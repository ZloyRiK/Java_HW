// Реализуйте алгоритм сортировки пузырьком числового массива (введён вами), 
// результат после каждой итерации запишите в лог-файл.

package Home_work_2;

import java.io.IOException;
import java.util.logging.*;


public class Task_1{
    public static void main(String[] args) throws IOException{
        int array[] = {1,2,4,6,2,6,7,8,9,6,4,4,7,8,5,3,4,6,7,5,4,3,6,5,6};
        Logger logger = Logger.getLogger(Task_1.class.getName());
        FileHandler handler = new FileHandler("./Home_work_2/log.xml");
        logger.addHandler(handler);
        XMLFormatter xml = new XMLFormatter();
        handler.setFormatter(xml);
        logger.info("Info message ");
        int temp = 0;
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length-1-i; j++) {
                if (array[j]>array[j+1]){
                    temp = array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j]+" ");
        }
    }
}