package solid._5_dependencyInversion.musicPlayer;

import solid._5_dependencyInversion.Switchable;

public abstract class MusicPlayer implements Switchable {
    protected boolean switchState = false;
    @Override
    public void pressSwitch() {

    }
}
