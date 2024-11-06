package Task_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class PhoneDirectory {
    private HashMap<String, ArrayList<String>> phoneBook = new HashMap<>();

    // Метод для добавления записи
    public void add(String surname, String phoneNumber){
        if(phoneBook.containsKey(surname)){              // Если есть уже запись с указанной фамилией в справочнике
            ArrayList<String> numbers = phoneBook.get(surname); // Получаем список номеров с указанной фамилией
            numbers.add(phoneNumber);   // Добавляем номер в список
        }else {                                // Если запись с указанной фамилией не найдена
            ArrayList<String> numbers = new ArrayList<>(); // Новый список номеров
            numbers.add(phoneNumber); // Добавление первого номера в список
            phoneBook.put(surname, numbers); // Добавление новой записи
        }
    }
    // Метод для получения списка телефонных номеров
    public ArrayList<String> get(String surname){
        return phoneBook.get(surname);
    }
}
