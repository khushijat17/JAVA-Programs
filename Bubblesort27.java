//Program to sort array using Bubble Sort
import java.util.Scanner;
class Bubblesort27{
public static void bubble(int arr[],int n){
for(int i=0; i<n-1;i++){
for(int j=0;j<n-i-1;j++){
if(arr[j]>arr[j+1]){
int temp=arr[j];
arr[j]=arr[j+1];
arr[j+1]=temp;
}

}
}
}
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter elements: ");
int n = sc.nextInt();
int arr[] = new int[n];
System.out.println("Enter " + n + " elements" );
for(int i=0; i<arr.length;i++){
arr[i] = sc.nextInt();

}
bubble(arr,n);
System.out.println("Sorted arry");
for(int i=0;i<n;i++){
System.out.println(arr[i]);
}
}
}

