public class Vehicle {
    String make,model;
    int year;

    Vehicle(String make, String model, int year)
    {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    void displayVehicleInfo()
    {
        System.out.println("Make = "+make);
        System.out.println("Model = "+model);
        System.out.println("Year = "+year);
   }
}
