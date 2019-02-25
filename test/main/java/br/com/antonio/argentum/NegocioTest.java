/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.br.com.antonio.argentum;

import java.time.LocalDate;
import java.time.Month;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Antonio
 */
public class NegocioTest {
    @Test
    public void dataDoNegocioEhImutavel(){
        LocalDate c = LocalDate.of(2019, 2, 15);

        Negocio n = new Negocio(10, 5, c);
        System.out.println(n.getData());
        n.getData().of(2019, Month.MARCH, 17);
        
        System.out.println(n.getData());
        Assert.assertEquals(15,n.getData().getDayOfMonth());
        
    }    
    
    
}
