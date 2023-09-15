import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the size of your shape_circle array: ");
        int sizeOfCircleShapeArray;
        double value_of_circle_radius;
        sizeOfCircleShapeArray = input.nextInt();
        Shape shape_circle[ ]= new Circle[sizeOfCircleShapeArray];
        System.out.println("Input the values of radius for each array index");
        for(int i=0;i<sizeOfCircleShapeArray;i++)
        {
            value_of_circle_radius = input.nextDouble();
            shape_circle[i] = new Circle(value_of_circle_radius);
        }

        for(int i=0;i<sizeOfCircleShapeArray;i++)
        {
            double circleArea = shape_circle[i].calculate_area();
            System.out.println("The area of circle of index "+ (i+1)+" is = "+circleArea);
        }

        System.out.println("\n\n");

        for(int i=0;i<sizeOfCircleShapeArray;i++)
        {
            double circlePerimeter = shape_circle[i].calculate_perimeter();
            System.out.println("The perimeter of circle of index "+ (i+1)+" is = "+circlePerimeter);
        }

        System.out.println("\n\n");
        System.out.print("Input the size of your shape_rectangle array: ");
        int sizeOfRectangleShapeArray;
        double value_of_Rectangle_dimension1, value_of_Rectangle_dimension2;
        sizeOfRectangleShapeArray = input.nextInt();
        Shape shape_rectangle[ ]= new Rectangle[sizeOfRectangleShapeArray];
        System.out.println("Input two dimensions of rectangle for of each array index");
        for(int i=0;i<sizeOfRectangleShapeArray;i++)
        {
            value_of_Rectangle_dimension1 = input.nextDouble();
            value_of_Rectangle_dimension2 = input.nextDouble();
            shape_rectangle[i] = new Rectangle(value_of_Rectangle_dimension1,value_of_Rectangle_dimension2);
        }

        for(int i=0;i<sizeOfRectangleShapeArray;i++)
        {
            double rectangleArea = shape_rectangle[i].calculate_area();
            System.out.println("The area of rectangle of index "+ (i+1)+" is = "+rectangleArea);
        }

        System.out.println("\n\n");

        for(int i=0;i<sizeOfRectangleShapeArray;i++)
        {
            double rectanglePerimeter = shape_rectangle[i].calculate_perimeter();
            System.out.println("The perimeter of Rectangle of index "+ (i+1)+" is = "+rectanglePerimeter);
        }
    }
}