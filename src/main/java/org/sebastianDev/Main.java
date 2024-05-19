package org.sebastianDev;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //  quadro de funcionários:
        Secretario jorge = new Secretario("Jorge Carvalho", 1, 2018);
        Secretario maria = new Secretario("Maria Souza", 12, 2015);
        Vendedor ana = new Vendedor("Ana Silva", 12, 2021);
        Vendedor joao = new Vendedor("João Mendes", 12, 2021);
        Gerente juliana = new Gerente("Juliana Alves", 7, 2017);
        Gerente bento = new Gerente("Bento Albino", 3, 2014);

        //  vendas de cada vendedor:
        ana.registrarVenda(12, 2021, 5200);
        ana.registrarVenda(1, 2022, 4000);
        ana.registrarVenda(2, 2022, 4200);
        ana.registrarVenda(3, 2022, 5850);
        ana.registrarVenda(4, 2022, 7000);

        joao.registrarVenda(12, 2021, 3400);
        joao.registrarVenda(1, 2022, 7700);
        joao.registrarVenda(2, 2022, 5000);
        joao.registrarVenda(3, 2022, 5900);
        joao.registrarVenda(4, 2022, 6500);

        //  lista de funcionários:
        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(jorge);
        funcionarios.add(maria);
        funcionarios.add(ana);
        funcionarios.add(joao);
        funcionarios.add(juliana);
        funcionarios.add(bento);

        Empresa empresa = new Empresa(funcionarios);

        int mes = 4;
        int ano = 2022;

        System.out.println("Total pago: " + empresa.calcularTotalPago(mes, ano));
        System.out.println("Total pago em salários: " + empresa.calcularTotalSalarios(mes, ano));
        System.out.println("Total pago em benefícios: " + empresa.calcularTotalBeneficios(mes, ano));
        System.out.println("Funcionário com maior salário: " + empresa.obterFuncionarioComMaiorSalario(mes, ano).getNome());
        System.out.println("Funcionário com maior benefício: " + empresa.obterFuncionarioComMaiorBeneficio(mes, ano).getNome());
        System.out.println("Vendedor com maior venda: " + empresa.obterVendedorComMaiorVenda(mes, ano).getNome());
    }
}
