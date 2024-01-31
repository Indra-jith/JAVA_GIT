public class jagged {
    public static void main(String args[]) {
        // IRREGULAR ARRAYS
        // Different column number for each rows
        // _____
        // __
        // _______

        int arr[][] = new int[3][]; // acceptable (specify only rows)

        // // telling how many columns each rows have

        // METHOD 1
        arr[0] = new int[2]; // for first row, 4 columns
        arr[1] = new int[4]; // for second row, 3 columns
        arr[2] = new int[3]; // for third row, 2 columns

        int value = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = value;
                value++;
            }
        }

        // // METHOD 2
        // int arr[][] = {
        // { 1, 2 }, // 2
        // { 3, 4, 5, 6 }, // 3
        // { 7, 8, 9 }// 4
        // };

        // printing
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) // since each row has different length arr[i].length
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        /*
         * Output
         * 1 2
         * 3 4 5 6
         * 7 8 9
         */
    }
}
