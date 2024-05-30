package org.example;

import java.util.logging.Logger;

public class BancoDeDados {
    public static final Logger LOGGER = Logger.getLogger(BancoDeDados.class.getName());

    public static void IniciarConexao(){
        LOGGER.info("Iniciou conexão");
    }
    public static void finalizarConexao(){
        LOGGER.info("finalizou conexão");
    }
}
