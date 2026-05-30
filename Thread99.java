//Write Java Program to demonstrate synchronization
class Counter{
int count=0;
public synchronized void increment(){
count++;
System.out.println(Thread.currentThread().getName() + " incremented count to: " + count);
}
}
class Mythread extends Thread{
Counter c;
Mythread(Counter c){
this.c= c;
}
public void run(){
for(int i=0;i<10;i++){
c.increment();
}
}
}
class Thread99{
public static void main(String args[]){
Counter counter = new Counter();
Mythread t1 = new Mythread(counter);
Mythread t2 = new Mythread(counter);
t1.setName("A");
t2.setName("B");
t1.start();
t2.start();
}
}

