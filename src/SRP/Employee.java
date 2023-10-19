//Приведенный вами код описывает класс Employee, который представляет сущность сотрудника. Давайте прокомментируем участки кода и рассмотрим, какие принципы можно применить:
package SRP;

public class Employee {
    private String name;
    private String dol;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDol() {
        return dol;
    }

    public void setDol(String dol) {
        this.dol = dol;
    }

    public Employee(String name, String dol) {
        this.name = name;
        this.dol = dol;
    }
}

//Принцип единственной ответственности (Single Responsibility Principle - SRP): В данном коде класс Employee нарушает SRP, так как он объединяет две ответственности. Во-первых, класс хранит данные о сотруднике (поля name и dol), и во-вторых, он предоставляет методы доступа к этим данным (геттеры и сеттеры). Это несоответствие принципу SRP делает код менее гибким и менее удобным для изменений.

//Использование геттеров и сеттеров: В данном коде используются геттеры и сеттеры для доступа к полям name и dol. Это хорошая практика, так как геттеры и сеттеры обеспечивают инкапсуляцию данных и контроль над доступом к ним.

//Чтобы улучшить код с точки зрения SRP, рекомендуется разделить класс Employee на два отдельных класса:

package SRP;

// Класс, представляющий данные о сотруднике
//public class EmployeeData {
//    private String name;
//    private String dol;
//
//    public EmployeeData(String name, String dol) {
//        this.name = name;
//        this.dol = dol;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getDol() {
//        return dol;
//    }
//
//    public void setDol(String dol) {
//        this.dol = dol;
//    }
//}

// Класс, представляющий сущность сотрудника и его операции
//public class Employee {
//    private EmployeeData employeeData;
//
//    public Employee(String name, String dol) {
//        this.employeeData = new EmployeeData(name, dol);
//    }
//
//    public String getName() {
//        return employeeData.getName();
//    }
//
//    public void setName(String name) {
//        employeeData.setName(name);
 //   }
//
//    public String getDol() {
//        return employeeData.getDol();
//    }
//
//    public void setDol(String dol) {
//        employeeData.setDol(dol);
//    }
//}

//Теперь данные о сотруднике хранятся в классе EmployeeData, который отвечает только за хранение данных. Класс Employee остается, чтобы предоставлять методы доступа к этим данным. Это следует принципу единственной ответственности (SRP), делая код более модульным и гибким для будущих изменений.
