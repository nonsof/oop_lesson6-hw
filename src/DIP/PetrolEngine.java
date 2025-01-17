//PetrolEngine реализует интерфейс Engine и представляет конкретную реализацию двигателя, в данном случае - бензинового двигателя. Давайте прокомментируем этот код:

package DIP;

public class PetrolEngine implements Engine {
    @Override
    public void start(){
        System.out.println("Бензиновый двигатель запущен");
    }
}

//Реализация интерфейса Engine: Класс PetrolEngine реализует интерфейс Engine, который определяет метод start(). Этот класс предоставляет конкретную реализацию метода start(), которая выводит сообщение в консоль, указывающее на запуск бензинового двигателя.

//Принцип инверсии зависимостей (DIP): Класс PetrolEngine соответствует принципу инверсии зависимостей (DIP), так как он является реализацией абстракции Engine. Это позволяет внедрить эту реализацию в класс Car, соблюдая принцип инверсии зависимостей, где зависимость от абстракции Engine позволяет легко менять или добавлять разные типы двигателей без изменения кода класса Car.
