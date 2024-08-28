package objectOrientedProgramming.abstraction.question;

abstract class Book {
    protected String name;
    protected String author;
    protected String price;

    public Book(String name, String author, String price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    abstract String getDetails();
}

class MyBook extends Book {
    private String title;

    public MyBook(String name, String price, String title) {
        super(name, "J.k. Rowling", price);
        this.title = title;
    }

    @Override
    public String getDetails() {
        return name + ", " + author + ", " + price + ", " + title;
    }
}

class Main {
    public static void main(String[] args) {
        Book myBook = new MyBook("Harry Potter", "100", "The Half Blood Princess");
        System.out.println(myBook.getDetails());
    }
}
