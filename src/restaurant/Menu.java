package restaurant;

import java.text.SimpleDateFormat;
import java.util.*;

public class Menu {

    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy, HH:mm:ss");
    Date date = new Date();
    String dateFormatter = formatter.format(date);

   /* public Map<MenuItems, String> addMenuItems(MenuItems menuitems) {

        Map<MenuItems, String> mapObj = new HashMap<>();
        mapObj.put(menuitems, dateFormatter);
        return mapObj;
    }*/

    public String removeMenuItem(Map<MenuItems, String> mapObj, String item) {
        String result = "";
        for (Map.Entry<MenuItems, String> entry : mapObj.entrySet()) {
            MenuItems searchKey = entry.getKey();
            if (searchKey.getName().equalsIgnoreCase(item)) {
                mapObj.remove(searchKey);
                result = "Item removed";
            } else {
                result = "Item not available to remove";
            }
        }
        return result;
    }

    public void displayMenu(Map<MenuItems, String> mapfinalObj) {
        System.out.println("The Entire Menu Items is:");
        for (Map.Entry<MenuItems, String> entry : mapfinalObj.entrySet()) {
            System.out.println(entry.getKey().getName()+","+entry.getKey().getPrice()+","+entry.getKey().getDescription()+","+entry.getKey().getCategory());
            //  mapObj.forEach((k,v)->System.out.println(k.getName()+":"+v));
        }
    }

    public void displayItem(Map<MenuItems, String> mapObj, String item) {
        for (Map.Entry<MenuItems, String> entry : mapObj.entrySet()) {
            if (entry.getKey().getName().equalsIgnoreCase(item)) {
                System.out.println("Details of " + item + " is:");
                System.out.println(entry.getKey().getName() + "," + entry.getKey().getCategory() + "," + entry.getKey().getPrice() + "," + entry.getKey().getDescription());
            }
            //  mapObj.forEach((k,v)->System.out.println(k.getName()+":"+v));
        }
    }

    public boolean compareMenuItems(MenuItems objMenuItems, MenuItems objMenuItems1) {
        boolean result=false;
        if(objMenuItems.equals(objMenuItems1))
            return true;
        else
            return false;
    }
}





