import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MageTest {

    @Test
    public void make_validMage_shouldGetCorrectAttributes() {

        Hero testHero = new Mage("Grand Wizard Nicholas");

        HeroAttribute expect = new HeroAttribute();
        expect.setAttributes(1,1,8);

        HeroAttribute actual = testHero.stats;

        assertEquals(expect, actual);

    }

    @Test
    public void make_validMage_shouldGetCorrectName() {

        Hero testHero = new Mage("Grand Wizard Nicholas");

        String expectName = "Grand Wizard Nicholas";

        String actualName = testHero.name;

        assertEquals(expectName, actualName);

    }

    @Test
    public void make_validMage_shouldGetCorrectValidWeaponType() {

        Hero testHero = new Mage("Grand Wizard Nicholas");

        String expectValidWeaponType = "Staff";

        String actualValidWeaponType = testHero.validWeaponType.get(0);

        assertEquals(expectValidWeaponType, actualValidWeaponType);

    }

}