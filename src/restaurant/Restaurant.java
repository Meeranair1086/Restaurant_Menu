package restaurant;

import com.sun.source.tree.WhileLoopTree;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Restaurant {

    public static void main(String[] args) {

        Restaurant rest = new Restaurant();
        Menu menuObj = new Menu();
        MenuItems objMenuItems = new MenuItems();
        MenuItems objMenuItems1 = new MenuItems();
        MenuItems objMenuItems2 = new MenuItems();
        MenuItems objMenuItems3 = new MenuItems();

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy, HH:mm:ss");
        Date date = new Date();
        String dateFormatter = formatter.format(date);

        Map<MenuItems, String> mapfinalObj = new HashMap<>();

        objMenuItems.setName("Chicken Biryani");
        objMenuItems.setPrice(13.99);
        objMenuItems.setDescription("Chicken and rice");
        objMenuItems.setCategory("Main Course");

        objMenuItems1.setName("Mango Lassi");
        objMenuItems1.setPrice(5.99);
        objMenuItems1.setDescription("Mango and yogurt");
        objMenuItems1.setCategory("Dessert");

        objMenuItems2.setName("Vegetable soup");
        objMenuItems2.setPrice(6.99);
        objMenuItems2.setDescription("Mixed vegetable soup");
        objMenuItems2.setCategory("Soup");

        objMenuItems3.setName("Cauliflower Manchurian");
        objMenuItems3.setPrice(8.99);
        objMenuItems3.setDescription("Cauliflower with sauces");
        objMenuItems3.setCategory("Appetizer");

        // Add Menu Items
        int n = mapfinalObj.size();
        //   mapfinalObj = menuObj.addMenuItems(objMenuItems);
        //  mapfinalObj = menuObj.addMenuItems(objMenuItems1);

        System.out.println("Size of map before adding dish is :" + mapfinalObj.size());

        mapfinalObj.put(objMenuItems, dateFormatter);
        mapfinalObj.put(objMenuItems1, dateFormatter);
        mapfinalObj.put(objMenuItems2, dateFormatter);
        mapfinalObj.put(objMenuItems3, dateFormatter);

        System.out.println("Size of map after adding dishes is :" + mapfinalObj.size());

        if (mapfinalObj.size() > n) {
            System.out.println("New Item is added");
            System.out.println("Menu was updated at :" + dateFormatter);
        } else if (mapfinalObj.size() == 0) {
            System.out.println("Could not able to add item to the map");
        } else {
            System.out.println("Item already present");
        }

        //Display Entire Menu
        menuObj.displayMenu(mapfinalObj);

        //Display Menu for a given item
        menuObj.displayItem(mapfinalObj, "Chicken Biryani");

        // Remove Menu items
        String remove = menuObj.removeMenuItem(mapfinalObj, "Chicken Fried Rice");
        System.out.println(remove);

        // Comparing two Menu Items
        boolean result = menuObj.compareMenuItems(objMenuItems,objMenuItems1);
        if(result) System.out.println("Both MenuItems are equal");
        else
            System.out.println("Both MenuItems are not equal");
    }
}
