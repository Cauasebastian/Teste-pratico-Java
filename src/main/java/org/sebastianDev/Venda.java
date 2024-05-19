package org.sebastianDev;

public class Venda {
    private Vendedor vendedor;
    private int mes;
    private int ano;
    private double valor;

    public Venda(Vendedor vendedor, int mes, int ano, double valor) {
        this.vendedor = vendedor;
        this.mes = mes;
        this.ano = ano;
        this.valor = valor;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

    public double getValor() {
        return valor;
    }
}

