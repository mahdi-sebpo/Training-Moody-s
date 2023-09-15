import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the size of your Car objects array: ");
        int sizeOfArray;
        String make;
        String model;
        int year;
        sizeOfArray = input.nextInt();
        Vehicle carVehicle[ ]= new Car[sizeOfArray];
        System.out.println("Input make, model & year info for the cars");
        for(int i=0;i<sizeOfArray;i++)
        {
            make = input.next();
            model = input.next();
            year = input.nextInt();
            carVehicle[i] = new Car(make,model,year);
            carVehicle[i].displayVehicleInfo();
        }

        System.out.print("Input the size of your Motorcycle objects array: ");
        sizeOfArray = input.nextInt();
        Vehicle MotorcycleVehicle[ ]= new Motorcycle[sizeOfArray];
        System.out.println("Input make, model & year info for the cars");
        for(int i=0;i<sizeOfArray;i++)
        {
            make = input.next();
            model = input.next();
            year = input.nextInt();
            MotorcycleVehicle[i] = new Motorcycle(make,model,year);
            MotorcycleVehicle[i].displayVehicleInfo();
        }
    }
}