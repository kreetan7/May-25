public class Main {
    public static void main(String[] args) {

        // Variables
        String name = "Kabita";
        int age = 25;
        double salary = 5000.50;
        boolean isStudent = true;

        // Print values
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println("Student: " + isStudent);

        // If-else condition
        if (age >= 18) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are not an adult.");
        }

        // For loop
        System.out.println("Numbers from 1 to 5:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        // Array
        String[] fruits = {"Apple", "Banana", "Mango"};

        System.out.println("Fruits List:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}