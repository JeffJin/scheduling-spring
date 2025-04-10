package io.eworks.scheduling.assets;

import io.eworks.scheduling.models.ImageDto;
import io.eworks.scheduling.models.VideoDto;
import io.eworks.scheduling.services.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ImageController {

    private final ImageService imageService;

    @Autowired
    public ImageController(ImageService imageService) {
        System.out.println("ImageController");
        this.imageService = imageService;
    }

    @GetMapping("/images")
    public ImageDto[] index(@RequestParam(value = "pageIndex", defaultValue = "0") int pageIndex, @RequestParam(value = "pageSize", defaultValue = "20") int pageSize) {
        return this.imageService.getAll(pageIndex, pageSize);
    }

    @GetMapping("/image/{id}")
    public ImageDto getImage(@PathVariable("id") Long id) {
        return this.imageService.getImage(id);
    }

}

