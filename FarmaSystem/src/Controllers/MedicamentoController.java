package Controllers;

import Model.Medicamento;
import Service.MedicamentosService;

import java.util.List;

public class MedicamentoController {

    private final MedicamentosService medicamentoService = new MedicamentosService();

    public void cadastrar(Medicamento medicamento) {
        medicamentoService.cadastrar(medicamento);
    }

    public List<Medicamento> listar() {
        return medicamentoService.listar();
    }

    public void excluir(int id) {
        medicamentoService.excluir(id);
    }
}