package sk.itsovy.strausz.other;

import java.util.Random;
import java.util.Scanner;

public class generate {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random rnd = new Random();
        for (int i = 1; i <= 10; i++) {
            int a = rnd.nextInt(90) + 10;
            int b = rnd.nextInt(90) + 10;
            int result = 0;
            int input = 0;

            int num = 0;
            int symbol = rnd.nextInt(4);

            switch (symbol) {
                case 0:
//
                    System.out.println("Problem" + i);
                    System.out.println(a + " + " + b + " = ");
                    result = a + b;
                    break;


                case 1:
                    System.out.println("Task" + i);
                    System.out.println(a + " + " + b + " = ");
                    result = a + b;
                    break;
                case 2:
                    System.out.println("Task" + i);
                    System.out.println(a + " - " + b + " = ");
                    result = a - b;
                    break;


                case 3:
                    System.out.println("Task" + i);
                    System.out.println(a + " * " + b + " = ");
                    result = a * b;
                    break;
            }
            input = scanner.nextInt();

            if (input == result) {
                System.out.println("Correct");
            } else {
                System.out.println("Incorrect. Correct answer is " + result);
            }


        }
    }

}
