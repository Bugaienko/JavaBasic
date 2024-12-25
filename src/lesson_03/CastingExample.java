package lesson_03;

/**
 * @author Sergey Bugaenko
 * {@code @date} 24.12.2024
 */

public class CastingExample {

    public static void main(String[] args) {

        // Неявное преобразование

        int myInt = 10;
        double myDouble = myInt; // Неявное преобразование из int в double
        System.out.println(myDouble);

        long myLong = 5_466_556;
        int myInt2 = (int) myLong;

        System.out.println("myInt2: " + myInt2);

        myDouble = 9.99;
        myInt = (int) myDouble;
        System.out.println("myInt: " + myInt);

        // Преобразования в вычислениях

        int x = 20;
        int y = 7;

        double result;

        result = x / y;
        System.out.println("result: " + result);

        result = x / 7.0;
        System.out.println("result: " + result);

        result = x / (double) y; // числитель тоже будет приведен к типу double
        System.out.println("result: " + result);

        result = (float) x / y;
        System.out.println("result: " + result);



    }
}
