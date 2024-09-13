import java.util.Scanner;

public class Template2 {
    // From https://stackoverflow.com/questions/1102891/how-to-check-if-a-string-is-numeric-in-java
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

    public static void main(String[] args) {
        Scanner readIn = new Scanner(System.in);
        println("Hey there! Could I have your name? (Not being stored according to EU data privacy laws. We retain the right to keep it for as long as neccessary in case of law enforcement issuing, or other issues.)");
        String name = readIn.nextLine();
        print("Hi ");
        print(name);
        println("!");
        println("Enter your number: ");
        int num = readIn.nextInt();
        print("Now give me a random number: ");
        int randInt = readIn.nextInt();
        num++;
        num += Math.floor(Math.random() * randInt);
        // println(num);
        num *= Math.floor(Math.random() * randInt) * 2;
        // println(num);
        num -= Math.floor(Math.random() * randInt);
        // println(num);
        num %= 50;
        // println(num);
        num /= 2;
        num--;
        // println(num);
        print("Tell me what you think the new number is: (it's an integer!) ");
        int guess = readIn.nextInt();
        if (num == guess) {
            print("Well that's awfully lucky! ");
        } else if (num > guess) {
            print("Sorry pal. Too high. Try again next time. ");
        } else {
            print("Sorry pal. Too low. Try again next time. ");
        }
        print("The number was: ");
        println(num);
        print("Your guess was: ");
        println(guess);
    }
}
