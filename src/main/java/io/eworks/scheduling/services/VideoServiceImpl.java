package io.eworks.scheduling.services;

import io.eworks.scheduling.models.TagDto;
import io.eworks.scheduling.models.VideoDto;
import io.eworks.scheduling.repositories.DataRepository;
import org.springframework.stereotype.Service;

@Service
public class VideoServiceImpl implements VideoService {
    private final DataRepository dataRepository;

    public VideoServiceImpl(DataRepository dataRepository) {
        this.dataRepository = dataRepository;
        System.out.println("VideoServiceImpl");
    }

    @Override
    public void merge() {
        System.out.println("VideoServiceImpl.merge");
    }

    @Override
    public VideoDto getVideo(long videoId) {
        return this.dataRepository.getVideoById(videoId);
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
