package Service;

import Model.Cliente;
import java.util.ArrayList;

public class ClienteService {
    private ArrayList<Cliente> clientes = new ArrayList<>();

    public void cadastrar(Cliente cliente) {
        clientes.add(cliente);
    }

    public void listar() {
        clientes.forEach(System.out::println);
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
}