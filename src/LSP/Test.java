//класс Test, который демонстрирует использование принципа подстановки Лисков (Liskov Substitution Principle - LSP). Давайте прокомментируем этот код:

package LSP;

public class Test {
    public static void main(String[] args) {
        // Создание объекта Rectangle с шириной 5 и высотой 3, который является QuadRangle
        QuadRangle quadRangle = new Rectangle(5, 3);
        System.out.println("Rectangle" + " " + quadRangle.area());

        // Создание объекта Square с длиной стороны 5, который также является QuadRangle
        quadRangle = new Square(5);
        System.out.println("Square" + " " + quadRangle.area());
    }
}
//Использование принципа подстановки Лисков (LSP): Ваш код демонстрирует принцип подстановки Лисков (LSP). Вы создаете объекты Rectangle и Square, которые являются подклассами QuadRangle. Поскольку Rectangle и Square наследуют от QuadRangle, их можно использовать вместо QuadRangle, сохраняя при этом корректное поведение. Это соответствует принципу LSP, который подразумевает, что подклассы должны быть заменяемыми на своих суперклассах без нарушения корректности программы.

//Использование полиморфизма: Ваш код использует полиморфизм, так как объект quadRangle может ссылаться как на Rectangle, так и на Square, и вызывать метод area(). При вызове метода area(), будет вызван соответствующий метод в подклассе (Rectangle или Square), что позволяет объектам разных типов вести себя согласно своей специфике.
