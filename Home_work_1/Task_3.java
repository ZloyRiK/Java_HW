// Реализовать простой калькулятор (+ - / *)
// Ввод числа ->
// Ввод знака ->
// Ввод числа ->

package Home_work_1;

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        int val_1 = 0, val_2 = 0;
        var res = 0;
        char simbol;
        Scanner value = new Scanner(System.in);
        System.out.print("Введите первое число ");
        val_1 = value.nextInt();
        System.out.print("Введите символ ");
        simbol = value.next().charAt(0);
        System.out.print("Введите второе число ");
        val_2 = value.nextInt();
        value.close();
        switch (simbol) {
            case '+':
                res = val_1 + val_2;
                System.out.printf("Ответ: %s", res);
                break;
            case '-':
                res = val_1 - val_2;
                System.out.printf("Ответ: %s", res);
                break;
            case '*':
                res = val_1 * val_2;
                System.out.printf("Ответ: %s", res);
                break;
            case '/':
                res = val_1 / val_2;
                System.out.printf("Ответ: %s", res);
                break;
            default:
                System.out.println("Символ не прочитался");
                break;
        }
    }
}
