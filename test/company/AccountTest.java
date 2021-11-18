package company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    public void testNewAccount_noAmount(){
        Account account=new Account(1,"Bendt");
        int expected = 0;
        int accountSaldo = account.getSaldo();
        //Assert
        assertEquals(expected, accountSaldo);}

    @Test
    public void testNewAccount_whitAmount(){
        Account account=new Account(1,"Bendt",20);
        int expected = 20;
        int accountSaldo = account.getSaldo();
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
}