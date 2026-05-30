//Write an application that uses String method charAt to reverse the string.
import java.util.Scanner;
class Revstr40{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter your String");
String s = sc.nextLine();
System.out.println(s);
String rev="";
for(int i=s.length()-1;i>=0;i--){
 rev=rev+s.charAt(i);
}
System.out.println(rev);
}
}
