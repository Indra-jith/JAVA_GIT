import java.util.Scanner;

public class rectangle_overlap {

    public static boolean doOverlap(int[] tl1, int[] br1, int[] tl2, int[] br2) {
        // Check if one rectangle is completely to the right or left of the other
        if (tl1[0] > br2[0] || br1[0] < tl2[0]) {
            return false;
        }
        // Check if one rectangle is completely above or below the other
        if (tl1[1] < br2[1] || br1[1] > tl2[1]) {
            return false;
        }

        // Overlap condition is met
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] tl1 = getInput(scanner);
        int[] br1 = getInput(scanner);
        int[] tl2 = getInput(scanner);
        int[] br2 = getInput(scanner);
        if (doOverlap(tl1, br1, tl2, br2)) {
            System.out.println("The rectangles overlap.");
        } else {
            System.out.println("The rectangles do not overlap.");
        }
    }

    public static int[] getInput(Scanner scanner) {
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        return new int[] { x, y };
    }
}
