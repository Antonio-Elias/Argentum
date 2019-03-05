/*
 * classe de teste de CandlestickFactory
 */
package main.java.br.com.antonio.argentum.reader;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import main.java.br.com.antonio.argentum.Candlestick;
import main.java.br.com.antonio.argentum.Negocio;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Antonio
 */
public class CandlestickFactoryTest {
    
    public CandlestickFactoryTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of constroiCandleParaData method, of class CandlestickFactory.
     */
    @Test
    public void testConstroiCandleParaData() {
        System.out.println("constroiCandleParaData");
        
        LocalDate hoje = LocalDate.now();
        
        Negocio negocio1 = new Negocio(40.5, 100, hoje);
        Negocio negocio2 = new Negocio(45.0, 100, hoje);
        Negocio negocio3 = new Negocio(39.8, 100, hoje);
        Negocio negocio4 = new Negocio(42.3, 100, hoje); 
        
        List<Negocio> negocios = Arrays.asList(negocio1,negocio2,negocio3,negocio4);
        
        CandlestickFactory fabrica = new CandlestickFactory();
        Candlestick candle = fabrica.constroiCandleParaData(hoje, negocios);
        
        assertEquals(40.5, candle.getAbertura(),0.00001);
        assertEquals(42.3, candle.getFechamento(),0.00001);
        assertEquals(39.8, candle.getMinimo(),0.00001);
        assertEquals(45.0, candle.getMaximo(),0.00001);
        assertEquals(16760.0, candle.getVolume(),0.00001);
        //assertEquals(2019-02-25, candle.getData());
        System.out.println(candle.getData());
    }
    @Test
    public void semNegociosGeraCandleComZeros(){
        LocalDate hoje = LocalDate.now();
        
        List<Negocio> negocios = Arrays.asList();
        
        CandlestickFactory fabrica = new CandlestickFactory();
        Candlestick candle = fabrica.constroiCandleParaData(hoje, negocios);
        
        assertEquals(0.0, candle.getVolume(),0.00001);
        assertEquals(0.0, candle.getAbertura(),0.00001);
        assertEquals(0.0, candle.getFechamento(),0.00001);
        assertEquals(0.0, candle.getFechamento(),0.00001);
        assertEquals(0.0, candle.getMinimo(),0.00001);
        assertEquals(0.0, candle.getMaximo(),0.00001);
    }
    @Test
    public void apenasUmNegocioGeraCandleComValoresIguais(){
        LocalDate hoje = LocalDate.now();
        
        Negocio negocio1 = new Negocio(40.5, 100, hoje);
        
        List<Negocio> negocios = Arrays.asList(negocio1);
        
        CandlestickFactory fabrica = new CandlestickFactory();
        Candlestick candle = fabrica.constroiCandleParaData(hoje, negocios);
        
        
        assertEquals(40.5, candle.getAbertura(),0.00001);
        assertEquals(40.5, candle.getFechamento(),0.00001);
        assertEquals(40.5, candle.getMinimo(),0.00001);
        assertEquals(40.5, candle.getMaximo(),0.00001);
        assertEquals(4050.0, candle.getVolume(),0.00001);
       
    }
}
