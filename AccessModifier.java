
class Clock {
    private long time = 0;
    int price;

    private Clock(long time) {
        this.time = time;
    }
    public Clock(long time, long timeOffset) {
        this(time);
        this.time += timeOffset;
    }
    // Getter
    public long getTime() {
        return time;
    }
    // Setter
    public void setTime(long time) {
        this.time = time;
    }

    public static Clock createClock() {
        return new Clock(System.currentTimeMillis());
    }

    void setPrice() {
        this.time = 1;
    }

}

class ParentClock {
    protected long time = 0;
}

class ChildrenClock extends ParentClock{
    void setTime() {
        super.time = 1;
    }
}

public class AccessModifier {
    Clock clock = Clock.createClock();
    Button button = new Button(); // Button is in default package
}
