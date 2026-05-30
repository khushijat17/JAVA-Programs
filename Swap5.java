//swap two numbers without using third variable
import java.util.Scanner;
class Swap5{
public static void main(){
Scanner sc= new Scanner(System.in);
System.out.print("Enter 1st num : ");
int num1= sc.nextInt();
System.out.print("Enter 2nd num : ");
int num2= sc.nextInt();
num1 = num1+num2;
num2= num1-num2;
num1 =num1- num2;
System.out.print("After swapping : " + num1 + " " + num2);
}
}









