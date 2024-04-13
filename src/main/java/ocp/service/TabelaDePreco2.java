package ocp.service;

import ocp.model.TabelaDePreco;

public class TabelaDePreco2 implements TabelaDePreco {
    @Override
    public double descontoPara(double valor) {
        return valor > 1000 ? 0.05 : 0;
    }
}
