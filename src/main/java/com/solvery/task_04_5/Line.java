package com.solvery.task_04_5;

public class Line extends Dot {

    private int angle;

    @Override
    public String toString() {
        return "line{" +
                "rootX=" + super.getRootAX() +
                ", rootY=" + super.getRootAY() +
                ", angle=" + angle +
                '}';
    }

    public Line(double rootX, double rootY, int angle) {
        super(rootX, rootY);
        this.angle = angle;
    }

    public int getAngle() {
        return angle;
    }

    public void setAngle(int angle) {
        this.angle = angle;
    }

    public static void main(String[] args) {
        Line line = new Line(2.0, 3.5, 40);
        System.out.println(line.toString());
    }

}
