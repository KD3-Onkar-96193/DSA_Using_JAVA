
import java.io.*;
import java.util.*;

public class Q2 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("Hello.txt"));

        HashMap<String, Integer> map = new HashMap<>();
        String line;

        while ((line = br.readLine()) != null) {
            String[] words = line.toLowerCase().split("\\W+");

            for (String word : words) {
                if (!word.isEmpty()) {
                    map.put(word, map.getOrDefault(word, 0) + 1);
                }
            }
        }
        br.close(); 
        for (String word : map.keySet()) {
            System.out.println(word + " -> " + map.get(word));
        }
    }
}