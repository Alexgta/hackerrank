package com.Paterns;


public class Fabric {

    interface Car {
        int seets = 0;
         default int getNum()  {
             return 1;
         }
    }

    static class sportCar implements Car {
        int seets = 4;
        public int getNum() {
            return 4;
        }
    }

    static class bus implements Car {
        int seets = 100;
        public int getNum() {
            return 100;
        }
    }

    public static void main(String[] args) {
        int passangers = 10;
        Car myCar;

        if (passangers < 5) {
            myCar = new sportCar();
        } else {
            myCar = new bus();
        }

        System.out.println("Seets: " + myCar.getNum());


    }

}
