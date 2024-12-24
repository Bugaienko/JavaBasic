package lesson_03;

/**
 * @author Sergey Bugaenko
 * {@code @date} 24.12.2024
 */

public class IncrementExample {
    public static void main(String[] args) {

        int x = 20;

        x = x + 5;

        x = x - 10;

        x += 5; // x = x + 5;

        x = 20;
        x -= 2;
        System.out.println("x: " + x);

        x *= 2; // x = x * 2;

        System.out.println("x: " + x);

        x /= 4;

        System.out.println("x: " + x);

        System.out.println("\n================\n");

        x = x + 1;
        x += 1;
        x++;

        System.out.println("x: " + x);

        x--;

        System.out.println("x: " + x);

        //x++; x--;

        // ++x; --x;

       int y = 5;
        System.out.println("постфикс: " +  y++); // Выведет 5, а потом увеличит y до 6.
        System.out.println(y);

        y = 5;
        System.out.println("префикс: " + ++y); // Увеличит y до 6 и потом выведет в консоль
        System.out.println(y);



    }
}
