package days.fourth;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EncodeDecode {


    private static Map<Integer, String> encode = new HashMap<>();

    public static void main(String[] args) {
        readCode();

        List<Integer> letters = readLetter();
        StringBuilder stringBuilder = new StringBuilder();
        for(Integer l : letters){
           String value = encode.get(l);
           if(value != null){
               stringBuilder.append(value.equals("tarpas") ? " " : value);
           }

        }
        System.out.println(stringBuilder.toString());
    }
        private static List<Integer> readLetter(){
        List<Integer> numbers = new ArrayList<>();
            try (BufferedReader bf = new BufferedReader(new FileReader("uzduotis.txt"))){
            String line;
            while((line = bf.readLine()) !=null){
                String[] items = line.split(" ");
                for(String item : items){
                numbers.add(Integer.valueOf(item));
                }
            }
            }catch(IOException e){
                System.out.println(e.getMessage());
            }
            return numbers;
        }
        private static void readCode(){
            try (BufferedReader bf = new BufferedReader(new FileReader("Koduote.txt"))) {

                String line;
                while ((line = bf.readLine()) != null) {
                    String[] items = line.split(" ");
                    encode.put(Integer.valueOf(items[0]), items[1]);
                }

            } catch (IOException e) {
                System.out.println("Klaida nuskaitanat faila " + e.getMessage());
            }
        }

    }


