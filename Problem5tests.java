import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class Problem5tests {
    @Test
    public void test1() {
        float income = 190000.0f;
        float expected = 0.0f;
        assertEquals(expected, Problem5.tax_calculation(income));
    }

    @Test
    public void test2() {
        float income = 345000.0f;
        float expected = 9500.0f;
        assertEquals(expected, Problem5.tax_calculation(income));
    }

    @Test
    public void test3() {
        float income = 780000.0f;
        float expected = 81000.0f;
        assertEquals(expected, Problem5.tax_calculation(income));
    }

    @Test
    public void test4() {
        float income = 2400000.0f;
        float expected = 545000.0f;
        assertEquals(expected, Problem5.tax_calculation(income));
    }
}
