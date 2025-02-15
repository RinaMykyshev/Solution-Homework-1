package items;

import java.util.ArrayList;

public class ItemManager {
    private ArrayList<Object> items;

    public ItemManager() {
        this.items = new ArrayList<>();
    }

    public void addItem(Object item) {
        items.add(item);
        System.out.println("Item added: " + item.getClass().getSimpleName());
    }

    public ArrayList<Object> getItems() {
        return items;
    }
}
