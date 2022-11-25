public class Circle implements Shape {
    private final double PI = Math.PI;
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return PI * Math.pow(radius, 2);
    }

    @Override
    public double calculatePerimeter() {
        return 2 * radius * PI;
    }

    @Override
    public String getName() {
        return "Circle";
    }

    @Override
    public String toString() {
        return getName() + " with area (" + calculateArea() + ") and perimeter (" + calculatePerimeter() + ")";
    }
}
