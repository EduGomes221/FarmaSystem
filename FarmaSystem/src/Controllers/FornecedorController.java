package Controllers;

import Model.Fornecedor;
import Service.FornecedorService;

import java.util.List;

public class FornecedorController {

    private final FornecedorService fornecedorService = new FornecedorService();

    public void cadastrar(Fornecedor fornecedor) {
        fornecedorService.cadastrar(fornecedor);
    }

    public List<Fornecedor> listar() {
        return fornecedorService.listar();
    }

    public void atualizar(int id, Fornecedor fornecedor) {
        fornecedorService.atualizar(id, fornecedor);
    }

    public void excluir(int id) {
        fornecedorService.excluir(id);
    }
}