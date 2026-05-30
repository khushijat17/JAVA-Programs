 //check whether a number is Armstrong
import java.util.Scanner;
class Armstrong18{
public static void main(String args[]){
Scanner sc= new Scanner(System.in);
System.out.print("Enter number: ");
int num= sc.nextInt();
int n= num;
int res= 0;
while(n>0){
int ls= n%10;
res=res+ls*ls*ls;
n=n/10;
}
if(num==res){
System.out.print(" Armstrong number ");
}else{
System.out.print(" not Armstrong number ");
}
}
}




 
