package io.eworks.scheduling.services;

import io.eworks.scheduling.models.VideoDto;

public interface VideoService {
    void merge();
    VideoDto getVideo(long videoId);
    VideoDto[] getAll(int pageIndex, int pageSize);
}
