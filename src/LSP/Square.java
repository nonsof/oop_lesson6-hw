//код описывает класс Square, который является подклассом класса QuadRangle. Давайте прокомментируем этот код:

package LSP;

public class Square extends QuadRangle {
    private int length;

    // Конструктор класса Square, принимающий длину стороны квадрата
    public Square(int length) {
        this.length = length;
    }

    // Переопределенный метод для расчета площади квадрата
    @Override
    public int area() {
        return this.length * this.length;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}

//Конструктор класса Square: Конструктор класса Square принимает длину стороны квадрата и инициализирует поле length. Это позволяет создавать объекты Square с указанной длиной стороны.

//Переопределение метода area(): Класс Square переопределяет метод area(), унаследованный от суперкласса QuadRangle. В данной реализации метода area(), площадь квадрата вычисляется как произведение длины стороны на саму себя.

//Геттер и сеттер для length: Класс Square предоставляет методы getLength() и setLength(), чтобы получить и установить значение длины стороны квадрата. Эти методы обеспечивают доступ к полю length, соблюдая инкапсуляцию данных.
