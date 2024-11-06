package Task_1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Task_1 {
    public static void main(String[] args) {
        String[] wordsArray = {"семь", "два", "три","один","пять","пять","семь","семь","восемь","девять","десять","десять"};

        HashMap<String, Integer> words = new HashMap<>();

        // Кладём в мапу ключ=слово из массива, значение=количество вхождений.
        for (String word : wordsArray) {
            words.put(word, words.getOrDefault(word, 0) + 1);
        }

        // Список уникальных слов
        System.out.println("Список уникальных слов:");
        for(Map.Entry<String, Integer> entry: words.entrySet()){
            if(entry.getValue() == 1){
                System.out.println(entry.getKey());
            }
        }
        System.out.println();

        // Выводим количество вхождений каждого слова
        System.out.println("Количество вхождений каждого слова:");
        for (HashMap.Entry<String, Integer> entry : words.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}


