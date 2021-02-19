package com.solvery.task_04_5;

public class Section extends Line {
    private Dot rootB;
    private double length;

    public static void main(String[] args) {
        Section section = new Section(1.0, 1.0, 90, 5);
        System.out.println(section.toString());
    }

    @Override
    public String toString() {
        return "Section: {" +
                "rootAX=" + getRootAX() +
                ", rootAY=" + getRootAY() +
                ", rootBX=" + rootB.getRootAX() +
                ", rootBY=" + rootB.getRootAY() +
                ", length=" + length +
                ", angle=" + getAngle() +
                '}';
    }

    public Section(double rootX, double rootY, int angle, double length) {
        super(rootX, rootY, angle);
        // for simplicity of calculation (non-use of the cos and sin) lets consider that the angle always = 90
        this.rootB = new Dot(rootX + length, rootY);
        this.length = length;
    }

    public Dot getRootB() {
        return rootB;
    }

    public void setRootB(Dot rootB) {
        this.rootB = rootB;
    }

    public double getLength() {
        return this.length;
    }

}
