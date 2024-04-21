package solid._2_openClose;

import solid._2_openClose.sensors.Sensor;

/**
 * <a href="https://nuancesprog.ru/p/18651/">Принципы SOLID</a>
 * <p><b>Принцип открытости/закрытости</b></p>
 * Согласно этому принципу, класс должен быть открыт для расширения, но закрыт для модификации.
 * То есть должна быть возможность, не меняя уже имеющийся код, добавлять в него новую функциональность.
 * <p>
 * Таким образом можно расширить функционал не меняя класс Robot, а добавив новый сенсор.
 */

public class Robot {
    private final Sensor sensor;

    public Robot(Sensor sensor) {
        this.sensor = sensor;
    }

    public void detect() {
       sensor.detect();
    }

}
