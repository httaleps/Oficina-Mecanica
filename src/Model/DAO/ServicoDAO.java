/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.DAO;

import Model.Servico;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tales
 */

public class ServicoDAO {

    private static List<Servico> servicos = new ArrayList<>();

    public void inserir(Servico servico) {
        servicos.add(servico);
        System.out.println("Serviço inserido: " + servico);
    }

    public List<Servico> listar() {
        return servicos;
    }
    
    public void atualizar(Servico servicoAtualizado) {
        for (int i = 0; i < servicos.size(); i++) {
            if (servicos.get(i).getId() == servicoAtualizado.getId()) {
                servicos.set(i, servicoAtualizado);
                System.out.println("Serviço atualizado: " + servicoAtualizado);
                return;
            }
        }
        System.out.println("Serviço com ID " + servicoAtualizado.getId() + " não encontrado.");
    }
    
    public void excluir(int id) {
        boolean removido = servicos.removeIf(s -> s.getId() == id);
        if (removido) {
            System.out.println("Serviço com ID " + id + " removido.");
        } else {
            System.out.println("Serviço com ID " + id + " não encontrado.");
        }
    }
}

