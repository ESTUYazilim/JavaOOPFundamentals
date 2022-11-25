package AreaCalculator;

import java.util.Arrays;

public abstract class Polygonal implements Shape {
    int sideNum = 3;
    double[] sides = new double[sideNum];

    public Polygonal(double[] sides) {
        this.sides = sides;
    }

    @Override
    public double calculateArea() {
        return 0;
    }

    @Override
    public double calculatePerimeter() {
        return Arrays.stream(sides).sum();
    }

    public boolean isRegular() {
        return Arrays.stream(sides).min() == Arrays.stream(sides).max();
    }

    @Override
    public String toString() {
        return getName() + " with area (" + calculateArea() + ") and perimeter (" + calculatePerimeter() + ")";
    }
}