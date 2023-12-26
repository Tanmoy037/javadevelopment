// Threads in java
public class day9 {
    public static void main(String[] args) {
        A obj1 = new A();
        B objB = new B();

        obj1.start();
        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        objB.start();
    }
}

class  A extends Thread{
    public void run(){
        for (int i = 1; i < 10; i++){
            System.out.println("Hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
}

class B extends Thread{
    public void run(){
        for (int i = 1; i<10; i++){
            System.out.println("Hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}