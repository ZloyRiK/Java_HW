package Home_work_2;

import java.nio.charset.Charset;
import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in, "Cp866");
        System.out.println("Введите фразу для проверки на полиндром:");
        String str = value.nextLine();
        value.close();
        String new_str = str.toLowerCase().replace(" ","");
        char[] char_array = new char[new_str.length()];
        int count = 0;
        int right = char_array.length-1;
        for (int i = 0; i < char_array.length; i++) {
            char_array[i]=new_str.charAt(i);
        }
        for (int i = 0; i < right; i++) {
            if (char_array[i]==char_array[right]) right--;
            else count++;
        }
        if(count==0) System.out.print("Это полиндром");
        else System.out.print("Это не полиндром");
    }
}
