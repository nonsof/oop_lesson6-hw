//Класс DieselPetrol реализует интерфейс Engine и представляет конкретную реализацию двигателя, в данном случае, дизельного двигателя. Давайте прокомментируем этот код:

package DIP;

public class DieselPetrol implements Engine {
    @Override
    public void start() {
        System.out.println("Запустили дизельный двигатель");
    }
}


//Реализация интерфейса Engine: Класс DieselPetrol реализует интерфейс Engine, который, вероятно, определяет метод start(). Этот класс обязан предоставить конкретную реализацию этого метода.

//Метод start(): В данной реализации метода start(), выводится сообщение в консоль, которое указывает на запуск дизельного двигателя.

//Принцип инверсии зависимостей (DIP): Класс DieselPetrol представляет конкретную реализацию двигателя, и он соответствует принципу инверсии зависимостей (DIP), так как он является реализацией абстракции Engine. Это позволяет внедрить разные реализации двигателей в класс Car, соблюдая принцип инверсии зависимостей, а именно зависимость от абстракции (интерфейса Engine).
