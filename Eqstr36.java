//uses String method equals and equalsIgnoreCase to tests any two string objects for equality
import java.util.Scanner;
class Eqstr36{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter 1st string");
String s1 = sc.nextLine();
System.out.println("Enter 2nd string");
String s2 = sc.nextLine();
System.out.println("use of compare method");
Boolean b =s1.equals(s2);
System.out.println(b);
Boolean b1 =s1.equalsIgnoreCase(s2);
System.out.println(b1);


}
}

