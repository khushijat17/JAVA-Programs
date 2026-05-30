import java.util.Scanner;

class Employee {

    String name;
    int age;
    char gender;

    void display() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name: ");
        name = sc.nextLine();

        System.out.println("Enter gender: ");
        gender = sc.next().charAt(0);

        System.out.println("Enter age: ");
        age = sc.nextInt();

        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Age: " + age);
    }
}

class FullTimeEmployee extends Employee {

    String designation;
    int salary;

    void display() {
        super.display();   // Call parent method

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter designation: ");
        sc.nextLine(); // Fix input buffer
        designation = sc.nextLine();

        System.out.println("Enter salary: ");
        salary = sc.nextInt();

        System.out.println("Designation: " + designation);
        System.out.println("Salary: " + salary);
    }

    public static void main(String args[]) {
        FullTimeEmployee e = new FullTimeEmployee();
        e.display();
    }
}