//Write Java Program to demonstrate thread priority
class Mythread extends Thread{
public void run(){
System.out.println("Thread name: " + Thread.currentThread().getName());
System.out.println("Thread Priority: " + Thread.currentThread().getPriority());
}
}
class Thread98{
public static void main(String args[]){
Mythread t1 = new Mythread();
Mythread t2 = new Mythread();
t1.setPriority(Thread.MIN_PRIORITY);
t2.setPriority(Thread.MAX_PRIORITY);
t1.setName("T");
t2.start();

t1.start();

}
}
