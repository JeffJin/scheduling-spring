package io.eworks.scheduling.repositories;

import io.eworks.scheduling.models.VideoDto;

public interface DataRepository {
    VideoDto getVideoById(long videoId);
}
