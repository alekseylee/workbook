package be.intecbrussel.classwek15.oefening1;

public class AudioPlayer implements MediaPlayer {
    private String audioType;
    private String fileName;

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equals("mp3")) {
            System.out.println("Playing mp3 file. Name: " + fileName);
        } else if (audioType.equals("mp4")) {
            MediaAdapter mp4 = new MediaAdapter(audioType);
            mp4.play(audioType,fileName);
        } else  if (audioType.equals("vlc")) {
            MediaAdapter vlc = new MediaAdapter(audioType);
            vlc.play(audioType,fileName);
        } else {
            if (audioType.equals("avi")) {
                System.out.println("Invalid media. avi format not supported");
            }
        }
    }
}
