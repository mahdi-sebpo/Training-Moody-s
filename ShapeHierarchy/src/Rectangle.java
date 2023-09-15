public class Rectangle extends Shape{
    private double dimension1,dimension2;
    Rectangle(double dimension1,double dimension2)
    {
        this.dimension1 = dimension1;
        this.dimension2 = dimension2;
    }
    @Override
    double calculate_area() {
        return dimension1*dimension2;
    }
    @Override
    double calculate_perimeter()
    {
        return 2*(dimension1+dimension2);
    }
}
