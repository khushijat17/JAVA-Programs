//Write Java Program to print right triangle star pattern
import java.util.Scanner;
class Pattern50{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter elements: ");
int n =sc.nextInt();
for(int i=1;i<=n;i++){
for(int j=1;j<=i;j++){
System.out.print("*");
}
System.out.println();
}
}
}
