package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class AssertionsTest {

    @Test
    void lancamentoDeNotas(){
        int[] primeiroLancamento = {12, 34, 45, 21, 56};
        int[] segundoLancamento = {2, 34, 75, 23, 54};
        Assertions.assertNotEquals(segundoLancamento, primeiroLancamento);
    }
    @Test
    void validarObjetoNull(){
        Pessoa pessoa = null;
        Assertions.assertNull(pessoa);

        Pessoa pessoa2 = new Pessoa("josé", LocalDate.now());
        Assertions.assertNotNull(pessoa2);
    }
}
