package br.com.antonio.principal;

import br.com.antonio.modelos.Conversor;
import br.com.antonio.modelos.Moedas;

public class Conversao {

     private Moedas moedas = new Moedas();

     public Conversao(Moedas moedas) {
          this.moedas = moedas;
     }

     //     Dólar ==>> Real Brasileiro
//                2) Real brasileiro ==>> Dólar
//                3) Euro ==>> Real Brasileiro
//                4) Yuan ==> Real Brasileiro
//                5) Rublo ==> Real Brasileiro
//                6) Euro ==>> Rublo

     public double dolarParaReal(double dolar){
          return dolar * moedas.getReal();
     }
     public double realParaDolar(double real){

          return   real * (moedas.getDolar()/ moedas.getReal());
     }
}
