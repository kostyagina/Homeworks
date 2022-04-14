package SixthHomework;

public class Dog extends Animal {

    Dog(String name, int distanceRun, String distanceSwim) {
        super(name, distanceRun, distanceSwim);
    }

   public void distanceRun() {
        System.out.println(name + " пробежал " + distanceRun + " метров");
    }

    public void distanceSwim() {
        System.out.println(name + " проплыл " + distanceSwim + " метров");
    }

}
