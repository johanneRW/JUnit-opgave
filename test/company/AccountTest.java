package company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    public void testNewAccount_noAmount(){
        Account account=new Account(1,"Bendt");
        int expected = 0;
        int accountSaldo = account.getBalance();
        //Assert
        assertEquals(expected, accountSaldo);}

    @Test
    public void testNewAccount_whitAmount(){
        Account account=new Account(1,"Bendt",20);
        int expected = 20;
        int accountSaldo = account.getBalance();
        //Assert
        assertEquals(expected, accountSaldo);}


    @Test
    public void testOfInsert_whitAmount(){
    Account account=new Account(1,"Bendt",10);
    int expected = 40;
    int result = account.insert(30);
    //Assert
    assertEquals(expected, result);}

    @Test
    public void testOfInsert_noAmount(){
        Account account=new Account(1,"Bendt");
        int expected = 30;
        int result = account.insert(30);
        //Assert
        assertEquals(expected, result);}


    @Test
    public void testOfWithdrawal(){
        Account account=new Account(1,"Bendt",30);
        int expected = 10;
        int result = account.withdrawal(20);
        //Assert
        assertEquals(expected, result);}

    @Test
    public void testOfWithdrawal_tooLargeAmount() {
        Account account = new Account(1, "Bendt");
        assertThrows(IllegalArgumentException.class, () -> account.withdrawal(2));
    }

    @Test
    public void testOfTransfer(){
        Account account=new Account(1,"Bendt",30);
        Account account1=new Account(2,"søren");
        int expected = 15;
        int expected1=10;
        int result = account.transfer(10,account1);
        int result1 = account1.getBalance();
        //Assert
        assertEquals(expected, result);
        assertEquals(expected1, result1);
    }

    @Test
    public void testOfTransfer_whitTooLArgeAomunt(){
        Account account=new Account(1,"Bendt",10);
        Account account1=new Account(2,"søren");
        assertThrows(IllegalArgumentException.class,()->account.transfer(10,account1));
    }
}