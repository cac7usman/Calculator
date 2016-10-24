package calculator;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Alex-Notebook on 24.10.2016.
 */

public class CalcAPITest {
    @org.junit.Test
    public void FCalc() throws Exception {

    }

    @Test(expected = ArithmeticException.class)
    public void test_00()
    {
        int test = CalcAPI.FCalc(10, 0, '/');
        assertEquals(0, test);
    }

    @Test
    public void test_01() {
        int test = CalcAPI.FCalc(10, 2, '*');
        assertEquals(20, test);
    }

    @Test
    public void test_02() {
        int test = CalcAPI.FCalc(10, 10, '+');
        assertEquals(20, test);
    }

    @Test
    public void test_03() {
        int test = CalcAPI.FCalc(40, 2, '/');
        assertEquals(20, test);
    }

    @Test
    public void test_04() {
        int test = CalcAPI.FCalc(22, 2, '-');
        assertEquals(20, test);
    }

}