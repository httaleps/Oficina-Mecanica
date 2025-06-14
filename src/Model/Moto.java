/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Polícia Civil
 */
public class Moto extends Veiculo {
     private int cilindrada;

    public Moto(String modelo, String marca, int ano, int proprietarioId, int cilindrada) {
        super(modelo, marca, ano, proprietarioId);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        return super.toString() + ", Moto{cilindrada=" + cilindrada + "}";
    }
}