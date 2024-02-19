enum Days {
    MONDAY,
    TUESDAY,
    WEDNESDAY
}

enum Levels {
    EASY,
    MEDIUM,
    HARD
}

class SetDifficulty {
    Levels level;

    public SetDifficulty(Levels level) {
        this.level = level;
    }

    public void SetDiff() {
        switch (level) {
            case EASY:
                System.out.println("Easy Mode");
                break;
            case MEDIUM:
                System.out.println("Medium Mode");
                break;
            case HARD:
                System.out.println("Hard Mode");
                break;
        }
    }
}

public class enum_intro {
    public static void main(String[] args) {
        for (Days i : Days.values()) {
            System.out.println(i);
        }
        SetDifficulty s1 = new SetDifficulty(Levels.MEDIUM);
        s1.SetDiff();
    }
}
