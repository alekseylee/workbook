package be.intecbrussel.classwek15.oefening1;

public class MediaAdapter implements MediaPlayer{
    private AdvancedMediaPlayer advancedMusicPlayer;


    public MediaAdapter(String audioType) {
        if (audioType.equals("mp4")){
            advancedMusicPlayer = new Mp4Player(audioType);
        }
        else if(audioType.equals("vlc")){
            advancedMusicPlayer = new VlcPlayer(audioType);
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equals("mp4")){
            advancedMusicPlayer.playMp4("Playing " + fileName);
        } else if (audioType.equals("vlc")) {
            advancedMusicPlayer.playVlc("Playing " + fileName);
        }
        else {
            System.out.println("can't play file: " + audioType);
        }

    }
}
