//import java.util.Scanner;

public class CountCharacters {

    public static void main(String[] args) {

        /*Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");*/

        String inputString = "Hi this Vijayaragavan , phone number is 6383436185, email is vijay2001@gmail.com ...";

        int letterCount = 0;

        int spaceCount = 0;

        int numberCount = 0;

        int specialCharCount = 0;

        for (int i = 0; i < inputString.length(); i++) {

            char ch = inputString.charAt(i);

            	if (Character.isLetter(ch)) {

                	letterCount++;

            	} 
		else if (Character.isDigit(ch)) {

                	numberCount++;

            	} 
		else if (Character.isSpaceChar(ch)) {

                	spaceCount++;
            	} 
		else {

                specialCharCount++;

            	}

        }

        System.out.println("Number of letters: " + letterCount);

        System.out.println("Number of spaces: " + spaceCount);

        System.out.println("Number of numbers: " + numberCount);

        System.out.println("Number of special characters: " + specialCharCount);

    }

}
