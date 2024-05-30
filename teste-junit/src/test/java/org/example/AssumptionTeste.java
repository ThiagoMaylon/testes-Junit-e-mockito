package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssumptionTeste {
    @Test
    void validaAlgo(){
        Assumptions.assumeTrue("jj".equalsIgnoreCase(System.getenv("NAME")));
        Assertions.assertTrue(true);
    }
}
