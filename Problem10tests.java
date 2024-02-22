import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class Problem10tests {
    @Test
    public void test1() {
        int n[] = { 8, 3, 12, 5, 9 };
        float expected = 9;
        assertEquals(expected, Problem10.second_max(n));
    }

    @Test
    public void test2() {
        int n[] = { 17, 4, 10, 6, 1};
        float expected = 10;
        assertEquals(expected, Problem10.second_max(n));
    }

    @Test
    public void test3() {
        int n[] = { 19, 14, 20, 13, 18};
        float expected = 19;
        assertEquals(expected, Problem10.second_max(n));
    }

    @Test
    public void test4() {
        int n[] = {25, 23, 16, 21, 24};
        float expected = 24;
        assertEquals(expected, Problem10.second_max(n));
    }
}
