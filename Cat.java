package Lesson7;

public class Cat {
    private String name;
    private int appetite;
    private boolean isHungry;
    private boolean satiety;

    public Cat(String name, int appetite, boolean isHungry, boolean satiety) {
        this.name = name; // кличка
        this.appetite = appetite; // аппетит
        this.isHungry = isHungry; // голоден
        this.satiety = satiety; // сытость
    }

    public void eat(Plate plate) {
        plate.decreaseFood(appetite);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (obj instanceof Cat) {
            Cat anotherCat = (Cat) obj;
            return name.equals(anotherCat.name);
        }
        return false;
    }

    public String toString() {
        return "Кошка по кличке " + name;
    }

}
