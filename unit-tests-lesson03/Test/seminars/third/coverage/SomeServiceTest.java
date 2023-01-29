package seminars.third.coverage;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
class SomeServiceTest {
    private SomeService someService;

    @BeforeEach
    void setUp() {
        someService = new SomeService();
    }


    //task 3.1
    @Test
    void fizzTest() {
        assertThat(someService.fizzBuzz(3)).isEqualTo("Fizz");
    }

    @Test
    void buzzTest() {
        assertThat(someService.fizzBuzz(5)).isEqualTo("Buzz");
    }

    @Test
    void fizzBuzzTest() {
        assertThat(someService.fizzBuzz(15)).isEqualTo("FizzBuzz");
    }

    @Test
    void nofizzBuzzTest() {
        assertThat(someService.fizzBuzz(2)).isEqualTo("2");
    }


    //task 3.2
    @Test
    void firstElement6() {
        assertTrue(someService.firstLast6(new int[]{6, 2, 3}));
    }

    @Test
    void lastElement6() {
        assertTrue(someService.firstLast6(new int[]{2, 3, 6}));
    }

    @Test
    void ElementTest() {
        assertFalse(someService.firstLast6(new int[]{1, 6, 2}));
    }


    //Task 3.3

    @Test
    void insufficientCoverageTest() {

        System.out.println(someService.calculatingDiscount(2000.0, 10));

    }

    @Test
    void testNormalDiscount() {
        assertThat(someService.calculatingDiscount(2000.0, 50))
                .isEqualTo(1000); // обычная скидка
    }

    @Test
    void testFullDiscount() {
        assertThat(someService.calculatingDiscount(2000.0, 100))
                .isEqualTo(0); // обычная скидка
    }

    @Test
    void testNoDiscount() {
        assertThat(someService.calculatingDiscount(2000.0, 0))
                .isEqualTo(2000); // обычная скидка
    }


    @Test
    void discountMore100ReturnException() {
        assertThatThrownBy(() ->
                someService.calculatingDiscount(2000.0, 110))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Скидка должна быть в диапазоне от 0 до 100%"); // процент скидки больше 100%
    }

    @Test
    void negativePurchaseDiscountReturnException() {
        assertThatThrownBy(() ->
                someService.calculatingDiscount(2000.0, -10))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Скидка должна быть в диапазоне от 0 до 100%"); // процент скидки меньше 0
    }

    @Test
    void negativePurchaseAmountReturnException() {
        assertThatThrownBy(() ->
                someService.calculatingDiscount(-100, 10))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Сумма покупки не может быть отрицательной");
    }



    //Task 3.4
    @Test
    void luckySumA13() {
        assertThat(someService.luckySum(13, 1, 2)).isEqualTo(3);
    }

    @Test
    void luckySumB13() {
        assertThat(someService.luckySum(1, 13, 3)).isEqualTo(4);
    }

    @Test
    void luckySumC13() {
        assertThat(someService.luckySum(4, 1, 13)).isEqualTo(5);
    }

    @Test
    void luckySumNo13() {
        assertThat(someService.luckySum(1, 2, 3)).isEqualTo(6);
    }
    }







