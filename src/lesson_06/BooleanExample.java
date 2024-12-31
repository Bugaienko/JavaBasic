package lesson_06;

import java.util.Random;

/**
 * @author Sergey Bugaenko
 * {@code @date} 28.12.2024
 */

public class BooleanExample {

    public static void main(String[] args) {

        boolean isSunny = true; // Сейчас солнечно
        boolean isRaining = false; // Дождя нет

        int x = 10;
        int y = 5;

        // Сравнение на равенство "=="
        boolean b1 = x == y; // X равен Y -> 10 равно 5 -> false
        System.out.println(x + " == " + y + " -> " + b1);

        // Сравнение на неравенство "!="

        b1 = x != y; // X не равен Y -> 10 не равно 5 -> true
        System.out.println(x + " != " + y + " -> " + b1);

        // Больше ">"

        b1 = x > y; // X больше чем Y -> 10 больше чем 5 -> true
        System.out.println(x + " > " + y + " -> " + b1);

        y = 10;
        b1 = x > y; // 10 больше чем 10 -> false
        System.out.println(x + " > " + y + " -> " + b1);

        // Больше или равно ">="
        b1 = x >= y; // X больше или равен Y -> 10 больше или равно 10 -> true
        System.out.println(x + " >= " + y + " -> " + b1);

        // Меньше "<"
        x = 7;
        b1 = x < y; // X меньше чем Y -> 7 меньше чем 10 -> true
        System.out.println(x + " < " + y + " -> " + b1);

        // Меньше или равно "<="
        b1 = x <= y; // X  меньше или равен Y -> 7 меньше равно 10 -> true
        System.out.println(x + " <= " + y + " -> " + b1);

        // contains()
        String str = "Java is the best";
        boolean contains = str.contains("Java"); // Содержит "Java"
        System.out.println("contains = " + contains);

        // startWith()
        boolean startWith = str.startsWith("ava"); // Строка начинается с "Java"
        System.out.println("startWith = " + startWith);

        // endWith()
        boolean endWith = str.endsWith("best"); // Строка заканчивается последовательностью символов "best"
        System.out.println("endWith = " + endWith);

        // Логические операции

        System.out.println("\n=========================\n");

        // Логическое НЕ (!)

        b1 = !false;
        System.out.println("!false: " + b1);

        b1 = !(4 == 5); // !false
        System.out.println("!(4 == 5): " + b1);

        // Логическое И (&)
        b1 = true & true; // true
        System.out.println("true & true: " + b1);

        int x1 = 1000;
        boolean isGoodNumber = x1 > 0 & x1 < 100;
        System.out.println("isGoodNumber = " + isGoodNumber);

        // Логическое ИЛИ (|)
        b1 = false | true; // true
        System.out.println("false | true: " + b1);

        Random random = new Random();
        int rand = random.nextInt(100); // Генерация случайного числа от 0 до 99
        System.out.println("rand = " + rand);
        isGoodNumber = (rand % 2 == 0) | (rand % 5 == 0); // Четное или кратное 5
        System.out.println("isGoodNumber = " + isGoodNumber);

        // Логическое исключающее ИЛИ (^) XOR
        b1 = true ^ false; // true, потому что значения разные
        System.out.println("true ^ false: " + b1);
        System.out.println("true ^ true -> " + (true ^ true));
        System.out.println("false ^ true -> " + (false ^ true));
        System.out.println("false ^ false -> " + (false ^ false));

        // Сокращенное логическое И (&&)
        b1 = true && false; // false
        System.out.println("true && false: " + b1);

        int a = 10, b = 0;
        b1 = (b != 0) && (a / b > 2);
        System.out.println(b1);

        // Сокращенное логическое ИЛИ (||)
        b1 = true || (a / b > 2) ; // Левая часть истина, правая не важна для общего результата и не вычисляется
        System.out.println(b1);

        System.out.println("\n=======================\n");

        /*
        !
        &
        ^
        |
        &&
        ||
         */

        System.out.println(true ^ true & false); // true
        System.out.println(true ^ false); // true
        System.out.println(true ); // true

        System.out.println("\n ====================== \n");
        System.out.println(true ^ true && false); // false
        System.out.println(false && false); // false
        System.out.println(false); // false

        System.out.println("\n====================\n");
        System.out.println((true ^ true) & false); // false
        System.out.println(true ^ (true & false)); // true



    }
}
