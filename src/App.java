import java.math.BigDecimal;

import br.com.alura.rh.model.Cargo;
import br.com.alura.rh.model.Funcionario;

public class App {
    public static void main(String[] args) throws Exception {

        Funcionario funcionario = new Funcionario(
                "Flavio Alves", 
                "12345678900", 
                Cargo.ANALISTA,
                new BigDecimal("3500.00"));
        System.out.println(funcionario.getCpf());
        System.out.println(funcionario.getNome());
        System.out.println(funcionario.getCargo());
        System.out.println(funcionario.getSalario());
    }
}
