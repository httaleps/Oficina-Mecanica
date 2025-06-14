package Controller;

import Model.Orcamento;
import Model.DAO.OrcamentoDAO;
import View.TelaOrcamento;

import javax.swing.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class OrcamentoController {

    private TelaOrcamento view;
    private OrcamentoDAO dao;
    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public OrcamentoController(TelaOrcamento view, OrcamentoDAO dao) {
        this.view = view;
        this.dao = dao;
        initController();
    }

    private void initController() {
        // Configura o botão ENVIAR
        view.jButton2.addActionListener(e -> enviarOrcamento());
        // Configura o botão LIMPAR
        view.jButton1.addActionListener(e -> limparCampos());
    }

    public void enviarOrcamento() {
        try {
            int id = Integer.parseInt(view.jTextFieldCodOrcamento.getText().trim());
            int servicoId = Integer.parseInt(view.jTextFieldCodServico.getText().trim());
            double valorEstimado = Double.parseDouble(view.jTextFieldValor.getText().trim().replace(",", "."));
            Date dataOrcamento = sdf.parse(view.jTextFieldData.getText().trim());
            String status = view.jTextFieldStatus.getText().trim();

            Orcamento orc = new Orcamento(id, servicoId, valorEstimado, dataOrcamento, status);

            System.out.println(orc); // debug opcional
            dao.salvar(orc);

            JOptionPane.showMessageDialog(view, "Orçamento enviado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            limparCampos();

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(view, "Por favor, preencha corretamente os campos numéricos (somente números).", "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(view, "Data inválida. Use o formato dd/MM/yyyy.", "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(view, "Erro ao enviar orçamento: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }



    private void limparCampos() {
        view.jTextFieldStatus.setText("");
        view.jTextFieldCodOrcamento.setText("");
        view.jTextFieldCodServico.setText("");
        view.jTextFieldValor.setText("");
        view.jTextFieldData.setText("");
    }
}
