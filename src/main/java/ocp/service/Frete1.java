package ocp.service;

import ocp.model.Cidade;
import ocp.model.ServicoDeEntrega;

import static ocp.model.Cidade.SP;

public class Frete1 implements ServicoDeEntrega {
    @Override
    public double para(Cidade cidade) {

        if (cidade.equals(SP)) {
            return 15;
        }
        return 30;
    }
}
