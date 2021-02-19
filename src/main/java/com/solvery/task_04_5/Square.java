package com.solvery.task_04_5;

public class Square extends Section {
    protected Section section2;

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
                ", length=" + getLength() +
                ", angle=" + getAngle() +
                '}';
    }

    public static void main(String[] args) {
        Square square = new Square(1.0, 1.0, 90, 4);
        System.out.println(square.toString());
    }

    public Square(double rootX, double rootY, int angle, double length) {
        super(rootX, rootY, angle, length);
        setSection2();
    }

    protected void setSection2() {
         this.section2 = new Section(getRootAX(), getRootAY() + getLength(), getAngle(), getLength());
    }

}
