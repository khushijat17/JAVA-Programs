//Write an application that changes any given string with uppercase letters, displays it , changes it back to lowercase letters and displays it.
import java.util.Scanner;
class Uplowstr42{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter String: ");
String s= sc.nextLine();
String Ustr = s.toUpperCase();
System.out.println("Uppercase String: "+ Ustr);
String Lstr = s.toLowerCase();
System.out.println("Lowercase String: "+ Lstr);
}
}



