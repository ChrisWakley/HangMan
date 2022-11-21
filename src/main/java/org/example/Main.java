package org.example;

import java.util.Scanner;
import static org.example.Image.printHangman;

public class Main {

    public static boolean Play(String answer) {

        Scanner scanner = new Scanner(System.in);
        char[] underscoreArr = new char[answer.length()];
        int lives = 8;

        for (int i = 0; i < answer.length(); i++) {
            underscoreArr[i] = '_';
        }

        while (lives > 0) {
            char input = scanner.next().toLowerCase().charAt(0);
                if (answer.contains(String.valueOf(input))) {
                    for (int i = 0; i < answer.length(); i++) {
                        if (input == answer.charAt(i)) {
                            underscoreArr[i] = input;
                        }
                    }
                } else {
                    lives--;
                }
                System.out.println(underscoreArr);
                System.out.println(lives + " lives remaining.");
                printHangman(lives);

                if (String.valueOf(underscoreArr).equals(answer)) {
                    System.out.println("You win, live another day!");
                    return true;
                }
            }
        System.out.println("Oh dear, you died. The correct word was: " + answer);
        return false;
    }

    public static void main(String[] args) {

        Message message = new Message();
        System.out.println(message.welcome());
        boolean flag;
        do {
            flag = true;
            String answer = Word.generateWord();
            Play(answer);
            Scanner userReply = new Scanner(System.in);
            System.out.println("Press any key to play again. Press N to exit game.");
            String response = userReply.nextLine().toLowerCase();
            if (!response.equals("n")) {
                flag = true;
                System.out.println("Game reset.");
            } else if ("n".equals(response)) {
                flag = false;
                System.out.println("game exit");
            }
        } while (flag);
    }
}