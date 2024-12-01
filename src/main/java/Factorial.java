public class Factorial {
    public int calculateFactorial(int a){
        if(a<0){
            return 0; // Для отрицательных чисел возвращаем 0
        }
        int result = 1;
        for(int i = 1; i<=a; i++){
            result*=i;
        }
        return result;
    }
}
