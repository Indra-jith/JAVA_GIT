import java.util.Scanner;

public class window_problem {

    public static int countOpenWindows(long N) {
        int count = 0;

        // Special case for N = 1 (always open)
        if (N == 1) {
            return 1;
        }

        // Iterate through divisors of N (excluding 1 and N)
        for (long i = 2; i * i <= N; i++) {
            if (N % i == 0) {
                // Count only odd divisors (windows toggled odd times)
                if (i % 2 != 0) {
                    count++;
                }
                // Since we're not including 1 and N in the loop,
                // count the divisor N/i if it's different from i
                if (i != N / i && (N / i) % 2 != 0) {
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of windows (N): ");
        long N = scanner.nextLong();

        int openWindows = countOpenWindows(N);
        System.out.println("Number of open windows: " + openWindows);
    }
}
