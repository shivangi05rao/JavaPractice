package collectionFramework.arraylist;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnAL {
    public static void main(String[] args) {
        List<String> shoppingList = new CopyOnWriteArrayList<>();
        shoppingList.add("Milk");
        shoppingList.add("Eggs");
        shoppingList.add("Bread");
        System.out.println("Initial shopping list: " + shoppingList);

        for (String item : shoppingList) {
            if (item.equals("Eggs")){
                shoppingList.add("Butter");
                System.out.println("Added butter while reading");
            }
        }
        System.out.println("Updated ArrayList: " + shoppingList);
    }
}
