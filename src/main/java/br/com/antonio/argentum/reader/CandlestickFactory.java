/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.br.com.antonio.argentum.reader;

import java.util.Calendar;
import java.util.List;
import main.java.br.com.antonio.argentum.Candlestick;
import main.java.br.com.antonio.argentum.Negocio;

/**
 *
 * @author Antonio
 */
public class CandlestickFactory {
    public Candlestick constroiCandleParaData(Calendar data, List<Negocio> negocios){
      double maximo = negocios.get(0).getPreco();
      double minimo = negocios.get(0).getPreco();
      double volume = 0;
      
        for (Negocio negocio : negocios) {
            volume += negocio.getVolume();
            if(negocio.getPreco() > maximo){
                maximo = negocio.getPreco();
            } else if(negocio.getPreco() < minimo){
                minimo = negocio.getPreco();
            }
        }
        
        double abertura = negocios.get(0).getPreco();
        double fechamento = negocios.get(negocios.size()-1).getPreco();
        
        return new Candlestick(abertura, fechamento, minimo, maximo, volume, data);
    }    
}
