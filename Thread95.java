//Write Java Program to create thread using Thread class
class Mythread extends Thread{
public void run(){
System.out.println("Thread executed");
}
}
class Thread95{
public static void main(String args[]){
Mythread obj = new Mythread();
obj.start();
}
}