import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class Problem4test {
    
    @Test
    public void test1() {
        float n[] = { 10.7f };
        float expected = 10.7f;
        assertEquals(expected, Problem4.median(n));
    }

    @Test
    public void test2() {
        float n[] = { 1.0f, 2.0f, 3.0f };
        float expected = 2.0f;
        assertEquals(expected, Problem4.median(n));
    }

    @Test
    public void test3() {
        float n[] = { 17.4f, 21.1f, 39.7f, 48.0f };
        float expected = 30.4f;
        assertEquals(expected, Problem4.median(n));
    }

    @Test
    public void test4() {
        float n[] = { -957.0f, -493.0f, -384.0f, -268.0f, -131.0f};
        float expected = -384.0f;
        assertEquals(expected, Problem4.median(n));
    }
}
