//Program to sort array using Selection Sort
import java.util.Scanner;
class Selectionsort28{
public static void selection(int arr[],int n){
for(int i=0;i<arr.length;i++){
int min =i;
for(int j=i+1;j<n;j++){
if( arr[j]<arr[min]){
min=j;
}
}
int temp=arr[min];
arr[min]=arr[i];
arr[i]=temp;
}
}
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter elements: ");
int n= sc.nextInt();
System.out.println("Enter  " + n + " elements");
int arr[] = new int[5];
for(int i=0;i<n;i++){
arr[i]=sc.nextInt();
}
selection(arr,n);
System.out.println(" Sorted array " );
for(int i=0;i<n;i++){
System.out.println(arr[i]);
}
}
}