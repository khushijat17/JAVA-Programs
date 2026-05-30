import java.util.Scanner;
class Exception86{
public static void main(String args[]){
Scanner sc =new Scanner(System.in);
System.out.println("Enter elements: ");
int n = sc.nextInt();
int a[]= new int[n];
try{
System.out.println("Enter elements:");
for(int i=0;i<=n;i++)
{
a[i]=sc.nextInt();
}
}catch(Exception e){
System.out.println("Error: buffer  overflow");
}
}
}

