package srp.service;

import srp.model.Funcionario;

public class CalculadoraSalario {

    public double calcular(Funcionario funcionario) {
        if (funcionario.getCargo().equals(funcionario.getCargo())) {
            return funcionario.getCargo().getRegra().calcular(funcionario);
        }

        throw new RuntimeException("Funcionário inválido");
    }
}
