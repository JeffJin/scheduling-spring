package io.eworks.scheduling.services;

import io.eworks.scheduling.models.ImageDto;
import io.eworks.scheduling.models.TagDto;
import io.eworks.scheduling.models.VideoDto;
import io.eworks.scheduling.repositories.DataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImageServiceImpl implements ImageService {

    @Autowired
    private List<DataRepository> imageRepos;

    public ImageServiceImpl() {
    }

    @Override
    public void setWatermark(String text) {
        System.out.printf("ImageService number of repos :: %d%n", imageRepos.size());
        System.out.printf("ImageService.setWatermark :: %s%n", text);
    }

    @Override
    public ImageDto getImage(long id) {
        ImageDto img = new ImageDto();
        img.setId(id);
        img.setTitle("Lion King");
        img.setDescription("This is movie description");
        img.setFileType("jpg");
        img.setFileSize(2899);
        img.setUrl("sample image url");
        img.setPrivacySetting("PRIVATE");
        img.setWidth(600);
        img.setHeight(400);
        return img;
    }

    @Override
    public ImageDto[] getAll(int pageIndex, int pageSize) {
        ImageDto[] list = new ImageDto[pageSize];
        for(int i = 0; i < pageSize; i++) {
            list[i] = getImage(100 + i);
        }
        return list;
    }
}
