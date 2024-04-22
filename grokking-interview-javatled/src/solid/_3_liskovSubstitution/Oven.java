package solid._3_liskovSubstitution;

public class Oven extends TemperatureControlledHouseholdItem {
    @Override
    public void changeTemperature() {
        System.out.println("Oven temperature changed ...");
    }

    @Override
    public void turnOff() {
        System.out.println("Oven turned off ...");
    }

    @Override
    public void turnOn() {
        System.out.println("Oven turned on ...");
    }
}
