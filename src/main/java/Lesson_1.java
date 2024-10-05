public class Lesson_1 {
    public static void main(String[] args) {
        printThreeWords(); //1
        checkSumSign(); //2
        printColor(); //3
        compareNumbers(); //4
        System.out.println(sumRange(5, 5)); //5
        getNumber(-1000); //6
        System.out.println(getNumber1(-10)); //7
        numberLines(3, "Aston"); //8
        System.out.println(determineYear(2024)); //9
        int[] arrayReplace = {1,1,0,0,1,0,1,1,0,0,0,0};
        replaceElements(arrayReplace);
        for(int i: arrayReplace){
            System.out.print(i); //10
        }
        System.out.println();
        int[] arrayFill = fillArray(); // 11
        System.out.println();
        multiplyArray(); //12
        System.out.println();
        fillDiagonals(5); //13
        int[] crArray = createArray(10,52); //14
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
    //Task_8
    public static void numberLines(int a, String b){
        for(int i = 0; i < a; i++){
            System.out.println(b);
        }
    }
    //Task_9
    public static boolean determineYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
    //Task_10
    public static void replaceElements(int[] a){
        for(int i = 0; i < a.length; i++){
            if(a[i] == 1){
                a[i] = 0;
            }else a[i] = 1;
        }
    }
    //Task_11
    public static int[] fillArray(){
        int[] array = new int[100];
        for(int i = 0; i < array.length; i++){
            array[i] = i + 1;
        }
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i]); //11
            if(i < array.length - 1){
                System.out.print(" ");
            }
        }
        return array;
    }
    //Task_12
    public static void multiplyArray(){
        int [] array = {1,5,3,2,11,4,5,2,4,8,9,1};
        for(int i = 0; i < array.length; i++){
            if(array[i] < 6){
                array[i]*= 2;
            }
        }
        for(int i: array){
            System.out.print(i);
        }
    }
    //Task_13
    public static void fillDiagonals(int a){
        int[][] array = new int[a][a];
        for(int i = 0; i < a; i++){
            array[i][i] = 1;
            array[i][a-1-i] = 1;
        }
        for(int[] i: array){
            for(int j: i){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    //Task_14
    public static int[] createArray(int len, int initalValue){
        int[] array = new int[len];
        for (int i = 0; i < array.length; i++){
            array[i] = initalValue;
        }
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i]); //11
            if(i < array.length - 1){
                System.out.print(" ");
            }
        }
        return array;
    }
}
