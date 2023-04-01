package logic.system;

public class Instant {
    long id;

    Instant() {
        id = 0;
    }

    public void next() {
        id = id + 1;
    }
}
