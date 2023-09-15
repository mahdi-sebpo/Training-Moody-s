public class Circle extends Shape {
    private double radius;
    Circle(double radius)
    {
        this.radius = radius;
    }
    @Override
    double calculate_area() {
        return (Math.PI)*radius*radius;
    }
    @Override
    double calculate_perimeter()
    {
        return 2*(Math.PI)*radius;
    }
}
