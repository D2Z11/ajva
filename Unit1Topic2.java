import java.util.Scanner;
import java.util.*;
import java.util.ArrayList; // import the ArrayList class

public class Unit1Topic2 {
    // From
    // https://stackoverflow.com/questions/1102891/how-to-check-if-a-string-is-numeric-in-java
    static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    static void print(Object contents) {
        System.out.print(contents);
    }

    static void println(Object contents) {
        System.out.print(contents + "\n");
    }

    static boolean isOperation(char character) {
        final char[] operations = { '+', '-', '*', '/', '%' };
        for (char c : operations) {
            if (c == character) {
                return true;
            }
        }
        return false;
    }

    static void throwErr() {
        println("Your expression is not valid.");
    }

    public static void main(String[] args) {
        println("Welcome to the calculator.");
        Scanner readIn = new Scanner(System.in);
        println("Enter your expression: ");

        String expression = readIn.nextLine();
        // https://www.geeksforgeeks.org/how-to-remove-all-white-spaces-from-a-string-in-java/
        String newExpression = expression.replaceAll("\\s", "");
        // for (int i = 0; i < expression.length(); i++) {
        // Remove all spaces in the input
        // https://www.geeksforgeeks.org/how-to-convert-char-to-string-in-java/
        // if (!(String.valueOf(expression.charAt(i)) == "")) {
        // newExpression += Character.toString(expression.charAt(i));
        // }
        //
        // }
        int i = 0;
        // Expect a operation after each number
        boolean done = false;
        // Why is it called tokenType? Because it makes me look smarter
        String tokenType = "number";
        // https://stackoverflow.com/questions/2369967/how-can-i-check-whether-an-array-is-null-empty
        // Just add values in advance because otherwise we can't just set any item
        // (I just found out after that it's fixed size like java are you kidding me)
        // String[] numbers = new String[100];
        ArrayList<String> numbers = new ArrayList<String>(); // Create an ArrayList object
        int numCounter = 0;
        char[] operations = new char[100];
        int opCounter = 0;
        char currentLetter = newExpression.charAt(0);

        while (!done) {
            if (i == 0 || tokenType == "number") {
                // Expect a number as first character
                String number = "";
                while (Character.isDigit(currentLetter)) {
                    currentLetter = newExpression.charAt(i);
                    number += currentLetter;
                    i++;
                }
                // if (!Character.isDigit(currentLetter)) {
                //     println("Error 1");
                //     println("Letter: " + currentLetter);
                //     print("i: ");
                //     println(i);
                //     throwErr();
                //     return;
                // }
                tokenType = "operation";
                numbers.add(number);
            }
            if (tokenType == "operation") {
                tokenType = "number";
                
                if ((i == newExpression.length() - 1)) {
                    break;
                }
                // Expect a operation
                if (!isOperation(newExpression.charAt(i + 1))) {
                    print("2");
                    throwErr();
                    return;
                }
            }
            i++;
            if (i > newExpression.length()) {
                break;
            }
        }
        for (String c : numbers) {
            println(c);
        }
    }
}
