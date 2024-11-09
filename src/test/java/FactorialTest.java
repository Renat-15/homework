import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class FactorialTest {

    @Test
    public void correctFactorialZero(){ // Тест для успешного подсчёта факториала нуля
        Factorial factorial = new Factorial();
        int number = factorial.calculateFactorial(0);
        Assertions.assertEquals(1, number);
    }

    @Test
    public void correctFactorialDefault(){ // Тест для успешного подсчёта факториала обычного числа
        Factorial factorial = new Factorial();
        int number = factorial.calculateFactorial(5);
        Assertions.assertEquals(120, number);
    }
    @Test
    public void incorrectFactorial(){ // Тест для неуспешной проверки
        Factorial factorial = new Factorial();
        int number = factorial.calculateFactorial(-8);
        Assertions.assertEquals(8, number);
    }
}
