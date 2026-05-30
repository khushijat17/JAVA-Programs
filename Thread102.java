//Write Java Program to demonstrate join() method of Thread class.
class My extends Thread{
public void run(){
System.out.println("Loop");
for(int i=0;i<5;i++){
System.out.println(i);
try{
Thread.sleep(400);
}catch(InterruptedException e){System.out.println("Thread was interrupted!");}

}
}
}
class Thread102{
public static void main(String args[])throws Exception{
My t = new My();
System.out.println("Before Thread start:" + t.isAlive());
t.start();
System.out.println("After Thread start:" + t.isAlive());
t.join();
System.out.println(" Thread " + t.isAlive());
}
}



