package test;


public class T2DefaultInterface {

    interface Interf3 {
        public void theLength(String s);
    }

    interface IntTest {

        public void theLength(String s);

        default int m1(int a) {
            return a + 2;
        };

    }

    public static void main(String[] args) {

        IntTest intTest = s -> System.out.println("Length: " + s.length()) ;
        intTest.theLength("Hello");
        System.out.println(intTest.m1(2));

    }

}
