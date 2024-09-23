package Generics;

public class banking {
    public static class BankAccount{
        private double balance;

        public synchronized void deposit (int amount){
            if(amount>0){
                balance+=amount;
            }
        }
        public synchronized void withdraw(int amount){
            if(amount>0 && balance>=amount){
                balance-=amount;
            }
        }
        public synchronized double getBalance(){
            return balance;
        }
    }
    public static void main(String[] args) throws InterruptedException{
        BankAccount account = new BankAccount();

        Thread depositThread = new Thread(() -> {
            account.deposit(100);
            System.out.println("Deposited 100, balance: " + account.getBalance());
        });

        Thread withdrawThread = new Thread(() -> {
            account.withdraw(50);
            System.out.println("Withdrew 50, balance: " + account.getBalance());
        });

        depositThread.start();
        withdrawThread.start();

        depositThread.join();
        withdrawThread.join();
//
        System.out.println("Final balance: " + account.getBalance());

    }
}
