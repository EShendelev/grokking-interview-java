package solid._2_openClose.sensors;

public class TemperatureSensor extends Sensor {
    @Override
    public void detect() {
        System.out.println("Detecting objects using temperature sensor ... ");
    }
}
