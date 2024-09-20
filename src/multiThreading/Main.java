package multiThreading;
class MyThread extends Thread{
    public void run(){
        for(int i=0;i<5;i++) {
            System.out.println(i);

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
            }
        }
    }
}

class MyThread2 implements Runnable {
    public void run(){
        for(int i=0;i<5;i++) {
            System.out.println(i);

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
            }
        }
    }
}
public class Main {
    public static void main(String[] args) {
        for(int i=0;i<5;i++) {
            MyThread My = new MyThread();
            My.start();
        }
        MyThread2 myrun= new MyThread2();
        Thread thread=new Thread(myrun);
        thread.start();
    }
}
