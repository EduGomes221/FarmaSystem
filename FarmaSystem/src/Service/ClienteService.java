package Service;

import Model.Cliente;
import java.util.ArrayList;
import java.util.List;

public class ClienteService {
    private ArrayList<Cliente> clientes = new ArrayList<>();

    public void cadastrar(Cliente cliente) {
        clientes.add(cliente);
    }

    public List<Cliente> listar() {
        clientes.forEach(System.out::println);
        return null;
    }

    public void atualizar(int id, String nome, String cpf) {
        for (Cliente c : clientes) {
            if (c.getId() == id) {
                c.setNome(nome);
                c.setCpf(cpf);
                return;
            }
        }
    }

    public void excluir(int id) {
        clientes.removeIf(c -> c.getId() == id);
    }

    public void atualizar(int id, Cliente cliente) {
    }
}