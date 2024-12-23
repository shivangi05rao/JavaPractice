package solidprinciples.examples;

//Single Responsibility Principle
public class Marker {
    String name;
    String color;
    int price;
    int year;

    public Marker(String name, String color, int price, int year) {
        this.name = name;
        this.color = color;
        this.price = price;
        this.year = year;
    }
}

class Invoice {
    private Marker marker;
    private int quantity;

    public Invoice(Marker marker, int quantity) {
        this.marker = marker;
        this.quantity = quantity;
    }

    public int calculateTotal() {
        return this.quantity * marker.price;
    }
}

class InvoiceDao {
    Invoice invoice;

    public InvoiceDao(Invoice invoice) {
        this.invoice = invoice;
    }

    public void saveToDb() {
        //
    }
}

class InvoicePrinter {
    private Invoice invoice;

    public InvoicePrinter(Invoice invoice) {
        this.invoice = invoice;
    }

    public void printInvoice() {
        //
    }
}


//Open/Close Principle
interface InvoiceDaoInterface {
    public void save(Invoice invoice);
}

class DatabaseInvoiceDao implements InvoiceDaoInterface {

    @Override
    public void save(Invoice invoice) {

    }
}

class FileInvoiceDao implements InvoiceDaoInterface {

    @Override
    public void save(Invoice invoice) {

    }
}















