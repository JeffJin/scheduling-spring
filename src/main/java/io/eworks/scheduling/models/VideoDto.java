package io.eworks.scheduling.models;

public class VideoDto {

    private long id;
    private String title;
    private String description;
    private String youtubeUrl;
    private String url;
    private int duration;
    private int fileSize;
    private String fileType;
    private String videoSetting;
    private String privacySetting;
    private String[] thumbnailUrls;
    private TagDto[] tags;

    public VideoDto() {
        this.thumbnailUrls = new String[0];
        this.tags = new TagDto[0];
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getYoutubeUrl() {
        return youtubeUrl;
    }

    public void setYoutubeUrl(String youtubeUrl) {
        this.youtubeUrl = youtubeUrl;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getFileSize() {
        return fileSize;
    }

    public void setFileSize(int fileSize) {
        this.fileSize = fileSize;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public String getVideoSetting() {
        return videoSetting;
    }

    public void setVideoSetting(String videoSetting) {
        this.videoSetting = videoSetting;
    }

    public String getPrivacySetting() {
        return privacySetting;
    }

    public void setPrivacySetting(String privacySetting) {
        this.privacySetting = privacySetting;
    }

    public String[] getThumbnailUrls() {
        return thumbnailUrls;
    }

    public void setThumbnailUrls(String[] thumbnailUrls) {
        this.thumbnailUrls = thumbnailUrls;
    }

    public TagDto[] getTags() {
        return tags;
    }

    public void setTags(TagDto[] tags) {
        this.tags = tags;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}