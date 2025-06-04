package br.com.antonio.principal;

import br.com.antonio.modelos.Moedas;

import java.io.IOException;
import java.util.Scanner;

public class MoedasConverter {

    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner entrada = new Scanner(System.in);
        int opc=0;
        double valor;
        BuscarMoedas novaBusca= new BuscarMoedas();


        Moedas moedas = new Moedas(novaBusca.meoedasParaBucar().conversion_rates());
        System.out.println(moedas);

        Conversao novaConversao = new Conversao(moedas);

        System.out.println(novaBusca.meoedasParaBucar());


    while (opc != 7) {
        System.out.println("*********************************************");
        System.out.println("Seja bem-vindo/a ao conversor de Moeda =]");

        System.out.println("""
                
                1) Dólar ==>> Real Brasileiro
                2) Real brasileiro ==>> Dólar 
                3) Euro ==>> Real Brasileiro 
                4) Yuan ==> Real Brasileiro 
                5) Rublo ==> Real Brasileiro
                6) Euro ==>> Rublo
                7) Sair
                
                """);
        System.out.println("Escolha uma opção válida: ");
        System.out.println("*********************************************");

        opc = entrada.nextInt();


        if (opc == 7) {
            break;
        }

        System.out.println("Digite o valor que deseja converter");
        valor = entrada.nextDouble();


        switch (opc){
            case 1:
                System.out.println("Valor " + valor + " [USD] corresponde ao valor final de  ==>> "+ novaConversao.dolarParaReal(valor) + " [BRL]");
                break;
            case 2:
                System.out.println("Valor " + valor + "[BRL] corresponde ao valor final de  ==>>"+ novaConversao.realParaDolar(valor) +" [USD]" );

                break;
            case 3:

                break;
            case 4:

                break;
            case 5:

                break;
            case 6:
                System.out.println();
                break;

            default:
                System.out.println("Opção invalida! Digite a opçãod de 1 ao 7");
            break;
          }
        }

        entrada.close();
    }
}
