package LabSesssion.InventoryManagement;

import java.util.*;

public class Inventory<T extends Item> {

    private Map<String, T> items;


    public Inventory() {
        items = new HashMap<>();
    }


    public void addItem(T item) {
        items.put(item.getId(), item);

    }

    public void removeItem(String id) {
        items.remove(id);
    }

    public T getItem(String id) {

        return items.get(id);
    }

    public List<T> getItems() {
        return items.values().stream().toList();
    }

}
