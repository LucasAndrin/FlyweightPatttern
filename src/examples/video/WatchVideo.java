package examples.video;

public class WatchVideo {
    private int position;
    private final Video video;

    public WatchVideo (Video video) {
        this.video = video;
    }

    public void nextTick() {
        position++;
    }
}
