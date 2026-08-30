import java.util.Random;
import java.util.Scanner;

// Task 1 = setting the original logic

public class task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        boolean control = true;
        String number = "";
        int n1, n2, n3, n4, counterg = 1;

        while(control) {
            n1 = random.nextInt(10);
            n2 = random.nextInt(10);
            n3 = random.nextInt(10);
            n4 = random.nextInt(10);

            if(n1!=n2 && n1!=n3 && n1!=n4 && n2!=n3 && n2!=n4 && n3!=n4)
                control = false;
            if(!control)
                number = String.valueOf(n1*1000 + n2*100 + n3*10 + n4);
        }
        control = true;

        while(control && counterg <= 10) {
            System.out.print("Please guess the number:");
            String gnumber = input.next();

            int counter1 = 0, counter2 = 0;

            for(int i = 0; i < 4; i++)
                for(int j = 0; j < 4; j++)
                    if(gnumber.charAt(i) == number.charAt(j)) {
                        counter2++;
                        if(i == j)
                            counter1++;
                    }

            if(counter1 == 4) {
                System.out.printf("Guess %d: Congratulations!\n", counterg++);
                control = false;
            } else {
                System.out.printf("Guess %d: %d number(s) are found, %d of them in the right place!\n", counterg++, counter2, counter1);
            }
        }
    }
}
