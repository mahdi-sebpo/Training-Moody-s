public class PhysicalProduct extends Product{
    private double weight;
    PhysicalProduct(String productName, double price, double weight)
    {
        this.productName = productName;
        this.price = price;
        this.weight = weight;
    }

    @Override
    double calculatePrice()
    {
        if(weight<=5)
        {
            return price+50;
        }
        else if(weight>5 && weight<15)
        {
            return price+100;
        }
        else
        {
            return price+200;
        }
    }
}
