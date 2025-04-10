package io.eworks.scheduling.utils;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.*;
import io.eworks.scheduling.models.TagDto;
import io.eworks.scheduling.models.VideoDto;
import org.springframework.boot.jackson.JsonComponent;

import java.io.IOException;

@JsonComponent
public class AdworksJsonComponent {

    public static class Serializer extends JsonSerializer<VideoDto> {

        @Override
        public void serialize(VideoDto value, JsonGenerator jgen, SerializerProvider serializers) throws IOException {
            jgen.writeStartObject();
            jgen.writeNumberField("id", value.getId());
            jgen.writeStringField("title", value.getTitle());
            jgen.writeStringField("description", value.getDescription());
            jgen.writeStringField("youtubeUrl", value.getYoutubeUrl());
            jgen.writeStringField("url", value.getUrl());
            jgen.writeNumberField("duration", value.getDuration());
            jgen.writeNumberField("fileSize", value.getFileSize());
            jgen.writeStringField("fileType", value.getFileType());
            jgen.writeStringField("videoSetting", value.getVideoSetting());
            jgen.writeStringField("privacySetting", value.getPrivacySetting());
            jgen.writeArrayFieldStart("thumbnailUrls");
            for (String url: value.getThumbnailUrls()) {
                jgen.writeString(url);
            }
            jgen.writeEndArray();
            jgen.writeArrayFieldStart("tags");
            for (TagDto tag: value.getTags()) {
                jgen.writeObject(tag);
            }
            jgen.writeEndArray();
            jgen.writeEndObject();
        }

    }

    public static class Deserializer extends JsonDeserializer<VideoDto> {

        @Override
        public VideoDto deserialize(JsonParser jsonParser, DeserializationContext cxt) throws IOException {
            ObjectCodec codec = jsonParser.getCodec();
            JsonNode tree = codec.readTree(jsonParser);
            VideoDto dto = new VideoDto();
            dto.setId(tree.get("id").longValue());
            dto.setTitle(tree.get("title").textValue());
            dto.setDescription(tree.get("description").textValue());
            dto.setYoutubeUrl(tree.get("youtubeUrl").textValue());
            dto.setUrl(tree.get("url").textValue());
            dto.setDuration(tree.get("duration").intValue());
            dto.setFileSize(tree.get("fileSize").intValue());
            dto.setFileType(tree.get("fileType").textValue());
            dto.setVideoSetting(tree.get("videoSetting").textValue());
            dto.setPrivacySetting(tree.get("privacySetting").textValue());
//            JsonNode tagNodes = tree.get("tags");
//            if(tagNodes!= null && tagNodes.isArray()) {
//                TagDto[] tags = new TagDto[tagNodes.size()];
//                for (int i = 0; i < tagNodes.size(); i++) {
//                    System.out.println(tagNodes);
//                    tags[i] = new TagDto();
//                    tags[i].setName(tagNodes.get(i).textValue());
//                }
//                dto.setTags(tags);
//            }
//            JsonNode thumbnailUrlNodes = tree.get("thumbnailUrls");
//            if(thumbnailUrlNodes!= null && thumbnailUrlNodes.isArray()) {
//                String[] thumbnails = new String[thumbnailUrlNodes.size()];
//                for (int i = 0; i < thumbnailUrlNodes.size(); i++) {
//                    System.out.println(thumbnailUrlNodes.get(i).textValue());
//                    thumbnails[i] = thumbnailUrlNodes.get(i).textValue();
//                }
//                dto.setThumbnailUrls(thumbnails);
//            }
            return dto;
        }

    }
}
