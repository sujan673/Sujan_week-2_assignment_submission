//Rectangle and Area Calculation Create a class Rectangle with length and width. Initialize using a constructor. Create a method calculateArea() that returns the area. Create 3 rectangles of different dimensions and display their areas.
class Rectangle {
    double length;
    double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    double calculateArea() {
        return length * width;
    }
    void displayArea() {
        System.out.println("-------------------------------");
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Area: " + calculateArea());
        System.out.println("-------------------------------");
    }
}
public class Qn4_medium {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(5.0, 3.1);
        Rectangle r2 = new Rectangle(7.5, 4.1);
        Rectangle r3 = new Rectangle(10.0, 2.1);
        System.out.println("Rectangle 1:");
        r1.displayArea();
        System.out.println("Rectangle 2:");
        r2.displayArea();
        System.out.println("Rectangle 3:");
        r3.displayArea();
    }
}