public class HeroAttribute {

    int strength;
    int dexterity;
    int intelligence;
    int totalStr;
    int totalDex;
    int totalInt;

    public void setAttributes (int str, int dex, int intel) {
        this.strength = str;
        this.dexterity = dex;
        this.intelligence = intel;
        this.totalStr = str;
        this.totalDex = dex;
        this.totalInt = intel;
    }

    public void setTotalAttributes (int armorStr, int armorDex, int armorInt) {
        this.totalStr = strength + armorStr;
        this.totalDex = dexterity + armorDex;
        this.totalInt = intelligence + armorInt;
    }

    public int getTotalStr() { return totalStr; }

    public int getTotalDex() {
        return totalDex;
    }

    public int getTotalInt() {
        return totalInt;
    }

}
