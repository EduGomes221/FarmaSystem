package Controllers;

import Model.Funcionario;
import Service.FuncionarioService;

import java.util.List;

public class FuncionarioController {

    private final FuncionarioService funcionarioService = new FuncionarioService();

    public void cadastrar(Funcionario funcionario) {
        funcionarioService.cadastrar(funcionario);
    }

    public List<Funcionario> listar() {
        return funcionarioService.listar();
    }

    public void atualizar(int id, Funcionario funcionario) {
        funcionarioService.atualizar(id, funcionario);
    }

    public void excluir(int id) {
        funcionarioService.excluir(id);
    }
}