import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BasicTests {
    Calculator calc = new Calculator();
    //  1 - умножение, 2 - сложение, 3 - вычитание, 4 - деление

    @Test
    void multiplicationTestPositive() {
        assertEquals(34.10625, calc.makeCalculation(4.0125, 8.5, 1),
                "Ошибка перемножения положительных чисел");
    }

    @Test
    void additionTestPositive() {
        assertEquals(4.69134, calc.makeCalculation(1.23456, 3.45678, 2),
                "Ошибка сложения положительных чисел");
    }

    @Test
    void subtractionTestPositive() {
        assertEquals(2.22222, calc.makeCalculation(3.45678, 1.23456, 3),
                "Ошибка разности положительных чисел");
    }

    @Test
    void divisionTestPositive() {
        assertEquals(1.5, calc.makeCalculation(12, 8, 4),
                "Ошибка деления положительных чисел");
    }

    @Test
    void multiplicationTestNegativ() {
        assertEquals(-6, calc.makeCalculation(-4, 1.5, 1),
                "Ошибка перемножения положительного и отрицательного чисел");
    }

    @Test
    void additionTestNegativ() {
        assertEquals(-2.22222, calc.makeCalculation(1.23456, -3.45678, 2),
                "Ошибка сложения положительного и отрицательного чисел");
    }

    @Test
    void subtractionTestNegativ() {
        assertEquals(-4.69134, calc.makeCalculation(-1.23456, 3.45678, 3),
                "Ошибка разности положительного и отрицательного чисел");
    }

    @Test
    void divisionTestNegativ() {
        assertEquals(-1.5, calc.makeCalculation(12, -8, 4),
                "Ошибка деления положительного числа на отрицательное");
    }
}
