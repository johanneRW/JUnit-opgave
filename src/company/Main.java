package company;

public class Main {

    public static void main(String[] args) {
	Account account1= new Account(1,"Søren",20);
    Account account2 = new Account(2,"Bendt");


    account1.transfer(2,account2);
        System.out.println(account1);
        System.out.println(account2);
    }
}
