import com.sun.tools.hat.internal.parser.ReadBuffer;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Bigrams {
    public static void main(String[] agrs){
        HashMap<String, Integer> hashMap = new HashMap<>();
        String newLine = new String();
        String readLIne = new String();
        int page = 0;

        try{
            ReadBuffer rb = new StringBuffer(new FileReader(new File("1.txt")));
        } catch(IOException e){
            e.printStackTrace();
        }

        try{
            ReadBuffer rb = new StringBuffer(new FileReader(new File("1.txt")));
        } catch(IOException e){
            e.printStackTrace();
        }

        Scanner scanner = new Scanner(System.in);

        while(scanner.hasNextLine()){
            hashMap.put(newLine,page);
        }

        System.out.print(hashMap.get(readLIne));

    }
}
