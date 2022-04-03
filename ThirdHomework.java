public class ThirdHomework<arrNum> {
    public static void main(String[] args) {

        // Task 1.
        // Задать целочисленный массив, состоящий из элементов 0 и 1.
        // Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
        int[] arrNullOne = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int x = 0; x < arrNullOne.length; x++) {
            // С помощью цикла и условия заменить 0 на 1, 1 на 0;
            if (arrNullOne[x] == 1) {
                arrNullOne[x] = 0;
            } else {
                arrNullOne[x] = 1;
            }
            System.out.print(arrNullOne[x] + " ");
        }
        System.out.println();

        // Task 2;
        // Задать пустой целочисленный массив длиной 100.
        int[] myArray = new int[100];
        // С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
        for (int q = 0; q < myArray.length; q++) {
            myArray[q] = q + 1;
        }
        //Проверка: вывод результата
        for (int element : myArray) {
            System.out.print(element + " ");

        }
        System.out.println();

        // Task 3;
        // Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ];
        int[] arrNullTwo = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        // пройти по нему циклом
        for (int i = 0; i < arrNullTwo.length; i++) {
            // Числа меньшие 6 умножить на 2;
            if (arrNullTwo[i] < 6) {
                arrNullTwo[i] *= 2;
            }
            System.out.print(arrNullTwo[i] + " ");
        }
        System.out.println();

        // Task 4;
        // Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
        // и с помощью цикла(-ов) заполнить его диагональные элементы единицами
        // (можно только одну из диагоналей, если обе сложно).
        // Определить элементы одной из диагоналей можно по следующему принципу:
        // индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
        int[][] squareArr = new int[4][4];
        for (int i = 0; i < squareArr.length; i++) {
            for (int j = 0; j < squareArr.length; j++) {
                if (i == j) {
                    squareArr[i][j] = 1;
                } else if (i != j) {
                    squareArr[i][4 - i - 1] = 1;
                }
                System.out.print(squareArr[i][j] + " ");
            }

        }
        // Task 6*. - не смогла решить.
        //* Задать одномерный массив и найти в нем минимальный и максимальный элементы ;
      /*  int[] arrMinMax = new int[5];
        for (i = 0; i < arrMinMax.length; i++) {
            arrMinMax[i] = Integer.max();
            arrMinMax[i] = Integer.min();
            // System.out.print(max + " " + min);
        }
*/
    }
    // Task 5. - не выводится на печать.
    // Написать метод, принимающий на вход два аргумента: len и initialValue,
    // и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;
    public static int[] lenInitialValue(int len, int initialValue) {
        int[] lenArr = new int[len];
        for (int i = 0; i < lenArr.length; i++) {
            lenArr[i] = initialValue;
            System.out.print(lenArr[i] + " ");
        }
        return lenArr;
    }
}
