package org.example;

import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class EscolhendoOrdemTeste {

    @Test
    @Order(2)
    void ValidaA(){
        Assertions.assertTrue(true);
    }
    @Test
    @Order(4)
    void ValidaB(){
        Assertions.assertFalse(false);
    }
    @Test
    @Order(1)
    void ValidaC(){
        Assertions.assertTrue(true);
    }
    @Test
    @Order(3)
    void ValidaD(){
        Assertions.assertFalse(false);
    }
}
