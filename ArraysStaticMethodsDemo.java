import java.util.Scanner;

public class ArraysStaticMethodsDemo {
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        System.out.print("What length is the array? ");
        int input = kb.nextInt();
        int[] x = readInputs(input);

        System.out.print("The array before: ");
        display(x);
        swap(x);
        System.out.println();
        System.out.println("Is there an even number of evens? " + even(x));
        System.out.print("The array after: ");
        display(x);

    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        public static int[] readInputs(int size){
            int[] arr = new int[size];

            for(int i=0; i<size; i++){
                System.out.print("Enter a number: ");
                Scanner kb = new Scanner(System.in);
                int input = kb.nextInt();
                arr[i] = input;
            }
            return arr;
        }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        public static void swap(int[] arr){
        int min = arr[0]; // holds the value of whatever is at the min index
        int max = arr[0]; // holds the value of whatever is at the max index
        int minIndex = 0; // holds the min index
        int maxIndex = 0;// holds the max index

            // find min
            for (int i=1; i<arr.length; i++){
                    if (arr[i] < min){
                        minIndex = i;
                        min = arr[i];
                }
            }
            //find max
            for (int i=1; i<arr.length; i++){
                if (arr[i] > max){
                    maxIndex = i;
                    max = arr[i];
                }
            }
            //swap
            for (int i = 0; i<arr.length; i++){
                if (i == minIndex){
                    arr[i] = max;
                } else if (i == maxIndex){
                    arr[i] = min;
                }
            }
        }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        public static boolean even(int[] arr){
            int evenNumsCount = 0; // count the number of evens in the arrau
            for (int i=0; i<arr.length; i++){
                if (arr[i] % 2 == 0){
                    evenNumsCount++;
                }
            }
            // check if the mod of the evensNumCount is even.. returns true is yes and no if not
            if (evenNumsCount % 2 == 0){
                return true;
            } else return false;
        }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        public static void display(int[] arr){
            for (int i=0; i<arr.length; i++){
                System.out.print(arr[i] + " ");
            }
        }


}
