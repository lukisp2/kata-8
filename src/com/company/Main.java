package com.company;

class MexicanWave {

    public static String[] wave(String str) {

        int letters = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))) {
                letters++;
            }
        }
        String[] anArray = new String[letters];

        for (int i = 0; i < letters; i++) {
            String waveString = "";
            int nonLetters = 0;
            for (int j = 0; j < str.length(); j++) {

                if (Character.isLetter((str.charAt(j)))) {

                    if (j == (i+nonLetters)) {

                        waveString += Character.toUpperCase((str.charAt(j)));

                    } else {

                        waveString += str.charAt(j);

                    }
                } else {
                    waveString += str.charAt(j);
                    nonLetters++;
                }

            }
            anArray[i] = waveString;

        }


        return anArray;
    }

}

public class Main {

    public static void main(String[] args) {
        String[] wave = new String[10];
        wave = MexicanWave.wave(" gap ");
        System.out.println(wave);
    }
}
