package ocp.service;

import ocp.model.Cidade;
import ocp.model.Produto;
import ocp.model.ServicoDeEntrega;
import ocp.model.TabelaDePreco;

public class CalculadoraDePrecos {

    private TabelaDePreco tabela;
    private ServicoDeEntrega correios;

    public CalculadoraDePrecos(TabelaDePreco tabela, ServicoDeEntrega correios) {
        this.tabela = tabela;
        this.correios = correios;
    }

    public double calcula(Produto produto, Cidade cidade) {
        var desconto = tabela.descontoPara(produto.getValor());
        var frete = correios.para(cidade);

        return produto.getValor() * (1-desconto) + frete;
    }
}
