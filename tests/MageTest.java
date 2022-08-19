import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MageTest {

    @Test
    public void make_validMage_shouldGetMage() {

        Hero hero = new Mage("Lord Nicholas III");

        HeroAttribute expect = new HeroAttribute();
        expect.setAttributes(1,1,8);

        HeroAttribute actual = hero.stats;

        assertEquals(expect, actual);
    }

}