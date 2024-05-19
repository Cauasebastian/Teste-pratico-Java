package org.sebastianDev;

public class Gerente extends Funcionario {
    public Gerente(String nome, int mesContratacao, int anoContratacao) {
        super(nome, "Gerente", mesContratacao, anoContratacao, 20000.00);
    }

    @Override
    public double calcularSalario(int mes, int ano) {
        int anosDeServico = ano - getAnoContratacao();
        return getSalarioBase() + (anosDeServico * 3000);
    }
}
