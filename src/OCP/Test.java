//Класс Test содержит метод main, который демонстрирует использование классов Vehicle, Car и Bus, а также их соответствие принципу открытости/закрытости (OCP). Давайте прокомментируем этот код:

package OCP;

public class Test {
    public static void main(String[] args) {
        // Создание объекта Vehicle с максимальной скоростью 100 и типом "SOLID"
        Vehicle vehicle = new Vehicle(100, "SOLID");
        System.out.println(vehicle.getType() + " " + vehicle.calculateAllowedSpeed());

        // Создание объекта Car с максимальной скоростью 200
        Vehicle car = new Car(200);
        System.out.println(car.getType() + " " + car.calculateAllowedSpeed());

        // Создание объекта Bus с максимальной скоростью 100
        Vehicle bus = new Bus(100);
        System.out.println(bus.getType() + " " + bus.calculateAllowedSpeed());
    }
}
//Создание объекта Vehicle: В этой части кода создается объект Vehicle с максимальной скоростью 100 и типом "SOLID". Это показывает использование базового класса Vehicle.

//Создание объекта Car и Bus: Затем создаются объекты Car и Bus, представляющие автомобиль и автобус соответственно. Оба объекта имеют разные максимальные скорости.

//Вызов метода calculateAllowedSpeed(): Для каждого объекта вызывается метод calculateAllowedSpeed(), который рассчитывает допустимую скорость для каждого типа транспортного средства в соответствии с их реализацией. Затем результат выводится на консоль вместе с типом транспортного средства.
