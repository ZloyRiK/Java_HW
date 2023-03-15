// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее ариф. из этого списка.

package Home_work_3;

import java.util.ArrayList;

public class task_3 {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        int min =10 , max=0, mid=0, sum = 0;

        for (int i = 0; i < 20; i++) {
            list.add((int) (Math.random()*10));
        }
        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i)<min) min = list.get(i);
            if (list.get(i)>max) max = list.get(i);
            sum += list.get(i);
        }
        mid = sum/list.size();
        System.out.println("min = " + min);
        System.out.println("max = " + max);
        System.out.println("mid = " + mid);
    }
}
