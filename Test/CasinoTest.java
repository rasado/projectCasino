import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CasinoTest {

    @Test
    void intro() {
        int minAge;
        minAge = 21;
        assertEquals(21, minAge);
    }

    @Test
    public void settingName(){
        Character character = new Character();
        character.setName("Arne");
        boolean isNameSet = character.setName("Arne");
        assertFalse(isNameSet, "Rasmus");
    }

    //Jag är ledsen men jag lyckades inte med fler Tester. Jag slet mitt hår länge och väl men eftersom
    //nästan all min kod är inputbaserad så var det oerhört svårt.




}