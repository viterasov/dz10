package File;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Paeser2

{
    public static void main(String[] args) throws IOException
    {
        File f1=new File("mir.txt"); //Создание файлового дескриптора для входного файла
        String[] words=null;  //Инициализировать массив слов
        FileReader fr = new FileReader(f1);  //Создание объекта File Reader
        BufferedReader br = new BufferedReader(fr); //Создание объекта BufferedReader
        String s;
        String input= "страдания";   // Введите слово для поиска
        int count=0;   //Инициализировать слово до нуля
        while((s=br.readLine())!=null)   //Чтение содержимого из файла
        {
            words=s.split( " ");  //Разделите слово, используя пробел
            for (String word : words)
            {
                if (word.equals(input))   //Поиск заданного слова
                {
                    count++;    //Если присутствует, увеличьте количество на единицу
                }
            }
        }
        if(count!=0)  //Проверить, не равен ли счет нулю
        {
            System.out.println("Данное слово  "+count+ " раза присутствует в файле");
        }
        else
        {
            System.out.println("Данное слово отсутствует в файле");
        }

        fr.close();
    }


}
