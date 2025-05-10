/*Create a Student class with name and marks. Write a method calculateGrade() that assigns a grade (A, B, C, D, F) 
based on marks using a switch or if-else ladder. Create 3 students and display their grades.*/
class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
    String calculateGrade() {
        if (marks >= 90) {
            return "A";
        } else if (marks >= 80) {
            return "B";
        } else if (marks >= 70) {
            return "C";
        } else if (marks >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
    }
}
public class Qn3_medium {
    public static void main(String[] args) {
        Student s1 = new Student("Aashish", 92); //I created three student object
        Student s2 = new Student("Sandesh", 76);
        Student s3 = new Student("Harry", 58);
        System.out.println("Student 1:");
        s1.displayDetails();
        System.out.println("\nStudent 2:");
        s2.displayDetails();
        System.out.println("\nStudent 3:");
        s3.displayDetails();
    }
}