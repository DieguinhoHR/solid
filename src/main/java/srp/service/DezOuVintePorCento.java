package srp.service;

import srp.model.Funcionario;

public class DezOuVintePorCento implements RegraDeCalculo {
    @Override
    public double calcular(Funcionario funcionario) {
        if (funcionario.getSalarioBase() > 3000.0) {
            return funcionario.getSalarioBase() * 0.8;
        }
        return funcionario.getSalarioBase() * 0.9;
    }
}
