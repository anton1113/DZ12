import java.io.*;

public class MyFile {
    public static void main(String[] args) throws  IOException{
        int wordcount=0;
        FileReader file = new FileReader("C://COURSE//dz12//src//javaprogram.txt");
        StreamTokenizer fileTokenizer =new StreamTokenizer(file);
        while ((fileTokenizer.nextToken()) !=StreamTokenizer.TT_EOF){
            if(fileTokenizer.ttype==StreamTokenizer.TT_WORD)
                wordcount++;
        }
        System.out.println("Количество слов в файле: " +wordcount);
    }
}