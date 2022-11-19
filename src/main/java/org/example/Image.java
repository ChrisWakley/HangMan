package org.example;

public class Image {
        public static void printHangman(int lives) {
            if(lives == 0) {
                System.out.println("");
                System.out.println("  ____________");
                System.out.println("  |          |");
                System.out.println("  |        (ʘ‿ʘ)              you are");
                System.out.println("  |       <(   )>            a loser.");
                System.out.println("  |        /   |");
                System.out.println("  |");
                System.out.println("  | ");
                System.out.println("__|____");
                System.out.println("");
            }
            if(lives == 1) {
                System.out.println("");
                System.out.println("  ____________");
                System.out.println("  |          |");
                System.out.println("  |        (ʘ‿ʘ)");
                System.out.println("  |       <(   )>");
                System.out.println("  |");
                System.out.println("  |");
                System.out.println("  | ");
                System.out.println("__|____");
                System.out.println("");
            }
            if(lives == 2) {
                System.out.println("");
                System.out.println("  ____________");
                System.out.println("  |          |");
                System.out.println("  |        (ʘ‿ʘ)");
                System.out.println("  |");
                System.out.println("  |");
                System.out.println("  |");
                System.out.println("  | ");
                System.out.println("__|____");
                System.out.println("");
            }
            if(lives == 3) {
                System.out.println("");
                System.out.println("  ____________");
                System.out.println("  |          |");
                System.out.println("  |");
                System.out.println("  |");
                System.out.println("  |");
                System.out.println("  |");
                System.out.println("  | ");
                System.out.println("__|____");
                System.out.println("");
            }
            if(lives == 4) {
                System.out.println("");
                System.out.println("  ____________");
                System.out.println("  |");
                System.out.println("  |");
                System.out.println("  |");
                System.out.println("  |");
                System.out.println("  |");
                System.out.println("  | ");
                System.out.println("__|____");
                System.out.println("");
            }
            if(lives == 5) {
                System.out.println("");
                System.out.println("  |");
                System.out.println("  |");
                System.out.println("  |");
                System.out.println("  |");
                System.out.println("  |");
                System.out.println("  | ");
                System.out.println("__|____");
                System.out.println("");
            }
            if(lives == 6) {
                System.out.println("");
                System.out.println("__|____");
                System.out.println("");
            }
            if(lives == 7) {
                System.out.println("");
                System.out.println("_______");
                System.out.println("");
            }
            if(lives == 8) {
                System.out.println("");
                System.out.println("");
            }
        }
    }
