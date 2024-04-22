package solid._5_dependencyInversion;

import solid._5_dependencyInversion.car.ElectricCar;
import solid._5_dependencyInversion.car.ElectricVehicleEngine;
import solid._5_dependencyInversion.musicPlayer.CarMusicPlayer;
import solid._5_dependencyInversion.musicPlayer.MusicPlayerSwitcher;

/**
 * <a href="https://nuancesprog.ru/p/18651/">Принципы SOLID</a>
 * <p><b>Принцип инверсии зависимостей</b></p>
 *
 * Согласно этому принципу, высокоуровневые модули или классы не должны зависеть от низкоуровневых  —  и те
 * и другие должны зависеть только от абстракций. Зависимостью модулей не от конкретных, а от абстрактных реализаций
 * повышается уровень слабой связанности программного кода, облегчается расширение функциональности программы
 * без изменения имеющегося кода.
 * <p>
 * Абстрактным классом SwitchableObject представлены все объекты с переключателем или кнопкой для включения/выключения.
 * Им создается единственный абстрактный метод press_switch, готовый к реализации в последующих производных классах.
 * Производный класс ElectricCar  —  конкретная реализация класса SwitchableObject для электромобилей.
 * Другой производный класс ElectricVehicleEngine  —  конкретная реализация класса SwitchableObject для двигателей
 * электромобилей, в которой принимается аргумент конструктора SwitchableObject. То есть переключаемый объект необходимо
 * включить во входной параметр при инициализации класса ElectricVehicleEngine в объект
 */


public class Main {
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        ElectricVehicleEngine electricCarEngine = new ElectricVehicleEngine(electricCar);

        electricCarEngine.pressSwitch();
        electricCarEngine.pressSwitch();
        electricCarEngine.pressSwitch();

        CarMusicPlayer carMusicPlayer = new CarMusicPlayer();
        MusicPlayerSwitcher musicPlayerSwitcher = new MusicPlayerSwitcher(carMusicPlayer);

        musicPlayerSwitcher.pressSwitch();
        musicPlayerSwitcher.pressSwitch();
        musicPlayerSwitcher.pressSwitch();
    }
}
