//calculate Simple Interest
import java.util.Scanner;
class Si10{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.print("Enter P:");
int P = sc.nextInt();
System.out.print("Enter R:");
int R = sc.nextInt();
System.out.print("Enter T:");
int T = sc.nextInt();
float s=(P*R*T/100);
System.out.print("Simple interest: "+ s );
}
}






