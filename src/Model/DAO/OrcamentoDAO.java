package Model.DAO;

import Model.Orcamento;
import java.util.ArrayList;
import java.util.List;

public class OrcamentoDAO {
    private static List<Orcamento> orcamentos = new ArrayList<>();

    public void salvar(Orcamento orcamento) {
        orcamentos.add(orcamento);
    }

    public Orcamento buscarPorId(int id) {
        for (Orcamento o : orcamentos) {
            if (o.getId() == id) {  // aqui getId()
                return o;
            }
        }
        return null;
    }

    public void atualizar(Orcamento orcamento) {
        for (int i = 0; i < orcamentos.size(); i++) {
            if (orcamentos.get(i).getId() == orcamento.getId()) {  // getId()
                orcamentos.set(i, orcamento);
                return;
            }
        }
    }

    public void excluir(int id) {
        orcamentos.removeIf(o -> o.getId() == id);  // getId()
    }

    public List<Orcamento> listar() {
        return new ArrayList<>(orcamentos);
    }
}
