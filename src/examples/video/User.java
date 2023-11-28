package examples.video;

import java.util.Random;
import java.util.UUID;

public class User {
    private UUID id;
    private String name;

    private WatchVideo watchingVideo;

    public User(UUID id) {
        this.id = id;
    }

    public User(UUID id, String name) {
        this.id = id;
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void watchVideo(UUID videoId) {
        watchingVideo = VideoFactory.watchVideo(videoId);
    }

    public void watchVideoWithoutFlyweight(UUID videoId) {
        Random rd = new Random();
        watchingVideo = new WatchVideo(new Video(videoId, rd.nextInt(0, 100)));
    }
}
