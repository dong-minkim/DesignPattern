package AdapterPattern;

import AdapterPattern.base.AdvancedMediaPlayer;
import AdapterPattern.base.MEDIA_TYPE;
import AdapterPattern.base.MediaPlayer;
import AdapterPattern.player.Mp4Player;
import AdapterPattern.player.VlcPlayer;

public class MediaAdapter implements MediaPlayer {
    private AdvancedMediaPlayer advancedMusicPlayer;

    public MediaAdapter(MEDIA_TYPE type) throws Exception {
        switch (type) {
            case MP4:
                advancedMusicPlayer = new Mp4Player();
                break;

            case VLC:
                advancedMusicPlayer = new VlcPlayer();
                break;

            default:
                throw new Exception();
        }
    }

    @Override
    public void play(MEDIA_TYPE type, String fileName) {
        advancedMusicPlayer.play(type, fileName);
    }
}
