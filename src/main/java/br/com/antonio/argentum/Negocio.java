/*
 * Classe geradora.
 */
package main.java.br.com.antonio.argentum;

import java.time.LocalDate;

/**
 *
 * @author Antonio
 */
public final class Negocio {
    private final double preco;
    private final int quantidade;
    private final LocalDate data;

    public Negocio(double preco, int quantidade, LocalDate data) {
        if(data == null){
            throw new IllegalArgumentException("Data não pode ser nula");
        }
        this.preco = preco;
        this.quantidade = quantidade;
        this.data = data;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public LocalDate getData() {
        return data;
    }
    
    public double getVolume(){
        return preco * quantidade;
    }
}
