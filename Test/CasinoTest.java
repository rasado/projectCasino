import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CasinoTest {

    Character character = new Character();

    @Test
    public void testSetName(){
        character.setName("Arne");
        String result = character.getName();
        assertEquals("Arne",result);
    }

    @Test
    public void testGetAge(){
        character.setAge(21);
        int result = character.getAge();
        assertEquals(21,result);
    }

    @Test
    public void testWallet(){
        double result = character.getWallet();
        assertEquals(0.0,result);
    }

    @Test
    public void testIncreaseWallet(){
        character.increaseWallet(5.0);
        double result = character.getWallet();
        assertEquals(5.0,result);
    }

    //Jag är ledsen men jag lyckades inte med fler Tester. Jag slet mitt hår länge och väl men eftersom
    //nästan all min kod är inputbaserad så var det oerhört svårt.




}