package solid._5_dependencyInversion.car;

import solid._5_dependencyInversion.Switchable;

public abstract class Car implements Switchable {

    protected boolean switchState = false;

    @Override
    public void pressSwitch() {
    }
}
