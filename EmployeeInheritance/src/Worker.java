public class Worker extends Employee{
    Worker(double salary)
    {
        this.salary = salary;
    }

    @Override
    double totalSalary() {
        return salary;
    }
}
