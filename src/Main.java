public class Main extends HeroAttribute{

    public static void main(String[] args) {

        Hero hero = new Mage("Peepo");
        Hero warDude = new Warrior("Ragnar");

        Weapon weapon = new Weapon("Legendary Popo", 3, Slot.Weapon, 15, WeaponType.Wand);
        Weapon pogAx = new Weapon("Pogus Aximus", 2, Slot.Weapon, 45, WeaponType.Axe);
        Armor chest = new Armor("Breast of Valor", 2, Slot.Body, ArmorType.Cloth, 100,100,1000);
        Armor legs = new Armor("Ripped Legs", 2,Slot.Legs, ArmorType.Cloth,2,2,5);
        Armor chest2 = new Armor("Amazing Chest", 2,Slot.Body, ArmorType.Cloth,5,5,10);

        System.out.println(
            "\nUnknown: Hey, you. You’re finally awake. You were trying to cross the border,\n" +
            "right? Walked right into that Imperial ambush, same as us, and that\n" +
            "thief over there. What is your name traveler?\n"
        );
        System.out.println("Me: Im " + hero.name + " where am i?\n");
        System.out.println("Unknown: You are in Skyrim "  + hero.name + ". Im Ralof btw.\n");
        System.out.println("Ralof: Here are your stats:");

        hero.Display(); //Display hero stats

        System.out.println("You fell confident knowing your stats and decide to jump of the cart and kill a wolf. \n");
        System.out.println("You leveled up!! This is your new stats: ");

        hero.LevelUp(); //This levels up your hero
        hero.LevelUp();

        hero.Display(); //Display hero stats

        //Weapon related
        hero.equipArmor(chest);
        hero.equipArmor(legs);
        hero.equipArmor(chest2);
        hero.equipArmor(chest);

        hero.equipWeapon(weapon);

        hero.Display();
        System.out.println(hero.Equipment);
        System.out.println(hero.TotalArmorAttributes);
       /* warDude.LevelUp();
        warDude.equipWeapon(pogAx);
        warDude.Display();*/

    }
}
