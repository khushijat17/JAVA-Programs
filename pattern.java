import java.util.Scanner;
class pattern{
public static void main(String arg[]){
Scanner sc = new Scanner(System.in);
System.out.print("enter num: ");
int n = sc.nextInt();
for(int i=1; i<=n;i++){
for(int j=0;j<i;j++){
System.out.print(n-j);
}
System.out.println();
}
}
}



