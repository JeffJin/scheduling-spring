package io.eworks.scheduling.services;

import io.eworks.scheduling.models.ImageDto;

public interface ImageService {

    void setWatermark(String text);

    ImageDto getImage(long id);

    ImageDto[] getAll(int pageIndex, int pageSize);
}
