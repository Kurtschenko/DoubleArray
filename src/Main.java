import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private final static int WIN = 1362;

    public static void main(String[] args) {


        int[][] nums = {{1456, 2045, 3056, 4564, 5165, 6934, 7890, 8231}, {9345, 1063, 1123, 1276, 1362, 1476, 1511, 1689}};

        Scanner sc = new Scanner(System.in);

        String numsStr = Arrays.deepToString(nums);

        System.out.println("There are numbers of ticket: " + numsStr);

        System.out.print("Please make your choice. Input selected number of ticket: ");

        int search = sc.nextInt();


        for (int i = 0; i < nums.length; i++)
            for (int j = 0; j < nums[i].length; j++) {

                if (nums[i][j] == search) ;

            }
            if (search == WIN)

                System.out.print("Number of ticket " + search + " is a victory  ");
            else
                System.out.print("Number of ticket " + search + " is not a victory  ");

        }

}