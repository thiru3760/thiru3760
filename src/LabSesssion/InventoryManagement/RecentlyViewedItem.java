package LabSesssion.InventoryManagement;

import java.util.Iterator;
import java.util.LinkedList;

public class RecentlyViewedItem<T extends Item>  {

    private LinkedList<T> recentlyViewedItems;;
    private int maxItems;

    public RecentlyViewedItem(int maxItems) {
        this.recentlyViewedItems = new LinkedList<>();
        this.maxItems = maxItems;
    }

    public void add(T item) {
        if(recentlyViewedItems.size() == maxItems) {
            recentlyViewedItems.removeLast();
        }
        recentlyViewedItems.remove(item);
        recentlyViewedItems.addFirst(item);
    }

    public void display() {
        Iterator it = recentlyViewedItems.iterator();
        while (it.hasNext()) {
            System.out.println( ((Item)it.next()).getName());
        }
        /*for(T item : recentlyViewedItems) {
            System.out.println(item.getName());
        }*/
    }

    public T getRecentItem(){
        return  recentlyViewedItems.getFirst();
    }

    public void removeItem(T item){
       recentlyViewedItems.remove(item);
    }

}
