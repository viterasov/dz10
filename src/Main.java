import java.io.File;

import java.util.ArrayList;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        String regEx = "^[Сс]трада(.*)";

        File file = new File("mir.txt");
        Parser parser = new Parser();
        ArrayList<String> lines = parser.scanParser(file);
        Pattern pattern = Pattern.compile(regEx);

        ArrayList<String> words = new ArrayList<>();
        for (String line : lines) {
            if (pattern.matcher(line).find()) {
                words.add(line);
            }
        }
        System.out.println(words.toString());

        System.out.println("----------------------------------------------------------");
        System.out.println("Таблица умножения:");
        System.out.println();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j <10 ; j++) {
                System.out.printf("%5d", (i + 1) * (j + 1));
            }
            System.out.println();
        }
        System.out.println("----------------------------------------------------------");
        System.out.println("End");
    }
}




