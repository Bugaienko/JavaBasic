package lesson_05;

/**
 * @author Sergey Bugaenko
 * {@code @date} 26.12.2024
 */

public class StringExample {

    public static void main(String[] args) {

        String greeting = "Hello, world!";

        System.out.println("greeting is: " + greeting);

        String string = new String("Java");
        System.out.println("string is: " + string);

        int length =  greeting.length();

        System.out.println("length: " + length);

        String lowerCase = greeting.toLowerCase();
        System.out.println("lowerCase: " + lowerCase);
        System.out.println("greeting: " + greeting);

        System.out.println(greeting.toUpperCase());
        System.out.println("greeting: " + greeting);

        greeting = greeting.toUpperCase();

        System.out.println("greeting: " + greeting);

        System.out.println("\n=====================\n");

        String str1 = "One";
        String str2 = " ";
        String str3 = "hello";

        // 1. Оператор +

        String concatStr = str1 + str2 + str3;

        System.out.println("concatStr: " + concatStr);

        int a = 1;
        int b = 2;

        String result = "Result: " + a + b;

        String result1 = "Result: " + (a + b);

        System.out.println("result: " + result);
        System.out.println("result1: " + result1);

        int age = 18;
        System.out.println("My age is: " + age);


        // 2. concat();
        String concatStr2 = str1.concat(str2);
        concatStr2 = concatStr2.concat(str3);
        System.out.println("concatStr2: " + concatStr2);

        String concatStr3 = str1.concat(str2).concat(str3);

        System.out.println("concatStr3: " + concatStr3);

        // 3. String.join()

        String concatStr4 = String.join(" ", str1, str3);

        System.out.println("concatStr4: " + concatStr4);

        String exampleJoin = String.join(" | ", "Hello", "World", "test", "string");
        System.out.println("exampleJoin: " + exampleJoin);


        int myInt = 123;

//        String strConcat = str1.concat(myInt);


        System.out.println("\n====================\n");

        String word = "Programming";

       char firstChar = word.charAt(0);
        System.out.println("firstChar: " + firstChar);

        System.out.println("word.charAt(4): " + word.charAt(4));

//        char lastChar = word.charAt(10);
        char lastChar = word.charAt(word.length() -1);
        System.out.println("lastChar: " + lastChar);

        System.out.println("\n=================\n");

        String digits = "0123456789";

        String subString = digits.substring(2);
        System.out.println("subString: " + subString);
        System.out.println("digits: " + digits);

        String subString2 = digits.substring(2, 5);

        System.out.println("subString2: " + subString2);

        System.out.println("\n==================\n");

        String string1 = "Java World Java";

        System.out.println(string1.replace("Java", "Python"));

        System.out.println(string1.replaceFirst("Java", "Python"));

        System.out.println(string1.replaceAll("Java", "Python"));

        System.out.println(string1.replaceAll("\\bW\\w+", "Python"));













    }
}
