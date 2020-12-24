package com.company.shapes;

import java.awt.*;

public class Circle implements Shape{

    private int radius = 5; //default values
    private Color color = Color.BLUE; //default values

    public Circle(int radius, Color color) {
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
        //some method to draw the shape
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Фигура: круг" +
                ", площадь= " + getArea() + " кв. ед." +
                ", радиус= " + getRadius() + " ед." +
                ", цвет= " + getColor();
    }
}
