package examples.video;
import java.util.UUID;

public class Video {
    private UUID id;
    private int duration;

    /**
     * Constructor
     * @param id UUID
     * @param duration int
     */
    public Video(UUID id, int duration) {
        this.id = id;
        this.duration = duration;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
