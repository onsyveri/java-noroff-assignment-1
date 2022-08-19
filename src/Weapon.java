public class Weapon extends Item{

    protected int weaponDmg;
    protected WeaponType weaponType;
    public Weapon(String name, int requiredLevel, Slot slot, int weaponDmg, WeaponType weaponType) {
        super(name, requiredLevel, slot);
        this.weaponDmg = weaponDmg;
        this.weaponType = weaponType;
    }

}
