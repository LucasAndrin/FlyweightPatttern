package examples.video;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.UUID;

public class VideoFactory {

    private static Map<UUID, Video> videos = new HashMap<>();

    public static synchronized WatchVideo watchVideo(UUID id) {
        Video video = videos.get(id);
        if (video == null) {
            /**
             * Search in database
             */
            Random rd = new Random();
            video = new Video(id, rd.nextInt(0, 100));

            try {
                FileInputStream input = new FileInputStream(System.getProperty("user.dir") + "/src/" + "DoOrDoNotThereIsNoTry.mp4");
                video.setData(input.readAllBytes());
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }

            videos.put(id, video);
        }
        return new WatchVideo(video);
    }
}
