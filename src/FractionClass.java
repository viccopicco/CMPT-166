import java.util.Scanner;

public class FractionClass {
    int num, den;
    public FractionClass(int startingNum, int startingDen) {
        if (startingDen == 0) {
            System.out.println("Error. Denominator cannot equal zero.");
            System.exit(1);
        }
        num = startingNum;
        den = startingDen;
    }

    // Mutator method to set the numerator
    public void setNum(int newNum) {
        num = newNum;
    }

    // Mutator method to set the denominator which cannot equal zero
    public void setDen(int newDen) {
        if (newDen == 0) {
            System.out.println("Error. Denominator cannot equal zero.");
            System.exit(1);
        }
        den = newDen;
    }

    // Displays the fraction in standard form as a String
    public String toString() {
        return (num + "/" + den); 
    }

    // Two FractionClass objects are considered equal if the reduced forms of each fraction are equal
    public boolean equals(FractionClass otherObject) {
        reduceFraction();
        otherObject.reduceFraction();
        boolean numEqual = (this.num == otherObject.num);
        boolean denEqual = (this.num == otherObject.num);
        return (numEqual && denEqual);
    }

    // Reduces the fraction using Euclid's Algorithm Method
    // Pre-Condictions: The calling object has a valid numerator and denominator
    // Post-Conditions: The calling object's numerator and denominator are reduced
    private void reduceFraction() {
        int GCD = euclidGCD(num, den);
        num = num / GCD;
        den = den / GCD;
    }

    // Euclid's Algorithm. Takes two integers and returns the greatest common divisor. 
    private int euclidGCD(int a, int b) {
        while (a != 0 && b != 0) {
            int c = b;
            b = a%b;
            a = c;
        }
        return a+b;
    }

    private static final String EXIT_KEYWORD = "exit"; // Keyword to end the main program loop

    public static void main(String[] args) {
        int numInput, denInput;
        Scanner kb = new Scanner(System.in);

        boolean resume = true;        
        boolean fractionsEqual;
        while (resume) {
            numInput = readNum(kb);
            denInput = readDen(kb);
            FractionClass firstFraction = new FractionClass(numInput, denInput);
            System.out.println("You entered the fraction: " + numInput + "/" + denInput);
            System.out.println("Now we will compare that to a new fraction.");
            numInput = readNum(kb);
            denInput = readDen(kb);
            fractionsEqual = firstFraction.equals(new FractionClass(numInput, denInput));
            if (fractionsEqual) {
                System.out.println("The fractions are equal.");
            } else {
                System.out.println("The fractions are not equal.");
            }

            resume = shouldResume(kb);
        }
    }

    // Reads an integer numerator and returns the value
    private static int readNum(Scanner kb) {
        System.out.println("Enter a numerator: ");
        return kb.nextInt();
    }

    // Reads a non zero integer denominator and returns the value
    private static int readDen(Scanner kb) {
        boolean incorrectInput = true;
        int denInput = 1;
        while (incorrectInput) {
            System.out.println("Please enter a denominator that doe not equal zero ");
            denInput = kb.nextInt();
            if (denInput != 0) incorrectInput = false;
        }
        return denInput;
    }


    // Asks the user if they want to run the program again
    // Returns false if the user input matches the exit keyword defined as a constant otherwise returns true
    private static boolean shouldResume(Scanner kb) {
        String resumeAnswer = "";
        System.out.println("Please enter \"" + EXIT_KEYWORD + "\" to exit the program or enter any key to run the program again.");
        resumeAnswer = kb.next();
        resumeAnswer = resumeAnswer.toLowerCase();
        if (resumeAnswer.equals(EXIT_KEYWORD)) {
            return false;
        } else {
            return true;
        }
    }
}