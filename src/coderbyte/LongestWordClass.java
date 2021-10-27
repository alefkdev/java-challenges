package coderbyte;

import java.util.Scanner;

public class LongestWordClass {

    private static String LongestWord(String sen) {

        String longest = "";
        Integer size = 0;

        String[] words = sen.split(" ");

        for(String word : words){

            word = word.replaceAll("[^a-zA-Z0-9]+","");

            if(word.length() > size){
                size = word.length();
                longest = word;
            }

        }

        return longest;

    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print(LongestWord(s.nextLine()));

    }

}
