public class Warrior extends Hero{

    public Warrior(String name) {
        this.name = name;
        this.heroClass = "Warrior";
        this.stats.setAttributes(5, 2, 1);
        this.validWeaponType.add("Sword");
        this.validWeaponType.add("Axe");
        this.validWeaponType.add("Hammer");
        this.validArmorType.add("Mail");
        this.validArmorType.add("Plate");
        this.EquipmentSlots();
        this.Damage();
    }

    @Override
    public void Damage(){
        DamagingAttribute = stats.getTotalStr();
        super.Damage();
    }
    @Override
    public void Display(){
        super.Display();
    }

    @Override
    public void LevelUp() {
        strUp = 3;
        dexUp = 2;
        intUp = 1;
        super.LevelUp();
    }

    @Override
    public void equipWeapon(Weapon weapon){
        super.equipWeapon(weapon);
    }
}
