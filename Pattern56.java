//Write Java Program to print butterfly star pattern
import java.util.Scanner;
class Pattern56{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter elements: ");
int n =sc.nextInt();
for(int i=0;i<=n;i++){
for(int j=0;j<i;j++){
System.out.print("*");
}
for(int k=0;k<2*(n-i);k++){
System.out.print(" ");
}
for(int j=0;j<i;j++){
System.out.print("*");
}

System.out.println();
}
for(int i=n;i>=1;i--){
for(int j=0;j<i;j++){
System.out.print("*");
}
for(int k=0;k<2*(n-i);k++){
System.out.print(" ");
}
for(int j=0;j<i;j++){
System.out.print("*");
}


System.out.println();
}


}
}
