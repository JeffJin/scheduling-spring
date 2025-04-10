package io.eworks.scheduling;

import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import io.eworks.scheduling.models.TagDto;
import io.eworks.scheduling.models.VideoDto;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class JsonComponentTest {
    @Test
    public void deserializeVideoDto() throws Exception {
        String currentDir = System.getProperty("user.dir");
        //read json file data to String
        byte[] jsonData = Files.readAllBytes(Paths.get(currentDir + "/src/test/resources/video.json"));

        //create ObjectMapper instance
        ObjectMapper objectMapper = new ObjectMapper();

        //convert json string to object
        VideoDto dto = objectMapper.readValue(jsonData, VideoDto.class);

        Assertions.assertEquals(123, dto.getId());
        Assertions.assertEquals("Lion King", dto.getTitle());
        Assertions.assertEquals( "thumbnail link 1", dto.getThumbnailUrls()[0]);
        Assertions.assertEquals( "thumbnail link 1", dto.getThumbnailUrls()[0]);
        Assertions.assertEquals( "fishing", dto.getTags()[0].getName());
        Assertions.assertEquals( "badminton", dto.getTags()[1].getName());
        Assertions.assertEquals( "reefing", dto.getTags()[2].getName());
        Assertions.assertEquals(3, dto.getTags().length);
        Assertions.assertEquals(2899, dto.getFileSize());
        Assertions.assertEquals("MOVIE", dto.getVideoSetting());
    }

    @Test
    public void serializeVideoDto() throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();

        //convert Object to json string
        VideoDto video1 = createVideo();
        //configure Object mapper for pretty print
        objectMapper.configure(SerializationFeature.INDENT_OUTPUT, true);

        //writing to console, can write to any output stream such as file
        StringWriter stringVideo = new StringWriter();
        objectMapper.writeValue(stringVideo, video1);
        String content = stringVideo.toString();
        byte[] byteArray = content.getBytes(StandardCharsets.UTF_8);

        String currentDir = System.getProperty("user.dir");
        //read json file data to String
        byte[] jsonData = Files.readAllBytes(Paths.get(currentDir + "/src/test/resources/video.json"));

        Assertions.assertArrayEquals(jsonData, byteArray);
    }

    private VideoDto createVideo() {
        VideoDto video = new VideoDto();
        video.setId(123);
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