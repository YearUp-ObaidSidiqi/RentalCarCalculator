package com.pluralsight;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class TheApp {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);


        // Known Values
        double priceOfCarRentalPerDay = 29.99f;
        double priceOfTotalTagPerDay = 3.95;
        double priceOfGPSPerDay = 2.95f;
        double priceOfRoadsideAssistancePerPage = 3.95;


        // Values from user
        String customerName, pickUpDate, hotel;

        int numbersOfDays=0;
        boolean needsTollTag = false;
        boolean needsGPS = false;
        boolean needsRoadAssistance = false;
        int age=0;

        System.out.println("\nWelcome to Amazon Rental Car Company!");
        System.out.println("\nLet's Calculate How much you will be paying for your favorite car! & Enjoy your visit from New York!");
        System.out.println("Please Enter your Name: ");
        customerName = scanner.nextLine();
        System.out.println("Where in New York you will be staying, \n Please enter the Hotel Name: ");
        hotel=scanner.nextLine();
        System.out.println("When would you like your car delivered to you: \n Please Enter the date in MM-DD_YYYY ");
        pickUpDate=scanner.nextLine();
        System.out.println("Please Answer the following Question: \nPlease enter 'Y' for if you think you might need it and 'N' if you would not need for. ");
        System.out.println("Would you like to have a Road Assistance? ");
        needsRoadAssistance = scanner.hasNext();
        System.out.println("Would you like GPS: ");
        System.out.println("Would you like Toll Tag to avoid Delays: ");





        // Calculation
        double totalPriceOfCarRental = priceOfCarRentalPerDay * numbersOfDays;
        // use if statement here
        double totalPriceOfTotalTag = (needsTollTag) ? (priceOfTotalTagPerDay * numbersOfDays) : 0;
        double totalPriceOfGPS = (needsGPS) ? (priceOfGPSPerDay * numbersOfDays) : 0;
        double totalPriceOfRoadsideAssistance = (needsRoadAssistance) ? (priceOfRoadsideAssistancePerPage * numbersOfDays) : 0;
        double underAgeSurcharges = (age > 18) ? (totalPriceOfCarRental * 0.30) : 0;
        double totalOptionsCost = totalPriceOfGPS + totalPriceOfTotalTag + totalPriceOfRoadsideAssistance;
        double totalCost = totalPriceOfCarRental + totalOptionsCost + underAgeSurcharges;

        //Display the results
        System.out.printf("Basic Car Rental Fee:   %.2f\n", totalPriceOfCarRental);
        System.out.printf("Options Fee:            %.2f\n", totalOptionsCost);
        System.out.printf("Underage Surcharge Fee: %.2f\n", underAgeSurcharges);
        System.out.println("-------------------------------------");
        System.out.printf("TOTAL:                  %.2f\n", totalCost);

        System.out.println(pickUpDate);

    }


}
