package com.company.shapes;

import com.company.drawers.ShapeDrawer;

import java.awt.*;
import java.text.DecimalFormat;

public class Square implements Shape {

    private int side;
    private Color color;

    public int getSide() {
        return side;
    }

    public Square(int side, Color color) {
        if (side <= 0)
            throw new IllegalArgumentException("Side should be greater then 0");
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
        new ShapeDrawer();
    }

    @Override
    public double getArea() {
        return side*side;
    }

    @Override
    public String toString() {
        return "Фигура: квадрат" +
                ", площадь= " + new DecimalFormat("#.##").format(getArea()) + " кв. ед." +
                ", длина стороны= " + getSide() + " ед." +
                ", цвет= " + getColor().getRed() + ", " + getColor().getGreen() + ", " + getColor().getBlue();
    }
}
