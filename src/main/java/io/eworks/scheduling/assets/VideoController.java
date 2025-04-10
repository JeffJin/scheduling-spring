package io.eworks.scheduling.assets;

import io.eworks.scheduling.models.VideoDto;
import io.eworks.scheduling.services.ImageService;
import io.eworks.scheduling.services.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VideoController {

    private final VideoService videoService;

    @Autowired
    public VideoController(VideoService videoService) {
        System.out.println("ImageController");
        this.videoService = videoService;
    }


    @GetMapping("/videos")
    public VideoDto[] index(@RequestParam(value = "pageIndex", defaultValue = "0") int pageIndex, @RequestParam(value = "pageSize", defaultValue = "20") int pageSize) {
        return this.videoService.getAll(pageIndex, pageSize);
    }

    @GetMapping("/video/{id}")
    public VideoDto getVideo(@PathVariable("id") Long id) {
        return this.videoService.getVideo(id);
    }

}

