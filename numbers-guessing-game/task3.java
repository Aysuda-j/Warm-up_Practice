import java.util.Random;
import java.util.Scanner;

// Task 3 = function form

public class task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Number of Digits: ");
        int digitCount = input.nextInt();
        int maxAttempts = (int)(2.5 * digitCount);

        String number = generateNumber(digitCount);
        playGame(digitCount, number, maxAttempts, input);
    }

    static String generateNumber(int digitCount) {
        Random random = new Random();
        int[] digits = new int[digitCount];
        boolean control = true;
        String number = "";
        boolean hasDuplicate;

        while(control) {
            for(int i = 0; i < digitCount; i++)
                digits[i] = random.nextInt(10);

            hasDuplicate = false;
            for(int i = 0; i < digitCount; i++)
                for(int j = i+1; j < digitCount; j++)
                    if(digits[i] == digits[j])
                        hasDuplicate = true;

            if(!hasDuplicate) {
                control = false;
                for(int i = 0; i < digitCount; i++)
                    number += digits[i];
            }
        }
        return number;
    }

    static int countCorrectPlace(String number, String gnumber, int digitCount) {
        int counter1 = 0;
        for(int i = 0; i < digitCount; i++)
            for(int j = 0; j < digitCount; j++)
                if(gnumber.charAt(i) == number.charAt(j))
                    if(i == j)
                        counter1++;
        return counter1;
    }

    static int countFound(String number, String gnumber, int digitCount) {
        int counter2 = 0;
        for(int i = 0; i < digitCount; i++)
            for(int j = 0; j < digitCount; j++)
                if(gnumber.charAt(i) == number.charAt(j))
                    counter2++;
        return counter2;
    }

    static void playGame(int digitCount, String number, int maxAttempts, Scanner input) {
        boolean control = true;
        int counterg = 1;

        while(control && counterg <= maxAttempts) {
            System.out.print("Please Guess the Number: ");
            String gnumber = input.next();

            int counter1 = countCorrectPlace(number, gnumber, digitCount);
            int counter2 = countFound(number, gnumber, digitCount);

            if(counter1 == digitCount) {
                System.out.printf("Guess %d: Congratulations!\n", counterg++);
                control = false;
            } else {
                System.out.printf("Guess %d: %s: %d numbers are found, and %d of them are in the correct place!\n",
                        counterg++, gnumber, counter2, counter1);
            }
        }
    }
}
