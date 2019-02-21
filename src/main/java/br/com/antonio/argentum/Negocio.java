/*
 * Classe que gera os negocios 
 */
package main.java.br.com.antonio.argentum;

import java.util.Calendar;

/**
 *
 * @author Antonio
 */
public final class Negocio {
    private final double preco;
    private final int quantidade;
    private final Calendar data;

    public Negocio(double preco, int quantidade, Calendar data) {
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

    public Calendar getData() {
        return data;
    }
    
    public double getVolume(){
        return preco * quantidade;
    }
}
