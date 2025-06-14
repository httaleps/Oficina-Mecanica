/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Polícia Civil
 */
public class Veiculo {
    private static int contador = 1; // Começa em 1
    private int id;
    private String modelo;
    private String marca;
    private int ano;
    private int proprietarioId;
    
    // Construtor sem ID - ID será gerado automaticamente
    public Veiculo(String modelo, String marca, int ano, int proprietarioId) {
        this.id = contador++; // Gera ID automático
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.proprietarioId = proprietarioId;
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getProprietarioId() {
        return proprietarioId;
    }

    public void setProprietarioId(int proprietarioId) {
        this.proprietarioId = proprietarioId;
    }

    // Método para exibir informações do veículo
    @Override
    public String toString() {
        return "Veiculo{" +
                "id=" + id +
                ", modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", ano=" + ano +
                ", proprietarioId=" + proprietarioId +
                '}';
    }
}