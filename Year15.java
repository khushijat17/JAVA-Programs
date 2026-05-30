//check whether a year is a leap year
import java.util.Scanner;
class Year15{
public static void main(String arg[]){
Scanner sc = new Scanner(System.in);
System.out.print("Enter year: ");
int y = sc.nextInt();
if ((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0)){
System.out.print("leap year");
}else{
System.out.print(" Not leap year ");
}
}
}





