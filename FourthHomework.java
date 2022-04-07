import java.util.Random;
import java.util.Scanner;

public class FourthHomework {
    public static char[][] map;
    public static final int SIZE = 3; // размер игорового поля
    //public static final int DOTS_TO_WIN = 4;
    public static final char DOT_X = 'X'; // крестики
    public static final char DOT_O = 'O'; // нолики
    public static final char DOT_EMPTY = '.'; // пустое поле

    public static void main(String[] args) {
        initMap();
        showMap();

        while (true) {
            humanTurn();
            showMap();
            if (isWinner(DOT_X)) {
                System.out.println("Победил человек");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья!");
                break;
            }
            aiTurn();
            showMap();
            if (isWinner(DOT_O)) {
                System.out.println("Победил компьютер");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья!");
                break;
            }

        }
        System.out.println("Игра закончена");
    }

    // Инициализация игрового поля
    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int row = 0; row < SIZE; row++) {
            for (int column = 0; column < SIZE; column++) {
                map[row][column] = DOT_EMPTY;
            }
        }
    }

    // Вывод игрового поля в консоль
    public static void showMap() {
        for (int i = 0; i <= SIZE; i++) { // Цикл шляпы сверху
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " "); // Вывод первой строки
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void humanTurn() {
        Scanner scanner = new Scanner(System.in); // Функция ввода данных в консоль
        int x;
        int y;
        do {
            System.out.println("Введите координаты в формате: X и Y");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isCellValid(x, y));
        map[y][x] = DOT_X; // Человек пусть ходит X
    }

    public static boolean isCellValid(int x, int y) { // Проверка ячейки
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) {
            return false;
        }
        return map[y][x] == DOT_EMPTY;
    }

    public static void aiTurn() {
        Random random = new Random(); // Псевдогенерация случайных чисел
        int x;
        int y;

        do {
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
        } while (!isCellValid(x, y));

        System.out.println("Компьютер сходил в координаты: X: " + x + " Y: " + y);
        map[y][x] = DOT_O; // Компьютер пусть ходит O
    }

    public static boolean isWinner(char symb) {
        if (map[0][0] == symb && map[0][1] == symb && map[0][2] == symb) {
            return true;
        }
        if (map[1][0] == symb && map[1][1] == symb && map[1][2] == symb) {
            return true;
        }
        if (map[2][0] == symb && map[2][1] == symb && map[2][2] == symb) {
            return true;
        }

        if (map[0][0] == symb && map[1][0] == symb && map[2][0] == symb) {
            return true;
        }
        if (map[0][1] == symb && map[1][1] == symb && map[2][1] == symb) {
            return true;
        }
        if (map[0][2] == symb && map[1][2] == symb && map[2][2] == symb) {
            return true;
        }

        if (map[0][0] == symb && map[1][1] == symb && map[2][2] == symb) {
            return true;
        }
        if (map[0][2] == symb && map[1][1] == symb && map[2][0] == symb) {
            return true;
        }

        return false;
    }
   /* public static boolean isWinner(char symb) { // Проверка победы - не запускается.
        for (int i = 0; i < SIZE; i++) {
            if (map[i][0] == symb && map[i][1] == symb && map[i][2] == symb)
                map[0][i] == symb && map[1][i] == symb && map[2][i] == symb)
            return true;

            if (map[0][0] == symb && map[1][1] == symb && map[2][2] == symb)
                return true;

            if (map[2][0] == symb && map[1][1] == symb &&
                    map[0][2] == symb)
                return true;

            return false;
        }*/

    public static boolean isMapFull() { // Проверка ничьи
        for (int row = 0; row < SIZE; row++) {
            for (int column = 0; column < SIZE; column++) {
                if (map[row][column] == DOT_EMPTY)
                    return false;
            }
        }

        return true;
    }
}

