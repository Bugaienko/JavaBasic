package lesson_04;

/**
 * @author Sergey Bugaenko
 * {@code @date} 26.12.2024
 */

public class CharExample {

    public static void main(String[] args) {

        char letterA = 'A';
        char digit = '5';
        char symbol ='@';


        System.out.println("letterA: " + letterA);
        System.out.println("digit: " + digit);
        System.out.println("symbol: " + symbol);

        char a = 65; //

        System.out.println("a: " + a);

        char a1 = 0x41;

        System.out.println("a1: " + a1);

        char a2 = 0x0041;
        System.out.println("a2: " + a2);

        char a3 = '\u0041';
        System.out.println("a3: " + a3);

        char x = '\u1547';

        System.out.println("x: " + x);

        char letter = 'A';
        letter++;
        System.out.println("letter: " + letter);


        char digit0 = 48;
        System.out.println("digit0: " + digit0);
        digit0 += 5;
        System.out.println("digit0: " + digit0);

        char letA = 97;
        System.out.println("letA: " + letA);

        letA += 10;
        System.out.println("letA: " + letA);

        // A...Z -> 65...90





    }
}
