/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.DAO.ServicoDAO;
import Model.Servico;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.List;

/**
 *
 * @author Tales
 */

public class ServicoController {
    
    private ServicoDAO servicoDAO = new ServicoDAO();
    
    // Formato padrão dd/MM/yyyy
    private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    // Retorna boolean indicando sucesso ou não
    public boolean cadastrarServico(String id, String veiculoId, String tipoServico, String dataServico, String custo) throws IllegalArgumentException {
        try {
            int idInt = Integer.parseInt(id);
            int veiculoIdInt = Integer.parseInt(veiculoId);
            double custoDouble = Double.parseDouble(custo);
            LocalDate data = LocalDate.parse(dataServico, formatter);

            Servico servico = new Servico(idInt, veiculoIdInt, tipoServico, data, custoDouble);
            servicoDAO.inserir(servico);
            return true;

        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("ID, Veículo ou Custo inválidos. Devem ser números.");
        } catch (DateTimeParseException e) {
            throw new IllegalArgumentException("Data inválida. Use o formato dd/MM/yyyy.");
        } catch (Exception e) {
            throw new IllegalArgumentException("Erro desconhecido: " + e.getMessage());
        }
    }
    
    public List<Servico> listarServicos() {
        return servicoDAO.listar();
    }

}
