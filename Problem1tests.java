import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;  

public class Problem1tests {
    
    @Test
    public void test_positive_number() {
        int number = 12345;
        int expectedDigits = 5;
        assertEquals(expectedDigits, Problem1.countDigits(number));
    }

    @Test
    public void test_negative_number() {
        int number = -9876;
        int expectedDigits = 4;
        assertEquals(expectedDigits, Problem1.countDigits(number));
    }

    @Test
    public void test_single_digit() {
        int number = 5;
        int expectedDigits = 1;
        assertEquals(expectedDigits, Problem1.countDigits(number));
    }

    @Test
    public void test_Zero() {
        int number = 0;
        int expectedDigits = 1; // Zero has one digit
        assertEquals(expectedDigits, Problem1.countDigits(number));
    }

}
