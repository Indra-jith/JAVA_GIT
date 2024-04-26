public class pattern_printing {
    public static void main(String[] args) {
        for (int i = 0; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print(" ");
            }
            for (int l = 0; l <= i; l++) {
                System.out.print("*");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }
            System.out.print("\n");

        }
        for (int m = 0; m <= 5; m++) {
            System.out.print(" ");
            for (int b = 0; b <= m; b++) {
                System.out.print(" ");
            }
            for (int c = 4; c >= m; c--) {
                System.out.print("*");
            }
            for (int d = 4; d > m; d--) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
