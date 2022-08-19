import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MageTest {

    @Test
    public void make_validMage_shouldGetMage() {

        String expectName = "Lord Nicholas III";
        int expectStr = 1;

        Hero hero = new Mage("Lord Nicholas III");

        String actualName = hero.name;
        int actualStr = hero.stats.strength;

        assertEquals(expectName, actualName);
        assertEquals(expectStr, actualStr);
    }

}