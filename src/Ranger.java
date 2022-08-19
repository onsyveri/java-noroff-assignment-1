public class Ranger extends Hero{

    public Ranger(String name) {
        this.name = name;
        this.heroClass = "Ranger";
        this.stats.setAttributes(1, 7, 1);
        this.validWeaponType.add("Bow");
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
        dexUp = 5;
        intUp = 1;
        super.LevelUp();
    }

    @Override
    public void equipWeapon(Weapon weapon){
        super.equipWeapon(weapon);
    }

}
