//find the largest of two numbers
import java.util.Scanner;
class Largest8{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.print("Enter first number: ");
int a = sc.nextInt();
System.out.print("Enter second number: ");
int b = sc.nextInt();
if(a>b){
System.out.print(a+ " is greater than " +b);
}else{
System.out.print(b+ " is greater than " +a);
}
}
}






