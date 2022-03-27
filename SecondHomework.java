public class SecondHomework {

    public static void main(String[] args) {
        TwoIntNumbers();
        PositiveNegativeInt();
        FalseTrueInt();
        StringInt();
        Year();
    }

    public static void TwoIntNumbers() {
        int a = 6;
        int b = 4;
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }

    public static void PositiveNegativeInt() {
        int x = -8;
        if (x >= 0) {
            System.out.println("Положительное число");
        }
        else {
            System.out.println("Отрицательное число");
        }
    }

    public static void FalseTrueInt() {
        int x = -8;
        if (x < 0) {
            System.out.println("True");
        }
        else if (x >= 0) {
            System.out.println("False");
        }
    }
    public static void StringInt() {
        String a = "Hello World!";
        int b = 3;
        for (b = 1; b <= 3; b++) {
            System.out.println(a);
        }
    }

    public static void Year() {
        int y = 2023;
        int v = 2020;
        if (y == v || y == v+4  || y == v-4) {
            System.out.println("true"); //високосный
        }
        else if (y != v && (y-v) != 4 ) {
            System.out.println("false"); 
        }
    }
}
