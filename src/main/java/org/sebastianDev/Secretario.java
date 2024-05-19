package org.sebastianDev;

public class Secretario extends Funcionario {
    private static final double BENEFICIO_ANUAL = 1000.00;
    private static final double BENEFICIO_PERCENTUAL = 0.20;

    public Secretario(String nome, int mesContratacao, int anoContratacao) {
        super(nome, "Secretário", mesContratacao, anoContratacao, 7000.00);
    }

    @Override
    public double calcularSalario(int mes, int ano) {
        int anosDeServico = ano - getAnoContratacao();
        double beneficio = (anosDeServico * BENEFICIO_ANUAL) + (getSalarioBase() * BENEFICIO_PERCENTUAL);
        return getSalarioBase() + beneficio;
    }
}