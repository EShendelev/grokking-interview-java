package solid._2_openClose.sensors;

public class InfraredSensor extends Sensor {
    @Override
    public void detect() {
        System.out.println("Detecting objects using infrared sensor ... ");
    }
}
