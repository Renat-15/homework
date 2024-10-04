public class Lesson_1 {
    public static void main(String[] args) {
<<<<<<< HEAD
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        System.out.println(sumRange(5, 5));
        getNumber(-1000);
        System.out.println(getNumber1(-10));
=======
        int i = 0; //another check
>>>>>>> cef79050a1f9e7cfffecbf8fc056e77545737e2c

    }
    //Task_1
    public static void printThreeWords(){
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    //Task_2
    public static void checkSumSign(){
         int a = 4;
         int b = 96;
         int sum = a + b;
         if(sum >= 0){
             System.out.println("Сумма положительная");
         } else{
             System.out.println("Сумма отрицательная");
         }
    }
    //Task_3
    public static void printColor(){
        int value = 1000;
        if(value <= 0){
            System.out.println("Красный");
        } else if (0 < value && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }
    //Task_4
    public static void compareNumbers(){
        int a = 0;
        int b = 0;
        if(a >= b){
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
    //Task_5
    public static boolean sumRange(int a, int b){
        int sum = a + b;
        if(sum >= 10 && sum <= 20){
            return true;
        } else return false;
    }
    //Task_6
    public static void getNumber(int a){
        if(a >= 0){
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }
    //Task_7
    public static boolean getNumber1(int a){
        if(a >= 0){
            return false;
        } else return true;
    }
}
