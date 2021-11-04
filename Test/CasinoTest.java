import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CasinoTest {

    @Test
    public void getName(){
        Character character = new Character();
        character.setName("Arne");
        String result = character.getName();
        assertEquals("Arne",result);
    }

    @Test
    public void getAge(){
        Character character = new Character();
        character.setAge(21);
        int result = character.getAge();
        assertEquals(21,result);
    }


    //Jag är ledsen men jag lyckades inte med fler Tester. Jag slet mitt hår länge och väl men eftersom
    //nästan all min kod är inputbaserad så var det oerhört svårt.




}