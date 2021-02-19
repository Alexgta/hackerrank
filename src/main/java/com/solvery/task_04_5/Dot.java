package com.solvery.task_04_5;

public class Dot {
    private double rootAX;
    private double rootAY;

    @Override
    public String toString() {
        return "dot:{" +
                "rootX=" + rootAX +
                ", rootY=" + rootAY +
                '}';
    }

    public static void main(String[] args) {
        Dot dot = new Dot(1.5, 34.2);
        System.out.println(dot.toString());
    }


    public Dot(double rootAX, double rootAY) {
        this.rootAX = rootAX;
        this.rootAY = rootAY;
    }

    public double getRootAX() {
        return rootAX;
    }

    public void setRootAX(double rootAX) {
        this.rootAX = rootAX;
    }

    public double getRootAY() {
        return rootAY;
    }

    public void setRootAY(double rootAY) {
        this.rootAY = rootAY;
    }

}
