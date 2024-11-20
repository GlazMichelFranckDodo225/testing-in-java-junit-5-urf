package com.dgmf.annotations;

import com.dgmf.Factorial;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {
    @Test
    public void factorialTest() {
        Factorial factorial = new Factorial();
        // int actualResult = factorial.factorial(5);
        // int actualResult = factorial.factorial(1);
        // int actualResult = factorial.factorial(2);
        int actualResult = factorial.factorial(4);

        // assertEquals(120, actualResult);
        // assertEquals(121, actualResult);
        // assertEquals(1, actualResult);
        // assertEquals(2, actualResult);
        assertEquals(24, actualResult);
    }
}