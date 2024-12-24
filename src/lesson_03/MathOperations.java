package lesson_03;

/**
 * @author Sergey Bugaenko
 * {@code @date} 23.12.2024
 */

public class MathOperations {

    public static void main(String[] args) {

        int var1 = 20;
        int var2 = 7;

        int result;

        // Сложение +

        result = var1 + var2;

        System.out.println("var1 + var2 = " + result);

        // Вычитания -
        result = var1 - var2;

        System.out.println("var1 - var2 = " + result);

        // Умножения *
        result = var1 * var2;
        System.out.println("var1 * var2 = " + result);

        // Целочисленное деления /

        // 20 / 7 = 2
        result = var1 / var2;

        System.out.println("var1 / var2 = " + result);

        // Взятие остатка от деления %

        int rest = var1 % var2;
        System.out.println("var1 % var2 = " + rest);

        System.out.println(4 % 2); // 0
        System.out.println(5 % 2); // 1


        result = (6 + 2) / 2; // 7
        System.out.println("(6 + 2) / 2 = " + result);

        result = 4 * 2 / 8;
        System.out.println("4 * 2 / 8 = " +  result);

        /*
        Приоритетность математических операций
         */

        System.out.println("\n=====================\n");

        double douVar1 = 20.0d; // явно указывает, что число в формате double
        double douVar2 = 7.0;

        double resultDou;

        resultDou = douVar1 + douVar2;

        System.out.println("douVar1 + douVar2 = " + resultDou);

        resultDou = douVar1 - douVar2;

        System.out.println("douVar1 - douVar2 = " + resultDou);

        resultDou = douVar1 * douVar2;

        System.out.println("douVar1 * douVar2 = " + resultDou);

        // Деление /

        resultDou = douVar1 / douVar2;
        System.out.println("douVar1 / douVar2 = " + resultDou);

        // Форматированный вывод

        /*
        %d - целое число
        %s - строковое значение
        %n - перевод каретки
         */

        System.out.printf("Результат деления %.2f / %.4f = %.3f\n", 20.0, douVar2, resultDou);

        int a = 20;
        int b = 7;
        int res = a / b;

        System.out.printf("Результат %d / %d = %d\n", a, b, res);

        // IEEE 754

        // Проблемы точности типа float / double
        double x = 0.1;
        double y = 0.2;
        double z = x + y; // 0.3
        System.out.println("z = " + z);

        System.out.println(y + y);





    }
}
