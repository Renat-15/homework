import java.util.ArrayList;
import java.util.List;

public class Lesson_2 { // Парадигма ООП
    public static void main(String[] args) {
        //Task_2
        Employee[] persArray = new Employee[5];
        persArray[0] = new Employee("Khaibullina Luisa", "QA Engineer Java",
                "luisa100@mail.ru","89991009900", 999999.9, 18);
        persArray[1] = new Employee("Khamatnurov Renat", "Beginner QA",
                "renat200115@mail.ru","89825317631", 0.1, 23);
        persArray[2] = new Employee("Pomidorov Aleksey", "Developer",
                "tomato@mail.ru","89825317799", 50000, 46);
        persArray[3] = new Employee("Kabachok Svetlana", "Data engineer",
                "sveta_s_togo_sveta@mail.ru","89878654532", 100000, 78);
        persArray[4] = new Employee("Pozitivny Mikhail", "Business analyst",
                "bear_smile@mail.ru","89789871234", 80000, 24);
        for(Employee employee: persArray){
            employee.printEmployees();
        }
        //Вывод для 3 задачи
        Park park = new Park();
        park.addAttractoons("Колесо обозрения", "9:00-23:00", 500);
        park.addAttractoons("Комната страха", "10:00-00:00", 600);
        park.addAttractoons("Батуты", "10:00-20:00", 300);
        park.showAttraction();
    }
}
//Task_1
class Employee{
    String fullName;
    String position;
    String email;
    String phoneNumber;
    double salary;
    int age;

    public Employee(String fullName, String position, String email, String phoneNumber, double salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }
    public void printEmployees(){
        System.out.println("ФИО: " + this.fullName);
        System.out.println("Должность: " + this.position);
        System.out.println("email: " + this.email);
        System.out.println("Телефон: " + this.phoneNumber);
        System.out.println("Зарплата: " + this.salary);
        System.out.println("Возраст: " + this.age);

    }
}
//Task_3
class Park{
    private List<AttractionsInfo> attractionsInfoList; // список для хранения аттракционов
    public Park(){
        attractionsInfoList = new ArrayList<>();
    }
    public void addAttractoons(String name, String workingHours, double cost){  // метод для добавления нового аттранциона в список
        AttractionsInfo attractionsInfo = new AttractionsInfo(name, workingHours, cost);
        attractionsInfoList.add(attractionsInfo);
    }
    public void showAttraction(){  // метод для вывода информации об аттракционах
        for(AttractionsInfo i: attractionsInfoList){
            System.out.println(i);
        }
    }
    class AttractionsInfo{
        private String name;
        private String workingHours;
        private double cost;

        public AttractionsInfo(String name, String workingHours, double cost) {
            this.name = name;
            this.workingHours = workingHours;
            this.cost = cost;
        }
        @Override
        public String toString() {
            return "Информация об аттракционах:" +
                    "Название='" + name + '\'' +
                    ", Часы работы='" + workingHours + '\'' +
                    ", Стоимость=" + cost;
        }
    }

}
