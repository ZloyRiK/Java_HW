// Look at DZ.md

package Home_work_2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Task_2 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("Home_Work_2/names.txt",
                                                                        StandardCharsets.UTF_8));
            String str= br.readLine();
            StringBuilder new_string=new StringBuilder();
            while (str != null) {
                String[] str_array = str.split("[\",:]");
                for (String s : str_array) {
                    switch (s) {
                        case "фамилия" -> new_string.append("Студент ");
                        case "оценка" -> new_string.append(" получил ");
                        case "предмет" -> new_string.append(" по предмету ");
                        default -> new_string.append(s);
                    }
                }
                System.out.println(new_string);
                new_string.setLength(0);
                str = br.readLine();
            }
            br.close();
            }
            catch (IOException e) {
                System.out.println("Ошибка: "+ e);
            }
    }
}
