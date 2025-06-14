/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Mecanico;
import javax.swing.JOptionPane;

/**
 *
 * @author Tales
 */
public class MecanicoController {
     public void salvarMecanico(Mecanico mecanico) {
        // Aqui poderia haver uma lógica de DAO para salvar no banco de dados
        // Exemplo simples com mensagem
        JOptionPane.showMessageDialog(null, 
            "Mecânico salvo:\n" +
            "Código: " + mecanico.getCodigo() + "\n" +
            "Nome: " + mecanico.getNome() + "\n" +
            "Especialidade: " + mecanico.getEspecialidade() + "\n" +
            "Telefone: " + mecanico.getTelefone() + "\n" +
            "E-mail: " + mecanico.getEmail()
        );
    }
}
