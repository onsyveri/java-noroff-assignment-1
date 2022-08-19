public class Mage extends Hero {

    public Mage(String name) {
        this.name = name;
        this.heroClass = "Mage";
        this.stats.setAttributes(1, 1, 8);
        this.validWeaponType.add("Staff");
        this.validWeaponType.add("Wand");
        this.validArmorType.add("Cloth");
        this.EquipmentSlots();
        this.Damage();
    }

    @Override
    public void Damage(){
        DamagingAttribute = stats.getTotalInt();
        super.Damage();
    }
    @Override
    public void Display(){
        super.Display();
    }

    @Override
    public void LevelUp() {
        strUp = 1;
        dexUp = 1;
        intUp = 5;
        super.LevelUp();
    }

    @Override
    public void equipWeapon(Weapon weapon){
        super.equipWeapon(weapon);
    }



}