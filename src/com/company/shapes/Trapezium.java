package com.company.shapes;

import java.awt.*;

public class Trapezium implements Shape {

    private int lowerBase, upperBase;
    private int h;
    private Color color;

    public Trapezium(int lowerBase, int upperBase, int h, Color color) {
        if (lowerBase <= 0 || h <= 0)
            throw new IllegalArgumentException("Lower base and/or H should be greater then 0");
        this.lowerBase = lowerBase;
        this.upperBase = upperBase;
        this.h = h;
        this.color = color;
    }

    public int getLowerBase() {
        return lowerBase;
    }

    public void setLowerBase(int lowerBase) {
        this.lowerBase = lowerBase;
    }

    public int getUpperBase() {
        return upperBase;
    }

    public void setUpperBase(int upperBase) {
        this.upperBase = upperBase;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    @Override
    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public void draw() {
        //some method to draw the shape
    }

    @Override
    public double getArea() {
        return (((double)lowerBase + (double)upperBase) / 2) * h;
    }

    @Override
    public String toString() {
        return "Фигура: трапеция" +
                ", площадь= " + getArea() + " кв. ед." +
                ", длина высоты= " + getH() + " ед." +
                ", цвет= " + getColor().getRed() + ", " + getColor().getGreen() + ", " + getColor().getBlue();
    }
}
