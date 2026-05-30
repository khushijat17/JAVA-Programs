//uses String method compareTo to compare two strings defined by the user
import java.util.Scanner;
class Comstr35{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter 1st string");
String s1 = sc.nextLine();
System.out.println("Enter 2nd string");
String s2 = sc.nextLine();
System.out.println("use of compare method");

System.out.println(s1.compareTo(s2));
}
}




