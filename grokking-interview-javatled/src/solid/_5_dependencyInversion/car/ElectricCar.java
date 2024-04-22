package solid._5_dependencyInversion.car;

import solid._5_dependencyInversion.Switchable;

public class ElectricCar extends Car implements Switchable {
    @Override
    public void pressSwitch() {
        if (switchState) {
            switchState = false;
            System.out.println("OFF: car switched off");
        } else {
            switchState = true;
            System.out.println("ON: car switched on");
        }
    }
}
