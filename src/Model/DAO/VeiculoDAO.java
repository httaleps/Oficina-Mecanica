package Model.DAO;

import Model.Veiculo;
import java.util.ArrayList;
import java.util.List;

public class VeiculoDAO {
    private static List<Veiculo> veiculos = new ArrayList<>();

    public boolean inserirVeiculo(Veiculo veiculo) {
        boolean adicionado = veiculos.add(veiculo);
        System.out.println("Veículos cadastrados: " + veiculos);
        return adicionado;
    }

    public List<Veiculo> listarVeiculos() {
        return new ArrayList<>(veiculos);
    }

    public Veiculo buscarPorId(int id) {
        for (Veiculo v : veiculos) {
            if (v.getId() == id) {
                return v;
            }
        }
        return null;
    }

    public boolean removerVeiculo(int id) {
        return veiculos.removeIf(v -> v.getId() == id);
    }
}
