import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the size of Physical Product array: ");
        int sizeOfArray;
        String productName;
        double price;
        double weight;
        sizeOfArray = input.nextInt();
        Product physicalProduct[ ]= new PhysicalProduct[sizeOfArray];
        System.out.println("Input Product Name, Price & Weight: ");
        for(int i=0;i<sizeOfArray;i++)
        {
            productName = input.next();
            price = input.nextDouble();
            weight = input.nextDouble();
            physicalProduct[i] = new PhysicalProduct(productName,price,weight);
        }

        for(int i=0;i<sizeOfArray;i++)
        {
            double totalPrice = physicalProduct[i].calculatePrice();
            System.out.println("Total price of Physical Product No. "+ (i+1)+" is = "+totalPrice);
        }

        System.out.println("\n\n");

        System.out.print("Input the size of Digital Product array: ");
        sizeOfArray = input.nextInt();
        Product digitalProduct[ ]= new DigitalProduct[sizeOfArray];
        System.out.println("Input Product Name, Price: ");
        for(int i=0;i<sizeOfArray;i++)
        {
            productName = input.next();
            price = input.nextDouble();
            digitalProduct[i] = new DigitalProduct(productName,price);
        }

        for(int i=0;i<sizeOfArray;i++)
        {
            double totalPrice = digitalProduct[i].calculatePrice();
            System.out.println("Total price of Digital Product No. "+ (i+1)+" is = "+totalPrice);
        }
    }
}