//61. Write Java Program to print alphabet triangle pattern
//Write Java Program to print Floyd’s triangle
import java.util.Scanner;
class Pattern61{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter elements: ");
int n =sc.nextInt();
for(int i=1;i<=n;i++){
char ch ='A';
for(int j=1;j<=i;j++){
System.out.print(ch);
ch++;
}
System.out.println();
}
}
}