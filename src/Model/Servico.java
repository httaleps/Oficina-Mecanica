/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Polícia Civil
 */
import java.time.LocalDate;

public class Servico {
    private int id;
    private int veiculoId;
    private String tipoServico;
    private LocalDate dataServico;
    private double custo;

    // Construtor
    public Servico(int id, int veiculoId, String tipoServico, LocalDate dataServico, double custo) {
        this.id = id;
        this.veiculoId = veiculoId;
        this.tipoServico = tipoServico;
        this.dataServico = dataServico;
        this.custo = custo;
    }

    public Servico() {

    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getVeiculoId() {
        return veiculoId;
    }

    public void setVeiculoId(int veiculoId) {
        this.veiculoId = veiculoId;
    }

    public String getTipoServico() {
        return tipoServico;
    }

    public void setTipoServico(String tipoServico) {
        this.tipoServico = tipoServico;
    }

    public LocalDate getDataServico() {
        return dataServico;
    }

    public void setDataServico(LocalDate dataServico) {
        this.dataServico = dataServico;
    }

    public double getCusto() {
        return custo;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }

    // Método para exibir informações do serviço
    @Override
    public String toString() {
        return "Servico{" +
                "id=" + id +
                ", veiculoId=" + veiculoId +
                ", tipoServico='" + tipoServico + '\'' +
                ", dataServico=" + dataServico +
                ", custo=" + custo +
                '}';
    }
}