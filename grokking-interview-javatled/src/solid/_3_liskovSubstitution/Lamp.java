package solid._3_liskovSubstitution;

public class Lamp extends HouseholdItem{
    @Override
    public void turnOn() {
        System.out.println("Lamp turn on ...");
    }

    @Override
    public void turnOff() {
        System.out.println("Lamp turn off ...");
    }
}
