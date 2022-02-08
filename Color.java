// text scanner that parses input using regular expressions
// breaks input into tokens
import java.util.Scanner;

// create a new class, class is blueprint for objects in
// Object-Oriented-Program
// each class in source file will compile to new .class (bytecode) file
class Color {
    public static void main(String[] args) {
        // use Scanner to parse user input from terminal
        Scanner input = new Scanner(System.in);
        System.out.println("What is your favorite color?");

        // Save user input to "color" variable
        String color = input.nextLine();
        System.out.println("Nice, I like " + color + " too.");
    }
}
