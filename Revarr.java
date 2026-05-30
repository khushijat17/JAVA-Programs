//reverse an array
import java.util.Scanner;
class Revarr{
public static void input(int arr[],Scanner sc){
System.out.println("Enter element: ");

for(int i=0;i<arr.length;i++){
 arr[i] = sc.nextInt();
}
}
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
int arr[]=new int[5];
input(arr,sc);
System.out.println("Reverse of elements: ");
for(int i=arr.length-1;i>=0;i--){
System.out.print( arr[i] + ",");
}
}
}
