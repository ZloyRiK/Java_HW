// Реализовать простой калькулятор (+ - / *)
// Ввод числа ->
// Ввод знака ->
// Ввод числа ->


package Home_work_1;

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        int val_1=0, val_2=0;
        var res =0;
        String simbol="";
        Scanner value = new Scanner(System.in);
        System.out.print("Введите первое число ");
        val_1=value.nextInt();
        System.out.print("Введите символ ");
        simbol=value.next();
        System.out.print("Введите второе число ");
        val_2=value.nextInt();
        value.close();
        if (simbol.contains("+")){
            res = val_1+val_2;
            System.out.printf("Ответ: %s", res);
        }
        if (simbol.contains("-")){
            res = val_1-val_2;
            System.out.printf("Ответ: %s",res);
        }
        if (simbol.contains("*")){
            res = val_1*val_2;
            System.out.printf("Ответ: %s",res);
        }
        if (simbol.contains("/")){
            res = val_1/val_2;
            System.out.printf("Ответ: %s",res);
        }
    }
}
