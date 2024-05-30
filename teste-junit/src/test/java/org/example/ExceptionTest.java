package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExceptionTest {

    @Test
    void validaExceptionNoSaque(){
        Saque saque = new Saque(100);
        Assertions.assertThrows(RuntimeException.class, () -> {
            saque.saque(-1);
        });
        Assertions.assertDoesNotThrow(() -> {
            saque.saque(20);
        });
    }
}
