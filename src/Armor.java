public class Armor extends Item{

    /*protected int armorStr;
    protected int armorDex;
    protected int armorInt;*/
    protected ArmorType armorType;
    HeroAttribute armorAttribute = new HeroAttribute();

    public Armor(String name, int requiredLevel, Slot slot, ArmorType armorType, int armorStr, int armorDex, int armorInt) {
        super(name, requiredLevel, slot);
        this.armorType = armorType;
        this.armorAttribute.strength = armorStr;
        this.armorAttribute.dexterity = armorDex;
        this.armorAttribute.intelligence = armorInt;
    }

}
