import java.util.HashMap;
import java.util.Map;

abstract class Item {

    protected String name;
    protected int requiredLevel;
    protected Slot slot;

    public Item(String name, int requiredLevel, Slot slot) {
        this.name = name;
        this.requiredLevel = requiredLevel;
        this.slot = slot;
    }
    //Everything under maybe useless
}
