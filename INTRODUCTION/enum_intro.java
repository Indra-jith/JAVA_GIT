enum Days {
    MONDAY,
    TUESDAY,
    WEDNESDAY
}

public class enum_intro {
    public static void main(String[] args) {
        for (Days i : Days.values()) {
            System.out.println(i);
        }
    }
}
