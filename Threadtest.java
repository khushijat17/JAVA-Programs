class A extends Thread {
    public void run() {
        for(int i = 0; i <= 5; i++) {
            System.out.println("From thread A i = " + i);
        }
        System.out.println("Exit from thread A");
    }
}

class B extends Thread {
    public void run() {
        for(int i = 0; i <= 5; i++) {
            System.out.println("From thread B i = " + i);
        }
        System.out.println("Exit from thread B");
    }
}

class C extends Thread {
    public void run() {
        for(int i = 0; i <= 5; i++) {
            System.out.println("From thread C i = " + i);
        }
        System.out.println("Exit from thread C");
    }
}

class Threadtest {
    public static void main(String args[]) {

        A t1 = new A();
        B t2 = new B();
        C t3 = new C();

        t1.start();
        t2.start();
        t3.start();
    }
}