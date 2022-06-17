package Q1;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Factorizer {
    public static void main(String[] args) {

        int numForFactorize;
        int factorNum = 1;
        int counter = 0;
        List<Integer> factors = new ArrayList<>();
        int sum = 0;


        // input variables to count
        Scanner sc = new Scanner(System.in);
        System.out.print("What number would you like to factor? ");
        String stringNumForFactorize = sc.nextLine();  // read user input number
        numForFactorize = Integer.parseInt(stringNumForFactorize);

        // Start factorization
        while(factorNum <= numForFactorize) {
            if(numForFactorize % factorNum == 0){
                if (factorNum == numForFactorize) {
                    factors.add(factorNum);
                    counter++;
                } else {
                    sum += factorNum;
                    factors.add(factorNum);
                    counter++;
                }
            }
            factorNum++;
        }

        // show factors
        System.out.println("The factors of 6 are:");

        for (int i: factors) {
            System.out.print(i + " ");
        }
        System.out.println();

        // show number of factors
        System.out.println("6 has "+ counter +" factors.");

        // proof perfect number or not
        if (sum == numForFactorize) {
            System.out.println(numForFactorize + " is a perfect number.");
        } else {
            System.out.println(numForFactorize + " is not a perfect number.");
        }

        // prime number number
        if (counter == 2) {
            System.out.println(numForFactorize + " is a prime number.");
        } else {
            System.out.println(numForFactorize + " is not a prime number.");
        }
    }
}
