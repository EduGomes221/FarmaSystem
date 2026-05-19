package Service;

import Model.Funcionario;
import java.util.ArrayList;

public class FuncionarioService {
    private ArrayList<Funcionario> funcionarios = new ArrayList<>();

    public void cadastrar(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public void listar() {
        funcionarios.forEach(System.out::println);
    }

    public void atualizar(int id, String nome, String cargo) {
        for (Funcionario f : funcionarios) {
            if (f.getId() == id) {
                f.setNome(nome);
                f.setCargo(cargo);
                return;
            }
        }
    }

    public void excluir(int id) {
        funcionarios.removeIf(f -> f.getId() == id);
    }
}