package com.pluralsight;
import java.util.Scanner;

public class Main {

   static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        // Known Values


        String feeling = promtForString("whats up?");
        System.out.println("Obaid is feelling: "+ feeling);

    }

    static String promtForString(String promt){

        System.out.println(promt);
        promt = scanner.nextLine();
        return promt;
    }
}