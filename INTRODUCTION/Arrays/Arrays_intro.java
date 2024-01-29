public class Arrays_intro { // if class(not public), we can use any class
    public static void main(String args[]) {
        // Arrays are used to store different variables of same type

        // declaration + initialization

        int arr[] = { 1, 2, 3, 4, 5 };
        // 0 1 2 3 4 <- array index starts from 0
        System.out.println(arr[3]); // 4
        // (fast access of elements in an array by index of elements)
        // accessing first element will take same time as accessing the last element
        // fixed size ->both advantage and disadvantage
        // once contributed we cannot change the size

        // Only declaration

        int arr1[] = new int[10]; // made an array of size 10 with '0's (by default)
        System.out.println(arr1[0]); // 0 (for whatever index it will be zero's)
        // initialization later
        arr1[0] = 10;
        arr1[1] = 15;
        // rest elements [2]-[9] will be 0 itself

        String arrString[] = new String[3];
        arrString[0] = "Hello";
        arrString[1] = "Hey";
        System.out.println(arrString[0]); // Hello
        System.out.println(arrString[2]); // null

        boolean arr2[] = new boolean[10];
        System.out.println(arr2[0]); // false

        // Boolean arr2[] = new Boolean[10];
        // System.out.println(arr2[0]); // NULL

        /**
         * main explanation later
         * For now
         * boolean can be yes or no
         * Boolean can be yes, no or NULL.
         * So unless you need the NULL (like for example your loading the field from the
         * database, and you want NULL to be different to false) then stick to boolean.
         */

        // for printing all elements of an array using loop
        // for (int i = 0; i < 5; i++) { //not proper way to use constants (i<5)
        // System.out.println(arr1[i]); // 10 15 0 0 0 (first array)
        // // if limit exceeded index out of range error
        // }

        for (int i = 0; i < arr1.length; i++) { // not proper way to use constants (i<5)
            System.out.println(arr1[i]); // 10 15 0 0 0 (first array)
            // // if limit exceeded index out of range error
        }

        // store roll numbers of your 5 friends in array,
        // if the numbers are , print them otherwise don't print

        // int rollnumbers[] = { 26, 14, 7, 37, 3 };
        // for (int i = 0; i < rollnumbers.length; i++) {
        // if (rollnumbers[i] % 2 != 0) {
        // System.out.println(rollnumbers[i]);
        // }
        // }

        // create an arary of 5 floats and calculate their sum and print

        float array[] = { 1.52f, 3.14f, 7.89f, 6.45f, 0.54f };
        float sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println(sum);
    }
}
