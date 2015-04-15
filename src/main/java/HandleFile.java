import org.junit.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
 * Created by Krzychu on 2015-03-28.
 */
public class HandleFile {

    public final static String PATH_TO_FILE = "C:\\Users\\Krzychu\\IdeaProjects\\Pawel\\src\\main\\resources\\plik.csv";

    public List<String> readFile() throws IOException {
        List<String> list = new ArrayList<String>();
        FileReader fileReader = new FileReader(PATH_TO_FILE);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        try {
            String textLine = bufferedReader.readLine();
            do {
                list.add(textLine);
                textLine = bufferedReader.readLine();
            } while (textLine != null);
        } finally {
            bufferedReader.close();
            fileReader.close();
        }
        return list;
    }

    public List<String> shareRecord(String record){
        List<String> list = new ArrayList<String>();
        String delims = ";";
        String[] splitedArray = null;
        splitedArray = record.split(delims);
        for (int i = 0 ; i < splitedArray.length ; i++) {
            System.out.println(splitedArray [i]);
        }
        return Arrays.asList(splitedArray);
    }

    @Test()
    public void xxx() throws IOException {
        List<String> a = readFile();
        shareRecord(a.get(1));
    }


}
