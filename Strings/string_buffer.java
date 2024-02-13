public class string_buffer {
    public static void main(String[] args) {
        // StringBuffer sb = new StringBuffer();
        // System.out.println(sb.capacity()); // 16

        StringBuffer sb = new StringBuffer("Hello");
        System.out.println(sb.capacity()); // 21

        // Now you can append and all (since its mutable rn)
        sb.append(" World");
        System.out.println(sb);

        sb.insert(0, "Surprise ");
        System.out.println(sb);
    }
}

// String buffer is used to create mutable String objects
