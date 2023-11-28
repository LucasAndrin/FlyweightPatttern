package examples.video;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.UUID;

public class VideoFactory {

    private static Map<UUID, Video> videos = new HashMap<>();

    public static synchronized WatchVideo watchVideo(UUID id, User user) {
        Video video = videos.get(id);
        if (video == null) {
            /**
             * Search in database
             */
            Random rd = new Random();
            video = new Video(UUID.randomUUID(), rd.nextInt(0, 100));

            /**
             * Set in videos singleton;
             */
            videos.put(id, video);
        }
        return new WatchVideo(user, video);
    }
}
