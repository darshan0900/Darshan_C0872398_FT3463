import java.util.ArrayList;

public class Moving {
    private final ArrayList<Box> items;

    public Moving(int count) {
        items = new ArrayList<>(count);
    }

    void addBox(Box box) {
        items.add(box);
    }

    int find(String itemName) {
        for (Box box : items) {
            int boxNo = box.findBoxNo(itemName);
            if (boxNo > -1) return boxNo;
        }
        return -1;
    }

    void print() {
        System.out.println("The objects of my move are: ");
        for (Box box : items) {
            box.print();
        }
    }

}
