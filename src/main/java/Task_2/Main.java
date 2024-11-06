package Task_2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        PhoneDirectory phoneDirectory = new PhoneDirectory();

        phoneDirectory.add("Огурцов", "89827876543");
        phoneDirectory.add("Помидоров", "89777777777");
        phoneDirectory.add("Салатов", "89843234456");
        phoneDirectory.add("Огурцов", "89321234500");
        phoneDirectory.add("Огурцов", "89321234111");

        ArrayList<String> phones = phoneDirectory.get("Огурцов");
        for(String phone: phones){
            System.out.println(phone);
        }
    }
}
