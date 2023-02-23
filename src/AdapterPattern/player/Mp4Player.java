package AdapterPattern.player;


import AdapterPattern.base.AdvancedMediaPlayer;
import AdapterPattern.base.MEDIA_TYPE;

public class Mp4Player implements AdvancedMediaPlayer {

    @Override
    public void play(MEDIA_TYPE type, String fileName) {
        System.out.printf("Playing {} file. Name: {}", type.getValue(), fileName);
    }
}
