public class Calculator {
    public int add(int a, int b){
        return a + b;
    }
    public int subtraction(int a, int b){
    return a - b;
    }
    public int multiplication(int a, int b){
        return a * b;
    }
    public double quotient(int a, int b){
        return a / b ;
    }public static void main(String[] args) {
        
        Calculator calc = new Calculator();

    int a = 5; 
    int b = 10;
    int c = calc.add(a, b);
    System.out.println(c);
    }
}
