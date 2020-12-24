package com.company.shapes;

import java.awt.*;

public class Triangle implements Shape {

    private double side1 = 3., side2 = 4., side3 = 5.; //default values
    private Color color = Color.ORANGE; //default value

    public Triangle(double side1, double side2, double side3, Color color) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        if (side1 + side2 < side3 || side2 + side3 < side2 || side3 + side2 < side1)
            throw new IllegalArgumentException("Sides are not valid!");
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
        //some method to draw the shape
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
                ", площадь= " + getArea() + " кв. ед." +
                ", гипотенуза= " + getHypotenuse() + " ед." +
                ", цвет= " + getColor();
    }
}
