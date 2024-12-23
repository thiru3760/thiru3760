package LabSesssion.InventoryManagement;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ClientMain {
    public static void main(String[] args) {

        List<Item> itemList = new ArrayList<>();

        Item clothing1 = new Clothing("C1", "Shirt", 100, 10, "M");
        Item clothing2 = new Clothing("C2", "Pants", 200, 5, "L");
        Item clothing3 = new Clothing("C3", "Dress", 150, 7, "S");
        Item electronic1 = new Electronics("E1", "Phone", 500, 3, 2);
        Item electronic2 = new Electronics("E2", "Laptop", 1000, 2, 4);
        Item electronic3 = new Electronics("E3", "Tablet", 300, 5, 3);
        Item electronic4 = new Electronics("E4", "Smart Watch", 200, 10, 1);
        Item clothing4 = new Clothing("C4", "T-Shirt", 50, 20, "XL");
        Item clothing5 = new Clothing("C5", "Jeans", 250, 3, "M");

        itemList.add(clothing1);
        itemList.add(clothing2);
        itemList.add(clothing3);
        itemList.add(clothing4);
        itemList.add(clothing5);
        itemList.add(electronic1);
        itemList.add(electronic2);
        itemList.add(electronic3);
        itemList.add(electronic4);

        System.out.println("============== Before sorting==========================");
        for (Item item : itemList) {
            System.out.println(item.getName());
        }

        System.out.println("==============After sorting==========================");
        Collections.sort(itemList);
        for (Item item : itemList) {
            System.out.println(item.getName());
        }


        //

        System.out.println("============== Inventory details=========================");
        Inventory<Item> bookInventory = new Inventory();
        //Adding items to the inventory
        bookInventory.addItem(clothing1);
        bookInventory.addItem(clothing2);
        bookInventory.addItem(clothing3);
        bookInventory.addItem(clothing4);

        //getting all clothes objects from the inventory
        Collection<Item> clothes = bookInventory.getItems();
        //Printing all the clothes
        for (Item item : clothes) {
            System.out.println(item.getName());
        }

        //Getting the cloth from the inventorying using id
        Item cloth = bookInventory.getItem("C1");

        //Printing the details of the cloth
        System.out.println(cloth.getName());


        //Removing the cloth from the inventory
        bookInventory.removeItem("C1");

        System.out.println("============== after removed c1=========================");
        //getting all clothes objects from the inventory
        clothes = bookInventory.getItems();

        //Printing all the clothes
        for (Item item : clothes) {
            System.out.println(item.getName());
        }


        //testing RecentlyViewedItems

        RecentlyViewedItem<Item> recentlyViewedItems = new RecentlyViewedItem<>(3);
        /*recentlyViewedItems.add(clothing1);
        recentlyViewedItems.add(clothing2);
        recentlyViewedItems.add(clothing3);
        recentlyViewedItems.add(clothing4);*/
        recentlyViewedItems.add(clothing5);
        //recentlyViewedItems.add(electronic1);
        recentlyViewedItems.add(electronic2);
        recentlyViewedItems.add(electronic3);

        //printing the recently viewed items

        System.out.println("============== Recently viewed items=========================");
        recentlyViewedItems.display();
        System.out.println("============== Recently viewed items=========================");
        Item item = recentlyViewedItems.getRecentItem();
        System.out.println(item.getName());
        System.out.println("============== one item removed=========================");
        recentlyViewedItems.removeItem(electronic3);
        item = recentlyViewedItems.getRecentItem();
        System.out.println(item.getName());



        // Testing order and orderProcess

        System.out.println("============== Order and OrderProcess=========================");
        Order order1 = new Order( "1", false);
        Order order2 = new Order( "2", true);
        Order order3 = new Order( "3", true);
        Order order4 = new Order( "4", false);

        OrderProcess orderProcess = new OrderProcess();
        orderProcess.addOrder(order1);
        orderProcess.addOrder(order2);
        orderProcess.addOrder(order3);
        orderProcess.addOrder(order4);
        orderProcess.processOrder();
        orderProcess.processOrder();
        orderProcess.processOrder();
        orderProcess.processOrder();



    }
}
