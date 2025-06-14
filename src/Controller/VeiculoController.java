/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Carro;
import Model.DAO.ProprietarioDAO;
import Model.Veiculo;
import Model.DAO.VeiculoDAO;
import Model.Moto;
import Model.Proprietario;
/**
 *
 * @author Tales
 */
public class VeiculoController {

    private VeiculoDAO veiculoDAO;

    public VeiculoController(VeiculoDAO veiculoDAO) {
        this.veiculoDAO = veiculoDAO;
    }

    public class ProprietarioNaoEncontradoException extends Exception {
        public ProprietarioNaoEncontradoException(String mensagem) {
            super(mensagem);
        }
    }

    public Proprietario buscarProprietarioPorId(int id) throws ProprietarioNaoEncontradoException {
        Proprietario p = ProprietarioDAO.buscarPorId(id);  // usa o método estático do DAO
        if (p == null) {
            throw new ProprietarioNaoEncontradoException("Proprietário com ID " + id + " não encontrado.");
        }
        return p;
    }

    public boolean cadastrarCarro(String modelo, String marca, int proprietarioId, int ano,  int portas) {
        try {
            Proprietario p = buscarProprietarioPorId(proprietarioId);
            Carro carro = new Carro(modelo, marca, proprietarioId, ano, portas);
            return veiculoDAO.inserirVeiculo(carro);
        } catch (ProprietarioNaoEncontradoException e) {
            System.err.println(e.getMessage());
            return false;
        }
    }

    public boolean cadastrarMoto(String modelo, String marca, int proprietarioId, int ano,  int cilindrada) {
        try {
            Proprietario p = buscarProprietarioPorId(proprietarioId);
            Moto moto = new Moto(modelo, marca, ano, proprietarioId,  cilindrada);
            return veiculoDAO.inserirVeiculo(moto);
        } catch (ProprietarioNaoEncontradoException e) {
            System.err.println(e.getMessage());
            return false;
        }
    }
}
