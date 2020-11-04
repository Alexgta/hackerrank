package com.IKMnet.Second28;


interface Environment38{};
interface IKMEnvironment38 extends Environment38{};
class TestEnvironment38 implements IKMEnvironment38 {}
class JavaSETestEnvironment38 extends TestEnvironment38 {}


public class Quastion38 {

    public static void main(String[] args) {
        IKMEnvironment38 environment = new JavaSETestEnvironment38();
        if (environment instanceof JavaSETestEnvironment38) {
            System.out.println("JavaSETestEnvironment38()");
        } else {
            System.out.println("NOT JavaSETestEnvironment38()");
        }
    }
}
