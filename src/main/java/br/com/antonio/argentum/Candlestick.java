/*
 *Classe que cria os negocios, que são passados para factory gerar os candle
 */
package main.java.br.com.antonio.argentum;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Antonio
 */
public final class Candlestick {
    private final double abertura;
    private final double fechamento;
    private final double minimo;
    private final double maximo;
    private final double volume;
    private final LocalDate data;

    public Candlestick(double abertura, double fechamento, double minimo, double maximo, double volume, LocalDate data) {
        if(maximo < minimo){
            throw new IllegalArgumentException("Maximo não pode ser menor que minimo");
        }
        this.abertura = abertura;
        this.fechamento = fechamento;
        this.minimo = minimo;
        this.maximo = maximo;
        this.volume = volume;
        this.data = data;
    }

    public double getAbertura() {
        return abertura;
    }

    public double getFechamento() {
        return fechamento;
    }

    public double getMinimo() {
        return minimo;
    }

    public double getMaximo() {
        return maximo;
    }

    public double getVolume() {
        return volume;
    }

    public LocalDate getData() {
        
        return data;
    }
    
    public boolean isAlta(){
        return this.abertura < this.fechamento;
    }
    
    public boolean isBaixa(){
        return this.abertura > this.fechamento;
    }
    private String dataFormatada(){
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String novaData = "";
        try{
            return novaData = this.data.format(formato);
           
        }catch(Exception e){
            return "ERRO";
        }
        
    }

    @Override
    public String toString() {
       
        return "abertura: " + abertura + " fechamento: "+ fechamento + " minimo: " + minimo 
                + " maximo: " + maximo + " volume: " + volume + " data: " + dataFormatada();
    }
     
}
