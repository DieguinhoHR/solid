package srp;

import srp.model.Funcionario;
import srp.service.CalculadoraSalario;

import static srp.model.Cargo.TESTER;

public class Main {

    public static void main(String[] args) {
        var calculadoraSalario = new CalculadoraSalario();
        var funcionario = new Funcionario();

        funcionario.setCargo(TESTER);
        funcionario.setSalarioBase(4000);

        var resultado = calculadoraSalario.calcular(funcionario);

        System.out.println(String.format("%,.2f", resultado));
    }
}
