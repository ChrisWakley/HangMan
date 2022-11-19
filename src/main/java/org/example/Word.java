package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Word {

    private static final List<String> words = new ArrayList<>();
    private static final Random RANDOM = new Random();

    static {
        words.add("resistance");
        words.add("transformer");
        words.add("electronics");
        words.add("transmit");
        words.add("aerial");
        words.add("positive");
        words.add("negative");
        words.add("impedance");
        words.add("inertia");
        words.add("Infinite");
        words.add("measurement");
        words.add("frequency");
        words.add("bandwidth");
        words.add("terminal");
        words.add("wavelength");
        words.add("overload");
        words.add("neutral");
        words.add("capacitor");
        words.add("transistor");
        words.add("electricity");
    }

    public static String generateWord() {
        return words.get( RANDOM.nextInt( words.size() ) );
    }

}
