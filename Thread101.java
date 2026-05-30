//Write Java Program to determine whether a thread is alive or not.
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
class Thread101{
public static void main(String args[]) {
My t = new My();
System.out.println("Before Thread start:" + t.isAlive());
t.start();
System.out.println("After Thread start:" + t.isAlive());
System.out.println(" Thread " + t.isAlive());
}
}



