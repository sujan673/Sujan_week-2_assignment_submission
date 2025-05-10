class Student{
    String name;
    int age;

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Ram";
        s.age = 20;
        s.displayInfo();
    }
}