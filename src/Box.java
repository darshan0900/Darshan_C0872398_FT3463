import java.util.ArrayList;

public class Box {
    private int boxNo;

    private final ArrayList<SimpleItem> items;

    public Box(int count, int boxNo) {
        this.boxNo = boxNo;
        items = new ArrayList<>(count);
    }

    public int getBoxNo() {
        return boxNo;
    }

    public void setBoxNo(int boxNo) {
        this.boxNo = boxNo;
    }

    public ArrayList<SimpleItem> getItems() {
        return items;
    }

    public void addItem(SimpleItem item) {
        items.add(item);
    }

    public void addItem(Box box) {
        items.addAll(box.getItems());
    }

    public int findBoxNo(String itemName) {
        for (SimpleItem item : items) {
            if (item.getItemName().toLowerCase().equals(itemName.toLowerCase())) {
                return getBoxNo();
            }
        }
        return -1;
    }

    public void print() {
        for (SimpleItem item : items) {
            System.out.println(item.getItemName());
        }
    }
}
