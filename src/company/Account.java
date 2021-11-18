package company;

public class Account {
    private  int kontoNummer;
    private  String kontoEjer;
    private  int saldo;
    private int gebyr =5;



    public Account(int kontoNummer, String kontoEjer, int saldo) {
        this.kontoEjer=kontoEjer;
        this.kontoNummer=kontoNummer;
        this.saldo=saldo;
    }

    public Account(int kontoNummer,String kontoEjer) {
        this.kontoEjer=kontoEjer;
        this.kontoNummer=kontoNummer;
        this.saldo=0;
    }


    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }


    public int insert(int beløb){
        saldo=saldo+beløb;
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


    public int transfer(int amount, Account otherKonto){
        this.withdrawal(amount+gebyr);
       otherKonto.insert(amount);
     return getSaldo();
    }

    @Override
    public String toString() {
        return "Account: "+kontoNummer +". Ejer: " + kontoEjer +". Saldo: " + saldo;
    }


}

