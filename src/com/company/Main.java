package com.company;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Passanger passanger = new Passanger("Shashank", "8209071692", "shashank4mathur@gmail.com", "23", "Jaipur", "Rajasthan");

        System.out.println(passanger.getContactDetails());
        System.out.println(passanger.getAddressDetails());

        Flight flight = new Flight("ac-123", "Indigo", 15, 0);

        System.out.println(flight.getFlightDetails());

        if (flight.getCapacity() > flight.getSeatBooked()) {
            RegularTicket regularTicket = new RegularTicket("air-123", "jaipur", "mumbai",
                    "11/02/2021 10:00:00", "11/02/2021 16:00:00",
                    10, 2500, flight, passanger, "food");
            System.out.println("Regular Ticket for passanger " + passanger.getName() + " is booked");
            printTicketDetails(regularTicket);
        } else {
            System.out.println("No seat available");
        }

        ArrayList<String> location = new ArrayList<String>(Arrays.asList("Zoho", "Ajio", "AutoRabit", "Amazon", "CRED"));

        if (flight.getCapacity() > flight.getSeatBooked()) {
            TouristTicket touristTicket = new TouristTicket("jet-123", "mumbai", "chennai",
                    "12/01/2021 10:00:00", "12/01/2021 14:00:00",
                    12, 2000, flight, passanger, "hotel Vijan Place, GandhiNagar, Mumbai", location);
            System.out.println("Tourist Ticket for passanger " + passanger.getName() + " is booked");

            printTicketDetails(touristTicket);
        } else {
            System.out.println("No seat available");
        }

    }

    public static void printTicketDetails(Ticket ticket) {
        System.out.println("PNR Number: " + ticket.getPnrNumber());
    }
}