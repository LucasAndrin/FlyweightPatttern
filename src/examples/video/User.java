package examples.video;

import java.io.FileInputStream;
import java.io.IOException;
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
        Video video = new Video(videoId, rd.nextInt(0, 100));
        try {
            FileInputStream input = new FileInputStream(System.getProperty("user.dir") + "/src/" + "DoOrDoNotThereIsNoTry.mp4");
            video.setData(input.readAllBytes());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        watchingVideo = new WatchVideo(video);
    }
}
