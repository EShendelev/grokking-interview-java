package solid._5_dependencyInversion.musicPlayer;

public class CarMusicPlayer extends MusicPlayer {
    @Override
    public void pressSwitch() {
        if (switchState) {
            switchState = false;
            System.out.println("OFF: Music player off");
        } else {
            switchState = true;
            System.out.println("ON: Music player on");
        }
    }
}
