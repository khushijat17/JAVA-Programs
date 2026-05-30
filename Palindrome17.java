//check whether a number is palindrome
import java.util.Scanner;
class Palindrome17{
public static void main(String args[]){
Scanner sc= new Scanner(System.in);
System.out.print("Enter number: ");
int num = sc.nextInt();
int n =num;
int rev =0;
while(n>0){
int r = n%10;
rev= r+10*rev;
n=n/10;
}
if(num==rev){
System.out.print(" Palindrome number");
}
else{
System.out.print("Not Palindrome number");
}
}
}




