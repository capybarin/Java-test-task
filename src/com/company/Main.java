package com.company;

import com.company.shapes.Circle;
import com.company.shapes.Shape;
import com.company.shapes.Square;
import com.company.shapes.Trapezium;
import com.company.shapes.Triangle;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    private final static int MAX_NUMBER_OF_SHAPES = 20;

    public static void main(String[] args) {

        List<Shape> shapes = new ArrayList<>();
        Color color;

        int min = 1, max = 25;

        for (int i = 0; i < MAX_NUMBER_OF_SHAPES ; i++) {
            int randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);
            color = Color.CYAN;
            Square square = new Square(randomNum, color);

            color = Color.MAGENTA;
            Circle circle = new Circle(randomNum, color);

            color = Color.PINK;
            Triangle triangle = new Triangle(randomNum, randomNum, randomNum, color);

            color = Color.BLUE;
            Trapezium trapezium = new Trapezium(randomNum, randomNum, randomNum, color);

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
