package ru.geekbrains.ru;

public class Lesson5 {
    public static void main(String[] args) {
        Employee[] employeesArray = new Employee[5];
        employeesArray[0] = new Employee("Иван Иванов", "Инженер", "www@ya.ru",
                "348888", 60000, 43);
        employeesArray[1] = new Employee("Дмитрий Петров", "Сторож", "aaa@ya.ru",
                "3439999", 20000, 60);
        employeesArray[2] = new Employee("Денис Денисов", "Программист", "ssss@ya.ru",
                "3455555", 80000, 35);
        employeesArray[3] = new Employee("Саша Ногин", "Сисадмин", "nnnn@ya.ru",
                "3499996", 40000, 25);
        employeesArray[4] = new Employee("Станислав Васечкин", "Водитель", "uuuu@ya.ru",
                "3432323", 30000, 41);

        for (int i = 0; i < employeesArray.length; i++) {
            if (employeesArray[i].getAge() > 40) {
                employeesArray[i].printAll();
                System.out.println("================================");
            }
        }
    }

}
