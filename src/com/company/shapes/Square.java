package com.company.shapes;

import java.awt.*;

public class Square implements Shape {

    private int side = 6; //default value
    private Color color = Color.CYAN; //default value

    public int getSide() {
        return side;
    }

    public Square(int side, Color color) {
        this.side = side;
        this.color = color;
    }

    @Override
    public Color getColor() {
        return color;
    }

    public void setSide(int side) {
        this.side = side;
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
        return side*side;
    }

    @Override
    public String toString() {
        return "Фигура: квадрат" +
                ", площадь= " + getArea() + " кв. ед." +
                ", длина стороны= " + getSide() + " ед." +
                ", цвет= " + getColor();
    }
}
