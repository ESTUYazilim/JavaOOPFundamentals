public class Triangle extends Polygonal {

    public Triangle(double[] sides) {
        super(sides);
    }

    @Override
    public double calculateArea() {
        // get all sides
        double a = sides[0];
        double b = sides[1];
        double c = sides[2];
        
        // use heron's formula
        double s = (a + b + c) / 2.0d;
        double x = (s * (s - a) * (s - b) * (s - c));
        double Area = Math.sqrt(x);
        return Area;
    }

    @Override
    public String getName() {
        return "Triangle";
    }

}
