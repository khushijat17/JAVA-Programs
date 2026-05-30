//. Create a constructor in above class to initialize the three instance variables. Provide a get method for each instance variable.
import java.util.Scanner;
class Employee{
String fname;
String lname;
double salary;
//contructor
Employee(String f,String l,double s){
fname=f;
lname=l;
salary=s;
}
//get method
String getfname(){
return fname;
}
String getlname(){
return lname;
}
double getsalary(){
return salary;
}
}
class Employee44{
public static void main(String args[]){
Employee emp=new Employee("khushi","jat",1000000);
 // Using get method
  System.out.println("First Name: " + emp.getfname());
  System.out.println("Last Name: " + emp.getlname());
  System.out.println("Salary: " + emp.getsalary());
}
}