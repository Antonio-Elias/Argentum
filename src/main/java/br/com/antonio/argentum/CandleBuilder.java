/*
 * Classe que implementa o padrao Builder, usando a Fluent Interface
 * para gerar um candlestick
 */
package main.java.br.com.antonio.argentum;

import java.time.LocalDate;

/**
 *
 * @author Antonio
 */
public class CandleBuilder {
    private double abertura;
    private double fechamento;
    private double minimo;
    private double maximo;
    private double volume;
    private LocalDate data;
    
    public CandleBuilder comAbertura(double abertura){
        this.abertura = abertura;
        return this;
    }
    
    public CandleBuilder comFechamento(double fechamento){
        this.fechamento = fechamento;
        return this;
    }
    
    public CandleBuilder comMinimo(double minimo){
        this.minimo = minimo;
        return this;
    }
    
    public CandleBuilder comMaxinmo(double maximo){
        this.maximo = maximo;
        return this;
    }
    
    public CandleBuilder comVolume(double volume){
        this.volume = volume;
        return this;
    }
    
    public CandleBuilder comData(LocalDate data){
        this.data = data;
        return this;
    }
    
    public Candlestick geraCandle(){
        return new Candlestick(abertura, fechamento, minimo, maximo, volume, data);
    }
}
