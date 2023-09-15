public class DigitalProduct extends Product{
    DigitalProduct(String productName, double price)
    {
        this.productName = productName;
        this.price = price;
    }

    @Override
    double calculatePrice()
    {
        return price;
    }
}
