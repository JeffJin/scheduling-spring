package io.eworks.scheduling.models;

import io.eworks.scheduling.services.VideoService;

public class PlaylistDto {
    private String id;
    private String title;
    private String description;
    private int startTime;
    private int endTime;
    private String privacySetting;
    private String[] thumbnailUrls;
    private VideoDto[] videos;
    private DeviceDto[] devices;
    private CommercialDto[] commercials;

    public CommercialDto[] getCommercials() {
        return commercials;
    }

    public void setCommercials(CommercialDto[] commercials) {
        this.commercials = commercials;
    }

    public DeviceDto[] getDevices() {
        return devices;
    }

    public void setDevices(DeviceDto[] devices) {
        this.devices = devices;
    }

    public VideoDto[] getVideos() {
        return videos;
    }

    public void setVideos(VideoDto[] videos) {
        this.videos = videos;
    }

    public String[] getThumbnailUrls() {
        return thumbnailUrls;
    }

    public void setThumbnailUrls(String[] thumbnailUrls) {
        this.thumbnailUrls = thumbnailUrls;
    }

    public String getPrivacySetting() {
        return privacySetting;
    }

    public void setPrivacySetting(String privacySetting) {
        this.privacySetting = privacySetting;
    }

    public int getEndTime() {
        return endTime;
    }

    public void setEndTime(int endTime) {
        this.endTime = endTime;
    }

    public int getStartTime() {
        return startTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
