/*Write a test application named EmployeeTest that demonstrates class Employee’s capabilities. Create two employee objects and display each
object’s yearly salary. */

class Employee{
String fname;
String lname;
double salary;
Employee(String f,String l,double s){
this.fname=f;
this.lname=l;
if(s>0){
this.salary=s;
}else{
this.salary=0.0;
}
}
public String getfname(){
return fname;
}
public String getlname(){
return lname;
}
public double getsalary(){
return salary;
}

}
class EmployeeTest45{
public static void main(String args[]){
Employee emp1 = new Employee("Mili","jat",100000);
Employee emp2 = new Employee("Naksh","jat",100000);
System.out.println(emp1.getfname()+ " "+ emp1.getlname()+" "+(emp1.getsalary()*12));
System.out.println(emp2.getfname()+ " "+ emp2.getlname()+" "+(emp2.getsalary()*12));
}
}



