import java.util.Scanner;
class Exception85{
public static void main(String args[]){
Scanner sc= new Scanner(System.in);
int n1=sc.nextInt();
int n2=sc.nextInt();
try{
int div =n1/n2;
System.out.println("Division : " + div);

}catch(ArithmeticException e)
{ 
System.out.println("Cannot divide by 0");
}

}
}

