package lesson_03;

/**
* @author Sergey Bugaenko
* {@code @date} 21.12.2024
*/

public class VariableExample {

    public static void main(String[] args) {

        int myFirstVariable; // Объявление (декларация) переменной типа int

        myFirstVariable = 1; // Присвоение значения переменной. Первое присвоение значения называется инициализацией.

        int mySecondVariable = 25; // Объявление и инициализация переменной в одной сроке


        System.out.println("myFirstVariable: " + myFirstVariable);

        myFirstVariable = 100;

        System.out.println("myFirstVariable: " + myFirstVariable);

        System.out.println("my Second Variable value is: " + myFirstVariable);

        byte myByteVariable = 50;

        System.out.println("myByteVariable: " + myByteVariable);

        short myShortVariable = 1000;
        long myLongVariable = 10000000;

        myLongVariable = 2_148_000_000_000_000L; // L - явно указывает, что число записано в формате long

        System.out.println(myLongVariable);

        double myDoubleVar = 154.678;

        System.out.println("myDoubleVar: " + myDoubleVar);

        float myFloatVar = 154.678f; // f - явно указывает, что число записано в формате float

        System.out.println("myFloatVar: " + myFloatVar);


    }
}
