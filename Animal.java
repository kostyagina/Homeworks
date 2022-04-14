package SixthHomework;

public abstract class Animal {
    String name;
    int distanceRun;
    String distanceSwim;

    Animal(String name, int distanceRun, String distanceSwim) {
        this.name = name;
        this.distanceRun = distanceRun;
        this.distanceSwim = distanceSwim;
    }

    public void distanceRun() {
        System.out.println(name + " пробежал " + distanceRun + " метров");
    }

    //public abstract  void distanceRun();
    //public void distanceRun (){}
    //public void distanceRun(int distanceRun){}

    public void distanceSwim() {
        System.out.println(name + " проплыл " + distanceSwim + " метров");
    }

}
