import static org.junit.jupiter.api.Assertions.*;

import java.text.DecimalFormat;

import org.junit.Test;

public class Problem2tests {

    @Test
    public void test1() {
        double net_price = 99.95;
        double tax_rate = 0.12;
        DecimalFormat df = new DecimalFormat("#.##"); // this is the decimal pattern set for the return value of the test
        String expectedDigits = "89.24"; // so we are comparing the return value to a string
        assertEquals(expectedDigits, df.format(Problem2.gross_price(net_price, tax_rate)));
    }

    @Test
    public void test2() {
        double net_price = 49999.00;
        double tax_rate = 0.28;
        DecimalFormat df = new DecimalFormat("#.##"); // this is the decimal pattern set for the return value of the test
        String expectedDigits = "39061.72"; // so we are comparing the return value to a string
        assertEquals(expectedDigits, df.format(Problem2.gross_price(net_price, tax_rate)));
    }

    @Test
    public void test3() {
        double net_price = 720.00;
        double tax_rate = 0.05;
        DecimalFormat df = new DecimalFormat("#.##"); // this is the decimal pattern set for the return value of the test
        String expectedDigits = "685.71"; // so we are comparing the return value to a string
        assertEquals(expectedDigits, df.format(Problem2.gross_price(net_price, tax_rate)));
    }

    @Test
    public void test4() {
        double net_price = 45.00;
        double tax_rate = 0.00;
        DecimalFormat df = new DecimalFormat("#.##"); // this is the decimal pattern set for the return value of the test
        String expectedDigits = "45"; // so we are comparing the return value to a string
        assertEquals(expectedDigits, df.format(Problem2.gross_price(net_price, tax_rate)));
    }
}
