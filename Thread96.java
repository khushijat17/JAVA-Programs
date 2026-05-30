//Write Java Program to create thread that print counting by extending Thread class.
import java.util.Scanner;
class Mythread extends Thread{
int n;
Mythread(int n){
this.n=n;
}

public void run(){
for(int i =1;i<=n;i++){
System.out.println("Counting:" + i);
}
}
}
class Thread96{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter number:" );
int num =sc.nextInt();
Mythread t = new Mythread(num);
t.start();
}
}