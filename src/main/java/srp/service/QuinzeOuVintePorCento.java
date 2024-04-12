package srp.service;

import srp.model.Funcionario;

public class QuinzeOuVintePorCento implements RegraDeCalculo {

    @Override
    public double calcular(Funcionario funcionario) {
        if (funcionario.getSalarioBase() > 2000.0) {
            return funcionario.getSalarioBase() * 0.75;
        }
        return funcionario.getSalarioBase() * 0.85;
    }
}
