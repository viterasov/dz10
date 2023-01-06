import javax.sound.sampled.Line;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Parser {
    ArrayList<String> scanParser(File file) {
        ArrayList<String> lines = new ArrayList<>();

        try (Scanner scanner = new Scanner(file)) {
            String line = scanner.nextLine();
            while (scanner.hasNextLine()) {
                lines.add(line);
                line = scanner.nextLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        ArrayList<String> words = new ArrayList<>();
        for (String line : lines) {
            words.addAll(Arrays.asList(line.split("[^а-яА-я]+")));
        }
        return words;
    }
}

