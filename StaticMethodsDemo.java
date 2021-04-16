

class StaticMetohdsDemo {
public int x = 0;
    // Marco for counting the methods
    static int N = 1;

    public static void main(String[] args) {
        int x = 0;
        spacer();
        System.out.println(countsGuests("Jason", 3));
        spacer();
        alarm(4);
        spacer();
        System.out.println(sum100());
        spacer();
        System.out.println(maxOfTwo(5, 8));
        spacer();
        System.out.println(sumRange(3, 10));
        spacer();
        System.out.println(larger(2.5, 9.2));
        spacer();
        System.out.println(countA("Apples are amazing!"));
        spacer();
        System.out.println(evenlyDivisible(2, 4));
        spacer();
        System.out.println(average(4, 5));
        spacer();
        System.out.println(average(2, 4, 6));
        spacer();
        System.out.println(average(2, 4, 6, 8));
        spacer();
        System.out.println(average(2, 4, 6, 8, 10));
        spacer();
        System.out.println(multiConcat("Hello", 5));
        spacer();
        System.out.println(isAlpha('a'));
        spacer();
        System.out.println(reverse("Fishsticks"));
        spacer();
        System.out.println(isIsoceles(7, 7, 12));
        spacer();
        System.out.println(randomInRange(10, 100));
    }

    /*
     * Pre: Give method a name and an integer
     * Post: returns a welcome message
     */
    public static String countsGuests(String visitorName, int visitorNumber) {
        return ("Welcome " + visitorName + "! You are visitor #" + visitorNumber);
    }

    /*
     * Pre: give method a int (number)
     * Post: print "Alarm" number amount of times

     */
    public static void alarm(int number) {
        if ( number < 1){
            System.out.println("Error: paramater " + number + " is less than 1.");
        }else {
            for (int i=0; i<number; i++) {
                System.out.println("Alarm!");
            }
        }
    }

    /*
     * Pre: none
     * Post: sum all numbers from 0 to 100
     */
    public static int sum100() {
        int sum = 0;

        for (int i=0; i<=100; i++){
            sum += i;
        }
        return sum;
    }

    /*
     * Pre: pass two numbers
     * Post: return the greater number of the two
     */
    public static int maxOfTwo(int x, int y) {
        int max = 0;

        if (x > y){
            max = x;
        } else if (y > x){
            max = y;
        } else if (y == x){
            max = x; // doesnt matter what variable you assign to x since both nums are the same value
        }
        return max;
    }

    /*
     * Pre: pass two numbers
     * Post: returns the sum of the range of integers (5,7 = 5+6+7)
     */
    public static int sumRange(int x, int y) {
        int range = x-y;
        int sum = 0;

        // if the num is a negative we know that x is less than y
        if (range < 0){
            System.out.println("Error: range " + range + " is not a positive number, first number must be smaller than the second number..");
        } else {
            for (int i = x; i <= y; i++){
                sum += i;
            }
        }
        return sum;
    }

    /*
     * Pre: passes two ints
     * Post: returns true if the first int passed (x) is greater than the second (Y)
     */
    public static boolean larger(double x, double y) {
            if (x > y){
                return true;
            } else return false;
    }

    /*
     * Pre: pass a string
     * Post: count the amount of A's in the string
     */

    public static int countA(String str) {
        String temp = str.toUpperCase();
        char[] x = temp.toCharArray();
        int count = 0;

        for (int i=0; i<x.length; i++){
            if (x[i] == 'A'){
                count++;
            }
        }
        return count;
    }

    /*
     * Pre: pass two ints x,y
     * Post: return true if x/y or y/x is evenly divisable (remainder is 0)
     */
    public static boolean evenlyDivisible(int x, int y) {

        if (x == 0 || y == 0) {
            System.out.println("One of your inputs is zero.");
            return false;
        } else {
            if (x % y == 0) {
                return true;
            } else if (y % x == 0) {
                return true;
            } else{
                return false;
            }
        }
    }

    /*
     * Pre: pass 2 ints
     * Post: return their average
     */

    public static float average(int x, int y) {
        float avg = (float)(x+y) / 2;
        return avg;
    }

    /*
     * Pre: pass 3 ints
     * Post: return their average
     */
    public static float average(int x, int y, int z) {
        float avg = (float)(x+y+z) / 3;
        return avg;
    }

    /*
     * Pre: pass 4 ints
     * Post: return their average
     */
    public static float average(int x, int y, int z, int a) {
        float avg = (float)(x+y+z+a) / 4;
        return avg;
    }

    /*
     * Pre: pass 5 ints
     * Post: return their average
     */
    public static float average(int x, int y, int z, int a, int b) {
        float avg = (float)(x+y+z+a+b) / 5;
        return avg;
    }

    /*
     * Pre: pass a number which is the amount of times we want to concat the string and print (x=5, str=hi, output: hihihihihi)
     * Post: return a string that is str x amount of times back to back
     */
    public static String multiConcat(String str, int x) {
        String concat = "";
        if (x < 2){
            return str;
        } else {
            for (int i = 0; i < x; i++) {
                concat += str;
            }
            return concat;
        }
    }

    /*
     * Pre: pass a char
     * Post: return false if the character is upper case or is lower case
     */
//WORK
    public static boolean isAlpha(char x) {
        // temp var that will automatically pass x.toUpperCase then compare it to x, if they are eq

        System.out.print(x + " is uppercase or lowercase? ");
        if ((x >= 'a' && x <= 'z') || x >= 'A' && x <= 'Z') {
                return (true);
            } else return false;
    }

    /*
     * Pre: pass a string
     * Post: return the string reversed
     */
    public static String reverse(String str) {

        // getBytes() method to convert string
        // into bytes[].
        byte[] strAsByteArray = str.getBytes();

        byte[] result = new byte[strAsByteArray.length];

        // Store result in reverse order into the
        // result byte[]
        for (int i = 0; i < strAsByteArray.length; i++)
            result[i] = strAsByteArray[strAsByteArray.length - i - 1];

        return(new String(result));
    }

    /*
     * Pre: pass the 3 line measurements
     * Post: return true if the triangle is isoceles (only 2 sides are equal length) and false in any other case
     */
    public static boolean isIsoceles(int opp, int adj, int hyp) {
        if (opp == adj && opp == hyp){
            return false;
        } else if (adj == opp && adj == hyp){
            return false;
        } else if (hyp == opp && hyp == adj){
            return false;
        } else if (opp == adj && opp != hyp){
            return true;
        } else if (adj == opp && adj != hyp){
            return true;
        } else if (hyp == opp && hyp != adj){
            return true;
        } else return false;
    }

    /*
     * Pre: pass two ints
     * Post: return a random number in between the two paramaters
     *
     */
    public static int randomInRange(int x, int y) {
        if (x > y){
            return 0;
        } else {
            int r = (int) (Math.random() * (y - x)) + x;
            return r;
        }
    }

    /*
     * Pre:
     * Post: returns a string
     */

    public static void spacer() {
        System.out.println("\n----- Method #" + N + " -----\n");
        N++;
    }
}

