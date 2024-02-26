public class array_reverse {
    public static void main(String args[]) {
        int[] originalSequence = { 1, 2, 3, 4, 5 };
        int reverse[] = new int[originalSequence.length];
        int pos = 0;
        for (int i = originalSequence.length - 1; i >= 0; i--) {
            reverse[pos] = originalSequence[i];
            pos++;
        }
        for (int i = 0; i < reverse.length; i++) {
            int count = 0;
            for (int j = 0; j < reverse.length; j++) {
                if (reverse[j] == reverse[i]) {
                    count++;
                }
            }
            System.out.println(reverse[i] + "\t" + count);
        }

    }
}
