package FifthHomework;

public class Main {
    public static void main(String[] args) {
        Employee[] empArray = new Employee[5]; // Объявляем массив объектов: массив из 5 сотрудников
        // Задаем объект для каждой ячейки массива
        empArray[0] = new Employee("Иванов Иван", "инженер", "ivivanov@mailbox.com", "+79231231234", 30000, 35);
        empArray[1] = new Employee("Смирнов Олег", "инженер", "olsmirnov@mailbox.com", "+79265678901", 40000, 45);
        empArray[2] = new Employee("Петрова Светлана", "бухгалтер", "svpetrova@mailbox.com", "+79161234567", 35000, 25);
        empArray[3] = new Employee("Соловьева Марина", "администратор", "masoloveva@mailbox.com", "+79139876543", 20000, 20);
        empArray[4] = new Employee("Потапов Евгений", "курьер", "evpotahov@mailbox.com", "+79060123456", 25000, 50);
        for (int i = 0; i < empArray.length; i++) {
            if (empArray[i].getAge() > 40) {
                empArray[i].printInfoEmployee();
            }
        }
    }
}
