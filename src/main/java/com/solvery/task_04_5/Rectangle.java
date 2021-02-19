package com.solvery.task_04_5;

public class Rectangle extends Square {
    private double with;

    @Override
    public String toString() {
        return "Square{" +
                "Line1: (" + getRootAX() +
                ", " + getRootAY() +
                "), -> (" + getRootB().getRootAX() +
                ", " + getRootB().getRootAY() +
                ")\n" +
                "Line2: (" + section2.getRootAX() +
                ", " + section2.getRootAY() +
                ") -> (" + section2.getRootB().getRootAX() +
                ", " + section2.getRootB().getRootAY() +
                "), length=" + getLength() +
                ", with=" + getLength() +
                ", angle=" + getAngle() +
                '}';
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(0.0, 0.0, 90, 5, 10);
        System.out.println(rectangle.toString());
    }

    public Rectangle(double rootX, double rootY, int angle, double length, double with) {
        super(rootX, rootY, angle, length);
        this.with = with;
        setSection2();
    }

    @Override
    protected void setSection2() {
        super.section2 = new Section(getRootAX(), getRootAY() + with, getAngle(), getLength());
    }


}
