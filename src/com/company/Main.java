package com.company;

import com.company.shapes.Circle;
import com.company.shapes.Shape;
import com.company.shapes.Square;
import com.company.shapes.Trapezium;
import com.company.shapes.Triangle;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public final static int MAX_NUMBER_OF_SHAPES = 20;

    public static void main(String[] args) {

        List<Shape> shapes = new ArrayList<>();
        Color color;

        for (int i = 0; i < MAX_NUMBER_OF_SHAPES ; i++) {
            color = Color.CYAN;
            Square square = new Square(i+1, color);

            color = Color.MAGENTA;
            Circle circle = new Circle(i+1, color);

            color = Color.PINK;
            Triangle triangle = new Triangle(i+3, i+4, i+5, color);

            color = Color.BLUE;
            Trapezium trapezium = new Trapezium(i+5, i+2, i+3, color);

            shapes.add(square);
            shapes.add(circle);
            shapes.add(triangle);
            shapes.add(trapezium);
        }
        for (Shape shape: shapes) {
            System.out.println(shape.toString());
        }
    }
}
