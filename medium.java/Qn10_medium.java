/*Create a Car class with attributes: brand, model, price. Create 5 different Car objects with different details. 
Display the cars whose price is greater than 20,00,000 (use if statement).*/
class Model {
    String modelName;   
    double version;
    int year;
    String bodyType;

    public Model(String modelName, double version, int year, String bodyType) {
        this.modelName = modelName;
        this.version = version;
        this.year = year;
        this.bodyType = bodyType;
    }

    public void displayModelInfo() {
        System.out.println("Model Name: " + modelName);
        System.out.println("Version: " + version);
        System.out.println("Year: " + year);
        System.out.println("Body Type: " + bodyType);
    }
}

public class Qn10_medium {
    String brand;
    Model model;
    double price;

    public Qn10_medium(String brand, Model model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public void displayCarInfo() {
        System.out.println("\n-----------------");
        System.out.println("Brand: " + brand);
        model.displayModelInfo();
        System.out.println("Price: " + price);
        System.out.println("-----------------\n");
    }

    public static void main(String[] args) {
        Model c1Model = new Model("Corola", 1.1, 2024, "Sedan");
        Qn10_medium c1 = new Qn10_medium("Toyota", c1Model, 115000);

        Model c2Model = new Model("Kia Seltos", 3.1, 2024, "SUV");
        Qn10_medium c2 = new Qn10_medium("Kia", c2Model, 530000);

        Model c3Model = new Model("Swift", 1.1, 2016, "Hatchback");
        Qn10_medium c3 = new Qn10_medium("Suzuki", c3Model, 279900);

        Model c4Model = new Model("BYD Atto 3", 3.4, 2024, "SUV");
        Qn10_medium c4 = new Qn10_medium("BYD", c4Model, 678000);

        Qn10_medium[] carArr = new Qn10_medium[4]; 
        carArr[0] = c1;
        carArr[1] = c2;
        carArr[2] = c3;
        carArr[3] = c4;

        for (int i = 0; i < carArr.length; i++) {
            if (carArr[i].price > 200000) {
                carArr[i].displayCarInfo();
            }
        }
    }
}