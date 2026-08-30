// package Number Guessing Game;

import java.util.Random;
import java.util.Scanner;

//Task 2 = randomizing for any size

public class task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        boolean control = true;
        String number = "";
        int counterg = 1;

        System.out.print("Enter Number of Digits: ");
        int digitCount = input.nextInt();
        int maxAttempts = (int)(2.5 * digitCount);
        int[] digits = new int[digitCount];
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
        control = true;

        while(control && counterg <= maxAttempts) {
            System.out.print("Please Guess the Number: ");
            String gnumber = input.next();

            int counter1 = 0, counter2 = 0;

            for(int i = 0; i < digitCount; i++)
                for(int j = 0; j < digitCount; j++)
                    if(gnumber.charAt(i) == number.charAt(j)) {
                        counter2++;
                        if(i == j)
                            counter1++;
                    }

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
