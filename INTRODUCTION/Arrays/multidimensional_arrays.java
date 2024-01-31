public class multidimensional_arrays {
    public static void main(String args[]) {
        // 2d array
        // declaration
        int arr[][] = new int[5][3]; // 2 brackets everywhere
        // 3rd row 1st column, index-> arr[2][0]

        int arr2[][] = {
                { -1, 2, 3 }, // first row
                { 4, 5, 6 }, // second row
                { 7, -8, 9 } // third row
        };

        // for (int i = 0; i < arr2.length; i++) {
        // for (int j = 0; j < arr[0].length; j++) {
        // System.out.print(arr2[i][j] + " ");
        // }
        // System.out.println();
        // }

        // i -> ROW j-> COLUMN

        // first and last row
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[0].length; j++) {
                if (i == 0 || i == arr2.length - 1) {
                    System.out.print(arr2[i][j] + " ");
                }
            }
            System.out.println();
        }
        System.out.println();

        // border elements
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[0].length; j++) {
                if (i == 0 || i == arr2.length - 1 || j == 0 || j == arr2[0].length - 1) {
                    System.out.print(arr2[i][j] + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
        // output
        // 1 2 3
        // 4 . 6
        // 7 8 9

        // PRINT ALL ELEMENTS BELOW DIAGONAL (includind diagonal)
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[0].length; j++) {
                if (i < j)
                    break;
                else {
                    System.out.print(arr2[i][j] + " ");
                }
            }
            System.out.println();
        }
        System.out.println();
        // output
        // 1
        // 4 5
        // 7 8 9

        // swap first row with last row of array

        // replace all the negative elements of array with 0
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[0].length; j++) {
                if (arr2[i][j] < 0) {
                    arr2[i][j] = 0;
                }
            }
        }

        // find max element in array and print
        int max = 0;
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[0].length; j++) {
                if (arr2[i][j] > max) {
                    max = arr2[i][j];
                }
            }
        }
        System.out.println("Max element: " + max);

        // sum of each row in an array
        int sumrow = 0;
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[0].length; j++) {
                sumrow += arr2[i][j];
            }
            System.out.println("Sum of row " + (i + 1) + "= " + sumrow);
            sumrow = 0;
        }

        // printing
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
