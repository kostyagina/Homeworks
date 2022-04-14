package SixthHomework;

public class Main {
    public static void main(String[] args) {
        Cat myCat = new Cat("Кот", 180, "Не умеет плавать");
        Dog myDog = new Dog("Собакен", 400, "10");
        Cat secondCat = new Cat("Другой кот", 120, "Не умеет плавать");
        myCat.distanceRun();
        myCat.distanceSwim();
        secondCat.distanceRun();
        secondCat.distanceSwim();
        myDog.distanceRun();
        myDog.distanceSwim();

        //Cat.distanceRun(200);
        //Dog.distanceRun(500);
        //Dog.distanceSwim(10);
/*
        Animal[] zoo = {
                myCat,
                myDog,
                secondCat

        };

        Cat mySecondCat = (Cat) zoo[2];
        mySecondCat.distanceRun();

        for (
                int i = 0;
                i < zoo.length; i++) {
            // zoo[i].distanceSwim();
            zoo[i].distanceRun(10);

            if (zoo[i] instanceof Cat) {
                Cat p = (Cat) zoo[i];
                p.distanceRun();
            }
        }
*/
    }
}