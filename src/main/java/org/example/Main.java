package org.example;


import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("TEXT: I did, did I? "+checkForPalindrome("I did, did I?"));
        System.out.println("TEXT: Racecar "+checkForPalindrome("Racecar"));
        System.out.println("TEXT: hello "+checkForPalindrome("hello"));
        System.out.println("TEXT: Was it a car or a cat I saw ? "+checkForPalindrome("Was it a car or a cat I saw ?"));

        System.out.println(convertDecimalToBinary(6));


    }


    public static boolean checkForPalindrome(String text){
        String[] cleanText = text.toLowerCase(Locale.forLanguageTag("EN-en")).replaceAll("[.,?!_\\-\\s]", "").split("");
        List<String> karakterDizisiListi = new ArrayList<String>(List.of(cleanText));
        List<String> karakterDizisiListiReversed = new ArrayList<String>(List.of(cleanText));
        Collections.reverse(karakterDizisiListiReversed);
        return karakterDizisiListi.equals(karakterDizisiListiReversed);
    }

    public static String convertDecimalToBinary(int sayi){
        LinkedList<Integer> ikilik = new LinkedList<>();
        while(!(sayi<=0)){
            ikilik.add(sayi%2);
            sayi = sayi / 2;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for(int i : ikilik){
            stringBuilder.append(i);
        }
        return stringBuilder.reverse().toString();
    }


}