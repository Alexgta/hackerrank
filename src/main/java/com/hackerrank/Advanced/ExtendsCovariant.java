package com.hackerrank.Advanced;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Complete the classes below
class Flower {
    private String name = "Flower";

    public String whatsYourName(){
        return name;
    }
}

class Jasmine extends Flower {
    private String name = "Jasmine";

    public String whatsYourName(){
        return this.name;
    }
}

class Lily extends Flower {
    private String name = "Lily";

    public String whatsYourName(){
        return this.name;
    }
}

class Region {
    Flower yourNationalFlower() {
        return new Flower();
    }
}

class WestBengal extends Region {
    Flower yourNationalFlower() {
        return new Jasmine();
    }
}

class AndhraPradesh extends Region {
    Flower yourNationalFlower() {
        return new Lily();
    }
}

public class ExtendsCovariant {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine().trim();
        Region region = null;
        switch (s) {
            case "WestBengal":
                region = new WestBengal();
                break;
            case "AndhraPradesh":
                region = new AndhraPradesh();
                break;
        }
        Flower flower = region.yourNationalFlower();
        System.out.println(flower.whatsYourName());
    }

}
