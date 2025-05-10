// Create a class Product with productName, price, and discountPercentage. Write a method calculateFinalPrice() which returns price after discount. Create 3 different products and print their final prices.
import java.util.Scanner;
class Product {
    String Productname;
    float price;
    float discountpercentage;

    Product(String Productname, float price, float discountpercentage) {
        this.Productname=Productname;
        this.price=price;
        this.discountpercentage=discountpercentage;
    }
    void calculateFinalPrice() {
        System.out.println("Product Name: "+Productname);
        System.out.println("Price Before discount:"+price);
        System.out.println("Discount Percentage: "+discountpercentage);
        float disc=(discountpercentage/100.0f * price);
        float discount=(price-disc);

        System.out.println("Price After Discount: "+discount);
    }


}

public class Qn7_medium {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Name of the product: ");
        String product=sc.nextLine();
        System.out.println("Enter the price of the product: ");
        float price=sc.nextFloat();
        System.out.println("Enter the discount percentage");
        float discount=sc.nextFloat();
        Product pr=new Product(product,price,discount);
        pr.calculateFinalPrice();
        sc.close();
    }

}