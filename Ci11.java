//calculate Compound Interest
import java.util.Scanner;
class Ci11{
public static void main(String args[]){
Scanner sc= new Scanner(System.in);
System.out.print("Enter P: ");
int P = sc.nextInt();
System.out.print("Enter r: ");
double r = sc.nextDouble();
r=r/100;
System.out.print("Enter n: ");
double n = sc.nextDouble();
System.out.print("Enter t: ");
int t = sc.nextInt();
double A = P*Math.pow((1+r/n),(n*t));
double ci = A-P;
System.out.println(" Amount : " + A);
System.out.println("Compound interest  : " + ci);

}
}






