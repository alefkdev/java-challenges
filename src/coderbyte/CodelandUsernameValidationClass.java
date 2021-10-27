package coderbyte;

import java.util.Scanner;

public class CodelandUsernameValidationClass {

    public static String CodelandUsernameValidation(String str) {

        String result = "false";

        if( (str.length() > 4 && str.length() < 25) &&
                (Character.isLetter(str.charAt(0))) &&
                (str.charAt(str.length()-1) != '_') &&
                (str.matches("[a-zA-Z0-9_]*"))) {

            result = "true";

        }

            // code goes here
            return result;
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print(CodelandUsernameValidation(s.nextLine()));

    }

}
