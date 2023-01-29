package seminars.third.coverage;

public class CalculateInterval {


    public CalculateInterval(int i, int i1) {
    }

    /**
     * Task 3.2
     * Нужно написать метод который проверяет, попадает ли переданное число в интервал (25;100)
     * возвращает true, если попадает и false - если нет, покрыть тестами метод на 100%
     */

    public boolean numberInInterval(int n) {
        if (n > 25 && n < 100) {
            return true;
        } else {
            return false;
        }
    }
}


