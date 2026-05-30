//reverse of string
import java.util.Scanner;
class Revstr32{
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



