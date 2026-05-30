//largest and smallest number
import java.util.Scanner;
class Array23{
public static void input(int a[]){
Scanner sc = new Scanner(System.in);

for(int i=0;i<5;i++){
System.out.println("Enter elements: ");
a[i]=sc.nextInt();
}
}
public static void output(int a[]){
for(int i=0;i<5;i++){
System.out.println( "Elements: "+a[i]);

}}
public static void largest(int a[],int max){
for (int i=0;i<5;i++){
if(a[max]<a[i]){
max=i;
}
}
System.out.print("max number : "  + a[max]);
}
public static void smallest(int a[],int min){
for (int i=0;i<5;i++){
if(a[min]>a[i]){
min=i;
}
}
System.out.println(" min number : "  + a[min]);
}




public static void main(String args[]){
int max=0;
int min=0;
int arr[]= new int[5];

input(arr);
output(arr);
largest(arr,max);
smallest(arr,min);

}
}
