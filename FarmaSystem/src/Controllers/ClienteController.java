package Controllers;

import Model.Cliente;
import Service.ClienteService;

import java.util.List;

public class ClienteController {

    private final ClienteService clienteService = new ClienteService();

    public void cadastrar(Cliente cliente) {
        clienteService.cadastrar(cliente);
    }

    public List<Cliente> listar() {
        return clienteService.listar();
    }

    public void atualizar(int id, Cliente cliente) {
        clienteService.atualizar(id, cliente);
    }

    public void excluir(int id) {
        clienteService.excluir(id);
    }
}