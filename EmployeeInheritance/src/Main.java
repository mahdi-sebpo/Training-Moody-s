import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the number of Managers: ");
        int numOfManagers;
        String name=" ";
        double salary,bonus;
        numOfManagers = input.nextInt();
        Employee employeeManager[ ]= new Manager[numOfManagers];
        System.out.println("Enter the salary & bonus for each Manager");
        for(int i=0;i<numOfManagers;i++)
        {
            salary = input.nextDouble();
            bonus = input.nextDouble();
            employeeManager[i] = new Manager(salary,bonus);
        }

        for(int i=0;i<numOfManagers;i++)
        {
            double totalSalary = employeeManager[i].totalSalary();
            System.out.println("Total Salary of Manager No. "+ (i+1)+" is = "+totalSalary);
        }

        System.out.println("\n\n");

        System.out.print("Input the number of Workers: ");
        int numOfWorker;
        numOfWorker = input.nextInt();
        Employee employeeWorker[ ]= new Worker[numOfWorker];
        System.out.println("Enter the salary for each Worker");
        for(int i=0;i<numOfWorker;i++)
        {
            salary = input.nextDouble();
            employeeWorker[i] = new Worker(salary);
        }

        for(int i=0;i<numOfWorker;i++)
        {
            double totalSalary = employeeWorker[i].totalSalary();
            System.out.println("Total Salary of Worker No. "+ (i+1)+" is = "+totalSalary);
        }

        System.out.println("\n\n");
    }
}