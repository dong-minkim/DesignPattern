package AdapterPattern;

import AdapterPattern.base.MEDIA_TYPE;
import AdapterPattern.player.AudioPlayer;

/**
 *  클래스의 인터페이스를 사용자가 기대하는 다른 인터페이스로 변환하는 패턴
 *  호환성이 없는 인터페이스 때문에 함께 동작할 수 없는 클래스들이 함께 작동하도록 해주는 패턴
 */

public class main {
    public static void main(String[] args) throws Exception {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play(MEDIA_TYPE.MP3, "beyond the horizon.mp3");
        audioPlayer.play(MEDIA_TYPE.MP4, "alone.mp4");
        audioPlayer.play(MEDIA_TYPE.VLC, "far far away.vlc");
        audioPlayer.play(MEDIA_TYPE.AVI, "mind me.avi");
    }
}
