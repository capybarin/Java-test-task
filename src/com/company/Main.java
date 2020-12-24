package com.company;

import com.company.shapes.Circle;
import com.company.shapes.Square;
import com.company.shapes.Trapezium;
import com.company.shapes.Triangle;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public final static int MAX_NUMBER_OF_SHAPES = 5;

    public static void main(String[] args) {

        List<Square> squares = new ArrayList<>();
        List<Circle> circles = new ArrayList<>();
        List<Trapezium> trapeziums = new ArrayList<>();
        List<Triangle> triangles = new ArrayList<>();

        for (int i = 0; i < MAX_NUMBER_OF_SHAPES ; i++) {
            Color color = Color.CYAN;
            Square sq = new Square(i+1, color);
            squares.add(sq);
        }
        for (Square sq: squares) {
            System.out.println(sq.toString());
        }
        for (int i = 0; i < MAX_NUMBER_OF_SHAPES ; i++) {
            Color color = Color.BLUE;
            Circle circle = new Circle(i+1, color);
            circles.add(circle);
        }
        for (Circle circle: circles) {
            System.out.println(circle.toString());
        }
        for (int i = 0; i < MAX_NUMBER_OF_SHAPES ; i++) {
            Color color = Color.ORANGE;
            Trapezium trapezium = new Trapezium(i+5, i+1, i+2, color);
            trapeziums.add(trapezium);
        }
        for (Trapezium trapezium: trapeziums) {
            System.out.println(trapezium.toString());
        }
        for (int i = 0; i < MAX_NUMBER_OF_SHAPES ; i++) {
            Color color = Color.MAGENTA;
            Triangle triangle = new Triangle(i+3, i+4, i+5, color);
            triangles.add(triangle);
        }
        for (Triangle triangle: triangles) {
            System.out.println(triangle.toString());
        }
    }
}
