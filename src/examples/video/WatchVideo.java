package examples.video;

public class WatchVideo {
    private int position;
    private final Video instance;

    /**
     * Constructor
     *
     * @param instance VideoFlyweight
     */
    public WatchVideo (Video instance) {
        this.instance = instance;
    }

    public void nextTick() {
        position++;
    }
}
