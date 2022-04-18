package Lesson7;

import java.util.Scanner;


public class MainClass {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int eating;
        Cat[] catsArray = new Cat[3];
        catsArray[0] = new Cat("Маркиз", 3, true, false);
        catsArray[1] = new Cat("Мурзик", 5, true, false); // объект из класса Cat - кошак по кличке Мурзик, с аппетитом на 5 единиц, голоден, сытость = false;
        catsArray[2] = new Cat("Васька", 2, true, false);

        Plate plate = new Plate(100); // объект тарелка из класса Plate - заполнена на 100 единиц;
        plate.info(); // метод выводит в консоль количество еды в тарелке;
       /* for (int i = 0; i < catsArray.length; i++) {
            if (catsArray[i].satiety == false && catsArray[i].appetite < plate.food) {
                catsArray[i].eat(plate);
                catsArray[i].satiety = true;
                System.out.println(catsArray[i].name + " сытый кот!");
            } else {
                System.out.println(catsArray[i].name + " голоден!");
            }*/
        plate.info(); // метод выводит в консоль количество оставшейся еды в тарелке;
        System.out.println("Сколько нужно добавки?");
        eating = scanner.nextInt();
        plate.increaseFood();
        plate.info();

    }

}



