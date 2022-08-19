public class Rogue extends Hero{

    public Rogue(String name) {
        this.name = name;
        this.heroClass = "Rouge";
        this.stats.setAttributes(2, 6, 1);
        this.validWeaponType.add("Dagger");
        this.validWeaponType.add("Sword");
        this.validArmorType.add("Leather");
        this.validArmorType.add("Mail");
        this.EquipmentSlots();
        this.Damage();
    }

    @Override
    public void Damage(){
        DamagingAttribute = stats.getTotalDex();
        super.Damage();
    }
    @Override
    public void Display(){
        super.Display();
    }

    @Override
    public void LevelUp() {
        strUp = 1;
        dexUp = 4;
        intUp = 1;
        super.LevelUp();
    }

    @Override
    public void equipWeapon(Weapon weapon){
        super.equipWeapon(weapon);
    }

}
