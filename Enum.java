enum Level {
    LOW(),
    MEDIUM,
    HIGH
}
public class Enum {
    public static void main(String[] args) {
        Level currentLevel = Level.HIGH;
        System.out.println(currentLevel);
        System.out.println("---");
        for (Level specificLevel: Level.values()) {
            System.out.println(specificLevel);
        }
        System.out.println("---");
        String highLevelStr = Level.HIGH.toString(); // toString can be override
        String highLevelName = Level.HIGH.name();
        System.out.println(highLevelStr);
        System.out.println(highLevelName);

    }
}
