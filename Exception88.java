/*Exception Handling program for NumberFormatException--thrown if a program is attempting to convert a string to a numerical datatype, and
the string contains inappropriate characters (i.e. 'z' or 'Q')*/
import java.util.Scanner;
class Exception88{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("enter string: ");
String s= sc.nextLine();
try{
int num = Integer.parseInt(s);
System.out.println(num);
}catch(NumberFormatException e){
System.out.println("Invalid Charcater");
}
}
}
