package solid._5_dependencyInversion.musicPlayer;

import solid._5_dependencyInversion.Switchable;

public class MusicPlayerSwitcher implements Switchable {
    Switchable switchable;
    protected boolean playerActive;

    public MusicPlayerSwitcher(Switchable switchable) {
        playerActive = false;
        this.switchable = switchable;
    }

    @Override
    public void pressSwitch() {
         if (playerActive) {
             switchable.pressSwitch();
             playerActive = false;
         } else {
             switchable.pressSwitch();
             playerActive = true;
         }
    }
}
