//transpose a matrix
import java.util.Scanner;
class Transpose31{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter elements of row of matrix");
int r = sc.nextInt();
System.out.println("Enter elements of Column of matrix");
int c = sc.nextInt();
int a[][]=new int [r][c];
for(int i=0;i<r;i++){
for(int j=0;j<c;j++){
a[i][j]= sc.nextInt();
}
}
System.out.println("Elements of matrix");
for(int i=0;i<r;i++){
for(int j=0;j<c;j++){
System.out.print(a[i][j]+ " ");
}
System.out.println();
}
System.out.println("Transpose of matrix");

for(int i=0;i<c;i++){
for(int j=0;j<r;j++){
System.out.print(a[j][i]+ " ");
}
System.out.println();
}
}
}

