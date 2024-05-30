package org.example;

import java.time.LocalDate;

public class Pessoa {
    private String nome;
    private LocalDate dataNascimento;
    private int idade;


    public Pessoa(String nome, LocalDate dataNascimento){
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.idade = LocalDate.now().getYear() - this.dataNascimento.getYear();
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
    public boolean maiorDeIdade(){
        return idade > 18;
    }

}
