package test;


public class T1LamdasDemo {

    public static void main(String[] args) {
        printMyName("Jack");
    }

    public static void printMyName(String name) {
        name = name + "Nelson";

        Runnable r = () -> {

          try {
              Thread.sleep(100);
          } catch (InterruptedException e) {

              e.printStackTrace();

          }
          //System.out.println("Wellcome " + name);           //Правильный ответ. - Error in line 22.
        };
        new Thread(r).start();
        System.out.println("Your name is " + name);


    }

}
