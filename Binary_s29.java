//Binary Search
import java.util.Scanner;

class Binary_s29{

public static void binary(int a[], int n, int num){

int lb = 0, ub = n-1;
int mid, found = 0;

while(lb <= ub){

mid = (lb + ub) / 2;

if(a[mid] == num){
found = 1;
break;
}

if(a[mid] < num){
lb = mid + 1;
}
else{
ub = mid - 1;
}

}

if(found == 1){
System.out.println("Element found");
}
else{
System.out.println("Element not found");
}

}

public static void main(String args[]){

Scanner sc = new Scanner(System.in);

System.out.println("Enter elements number: ");
int n = sc.nextInt();

int arr[] = new int[n];

System.out.println("Enter elements of an array (sorted): ");
for(int i=0;i<n;i++){
arr[i] = sc.nextInt();
}

System.out.println("Search number: ");
int num = sc.nextInt();

binary(arr,n,num);

}
}