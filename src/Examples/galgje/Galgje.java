package Examples.galgje;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Galgje {

    private static final File file = new File("src/Examples/galgje/woorden.txt");
    private static List<String> listOfWords = new ArrayList<>();

    public static void main(String[] args)
    {
        Galgje.readFile();
        System.out.print(Galgje.getWord());
    }

    public static void readFile()
    {
        try {
            BufferedReader abc = new BufferedReader(new FileReader(file));
            String word;
            while((word = abc.readLine()) != null) {
                listOfWords.add(word);
            }
            abc.close();
        } catch(Exception e) {
            System.out.print("Error: " + e.getLocalizedMessage());
        }
    }

    public static String getWord()
    {
        // Get random word out of list of words
        Integer random = ThreadLocalRandom.current().nextInt(0, listOfWords.size() + 1);
        String word = listOfWords.get(random);

        // Remove word out of list
        listOfWords.remove(word);

        // Remove word from file
        updateFile();

        return word;
    }

    public static void updateFile()
    {
        try {
            FileWriter fw = new FileWriter(file);
            for (String word : listOfWords)
                fw.write(word + System.lineSeparator());
            fw.close();
        } catch(Exception e){
            System.out.println(e.getLocalizedMessage());
        }
        System.out.println("File update success...");
    }
}
