//57.Write Java Program to print sandglass star pattern
import java.util.Scanner;
class Pattern57{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter elements: ");
int n =sc.nextInt();
for(int i=0;i<n;i++){
for(int j=0;j<i;j++){
System.out.print(" ");
}
for(int j=0;j<n-i;j++){
System.out.print("* ");
}
System.out.println();
}
//lower part
 for (int i = n - 2; i >= 0; i--) {

            // spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            // stars
            for (int j = i; j < n; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
}
}
