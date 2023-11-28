package examples.video;

public class WatchVideo {
    private int position;
    private final User user;
    private final Video instance;

    /**
     * Constructor
     *
     * @param user User
     * @param instance VideoFlyweight
     */
    public WatchVideo(User user, Video instance) {
        this.user = user;
        this.instance = instance;
    }

    public void nextTick() {
        position++;
    }
}
