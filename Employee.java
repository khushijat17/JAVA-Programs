import java.util.Scanner;

class Employee {

    String name, address;
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
class fulltimeemployee extends Employee{

String designation;
int salary;
void display(){
System.out.println("Enter designation: ");
designation = sc.nextLine();
System.out.println("Enter salary: ");
salary = sc.nextInt();
 

 System.out.println("designation: " + designation);
 System.out.println("salary: " + salary);
}
public static void main(String args[]){
fulltimeemployee e = new fulltimeemlpoyee();
e.display();
}
}








