package solid._2_openClose;

import solid._2_openClose.sensors.Sensor;


public class Robot {
    private final Sensor sensor;

    public Robot(Sensor sensor) {
        this.sensor = sensor;
    }

    public void detect() {
       sensor.detect();
    }

}
