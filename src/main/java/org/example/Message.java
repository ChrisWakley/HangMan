package org.example;

import java.util.Scanner;

public class Message {

    public boolean welcome() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("(☞ﾟヮﾟ)☞  Welcome to Hangman!  ☜(ﾟヮﾟ☜)");
        System.out.println("Please enter your name: ");
        String name = scanner.next();
        System.out.println("Hello " + name + "! Please press S to begin or Q to quit the game.");
        String choice = scanner.next();

        if (choice.equals("s")) {
            System.out.println("Game started, try not to die!");
            System.out.println("Please input a letter.");
        } else if (choice.equals("q")) {
            System.out.println("Quitting game...");
            scanner.close();
        } else {
            System.out.println("Please input a valid letter.");
        }
        return true;
    }
}
