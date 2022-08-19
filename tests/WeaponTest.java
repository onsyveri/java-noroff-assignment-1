import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WeaponTest {

    @Test
    void make_validWeapon_shouldGetCorrectName() {

        Weapon testWeapon = new Weapon("Rainbow Sword", 2, Slot.Weapon, 10, WeaponType.Sword);

        String expectName = "Rainbow Sword";
        String actualName = testWeapon.name;

        assertEquals(expectName, actualName);

    }

    @Test
    void make_validWeapon_shouldGetCorrectRequiredLevel() {

        Weapon testWeapon = new Weapon("Rainbow Sword", 2, Slot.Weapon, 10, WeaponType.Sword);

        int expectRequiredLevel = 2;
        int actualRequiredLevel = testWeapon.requiredLevel;

        assertEquals(expectRequiredLevel, actualRequiredLevel);

    }

    @Test
    void make_validWeapon_shouldBeAssignedCorrectSlot() {

        Weapon testWeapon = new Weapon("Rainbow Sword", 2, Slot.Weapon, 10, WeaponType.Sword);

        Slot expectSlot = Slot.Weapon;
        Slot actualSlot = testWeapon.slot;

        assertEquals(expectSlot, actualSlot);

    }

    @Test
    void make_validWeapon_shouldGetCorrectWeaponDamage() {

        Weapon testWeapon = new Weapon("Rainbow Sword", 2, Slot.Weapon, 10, WeaponType.Sword);

        int expectWeaponDmg = 10;
        int actualWeaponDmg = testWeapon.weaponDmg;

        assertEquals(expectWeaponDmg, actualWeaponDmg);

    }

    @Test
    void make_validWeapon_shouldBeAssignedCorrectWeaponType() {

        Weapon testWeapon = new Weapon("Rainbow Sword", 2, Slot.Weapon, 10, WeaponType.Sword);

        WeaponType expectWeaponType = WeaponType.Sword;
        WeaponType actualWeaponType = testWeapon.weaponType;

        assertEquals(expectWeaponType, actualWeaponType);

    }

}