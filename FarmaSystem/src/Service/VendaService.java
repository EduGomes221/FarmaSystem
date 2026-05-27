package Service;

import Model.Venda;
import java.util.ArrayList;
import java.util.List;

public class VendaService {
    private ArrayList<Venda> vendas = new ArrayList<>();

    public void cadastrar(Venda venda) {
        vendas.add(venda);
    }

    public List<Venda> listar() {
        vendas.forEach(System.out::println);
        return null;
    }

    public void atualizar(int id, String produto, double valor) {
        for (Venda v : vendas) {
            if (v.getId() == id) {
                v.setProduto(produto);
                v.setValor(valor);
                return;
            }
        }
    }

    public void excluir(int id) {
        vendas.removeIf(v -> v.getId() == id);
    }

    public void relatorioVendas() {
        System.out.println("\n=== RELATÓRIO DE VENDAS ===");
        listar();
    }

    public void lucroMensal() {
        double total = 0;

        for (Venda v : vendas) {
            total += v.getValor();
        }

        System.out.println("\nLucro mensal: R$ " + total);
    }

    public void registrar(Venda venda) {
    }

    public void atualizar(int id, Venda venda) {

    }
}