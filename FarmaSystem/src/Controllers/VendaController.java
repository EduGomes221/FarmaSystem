package Controllers;

import Model.Venda;
import Service.VendaService;

import java.util.List;

public class VendaController {

    private final VendaService vendaService = new VendaService();

    public void registrar(Venda venda) {
        vendaService.registrar(venda);
    }

    public List<Venda> listar() {
        return vendaService.listar();
    }

    public void atualizar(int id, Venda venda) {
        vendaService.atualizar(id, venda);
    }

    public void excluir(int id) {
        vendaService.excluir(id);
    }
}