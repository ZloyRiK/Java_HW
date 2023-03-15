// Пусть дан произвольный список целых чисел, удалить из него чётные числа

package Home_work_3;

import java.util.ArrayList;

public class Task_2 {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            list.add((int) (Math.random()*10));
        }
        System.out.println(list);
        for (int i = list.size()-1; i >=0; i--) {
            if (list.get(i)%2==0){
                list.remove(i);
            }
        }
        System.out.print(list);
    }
}
