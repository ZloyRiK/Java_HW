// Вычислить n-ое треугольного число(сумма чисел от 1 до n), а так же n! (произведение чисел от 1 до n)

package Home_work_1;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        int temp = 0, sum = 0, f = 1;
        System.out.print("Введите число: ");
        Scanner value = new Scanner(System.in);
        int n = value.nextInt();
        value.close();
        while (temp < n){
            temp++;
            sum += temp;
            f *= temp;
        }
        System.out.printf("Сумма всех чисел от 1 до %s равна %s \n", n, sum);
        System.out.printf("Факториал %s равен %s", n, f);
    }
}
