package test;


import java.util.UUID;

class Ticket {
    private String pnr;
    private String trainNumber;

    // Constructor to initialize the train number and generate a PNR
    public Ticket(String trainNumber) {
        this.trainNumber = trainNumber;
        this.pnr = generatePNR();
    }

    // Method to generate a unique PNR
    private String generatePNR() {
        return UUID.randomUUID().toString();
    }

    // Getters
    public String getPNR() {
        return pnr;
    }

    public String getTrainNumber() {
        return trainNumber;
    }

    // Display ticket details
    public void displayTicket() {
        System.out.println("Ticket Details:");
        System.out.println("PNR: " + getPNR());
        System.out.println("Train Number: " + getTrainNumber());
    }
}

public class TicketGenerator {
    public static void main(String[] args) {
        // Create a new ticket with a specified train number
        Ticket ticket1 = new Ticket("12345");
        Ticket ticket2 = new Ticket("67890");

        // Display the ticket details
        ticket1.displayTicket();
        ticket2.displayTicket();
    }
}

