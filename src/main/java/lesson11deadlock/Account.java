package lesson11deadlock;

public class Account {

    private int balance =10000;

    public void withdraw(int amount){
       balance -= amount;
    }

    public void deposit (int amount){
        balance += amount;
    }

    public int getBalance(){

        return this.balance;
    }

    public static void transfer(Account acc1, Account acc2, int amount){

        acc1.balance -= amount;
        acc2.balance += amount;

    }
}
