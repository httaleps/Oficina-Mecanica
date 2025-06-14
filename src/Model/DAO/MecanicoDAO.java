/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.DAO;

    import Model.Mecanico;
    import java.util.ArrayList;
    import java.util.List;

/**
 *
 * @author Tales
 */
public class MecanicoDAO {
    private List<Mecanico> mecanicos = new ArrayList<>();

    public void adicionar(Mecanico mecanico) {
        mecanicos.add(mecanico);
    }

    public List<Mecanico> listar() {
        return mecanicos;
    }

    public Mecanico buscarPorCodigo(int codigo) {
        for (Mecanico m : mecanicos) {
            if (m.getCodigo() == codigo) {
                return m;
            }
        }
        return null;
    }

    public void atualizar(Mecanico mecanicoAtualizado) {
        for (int i = 0; i < mecanicos.size(); i++) {
            if (mecanicos.get(i).getCodigo() == mecanicoAtualizado.getCodigo()) {
                mecanicos.set(i, mecanicoAtualizado);
                return;
            }
        }
    }

    public void remover(int codigo) {
        mecanicos.removeIf(m -> m.getCodigo() == codigo);
    }
}
