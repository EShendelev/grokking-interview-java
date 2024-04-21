package solid._2_openClose;

import solid._2_openClose.sensors.InfraredSensor;
import solid._2_openClose.sensors.Sensor;
import solid._2_openClose.sensors.TemperatureSensor;
import solid._2_openClose.sensors.UltrasonicSensor;

public class Main {
    public static void main(String[] args) {
        Sensor temperatureSensor = new TemperatureSensor();
        Sensor ultrasonicSensor = new UltrasonicSensor();
        Sensor infraredSensor = new InfraredSensor();
        Robot robot = new Robot(temperatureSensor);
        Robot robot1 = new Robot(ultrasonicSensor);
        Robot robot2 = new Robot(infraredSensor);
        robot.detect();
        robot1.detect();
        robot2.detect();
    }
}
