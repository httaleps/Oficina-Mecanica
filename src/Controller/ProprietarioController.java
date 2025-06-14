/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.DAO.ProprietarioDAO;
import Model.Proprietario;

public class ProprietarioController {
    
    public static void main(String[] args) {
        Proprietario p1 = new Proprietario(1, "João Silva", "1199999", "joao@email.com", "palhoça");
        Proprietario p2 = new Proprietario(2, "Maria Souza", "1188888", "maria@email.com", "São José");
        
        ProprietarioDAO.adicionarProprietario(p1);
        ProprietarioDAO.adicionarProprietario(p2);
        
        System.out.println("Todos os proprietários:");
        for (Proprietario p : ProprietarioDAO.getListaProprietarios()) {
            System.out.println(p);
        }

        Proprietario pAtualizado = new Proprietario(1, "João Silva", "1199999", "joao@novoemail.com", "palhoça");
        ProprietarioDAO.atualizarProprietario(pAtualizado); // Supondo que exista um método para atualizar
    }
}

