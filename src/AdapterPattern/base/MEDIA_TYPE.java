package AdapterPattern.base;

public enum MEDIA_TYPE {
    MP3("MP3"), MP4("MP4"), VLC("VLC"), AVI("AVI");

    private String type;

    MEDIA_TYPE(String type) {
        this.type = type;
    }

    public String getValue() {
        return this.type;
    }
}
