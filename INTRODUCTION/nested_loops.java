public class nested_loops {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.print(" Outer " + i);
            for (int j = 0; j < 4; j++) {
                System.out.print(" Inner " + j);
            }
            System.out.println("\n");
        }
    }
}
