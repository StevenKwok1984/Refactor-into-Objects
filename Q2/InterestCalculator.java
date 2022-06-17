package Q2;

import java.util.Scanner;

public class InterestCalculator {
    public void startCalculate(){

        float investAmount = readValue("How much do you want to invest? ");
        float year = readValue("How many years are investing? ");
        float interestRate = readValue("What is the annual interest rate % growth? ");

        System.out.println();
        System.out.println("Calculating...");

        for (int i = 1; i <= year; i ++) {

            System.out.println("Year "+ i +":");
            System.out.println("Began with $" + investAmount);

            // amount earned
            float currentBalance = investAmount;
            float newBalance = 0;
            for (int j = 0; j < 4; j++){
                newBalance = currentBalance * (1 + ((interestRate/4) / 100));
                currentBalance = newBalance;
            }
            float earn = currentBalance - investAmount;
            System.out.println("Earned " + (earn));
            // Ended with
            //currentBalance = newBalance;
            investAmount += earn;
            System.out.println("Ended with " + investAmount);
            System.out.println();
        }

    }

    public static float readValue(String prompt){
        Scanner sc = new Scanner(System.in);
        System.out.print(prompt);
        String stringNum = sc.nextLine();
        float number = Float.parseFloat(stringNum);
        return number;
    }


}
