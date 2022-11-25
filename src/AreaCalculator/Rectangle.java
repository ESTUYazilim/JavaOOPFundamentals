package AreaCalculator;

import java.util.Arrays;

public class Rectangle extends Polygonal {

    public Rectangle(double[] sides) {
        super(sides);
        this.sideNum = 4;
    }

    @Override
    public double calculateArea() {
        double min = Arrays.stream(sides).min().getAsDouble(); // get min
        double max = Arrays.stream(sides).max().getAsDouble(); // get max

        return min * max;
    }

    @Override
    public double calculatePerimeter() {
        return super.calculatePerimeter() * 2;
    }

    public boolean isSquare() {
        return isRegular();
    }

    @Override
    public String getName() {
        return isSquare() ? "Square" : "Rectangle";
    }

}
