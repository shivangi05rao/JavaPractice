package solidprinciples.examples;

//Interface segregation principle
public interface RestaurantEmployee {
    void washDishes();

    void serveCustomers();

    void cookFood();
}

//class waiter implements RestaurantEmployee {
//
//    @Override
//    public void washDishes() {
//        //not my job
//    }
//
//    @Override
//    public void serveCustomers() {
//        System.out.println("Serve the customers");
//    }
//
//    @Override
//    public void cookFood() {
//        //not my job
//    }
//}

interface WaiterInterface {
    void serveCustomer();

    void takeOrder();
}

interface ChefInterface {
    void decideMenu();

    void cookFood();
}

class waiter implements WaiterInterface {

    @Override
    public void serveCustomer() {
        System.out.println("Serve the customer");
    }

    @Override
    public void takeOrder() {
        System.out.println("Take the order from customer");
    }
}

class Chef implements ChefInterface {

    @Override
    public void decideMenu() {
        System.out.println("Decide menu");
    }

    @Override
    public void cookFood() {
        System.out.println("Cook food");
    }
}




