//Write Java Program to print diamond star pattern
import java.util.Scanner;
class Pattern54{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter elements: ");
int n =sc.nextInt();
for(int i=0;i<=n;i++){
for(int j=0;j<n-i;j++){
System.out.print(" ");
}
for(int k=0;k<2*i-1;k++){
System.out.print("*");
}

System.out.println();
}
for(int i=n;i>=1;i--){
for(int j=0;j<n-i;j++){
System.out.print(" ");
}
for(int k=0;k<2*i-1;k++){
System.out.print("*");
}

System.out.println();
}


}
}
