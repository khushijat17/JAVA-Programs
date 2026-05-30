//sum and avg of array elements
import java.util.Scanner;
class Asa24{
public static void sum(int arr[]){
int sum=0;
for(int i=0;i<arr.length;i++){
sum = sum + arr[i];
}
System.out.println("Sum of arrays: "+ sum);
int avg = sum/arr.length;
System.out.println("Average of array: "+avg);
}
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter elements: ");
int n= sc.nextInt();
System.out.println("Enter " + n + " elements: ");
int arr[]= new int[n];
for(int i=0;i<arr.length;i++){
arr[i]=sc.nextInt();
}
sum(arr);
}
}


