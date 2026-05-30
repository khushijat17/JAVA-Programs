// convert Celsius to Fahrenheit
//F = (C × 9/5) + 32
import java.util.Scanner;
class Conversion14{
public static void main(String args[]){
Scanner sc= new Scanner(System.in);
System.out.print("Temperature in Celsius : " );
int C = sc.nextInt();
int F = (C * 9/5) + 32;
System.out.print(" Convert temp Celsius to fahrenheit: "+ F );
}
}



