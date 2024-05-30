package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;

@ExtendWith(MockitoExtension.class)
public class CadastrarPessoaTest {

    @Mock
    private ApiDosCorreios apiDosCorreios;

    @InjectMocks
    private CadastrarPessoa cadastrarPessoa;

    @Test
    void validarDadosCadastrados(){
        DadosLocalizacao dadosLocalizacao = new DadosLocalizacao("ba", "Teste", "Rua 2", "Bar 1", "Centro");
        Mockito.when(apiDosCorreios.buscaDadosComBaseNoCep(ArgumentMatchers.anyString())).thenReturn(dadosLocalizacao);
        Pessoa pessoa = cadastrarPessoa.cadastrarPessoa("Paulo", "6574857", LocalDate.of(2000, 12, 11), "81654835");
        Assertions.assertEquals("Paulo", pessoa.getNome());
        Assertions.assertEquals("ba", pessoa.getEndereco().getUf());
    }
}
