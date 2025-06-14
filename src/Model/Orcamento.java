/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Polícia Civil
 */
import java.util.Date;

public class Orcamento {
    private int id;
    private int servicoId;
    private double valorEstimado;
    private Date dataOrcamento;
    private String status; // Ex: "aceito", "rejeitado", "pendente"

    // Construtor
    public Orcamento(int id, int servicoId, double valorEstimado, Date dataOrcamento, String status) {
        this.id = id;
        this.servicoId = servicoId;
        this.valorEstimado = valorEstimado;
        this.dataOrcamento = dataOrcamento;
        this.status = status;
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getServicoId() {
        return servicoId;
    }

    public void setServicoId(int servicoId) {
        this.servicoId = servicoId;
    }

    public double getValorEstimado() {
        return valorEstimado;
    }

    public void setValorEstimado(double valorEstimado) {
        this.valorEstimado = valorEstimado;
    }

    public Date getDataOrcamento() {
        return dataOrcamento;
    }

    public void setDataOrcamento(Date dataOrcamento) {
        this.dataOrcamento = dataOrcamento;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // Método para exibir informações do orçamento
    @Override
    public String toString() {
        return "Orcamento{" +
                "id=" + id +
                ", servicoId=" + servicoId +
                ", valorEstimado=" + valorEstimado +
                ", dataOrcamento=" + dataOrcamento +
                ", status='" + status + '\'' +
                '}';
    }
}