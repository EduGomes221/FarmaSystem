package Service;

import Model.Funcionario;
import java.util.ArrayList;
import java.util.List;

public class FuncionarioService {
    private ArrayList<Funcionario> funcionarios = new ArrayList<>();

    public void cadastrar(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public List<Funcionario> listar() {
        funcionarios.forEach(System.out::println);
        return null;
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

    public void atualizar(int id, Funcionario funcionario) {

    }
}