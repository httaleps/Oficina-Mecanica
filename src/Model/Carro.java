/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Polícia Civil
 */
public class Carro extends Veiculo {
     private int quantidadePortas;

    public Carro(String modelo, String marca, int ano, int proprietarioId, int quantidadePortas) {
        super(modelo, marca, ano, proprietarioId);
        this.quantidadePortas = quantidadePortas;
    }

    public int getQuantidadePortas() {
        return quantidadePortas;
    }

    public void setQuantidadePortas(int quantidadePortas) {
        this.quantidadePortas = quantidadePortas;
    }

    @Override
    public String toString() {
        return super.toString() + ", Carro{quantidadePortas=" + quantidadePortas + "}";
    }
}