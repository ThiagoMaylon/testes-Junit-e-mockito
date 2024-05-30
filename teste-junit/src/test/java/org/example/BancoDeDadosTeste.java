package org.example;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class BancoDeDadosTeste {
    @BeforeAll
    static void configurarConexao(){
        BancoDeDados.IniciarConexao();
    }
    @AfterAll
    static void fecharConexao(){
        BancoDeDados.finalizarConexao();
    }

    @Test
    void ValidaDadosDeRetorno(){
        Assertions.assertTrue(true);
    }
}
