package Lesson7;

public class Plate {
    private int food;
    private int newFood;

    // private int minAmountFood; - не додумалась, как установить это ограничение?
    // System.out.println("Количество еды в тарелке не может быть отрицательным");}

    public Plate(int food) { // конструкор тарелки
        this.food = food;
    }

    public void decreaseFood(int appetite) { // метод уменьшения еды
        food -= appetite; // еда -= аппетит;
    }

    public void increaseFood() { // метод увеличения еды (добавка)
        this.newFood = newFood;
        food += newFood;
        System.out.println("В тарелку добавили " + newFood + " единиц корма");
    }

    public void info() { // метод выводит в консоль текущее количество еды в тарелке
        System.out.println("Количество еды в тарелке: " + food);
    }
}


