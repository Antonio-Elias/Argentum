/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.br.com.antonio.argentum.testes;

import java.time.LocalDate;
import main.java.br.com.antonio.argentum.CandleBuilder;
import main.java.br.com.antonio.argentum.Candlestick;

/**
 *
 * @author Antonio
 */
public class TesteCandleBuilder {
    public static void main(String[] args) {
        // 1º modo
        CandleBuilder builder = new CandleBuilder();
        builder.comAbertura(40.5);
        builder.comFechamento(42.3);
        builder.comMinimo(39.8);
        builder.comMaxinmo(45.0);
        builder.comVolume(145234.20);
        builder.comData(LocalDate.now());
        
        Candlestick candle = builder.geraCandle();
        
        System.out.println(candle);
        
        
        // 2º modo
        
        Candlestick candle1 = new CandleBuilder().comAbertura(40.5).comFechamento(42.3)
                                                 .comMinimo(39.8).comMaxinmo(45.0)
                                                 .comVolume(145234.20).comData(LocalDate.now())
                                                 .geraCandle();
        
        System.out.println(candle1);
    }
}
