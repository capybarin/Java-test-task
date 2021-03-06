package com.company.shapes;

import com.company.drawers.ShapeDrawer;

import java.awt.*;
import java.text.DecimalFormat;

public class Triangle implements Shape {

    private double side1, side2, side3;
    private Color color;

    public Triangle(double side1, double side2, double side3, Color color) {
        if (side1 + side2 < side3 || side2 + side3 < side2 || side3 + side2 < side1)
            throw new IllegalArgumentException("Sides are not valid!");
        if (side1 <= 0 || side2 <= 0|| side3 <= 0)
            throw new IllegalArgumentException("Sides should be greater then 0");
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.color = color;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(int side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(int side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(int side3) {
        this.side3 = side3;
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
        new ShapeDrawer();
    }

    @Override
    public double getArea() {
        double p = (side1 + side2 + side3) / 2;
        return Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
    }

    public double getHypotenuse(){
        if (side1 > side2 && side1 > side2)
            return side1;
        else if (side2 > side3)
            return side2;
        else return side3;
    }

    @Override
    public String toString() {
        return "Фигура: треугольник" +
                ", площадь= " + new DecimalFormat("#.##").format(getArea()) + " кв. ед." +
                ", гипотенуза= " + getHypotenuse() + " ед." +
                ", цвет= " + getColor().getRed() + ", " + getColor().getGreen() + ", " + getColor().getBlue();
    }
}
