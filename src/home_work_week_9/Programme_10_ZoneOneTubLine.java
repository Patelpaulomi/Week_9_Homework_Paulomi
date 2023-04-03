package home_work_week_9;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Write a programme that tells you which line passes through particular stations.
 * Just use Zone 1 stations name.
 */


public class Programme_10_ZoneOneTubLine {
    public static void main(String[] args) {
        char c;

        HashMap<String, String> zone = new HashMap<>();

        //Stations name and Tube line passes in zone 1

        zone.put("Paddington", "Bakerloo/Circle/District/Hammersmith & City");
        zone.put("Edgware Road", "Bakerloo/Circle/District/Hammersmith & City");
        zone.put("Marlyebone", "Bakerloo");
        zone.put("Baker street", "Bakerloo/Jubilee/Metropolitan/Hammersmith & City");
        zone.put("Oxford Circus", "Bakerloo/Central/Victoria");
        zone.put("Piccadilly Circus", "Bakerloo");
        zone.put("Charing Cross", "Bakerloo/Northen");
        zone.put("Embankment", "Bakerloo/Northern/Circle");
        zone.put("Waterloo", "Bakerloo/Jubliee/Northern");
        zone.put("LambethNorth", "Bakerloo");
        zone.put("Elephant&castle", "Bakerloo/Northern");
        zone.put("NottingHill Gate", "Central/Circle/District");
        zone.put("Queensway", "Central");
        zone.put("lancasterGate", "Central");
        zone.put("MarbleArch", "Central");
        zone.put("Bond Street", "Central/Jubilee");
        zone.put("Holborn", "Central/Northern/Piccadilly");
        zone.put("Tottenum Court Road", "Central/Northern");
        zone.put("ChanceryLane", "Central");
        zone.put("StPaul", "Central");
        zone.put("Bank", "Central/Northern");
        zone.put("Liverpool Street", "Central/Metropolitan/Circle/Hammersmith & City");
        zone.put("GreenPark", "Jubliee/Piccadilly");
        zone.put("Westminster", "Jubliee/Circle");
        zone.put("Southwark", "Jubliee");
        zone.put("Londonbridge", "Jubliee/Northen");
        zone.put("Euston", "Northern/Victoria");
        zone.put("King'sCross", "Northern/Piccadilly/Metropolitan/Hammersmith & City/Victoria");
        zone.put("Angel", "Northern");
        zone.put("OldStreet", "Northern");
        zone.put("Moorgate", "Northern/Metropolitan/Hammersmith & City");
        zone.put("Borough", "Northern");
        zone.put("Warren Street", "Northern/Victoria");
        zone.put("Goodge Street", "Northern");
        zone.put("Lecicester Square", "Northern/Piccadilly");
        zone.put("Earl's Court", "Piccadilly/District");
        zone.put("Gloucester Road", "Piccadilly/Circle/District");
        zone.put("South Kensington", "Piccadilly/Circle/District");
        zone.put("KnightsBridge", "Piccadilly");
        zone.put("HydePark Corner", "Piccadilly");
        zone.put("Covent Garden", "Piccadilly");
        zone.put("RusselSquare", "Piccadilly");
        zone.put("GreatPortLand", "Metropolitan/Hammersmith & City");
        zone.put("Euston Square", "Metropolitan/Hammersmith & City");
        zone.put("Farringdon", "Metropolitan/Hammersmith & City");
        zone.put("Barbican", "Metropolitan/Hammersmith & City");
        zone.put("Aldgate", "Metropolitan/Circle");
        zone.put("Bayswater", "Circle/District");
        zone.put("HighStreet Kensington", "Circle/District");
        zone.put("Sloane Square", "Circle");
        zone.put("Victoria", "Circle/Victoria");
        zone.put("St Jame's Park", "Circle");
        zone.put("Temple", "Circle");
        zone.put("Blackfrier", "Circle");
        zone.put("Mansion House", "Circle");
        zone.put("CannonStreet", "Circle");
        zone.put("Monument", "Circle");
        zone.put("TowerHill", "Circle/District");
        zone.put("Tower", "Circle");
        zone.put("Aldgate East", "Circle/Hammersmith & City");
        zone.put("Vauxhall", "Victoria");

        do {
            Scanner scan = new Scanner(System.in);// scanner declaration
            System.out.println("Enter any Zone 1 station name: ");//Userinput the station name
            String stationName = scan.nextLine();// variable stored in "StationName"
            for (String i : zone.keySet()) { // for each syntax
                if (stationName.equalsIgnoreCase(i)) { // if syntax
                    System.out.println(zone.get(i));
                }
            }
            System.out.println("Would you like to search for more station please enter \"Y or \"N : ");
            String res = scan.next();
            c = res.charAt(0);

        } while (c == 'y' || c == 'Y'); //do - while syntax

        System.out.println("Thank you for browsing TFL website");

    }
}










