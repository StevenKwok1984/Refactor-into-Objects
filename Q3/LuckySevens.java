package Q3;

import java.util.Random;
import java.util.Scanner;

public class LuckySevens {
    public void playLuckSevens() {
        int dollar, dice1, dice2;
        int greatest = 0, roll = 0, greatestRoll = 0, greatestMoney;

        Scanner scan = new Scanner(System.in);

        System.out.println("How many dollars do you have? ");
        dollar = scan.nextInt();
        greatestMoney = dollar;

        dice1 = draw();
        dice2 = draw();

        while(dollar > 0) {
            roll++;

            if(dollar > greatestMoney) {
                greatestMoney = dollar;
                greatest = (dice1 + dice2);
                greatestRoll = (roll - 1);
            }

            dice1 = draw();
            dice2 = draw();

            if(dice1 + dice2 == 7){
                dollar += 4;
            } else {
                dollar -= 1;
            }
        }
        System.out.println("You went broke after " + roll + " roll.");
        System.out.println("You should have quit after " + greatestRoll + " rolls. When you had $"+greatestMoney);



    }

    public static int draw() {
        Random random = new Random();
        return random.nextInt(6) + 1;
    }


}
