/*
 * Classe que cria um candle com base em uma lista de negocios
 */

package main.java.br.com.antonio.argentum.reader;

import java.time.LocalDate;
import java.util.List;
import main.java.br.com.antonio.argentum.Candlestick;
import main.java.br.com.antonio.argentum.Negocio;

/**
 *
 * @author Antonio
 */
public class CandlestickFactory {
    public Candlestick constroiCandleParaData(LocalDate data, List<Negocio> negocios){
      double maximo = Double.MIN_VALUE;
      double minimo = Double.MAX_VALUE;
      double volume = 0;
      
        for (Negocio negocio : negocios) {
            volume += negocio.getVolume();
            if(negocio.getPreco() > maximo){
                maximo = negocio.getPreco();
            } else if(negocio.getPreco() < minimo){
                minimo = negocio.getPreco();
            }
        }
        
        double abertura = negocios.isEmpty()? 0: negocios.get(0).getPreco();
        double fechamento = negocios.isEmpty()? 0 : negocios.get(negocios.size()-1).getPreco();
        
        return new Candlestick(abertura, fechamento, minimo, maximo, volume, data);
    }    
}
