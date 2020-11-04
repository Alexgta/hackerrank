package com.IKMnet.Second28;


import java.sql.Connection;
import java.sql.ResultSet;
import java.util.List;

interface DatabaseOperation {
    ResultSet getData(String query);
    default void ExecuteProcedure(String procedureName) {
        System.out.println("Do nothing");
    }
    Connection getConnectin();
}

abstract class NoSqlDatabaseOperations implements DatabaseOperation {
    abstract void updateData(String updateQuery);
    void deleteData(String query) {  /*code to delete*/ };
}

class SqlOperations implements DatabaseOperation { // NOT  extends DatabaseOperation {

    @Override
    public ResultSet getData(String query) {  return null; }

    @Override
    public void ExecuteProcedure(String procedureName) {   }

    @Override
    public Connection getConnectin() { return null; }
    //void createTable(String createTableQuery);           ERROR here

}

abstract class MySQLDatabaseOperation implements DatabaseOperation {

    public ResultSet getData(String query) {  return null; }
    public void ExecuteProcedure(String procedureName) {   }
    public Connection getConnectin() { return null; }
    abstract void batchExecutin(List<String> batchQueries);

}

abstract class RelationDatabaseOperation implements DatabaseOperation {

    abstract public ResultSet getData(String query);
    abstract public void ExecuteProcedure(String procedureName);
    abstract public Connection getConnectin();

}

class OracleDatabaseOperation implements DatabaseOperation {
    public ResultSet getData(String query) {  return null; }
    public Connection getConnectin() { return null; }
}



public class Quastion48 {

    public static void main(String[] args) {
        System.out.println("yah");
    }

}
