/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.ServicoController;
import Model.Servico;
import java.awt.HeadlessException;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Polícia Civil
 */
public class TelaCadastroServico extends javax.swing.JFrame {

    private ServicoController servicoController = new ServicoController();

    public TelaCadastroServico() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelSubTitulo = new javax.swing.JLabel();
        botaoEnviar = new javax.swing.JButton();
        botaoLimpar = new javax.swing.JButton();
        botaoHome = new javax.swing.JButton();
        textValor = new javax.swing.JTextField();
        textCodServico = new javax.swing.JTextField();
        textCodVeiculo = new javax.swing.JTextField();
        textTipoServico = new javax.swing.JTextField();
        textDataServico = new javax.swing.JTextField();
        labelDataServico = new javax.swing.JLabel();
        labelValor = new javax.swing.JLabel();
        labelTipoServico = new javax.swing.JLabel();
        labelCodVeiculo = new javax.swing.JLabel();
        labelCodServico = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        labelBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelSubTitulo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelSubTitulo.setForeground(new java.awt.Color(0, 0, 0));
        labelSubTitulo.setText("Oficina Mecânica - Os Silveiras (Sob nova direção do mecânico Gustavo)");
        getContentPane().add(labelSubTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, -1, -1));

        botaoEnviar.setBackground(new java.awt.Color(0, 204, 0));
        botaoEnviar.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        botaoEnviar.setForeground(new java.awt.Color(0, 0, 0));
        botaoEnviar.setText("ENVIAR");
        botaoEnviar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botaoEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEnviarActionPerformed(evt);
            }
        });
        getContentPane().add(botaoEnviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 490, 120, 50));

        botaoLimpar.setBackground(new java.awt.Color(255, 51, 0));
        botaoLimpar.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        botaoLimpar.setForeground(new java.awt.Color(0, 0, 0));
        botaoLimpar.setText("LIMPAR");
        botaoLimpar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botaoLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLimparActionPerformed(evt);
            }
        });
        getContentPane().add(botaoLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 490, 120, 50));

        botaoHome.setBackground(new java.awt.Color(153, 153, 153));
        botaoHome.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        botaoHome.setForeground(new java.awt.Color(0, 0, 0));
        botaoHome.setText("Voltar Menu");
        botaoHome.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botaoHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoHomeActionPerformed(evt);
            }
        });
        getContentPane().add(botaoHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 590, -1, -1));

        textValor.setBackground(new java.awt.Color(255, 255, 255));
        textValor.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        textValor.setForeground(new java.awt.Color(0, 0, 0));
        textValor.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        getContentPane().add(textValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 410, 220, -1));

        textCodServico.setBackground(new java.awt.Color(255, 255, 255));
        textCodServico.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        textCodServico.setForeground(new java.awt.Color(0, 0, 0));
        textCodServico.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        getContentPane().add(textCodServico, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 210, 220, -1));

        textCodVeiculo.setBackground(new java.awt.Color(255, 255, 255));
        textCodVeiculo.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        textCodVeiculo.setForeground(new java.awt.Color(0, 0, 0));
        textCodVeiculo.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        getContentPane().add(textCodVeiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 260, 220, -1));

        textTipoServico.setBackground(new java.awt.Color(255, 255, 255));
        textTipoServico.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        textTipoServico.setForeground(new java.awt.Color(0, 0, 0));
        textTipoServico.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        getContentPane().add(textTipoServico, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 310, 220, -1));

        textDataServico.setBackground(new java.awt.Color(255, 255, 255));
        textDataServico.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        textDataServico.setForeground(new java.awt.Color(0, 0, 0));
        textDataServico.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        getContentPane().add(textDataServico, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 360, 220, -1));

        labelDataServico.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        labelDataServico.setForeground(new java.awt.Color(0, 0, 0));
        labelDataServico.setText("Data do Serviço");
        getContentPane().add(labelDataServico, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 350, 300, 60));

        labelValor.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        labelValor.setForeground(new java.awt.Color(0, 0, 0));
        labelValor.setText("Custo:");
        getContentPane().add(labelValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 400, 250, 60));

        labelTipoServico.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        labelTipoServico.setForeground(new java.awt.Color(0, 0, 0));
        labelTipoServico.setText("Tipos de Serviço");
        getContentPane().add(labelTipoServico, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 300, 250, 60));

        labelCodVeiculo.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        labelCodVeiculo.setForeground(new java.awt.Color(0, 0, 0));
        labelCodVeiculo.setText("Código do Veículo:");
        getContentPane().add(labelCodVeiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 250, 250, 60));

        labelCodServico.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        labelCodServico.setForeground(new java.awt.Color(0, 0, 0));
        labelCodServico.setText("Código do Serviço:");
        getContentPane().add(labelCodServico, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, 250, 70));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 716, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 426, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 720, 430));

        labelTitulo.setFont(new java.awt.Font("Gabriola", 1, 48)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(0, 0, 0));
        labelTitulo.setText("CADASTRO DE SERVIÇOS");
        getContentPane().add(labelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, 590, -1));

        labelBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Imagens/CARROVERMELHO.jpg"))); // NOI18N
        getContentPane().add(labelBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1120, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoHomeActionPerformed
        if (MenuPrincipalOficina.getInstance() == null) {
            MenuPrincipalOficina menu = new MenuPrincipalOficina();
            menu.setVisible(true);
        } else {
            MenuPrincipalOficina.getInstance().setVisible(true);
        }
        this.dispose(); //fecha a tela atual
    }//GEN-LAST:event_botaoHomeActionPerformed

    private void botaoEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEnviarActionPerformed
        try {
        String id = textCodServico.getText();
        String veiculoId = textCodVeiculo.getText();
        String tipoServico = textTipoServico.getText();
        String dataServico = textDataServico.getText();
        String custo = textValor.getText();
        // Chama o controller para cadastrar
        servicoController.cadastrarServico(id, veiculoId, tipoServico, dataServico, custo);
        // Mostra mensagem de sucesso
        JOptionPane.showMessageDialog(this, "Serviço cadastrado com sucesso!");
        // Limpa os campos
        limparCampos();
        // Abre a tela de listagem de serviços
        TelaListagemServicos listagemServicos = new TelaListagemServicos();
        listagemServicos.setVisible(true);
        this.dispose(); // Fecha a tela atual
    } catch (HeadlessException e) {
        // Mostra mensagem de erro
        JOptionPane.showMessageDialog(this, "Erro ao cadastrar serviço:\n" + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_botaoEnviarActionPerformed

    private void botaoLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLimparActionPerformed
        limparCampos();
    }//GEN-LAST:event_botaoLimparActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroServico().setVisible(true);
            }
        });
    }
    
    private void limparCampos() {
        textCodServico.setText("");
        textCodVeiculo.setText("");
        textTipoServico.setText("");
        textDataServico.setText("");
        textValor.setText("");
    }
    
    private void cadastrarServico() {
        try {
            // Validação simples de campos vazios
            if (textCodServico.getText().isEmpty() || textCodVeiculo.getText().isEmpty() ||
                textTipoServico.getText().isEmpty() || textDataServico.getText().isEmpty() ||
                textValor.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Por favor, preencha todos os campos.", "Aviso", JOptionPane.WARNING_MESSAGE);
                return;
            }

            servicoController.cadastrarServico(
                textCodServico.getText(),
                textCodVeiculo.getText(),
                textTipoServico.getText(),
                textDataServico.getText(),
                textValor.getText()
            );

            JOptionPane.showMessageDialog(this, "Serviço cadastrado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            limparCampos();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao cadastrar serviço: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoEnviar;
    private javax.swing.JButton botaoHome;
    private javax.swing.JButton botaoLimpar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelBackground;
    private javax.swing.JLabel labelCodServico;
    private javax.swing.JLabel labelCodVeiculo;
    private javax.swing.JLabel labelDataServico;
    private javax.swing.JLabel labelSubTitulo;
    private javax.swing.JLabel labelTipoServico;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JLabel labelValor;
    private javax.swing.JTextField textCodServico;
    private javax.swing.JTextField textCodVeiculo;
    private javax.swing.JTextField textDataServico;
    private javax.swing.JTextField textTipoServico;
    private javax.swing.JTextField textValor;
    // End of variables declaration//GEN-END:variables
}
