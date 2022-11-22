import java.util.ArrayList;

abstract public class Item {
    protected String itemName;
    protected ArrayList<Item> items;

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    public String getItem() {
        return itemName;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    @Override
    public String toString() {
        if (items != null) {
            String desc = "";
            for (Item item : items) {
                desc += item + "\n";
            }
            return desc.trim();
        } else {
            return getItem();
        }
    }

    int findBoxNo(String itemName) {
        if (this.itemName != null) {
            return this.itemName.toLowerCase().equals(itemName.toLowerCase()) ? 0 : -1;
        }
        return -1;
    }

    ;
}
