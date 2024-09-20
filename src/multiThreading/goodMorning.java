package multiThreading;

class MyThr1 extends Thread{
    @Override
    public void run(){
        System.out.println("Good Morning "+ this.getPriority());
    }
}

class MyThr2 implements Runnable{
    public void run(){
        try {
//            Thread.sleep(200);
            System.out.println("Welcome ");

        }
        catch (Exception e){}
    }
}


public class goodMorning {
    public static void main(String[] args) {

        for(int i=0;i<10;i++){
            MyThr1 thr=new MyThr1();
            MyThr2 thr2=new MyThr2();
            Thread thrr=new Thread(thr2);
            thrr.setPriority(Thread.MAX_PRIORITY);
            thr.setPriority(Thread.MIN_PRIORITY);

            thr.start();
            System.out.println(thr.getState());
            thrr.start();
            System.out.println(thrr.getState());
            System.out.println(thrr.getPriority());
            Thread currentThread=Thread.currentThread();
            currentThread.getName();
            currentThread.getId();
            currentThread.getState();
            currentThread.getPriority();


        }

    }
}
