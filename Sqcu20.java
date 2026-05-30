/*Write an application that calculates the squares and cubes of the numbers from 0 to 10 and prints the resulting values in a table format, a shown
below.
Number Square Cube
0 0 0
1 1 1
2 4 8 and so on*/
import java.util.Scanner;
class Sqcu20{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Number\tSquare\tcube");
for(int i=0;i<=10;i++){
int sq = i*i;
int cube = i*i*i;
System.out.println(i+ "\t"+ sq + "\t" +cube);
}
}
}


