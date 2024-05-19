package org.sebastianDev;

import java.util.List;

public class Empresa {
    private List<Funcionario> funcionarios;

    public Empresa(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public double calcularTotalPago(int mes, int ano) {
        double total = 0.0;
        for (Funcionario f : funcionarios) {
            total += f.calcularSalario(mes, ano);
        }
        return total;
    }

    public double calcularTotalSalarios(int mes, int ano) {
        double total = 0.0;
        for (Funcionario f : funcionarios) {
            total += f.getSalarioBase();
        }
        return total;
    }

    public double calcularTotalBeneficios(int mes, int ano) {
        double total = 0.0;
        for (Funcionario f : funcionarios) {
            if (f instanceof Secretario || f instanceof Vendedor) {
                total += f.calcularSalario(mes, ano) - f.getSalarioBase();
            }
        }
        return total;
    }

    public Funcionario obterFuncionarioComMaiorSalario(int mes, int ano) {
        Funcionario maiorSalarioFuncionario = null;
        double maiorSalario = 0.0;
        for (Funcionario f : funcionarios) {
            double salario = f.calcularSalario(mes, ano);
            if (salario > maiorSalario) {
                maiorSalario = salario;
                maiorSalarioFuncionario = f;
            }
        }
        return maiorSalarioFuncionario;
    }

    public Funcionario obterFuncionarioComMaiorBeneficio(int mes, int ano) {
        Funcionario maiorBeneficioFuncionario = null;
        double maiorBeneficio = 0.0;
        for (Funcionario f : funcionarios) {
            if (f instanceof Secretario || f instanceof Vendedor) {
                double beneficio = f.calcularSalario(mes, ano) - f.getSalarioBase();
                if (beneficio > maiorBeneficio) {
                    maiorBeneficio = beneficio;
                    maiorBeneficioFuncionario = f;
                }
            }
        }
        return maiorBeneficioFuncionario;
    }

    public Vendedor obterVendedorComMaiorVenda(int mes, int ano) {
        Vendedor maiorVendedor = null;
        double maiorVenda = 0.0;
        for (Funcionario f : funcionarios) {
            if (f instanceof Vendedor) {
                Vendedor v = (Vendedor) f;
                double vendasMes = v.getVendasMes(mes, ano);
                if (vendasMes > maiorVenda) {
                    maiorVenda = vendasMes;
                    maiorVendedor = v;
                }
            }
        }
        return maiorVendedor;
    }
}

