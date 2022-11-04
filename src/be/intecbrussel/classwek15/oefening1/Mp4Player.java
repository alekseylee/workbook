package be.intecbrussel.classwek15.oefening1;

public class Mp4Player implements AdvancedMediaPlayer {
    private String fileName;

    public Mp4Player(String fileName) {

        this.fileName = fileName;
    }

    @Override
    public void playVlc(String fileName) {


    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file.Name: " + fileName);

    }
}
