import java.util.Random;
import java.util.Scanner;

public class Temperature {
    public static void main(String[] args){
        Scanner kb = new Scanner((System.in));
        System.out.print("Enter a number: ");
        int x = kb.nextInt();
        System.out.println("I will find the average of " + x + " random degrees in the range 60-80." + "\n");
        int[] arr = new int[x];

        Random r = new Random();
        int low = 60;
        int high = 80;

        System.out.print("Random degrees: ");
        for (int i=0; i<arr.length; i++){
            arr[i] = r.nextInt(high - low) + low;
            System.out.print(arr[i] + " ");
        }

        System.out.print("\n" + "Average temperature: " + findAverage(arr));
        System.out.print("\n" + "Degree(s) above average: " + aboveAverage(arr));




    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public static int average;

    public static int findAverage(int[] arr){
        int sum = 0;
        int count = 0;


        for (int i=0; i<arr.length; i++){
            sum += arr[i];
            count++;
        }
        average = sum/count;
        return average;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public static int aboveAverage(int[] arr){
        int count = 0;
        for (int i=0; i<arr.length; i++){
            if (arr[i] > average){
                count++;
            }
        }
        return count;
    }
}
