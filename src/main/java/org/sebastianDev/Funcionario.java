package org.sebastianDev;

public abstract class Funcionario {
    private String nome;
    private String cargo;
    private int mesContratacao;
    private int anoContratacao;
    private double salarioBase;

    public Funcionario(String nome, String cargo, int mesContratacao, int anoContratacao, double salarioBase) {
        this.nome = nome;
        this.cargo = cargo;
        this.mesContratacao = mesContratacao;
        this.anoContratacao = anoContratacao;
        this.salarioBase = salarioBase;
    }

    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

    public int getMesContratacao() {
        return mesContratacao;
    }

    public int getAnoContratacao() {
        return anoContratacao;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public abstract double calcularSalario(int mes, int ano);
}

