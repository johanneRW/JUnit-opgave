package company;

public class Account {
    private  int accountNumber;
    private  String accountOwner;
    private  int saldo;
    private int fee =5;



    public Account(int accountNumber, String accountOwner, int saldo) {
        this.accountOwner =accountOwner;
        this.accountNumber =accountNumber;
        this.saldo=saldo;
    }

    public Account(int accountNumber,String accountOwner) {
        this.accountOwner =accountOwner;
        this.accountNumber =accountNumber;
        this.saldo=0;
    }


    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }


    public int insert(int amount){
        saldo=saldo+amount;
        return saldo;
    }

    public int withdrawal(int amount){
       int newSaldo= getSaldo()-amount;
       if (newSaldo<0){
           throw new IllegalArgumentException();
           }
       setSaldo(newSaldo);
        return newSaldo;
    }


    public int transfer(int amount, Account otherAccount){
        this.withdrawal(amount+ fee);
       otherAccount.insert(amount);
     return getSaldo();
    }

    @Override
    public String toString() {
        return "Account: "+ accountNumber +". Ejer: " + accountOwner +". Saldo: " + saldo;
    }


}

