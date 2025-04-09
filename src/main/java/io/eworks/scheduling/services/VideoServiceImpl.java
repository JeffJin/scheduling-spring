package io.eworks.scheduling.services;

import io.eworks.scheduling.models.TagDto;
import io.eworks.scheduling.models.VideoDto;
import org.springframework.stereotype.Service;

@Service
public class VideoServiceImpl implements VideoService {
    public VideoServiceImpl() {
        System.out.println("VideoServiceImpl");
    }

    @Override
    public void merge() {
        System.out.println("VideoServiceImpl.merge");
    }

    @Override
    public VideoDto getVideo(long videoId) {
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

    @Override
    public VideoDto[] getAll(int pageIndex, int pageSize) {
        VideoDto[] list = new VideoDto[pageSize];
        for(int i = 0; i < pageSize; i++) {
            list[i] = getVideo(100 + i);
        }
        return list;
    }
}
