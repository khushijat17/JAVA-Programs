
//62. Write Java Program to print spiral number pattern
import java.util.Scanner;
class Pattern62{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter elements: ");
int n =sc.nextInt();
int val =1;
for(int i=1;i<=n;i++){
for(int j=1;j<=n;j++){
System.out.print(val+ " ");
val++;
}
System.out.println();
}
}
}
