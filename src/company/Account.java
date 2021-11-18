package company;

public class Account {
    private  int accountNumber;
    private  String accountOwner;
    private  int balance;
    private int fee =5;



    public Account(int accountNumber, String accountOwner, int saldo) {
        this.accountOwner =accountOwner;
        this.accountNumber =accountNumber;
        this.balance =saldo;
    }

    public Account(int accountNumber,String accountOwner) {
        this.accountOwner =accountOwner;
        this.accountNumber =accountNumber;
        this.balance =0;
    }


    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int insert(int amount){
        balance = balance +amount;
        return balance;
    }

    public int withdrawal(int amount){
       int newSaldo= getBalance()-amount;
       if (newSaldo<0){
           throw new IllegalArgumentException();
           }
       setBalance(newSaldo);
        return newSaldo;
    }


    public int transfer(int amount, Account otherAccount){
        this.withdrawal(amount+ fee);
       otherAccount.insert(amount);
     return getBalance();
    }

    @Override
    public String toString() {
        return "Account: "+ accountNumber +". Ejer: " + accountOwner +". Saldo: " + balance;
    }


}

