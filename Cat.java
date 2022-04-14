package SixthHomework;

public class Cat extends Animal {
    Cat(String name, int distanceRun, String distanceSwim) {
        super(name, distanceRun, distanceSwim);
    }

    public void distanceRun() {
        System.out.println(name + " пробежал " + distanceRun + " метров");
    }

    public void distanceSwim() {
        System.out.println(name + " не умеет плавать");
    }

}

