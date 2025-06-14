package Model.DAO;

import Model.Proprietario;
import java.util.ArrayList;

public class ProprietarioDAO {
    
    private static final ArrayList<Proprietario> listaProprietarios = new ArrayList<>();

    public static boolean adicionarProprietario(Proprietario p) {
        if (buscarPorId(p.getId()) == null) {
            listaProprietarios.add(p);
            return true;
        }
        return false;
    }

    public static Proprietario buscarPorId(int id) {
        for (Proprietario p : listaProprietarios) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    public static boolean atualizarProprietario(Proprietario pAtualizado) {
        Proprietario pExistente = buscarPorId(pAtualizado.getId());
        if (pExistente != null) {
            pExistente.setNome(pAtualizado.getNome());
            pExistente.setTelefone(pAtualizado.getTelefone());
            pExistente.setEmail(pAtualizado.getEmail());
            pExistente.setEndereco(pAtualizado.getEndereco());
            return true;
        }
        return false;
    }

    public static ArrayList<Proprietario> getListaProprietarios() {
        return listaProprietarios;
    }
}
