package starPattern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


        public class ReverseAlphabetsDigits {
            public static void main(String[] args) {
                String sentence = "My Wife Shraddha his mobile number is 9049707390 and Height is 140";

                // Remove spaces
                sentence = sentence.replaceAll("\\s", "").toLowerCase();

                // ----- ALPHABETS -----
                String alphabets = sentence.replaceAll("[0-9]", ""); // keep only letters
                System.out.println("Alphabets only: " + alphabets);

                // Convert to Character[] for reverse sorting
                Character[] alphaList = new Character[alphabets.length()];
                for (int i = 0; i < alphabets.length(); i++) {
                    alphaList[i] = alphabets.charAt(i);
                }

                Arrays.sort(alphaList); // Ascending
                System.out.println("Ascending Alphabets: " + Arrays.toString(alphaList));

                Arrays.sort(alphaList, Collections.reverseOrder()); // Descending
                System.out.println("Descending Alphabets: " + Arrays.toString(alphaList));

                // ----- DIGITS -----
                String digits = sentence.replaceAll("[a-zA-Z]", ""); // keep only digits
                System.out.println("Digits only: " + digits);
                System.out.println(digits.length());

                // Convert to Character[] for reverse sorting
                Character[] digitList = new Character[digits.length()];
                for (int i = 0; i < digits.length(); i++) {
                    digitList[i] = digits.charAt(i);
                }

                Arrays.sort(digitList); // Ascending
                System.out.println("Ascending Digits: " + Arrays.toString(digitList));

                Arrays.sort(digitList, Collections.reverseOrder()); // Descending
                System.out.println("Descending Digits: " + Arrays.toString(digitList));
            }
        }

