public class two_dimensional_array {
    public static void main(String[] args) {
        int arr[][] = {
            { -1, 2, 3}, // first row
            { 4, 5, 6 }, // second row
            { 7, -8, 9}// third row
            };

        int numRows = arr.length;
        int numCols = arr[0].length;

        // //replace first and last row 
        // for(int i=0;i<numCols;i++)
        // {
        //     int temp = arr[0][i];
        //     arr[0][i] = arr[numRows-1][i];
        //     arr[numRows-1][i] = temp;
        // }
        // for(int i=0;i<arr.length;i++)
        // {
        //     for(int j=0;j<arr[0].length;j++)
        //     {
        //         System.out.print(arr[i][j]+" ");
        //     }
        //     System.out.println();
        // }

        //sum of each columns
        int sum=0;
        for(int i=0;i<numCols;i++)
        {
            for(int j=0;j<numRows;j++)
            {
                sum+=arr[j][i];
            }
            System.out.println("Sum of "+ i +" column = "+sum);
            sum=0;
        }
    }
}
