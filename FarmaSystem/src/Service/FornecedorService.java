package Service;

import Model.Fornecedor;
import java.util.ArrayList;

public class FornecedorService {
    private ArrayList<Fornecedor> fornecedores = new ArrayList<>();

    public void cadastrar(Fornecedor fornecedor) {
        fornecedores.add(fornecedor);
    }

    public void listar() {
        fornecedores.forEach(System.out::println);
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
}