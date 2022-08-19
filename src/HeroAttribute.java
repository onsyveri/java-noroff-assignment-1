import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HeroAttribute that = (HeroAttribute) o;
        return strength == that.strength && dexterity == that.dexterity && intelligence == that.intelligence;
    }

    @Override
    public int hashCode() {
        return Objects.hash(strength, dexterity, intelligence);
    }
}
