import java.io.*;
import java.util.*;

public class MyFile {

    public static void main(String[] args) throws  IOException{
        int wordcount=0;
        HashMap<String, Integer> map = new HashMap<>();
        FileReader file = new FileReader("C://COURSE//dz12//src//javaprogram.txt");
        FileWriter file2 = new FileWriter("C://COURSE//dz12//src//javaprogram2.txt");
        StreamTokenizer fileTokenizer =new StreamTokenizer(file);
        while ((fileTokenizer.nextToken()) !=StreamTokenizer.TT_EOF){

            if(fileTokenizer.ttype==StreamTokenizer.TT_WORD){
                wordcount++;
                int count = map.getOrDefault(fileTokenizer.sval, 0);
                map.put(fileTokenizer.sval, count + 1);
            }
        }
        System.out.println("Количество слов в файле: " + wordcount);
        for (Map.Entry<String,Integer> pair: map.entrySet()) {
            file2.write("----------------\n");
            file2.write ("|" + pair.getKey() + " |  " + pair.getValue() + " |\n");
            file2.write("----------------");
        }
    }
}