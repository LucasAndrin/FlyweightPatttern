import examples.video.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

public class VideoDemo {
    static final int usersSize = 1000000;
    static final int videosSize = 10;

    public static void main(String[] args) {
        Random rd = new Random();
        List<User> users = new ArrayList<>();
        for (int i = 0; i < usersSize; i++) {
            users.add(new User(UUID.randomUUID()));
        }

        List<UUID> videoIds = new ArrayList<>();
        for (int i = 0; i < videosSize; i++) {
            videoIds.add(UUID.randomUUID());
        }

        for (User user : users) {
            user.watchVideo(videoIds.get(rd.nextInt(videosSize)));
        }
    }
}
