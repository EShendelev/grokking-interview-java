package solid._5_dependencyInversion.car;

import solid._5_dependencyInversion.Switchable;

public class ElectricVehicleEngine implements Switchable {
    protected boolean engineActive;
    Switchable switchable;

    public ElectricVehicleEngine(Switchable switchable) {
        engineActive = false;
        this.switchable = switchable;
    }
    @Override
    public void pressSwitch() {
        if (engineActive) {
            switchable.pressSwitch();
            engineActive = false;
        } else {
            switchable.pressSwitch();
            engineActive = true;
        }
    }
}
