package solid._2_openClose;

import solid._2_openClose.sensors.InfraredSensor;
import solid._2_openClose.sensors.Sensor;
import solid._2_openClose.sensors.TemperatureSensor;
import solid._2_openClose.sensors.UltrasonicSensor;

/**
 * <a href="https://nuancesprog.ru/p/18651/">Принципы SOLID</a>
 * <p><b>Принцип открытости/закрытости</b></p>
 * Согласно этому принципу, класс должен быть открыт для расширения, но закрыт для модификации.
 * То есть должна быть возможность, не меняя уже имеющийся код, добавлять в него новую функциональность.
 * <p>
 * Таким образом можно расширить функционал не меняя класс Robot, а добавив новый сенсор.
 */
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
