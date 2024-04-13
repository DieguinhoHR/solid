package ocp.service;

import ocp.model.TabelaDePreco;

public class TabelaDePreco1 implements TabelaDePreco {
    @Override
    public double descontoPara(double valor) {
        return valor > 5000 ? 0.03 : 0;
    }
}
