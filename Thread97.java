//Write Java Program to create thread using Runnable interface
class Mythread implements Runnable{
public void run(){
System.out.println("Runnable interface");
}
}
class Thread97{
public static void main(String args[]){
Mythread obj = new Mythread();
Thread t =new Thread(obj);
t.start();
}
}

