//Write Java Program to print pyramid star pattern
import java.util.Scanner;
class Pattern52{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter elements: ");
int n =sc.nextInt();
for(int i=0;i<=n;i++){
for(int j=0;j<n-i;j++){
System.out.print(" ");
}
for(int k=0;k<i;k++){
System.out.print(" *");
}

System.out.println();
}
}
}
