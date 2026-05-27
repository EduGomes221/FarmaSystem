package Service;

import Model.Fornecedor;
import java.util.ArrayList;
import java.util.List;

public class FornecedorService {
    private ArrayList<Fornecedor> fornecedores = new ArrayList<>();

    public void cadastrar(Fornecedor fornecedor) {
        fornecedores.add(fornecedor);
    }

    public List<Fornecedor> listar() {
        fornecedores.forEach(System.out::println);
        return null;
    }

    public void atualizar(int id, String nome, String cnpj) {
        for (Fornecedor f : fornecedores) {
            if (f.getId() == id) {
                f.setNome(nome);
                f.setCnpj(cnpj);
                return;
            }
        }
    }

    public void excluir(int id) {
        fornecedores.removeIf(f -> f.getId() == id);
    }

    public void atualizar(int id, Fornecedor fornecedor) {

    }
}