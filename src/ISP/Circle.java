//Класс Circle реализует интерфейс Shape и представляет круг. Давайте прокомментируем этот код:
package ISP;

public class Circle implements Shape {
    private int radius;

    // Конструктор класса Circle, принимающий радиус круга
    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    // Переопределение метода area() для расчета площади круга
    @Override
    public double area() {
        return 2 * 3.14 * radius;
    }
}
//Конструктор класса Circle: Конструктор класса Circle принимает радиус круга и инициализирует соответствующее поле radius. Это позволяет создавать объекты Circle с указанным радиусом.

//Переопределение метода area(): Класс Circle переопределяет метод area() из интерфейса Shape. В данной реализации метода area(), площадь круга вычисляется как произведение радиуса на 2 и число π (приближенное значение 3.14).

//Геттер и сеттер для radius: Класс Circle предоставляет методы getRadius() и setRadius() для доступа к полю radius. Это обеспечивает контроль и безопасность при работе с данными о радиусе круга.
