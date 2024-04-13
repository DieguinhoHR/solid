package ocp;

import ocp.model.Cidade;
import ocp.model.Produto;
import ocp.service.CalculadoraDePrecos;
import ocp.service.Frete1;
import ocp.service.TabelaDePreco1;

public class Main {

    public static void main(String[] args) {
        var tabela = new TabelaDePreco1();
        var correios = new Frete1();

        var calculadora = new CalculadoraDePrecos(tabela, correios);

        var cd = new Produto("CD de jorge e mateus", 1500.0);
        var valor = calculadora.calcula(cd, Cidade.SP);

        System.out.println(valor);
    }
}
