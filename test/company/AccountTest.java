package company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    public void testAfIndsæet(){
    Account account=new Account(1,"Bendt",10);
    int expected = 40;
    int result = account.insert(30);
    //Assert
    assertEquals(expected, result);}

    @Test
    public void testAfIndsæet_medTomKonto(){
        Account account=new Account(1,"Bendt");
        int expected = 430;
        int result = account.insert(30);
        //Assert
        assertEquals(expected, result);}


    @Test
    public void testAfHæv(){
        Account account=new Account(1,"Bendt",30);
        int expected = 10;
        int result = account.withdrawal(20);
        //Assert
        assertEquals(expected, result);}

    @Test
    public void testHæv_forstort_beløb() {
        Account account = new Account(1, "Bendt");
        assertThrows(IllegalArgumentException.class, () -> account.withdrawal(2));
    }
}