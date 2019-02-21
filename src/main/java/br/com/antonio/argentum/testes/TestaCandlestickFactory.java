/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.br.com.antonio.argentum.testes;

import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import main.java.br.com.antonio.argentum.Candlestick;
import main.java.br.com.antonio.argentum.Negocio;
import main.java.br.com.antonio.argentum.reader.CandlestickFactory;

/**
 *
 * @author Antonio
 */
public class TestaCandlestickFactory {
    public static void main(String[] args) {
        Calendar hoje = Calendar.getInstance();
        Negocio nogocio1 = new Negocio(40.5, 100, hoje);
        Negocio nogocio2 = new Negocio(40.5, 100, hoje);
        Negocio nogocio3 = new Negocio(39.8, 100, hoje);
        Negocio nogocio4 = new Negocio(42.3, 100, hoje);
        
        List<Negocio> negocios = Arrays.asList(nogocio1,nogocio2,nogocio3,nogocio4);
        
        CandlestickFactory fabrica = new CandlestickFactory();
        Candlestick candle = fabrica.constroiCandleParaData(hoje, negocios);
        
        System.out.println(candle.getAbertura());
        System.out.println(candle.getFechamento());
        System.out.println(candle.getMinimo());
        System.out.println(candle.getMaximo());
        System.out.println(candle.getVolume());
    }
}
