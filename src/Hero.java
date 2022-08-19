import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

abstract class Hero {

    String name;
    String heroClass;
    int level = 1;
    int strUp;
    int dexUp;
    int intUp;
    int statSum;
    //Colors
    private static final String yellow = "\u001B[33m";
    private static final String red = "\u001B[31m";
    private static final String green = "\u001B[32m";
    private static final String blue = "\u001B[36m";
    private static final String purple = "\u001B[35m";
    private static final String reset = "\u001B[0m";

    ArrayList<String> validWeaponType = new ArrayList<String>();
    ArrayList<String> validArmorType = new ArrayList<String>();
    HeroAttribute stats = new HeroAttribute();

   //Damage start
    double heroDmg;
    double DamagingAttribute;
    int weaponDmg = 1;

    //Damage
    public void Damage() {
        heroDmg = weaponDmg * (1 + DamagingAttribute / 100);
    }

    //Display Hero Info
    public void Display() {
        StringBuilder display = new StringBuilder();
        display.append(yellow + "Name: " + reset + name + "\n");
        display.append("Class: " + heroClass + "\n");
        display.append("Level: " + level + "\n");
        display.append(red + "Str: " + reset + stats.getTotalStr() + "\n");
        display.append(green + "Dex: " + reset + stats.getTotalDex() + "\n");
        display.append(blue + "Int: " + reset + stats.getTotalInt() + "\n");
        display.append("Damage: " + heroDmg + "\n");
        display.toString();
        System.out.println(display);
    }

    //Level Up
    public void LevelUp() {
        level++;
        stats.setAttributes(stats.strength + strUp, stats.dexterity + dexUp, stats.intelligence + intUp);
        statSum = strUp + dexUp + intUp;
        //levelAttributes += statSum;
    }

    //Equip Items
    static HashMap<Slot, String> Equipment = new HashMap<>();

    public void EquipmentSlots() {
        //HashMap<Item.Slot, Item.WeaponType> Equipment = new HashMap<>();
        Equipment.put(Slot.Weapon, null);
        Equipment.put(Slot.Head, null);
        Equipment.put(Slot.Body, null);
        Equipment.put(Slot.Legs, null);
    }

    //Equip weapon
    public void equipWeapon(Weapon weapon) {

        try {
            if (level < weapon.requiredLevel){ //Checks if the player is high enough level to equip the weapon
                throw new InvalidWeaponException("Too low level");
            }
            if (!validWeaponType.contains(weapon.weaponType.name())) { //Checks if the weapon type the player tries to equip is valid according to its class
                throw new InvalidWeaponException("Your class cant use " + weapon.weaponType + "'s");
            }
        } catch (InvalidWeaponException err){
            System.err.println(err);
            return;
        }

        weapon.name = weapon.name + " " + weapon.weaponType;
        weaponDmg = weapon.weaponDmg;
        Damage(); //Updates damage

        for (WeaponType weapontype: WeaponType.values()) {
            if(weapon.weaponType.equals(weapontype)) {
                Equipment.put(weapon.slot, weapontype.name());

                System.out.println("Weapon: " + weapon.name);
            }
        }
    }

    //Equip armor
    static HashMap<Slot, ArrayList<Integer>> TotalArmorAttributes = new HashMap<>();

    //Set total attributes
    public void setArmorAttribute() {

        int armorStr = 0;
        int armorDex = 0;
        int armorInt = 0;

        for(ArrayList<Integer> key: TotalArmorAttributes.values()) {
            for (int i = 0; i < 3; i++){

                if (i == 0) {
                    armorStr += key.get(i);
                }
                if (i == 1) {
                    armorDex += key.get(i);
                }
                if (i == 2) {
                    armorInt += key.get(i);
                }
            }
        }
        stats.setTotalAttributes(armorStr, armorDex, armorInt);
    }

    public void equipArmor(Armor armor) {

        try {
            if (level < armor.requiredLevel){
                throw new InvalidWeaponException("Too low level");
            }
            if (!validArmorType.contains(armor.armorType.name())){
                throw new InvalidWeaponException("Your class cant use " + armor.armorType + " armor");
            }
        } catch (InvalidWeaponException err){
            System.err.println(err);
            return;
        }

        armor.name = armor.name + " " + armor.armorType.name();
        //stats.setArmorAttributes(armor.armorStr, armor.armorDex, armor.armorInt);
        Damage(); //Updates damage

        for (ArmorType armorType: ArmorType.values()) {

            if(armor.armorType.equals(armorType)) {
                Equipment.put(armor.slot, armorType.toString());
                TotalArmorAttributes.put(armor.slot, new ArrayList<>());
                TotalArmorAttributes.get(armor.slot).add(armor.armorAttribute.strength);
                TotalArmorAttributes.get(armor.slot).add(armor.armorAttribute.dexterity);
                TotalArmorAttributes.get(armor.slot).add(armor.armorAttribute.intelligence);

                //System.out.println(TotalArmorAttributes);

                System.out.println(armor.slot + " Piece: " + armor.name);
            }
        }
        setArmorAttribute();
    }
}
