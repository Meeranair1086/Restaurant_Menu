package restaurant;


import java.text.SimpleDateFormat;
import java.util.*;

public class Menu {

    public static void main(String[] args) {

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy, HH:mm:ss");
        Date date = new Date();

        String dateFormatter = formatter.format(date);

        MenuItems objMenuItems = new MenuItems();
        MenuItems objMenuItems1 = new MenuItems();
        MenuItems objMenuItems2 = new MenuItems();

        Map<MenuItems, String> mapObj = new HashMap<>();

        objMenuItems.setName("Vegetable Fried Rice");
        objMenuItems.setPrice(13.99);
        objMenuItems.setDescription("Vegetables rice Sauces and spices");
        objMenuItems.setCategory("Main Course");

        objMenuItems1.setName("Vegetable Soup");
        objMenuItems1.setPrice(5.99);
        objMenuItems1.setDescription("Mixed Vegetables black pepper vegetable stock and sauces");
        objMenuItems1.setCategory("Soups");

        objMenuItems2.setName("Cauliflower Manchurian");
        objMenuItems2.setPrice(8.99);
        objMenuItems2.setDescription("Cauliflower fried and mixed in sauces");
        objMenuItems2.setCategory("Appetizers");

        mapObj.put(objMenuItems, dateFormatter);
        mapObj.put(objMenuItems1, dateFormatter);
        mapObj.put(objMenuItems2, dateFormatter);

        System.out.println("Newly added Item and it's Last updated date and time:");
        for (Map.Entry<MenuItems, String> entry : mapObj.entrySet()) {
            System.out.println(entry.getKey().getName() + ":" + entry.getValue());
            //  mapObj.forEach((k,v)->System.out.println(k.getName()+":"+v));
        }

    }
}







