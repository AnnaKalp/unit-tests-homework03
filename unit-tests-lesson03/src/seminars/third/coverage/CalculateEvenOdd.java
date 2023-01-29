package seminars.third.coverage;

public class CalculateEvenOdd {

    //Homework 3

    /**
     * Task 3.1
     * Нужно покрыть тестами метод на 100%
     * Метод проверяет, является ли целое число записанное в переменную n,
     * чётным (true) либо нечётным (false)
     */

    public boolean evenOddNumber(int n) {
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}


