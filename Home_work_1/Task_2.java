// Вывести все простые числа от 1 до 1000


package Home_work_1;

public class Task_2 {
    public static void main(String[] args) {
        System.out.println("Простые числа от 1 до 100:");
        for (int i = 1; i < 100; i++) {
            int temp=0;
            for (int j = 2; j <= (Math.sqrt(i)); j++) {
                if (i%j==0){
                    temp++;
                }
            }
            if (temp==0){
                System.out.print(i+" ");
            }
        }
    }
}
