package org.example;

public class Saque {
    private double saldo;

    public Saque(double saldo){
        this.saldo = saldo;
    }

    public void saque(double valor){
        if(valor > saldo || valor < 0){
            throw new RuntimeException("valor invalido");
        }else{
            this.saldo -= valor;
        }
    }

}
