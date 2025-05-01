package io.eworks.scheduling.repositories;

import io.eworks.scheduling.models.TagDto;
import io.eworks.scheduling.models.VideoDto;
import org.springframework.stereotype.Repository;

@Repository
public class SqlDataRepository implements DataRepository {
    public SqlDataRepository() {
        System.out.println("SqlDataRepository");
    }

    public VideoDto getVideoById(long videoId) {
        VideoDto video = new VideoDto();
        video.setId(videoId);
        video.setTitle("Lion King");
        video.setDescription("This is movie description");
        video.setFileType("mp4");
        video.setFileSize(2899);
        video.setYoutubeUrl("sample youtube url");
        video.setUrl("sample url");
        video.setPrivacySetting("PRIVATE");
        video.setVideoSetting("MOVIE");
        String[] urls = {"thumbnail link 1", "thumbnail link 2"};
        video.setThumbnailUrls(urls);
        TagDto tag1 = new TagDto();
        tag1.setId(1000);
        tag1.setName("fishing");
        TagDto tag2 = new TagDto();
        tag2.setId(1001);
        tag2.setName("badminton");
        TagDto tag3 = new TagDto();
        tag3.setId(1002);
        tag3.setName("reefing");
        TagDto[] tags = { tag1, tag2, tag3 };
        video.setTags(tags);
        return video;
    }
}
