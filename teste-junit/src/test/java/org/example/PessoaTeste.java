package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class PessoaTeste {
    @Test
    void ValidaCalculoIdade(){
        Pessoa pessoa = new Pessoa("João", LocalDate.of(2005, 5, 30));
        Assertions.assertEquals(19, pessoa.getIdade());
    }

    @Test
    void ValidarMaiorDeIdade(){
        Pessoa pessoa = new Pessoa("João", LocalDate.of(2005, 5, 30));
        Assertions.assertTrue(pessoa.maiorDeIdade());
    }
}
