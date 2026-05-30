//  Program to count frequency of elements in an array
import java.util.Scanner;
class Countarr26{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
int n,sec,count=0;
System.out.println("Enter size of array: ");
n=sc.nextInt();
int arr[]=new int[n];
System.out.println("Enter " + n + " elements");
for (int i=0;i<arr.length;i++)
arr[i]=sc.nextInt();
System.out.println("Enter a element to know its frequency: ");
sec = sc.nextInt();
for(int element:arr){
if (element == sec)
count++;
}
System.out.println("Occurence of given elements " + sec + "  is : " + count);
}

}