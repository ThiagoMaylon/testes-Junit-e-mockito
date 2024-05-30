package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class ServicoEnvioEmailTeste {
    @Mock
    private PlataformaDeEnvio plataformaDeEnvio;

    @InjectMocks
    private ServicoEnvioEmail servicoEnvioEmail;

    @Captor
    private ArgumentCaptor<Email> captor;

    @Test
    void validarDadosEnviadosParaPlataforma(){
        String email = "teste123@teste.com";
        String mensagem = "olá teste mensagem";
        boolean formatoHtml = false;

        servicoEnvioEmail.enviaEmail(email, mensagem, formatoHtml);

        Mockito.verify(plataformaDeEnvio).enviaEmail(captor.capture());
        Email emailCapturado = captor.getValue();

        Assertions.assertEquals(email, emailCapturado.getEnderecoEmail());
        Assertions.assertEquals(mensagem, emailCapturado.getMensagem());
        Assertions.assertEquals(Formato.TEXTO, emailCapturado.getFormato());
    }
}
