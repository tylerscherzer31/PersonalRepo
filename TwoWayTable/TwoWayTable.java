public class TwoWayTable {
    int grandTotal;
    int grandTotal2;
    int rowSum;
    int colSum;

    TwoWayTable(int[][] data) {
        setMargins(data);
        printArray(data);
        System.out.println("------------------------");
        sumGrandTotal(sumOfRows(data));
        System.out.println("\n");
    }

    void setMargins(int[][] data) {
        grandTotal = 0;

        for (int row = 0; row < data.length; row++){
                rowSum = 0;
                colSum = 0;
            for (int col = 0; col < data[row].length; col++){
                rowSum += data[row][col];
                colSum += data[col][row];
            }
            grandTotal += rowSum;
        }
    }

    public void printArray(int[][] data){
        int currentRowSum = 0;
        int i = 0;
        for (int row = 0; row < data.length; row++){
            for (int col = 0; col < data[row].length; col++){
                System.out.print(data[row][col] + "\t");
            }
            System.out.print("|" + "\t");
            System.out.print(sumOfRows(data)[i]);
            i++;
            System.out.println();
        }
    }

    // returns an array with sum of all rows
    public int[] sumOfRows(int[][] data) {
        int[] rowSums = new int[data.length];
        int i = 0;

        for (int row = 0; row < data.length; row++) {
            rowSum = 0;
            for (int col = 0; col < data[row].length; col++) {
                rowSum += data[row][col];
            }
            rowSums[i] = rowSum;
            i++;
        }
        return rowSums;
    }

    // Calculates the grand total
    public int sumGrandTotal(int[] sums){
        grandTotal2 = 0;
        for (int i = 0; i < sums.length; i++){
            System.out.print(sums[i] + "\t");
            grandTotal2 += sums[i];
        }
        System.out.print(" | " + grandTotal2);
        return grandTotal2;
    }
}
