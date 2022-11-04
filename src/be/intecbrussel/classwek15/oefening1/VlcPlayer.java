package be.intecbrussel.classwek15.oefening1;

public class VlcPlayer implements AdvancedMediaPlayer {
    private String fileName;

    public VlcPlayer(String fileName) {

        this.fileName = fileName;
    }

    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file.Name: " + fileName);

    }

    @Override
    public void playMp4(String fileName) {

    }
}
