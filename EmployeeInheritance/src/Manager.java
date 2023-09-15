public class Manager extends Employee{
    private double bonus;

    Manager(double salary, double bonus)
    {
        this.salary = salary;
        this.bonus = bonus;
    }

    @Override
    double totalSalary()
    {
        return salary+bonus;
    }
}
