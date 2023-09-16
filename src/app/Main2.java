package app;

import java.util.Arrays;
import java.util.Scanner;

public class Main2 {

    private static final int WIN_WIN = 25;

    public static void main(String[] args) {


        int[][] numbers = {
                {8, 3, 27, 14},
                {13, 10, 15, 25},
                {37, 4, 23, 12},
                {9, 18, 5, 32},
        };

        boolean isWin = false;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");

        int choice = sc.nextInt();

        for (int[] nums1 : numbers) {
            for (int num : nums1) {
                if (num == WIN_WIN & choice == WIN_WIN) {

                    isWin = true;

                    break;
                }
            }
        }

        if (isWin)

            System.out.println("Number is " + choice + ". You won :)");

        else

            System.out.println("Number is " + choice + ". No winnig :(");

    }
}
