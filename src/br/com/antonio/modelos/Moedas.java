package br.com.antonio.modelos;

public class Moedas {

    private double dolar;
    private double euro;
    private double real;
    private double yuan;
    private double pesoArgentino;
    private double rublo;

    public Moedas(double dolar, double euro, double real, double yuan, double pesoArgentino, double rublo) {
        this.dolar = dolar;
        this.euro = euro;
        this.real = real;
        this.yuan = yuan;
        this.pesoArgentino = pesoArgentino;
        this.rublo = rublo;
    }

    public Moedas(ValorMoedas valorMoedas) {
        this.dolar = valorMoedas.USD();
        this.euro = valorMoedas.EUR();
        this.real = valorMoedas.BRL();
        this.yuan = valorMoedas.CNY();
        this.pesoArgentino = valorMoedas.ARS();
        this.rublo = valorMoedas.RUB();
    }

    public Moedas() {
    }

    public double getDolar() {
        return dolar;
    }

    public double getEuro() {
        return euro;
    }

    public double getPesoArgentino() {
        return pesoArgentino;
    }

    public double getReal() {
        return real;
    }

    public double getRublo() {
        return rublo;
    }

    public double getYuan() {
        return yuan;
    }

    @Override
    public String toString() {
        return "Moedas{" +
                "dolar=" + dolar +
                ", euro=" + euro +
                ", real=" + real +
                ", yuan=" + yuan +
                ", pesoArgentino=" + pesoArgentino +
                ", rublo=" + rublo +
                '}';
    }
}
