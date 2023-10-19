
//Ваш класс Rectangle представляет собой подкласс класса QuadRangle и описывает прямоугольник. Давайте прокомментируем этот код:

package LSP;

public class Rectangle extends QuadRangle {
    private int width;
    private int height;

    // Конструктор класса Rectangle, принимающий ширину и высоту прямоугольника
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    // Переопределенный метод для расчета площади прямоугольника
    @Override
    public int area() {
        return this.height * this.width;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
//Конструктор класса Rectangle: Конструктор класса Rectangle принимает ширину и высоту прямоугольника и инициализирует соответствующие поля width и height. Это позволяет создавать объекты Rectangle с указанными размерами.

//Переопределение метода area(): Класс Rectangle переопределяет метод area(), унаследованный от суперкласса QuadRangle. В данной реализации метода area(), площадь прямоугольника вычисляется как произведение ширины на высоту.

//Геттер и сеттер для width: Класс Rectangle предоставляет методы getWidth() и setWidth(), чтобы получить и установить значение ширины прямоугольника. Эти методы обеспечивают доступ к полю width, соблюдая инкапсуляцию данных.
