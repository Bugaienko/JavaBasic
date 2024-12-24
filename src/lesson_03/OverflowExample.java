package lesson_03;

/**
 * @author Sergey Bugaenko
 * {@code @date} 24.12.2024
 */

public class OverflowExample {

    public static void main(String[] args) {

        byte byteVar = 127;
        byteVar++;
        System.out.println(byteVar);

    }
}
