//класс Car, который также наследуется от класса Vehicle и переопределяет метод calculateAllowedSpeed(). Давайте прокомментируем этот код и рассмотрим, как он соответствует принципу открытости/закрытости (Open/Closed Principle - OCP) и другим аспектам:
package OCP;

public class Car extends Vehicle {
    // Конструктор класса Car, принимающий максимальную скорость автомобиля
    public Car(int maxSpeed) {
        super(maxSpeed, "Car");
    }

    // Переопределенный метод для расчета допустимой скорости автомобиля
    @Override
    public double calculateAllowedSpeed() {
        // Расчет допустимой скорости, в данном случае, 80% от максимальной скорости
        return super.getMaxSpeed() * 0.8;
    }
}
//Принцип открытости/закрытости (Open/Closed Principle - OCP): Класс Car также соблюдает OCP, так как он расширяет функциональность базового класса Vehicle, переопределяя метод calculateAllowedSpeed(), но не изменяя сам базовый класс Vehicle. Это позволяет добавлять новые типы транспортных средств, такие как автомобили, не модифицируя существующий код класса Vehicle.

//Конструктор класса: Конструктор класса Car принимает максимальную скорость автомобиля и вызывает конструктор суперкласса Vehicle с этим значением и типом транспортного средства "Car". Это позволяет задавать максимальную скорость и тип транспортного средства при создании объекта Car.

//Метод calculateAllowedSpeed(): Этот метод переопределяет метод из суперкласса Vehicle. В данном случае, он вычисляет допустимую скорость автомобиля как 80% от максимальной скорости, используя метод getMaxSpeed() из суперкласса.
