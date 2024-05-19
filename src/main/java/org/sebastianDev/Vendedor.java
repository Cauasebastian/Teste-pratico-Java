package org.sebastianDev;

import java.util.HashMap;
import java.util.Map;

public class Vendedor extends Funcionario {
    private static final double BENEFICIO_PERCENTUAL = 0.30;
    private Map<String, Double> vendasMensais;

    public Vendedor(String nome, int mesContratacao, int anoContratacao) {
        super(nome, "Vendedor", mesContratacao, anoContratacao, 12000.00);
        vendasMensais = new HashMap<>();
    }

    public void registrarVenda(int mes, int ano, double valorVenda) {
        String chave = mes + "/" + ano;
        vendasMensais.put(chave, valorVenda);
    }

    @Override
    public double calcularSalario(int mes, int ano) {
        String chave = mes + "/" + ano;
        double valorVendido = vendasMensais.getOrDefault(chave, 0.0);
        double beneficio = valorVendido * BENEFICIO_PERCENTUAL;
        int anosDeServico = ano - getAnoContratacao();
        beneficio += anosDeServico * 1800;
        return getSalarioBase() + beneficio;
    }

    public double getVendasMes(int mes, int ano) {
        String chave = mes + "/" + ano;
        return vendasMensais.getOrDefault(chave, 0.0);
    }
}
