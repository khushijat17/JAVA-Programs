/*Create a class called Employee that includes three pieces of information as instance variables – a first name (type String), a last name (type
String) and a monthly salary (double)*/
import java.util.Scanner;
class Employee{
String fname;
String lname;
double salary;
}
class Employee43{
public static void main(String args[]){
Scanner sc= new Scanner(System.in);
Employee emp=new Employee();
System.out.println("Enter first name: ");
emp.fname = sc.nextLine();
System.out.println("Enter last name: ");
emp.lname = sc.nextLine();
System.out.println("Enter Monthly salary: ");
emp.salary= sc.nextDouble();
System.out.println("Employee details: ");
System.out.println("Employee name: " + emp.fname + " " +emp.lname);
System.out.println("Employee salary: "+ emp.salary);

}
}






