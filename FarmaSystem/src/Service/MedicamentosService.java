package Service;

import Model.Medicamento;

import java.util.List;

public class MedicamentosService {
    public void cadastrar(Medicamento medicamento) {
    }

    public List<Medicamento> listar() {
        return null;
    }

    public void excluir(int id) {
    }

    public void relatorioEstoque() {
        System.out.println("\n=== RELATÓRIO DE ESTOQUE ===");
        listar();
    }

    public void produtosVencidos() {
        System.out.println("\n=== PRODUTOS VENCIDOS ===");

        Medicamento[] medicamento = new Medicamento[0];
        for (Medicamento m : medicamento) {
            if (m.getValidade().contains("2024")) {
                System.out.println(m);
            }
        }
    }
}
