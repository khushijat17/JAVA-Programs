//check whether a number is positive, negative or zero
import java.util.Scanner;
class Check7{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.print("Enter number: ");
int num = sc.nextInt();
if(num>0){
System.out.print("Positive numbers");
}else if(num<0){
System.out.print("Negative numbers");
}else{
System.out.print("zero");
}
}
}







