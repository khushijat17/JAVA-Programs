// calculate area of a circle
import java.util.Scanner;

class Area12{
static final double PI=3.14;
public static void main(String arg[]){
Scanner sc = new Scanner (System.in);
System.out.print("Enter radius : ");
double r = sc.nextDouble();
double a = PI*r*r;
System.out.print("Area of circle : " + a);
}
}



