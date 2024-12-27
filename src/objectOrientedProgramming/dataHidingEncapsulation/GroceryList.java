package objectOrientedProgramming.dataHidingEncapsulation;

public class GroceryList {
    private int numberOfItems;
    private final String[] items;

    public GroceryList() {
        numberOfItems = 0;
        items = new String[20];
    }

    public void insertItem(String item) {
        if (numberOfItems < 20){
            items[numberOfItems] = item;
            numberOfItems++;
        } else {
            System.out.println("List is full cannot add more items");
        }
    }

    public void printList(){
        for (int i = 0; i< numberOfItems; i++){
            System.out.println(items[i] + " ");
        }
    }

    public static void main(String[] args) {
        GroceryList list = new GroceryList();
        list.insertItem("Onion");
        list.insertItem("Bread");
        list.insertItem("Chicken");
        list.printList();
    }
}
