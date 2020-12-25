package com.company.shapes;

import com.company.drawers.ShapeDrawer;

import java.awt.*;
import java.text.DecimalFormat;

public class Circle implements Shape{

    private int radius;
    private Color color;

    public Circle(int radius, Color color) {
        if (radius <= 0)
            throw new IllegalArgumentException("Radius should be greater then 0");
        this.radius = radius;
        this.color = color;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
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
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Фигура: круг" +
                ", площадь= " + new DecimalFormat("#.##").format(getArea()) + " кв. ед." +
                ", радиус= " + getRadius() + " ед." +
                ", цвет= " + getColor().getRed() + ", " + getColor().getGreen() + ", " + getColor().getBlue();
    }
}
