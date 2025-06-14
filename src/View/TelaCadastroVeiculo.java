package View;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import Controller.VeiculoController;
import Model.DAO.VeiculoDAO;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


/**
 *
 * @author Polícia Civil
 */
public class TelaCadastroVeiculo extends javax.swing.JFrame {

    private VeiculoController controller;
    
    public TelaCadastroVeiculo() {
        initComponents();
        controller = new VeiculoController(new VeiculoDAO()); // Passe a view atual para o controller
        textInfoExtra.setVisible(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelCodProprietario = new javax.swing.JLabel();
        labelInfoExtra = new javax.swing.JLabel();
        botaoLimpar = new javax.swing.JButton();
        botaoEnviar = new javax.swing.JButton();
        labelId = new javax.swing.JLabel();
        textID = new javax.swing.JTextField();
        comboTipo = new javax.swing.JComboBox<>();
        labelModelo = new javax.swing.JLabel();
        labelMarca = new javax.swing.JLabel();
        labelAno = new javax.swing.JLabel();
        textIdProprietario = new javax.swing.JTextField();
        textMarca = new javax.swing.JTextField();
        textModelo = new javax.swing.JTextField();
        textAno = new javax.swing.JTextField();
        textInfoExtra = new javax.swing.JTextField();
        botaoHome = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelCodProprietario.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        labelCodProprietario.setForeground(new java.awt.Color(0, 0, 0));
        labelCodProprietario.setText("Código do Proprietário:");
        jPanel1.add(labelCodProprietario, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 350, 40));

        labelInfoExtra.setBackground(new java.awt.Color(255, 51, 0));
        labelInfoExtra.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        labelInfoExtra.setForeground(new java.awt.Color(0, 0, 0));
        labelInfoExtra.setText("Tipo");
        jPanel1.add(labelInfoExtra, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 350, 40));

        botaoLimpar.setBackground(new java.awt.Color(255, 0, 0));
        botaoLimpar.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        botaoLimpar.setForeground(new java.awt.Color(0, 0, 0));
        botaoLimpar.setText("LIMPAR");
        botaoLimpar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botaoLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLimparActionPerformed(evt);
            }
        });
        jPanel1.add(botaoLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 360, 100, 40));

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
        jPanel1.add(botaoEnviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 360, 100, 40));

        labelId.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        labelId.setForeground(new java.awt.Color(0, 0, 0));
        labelId.setText("Código do Veículo:");
        jPanel1.add(labelId, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 350, 40));

        textID.setEditable(false);
        textID.setBackground(new java.awt.Color(255, 255, 255));
        textID.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        textID.setForeground(new java.awt.Color(0, 0, 0));
        textID.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        textID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textIDActionPerformed(evt);
            }
        });
        jPanel1.add(textID, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 40, 240, -1));

        comboTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Carro", "Moto" }));
        comboTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboTipoActionPerformed(evt);
            }
        });
        jPanel1.add(comboTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 290, 70, 40));

        labelModelo.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        labelModelo.setForeground(new java.awt.Color(0, 0, 0));
        labelModelo.setText("Modelo:");
        jPanel1.add(labelModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 350, 40));

        labelMarca.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        labelMarca.setForeground(new java.awt.Color(0, 0, 0));
        labelMarca.setText("Marca:");
        jPanel1.add(labelMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 360, 40));

        labelAno.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        labelAno.setForeground(new java.awt.Color(0, 0, 0));
        labelAno.setText("Ano:");
        jPanel1.add(labelAno, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 360, 40));

        textIdProprietario.setBackground(new java.awt.Color(255, 255, 255));
        textIdProprietario.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        textIdProprietario.setForeground(new java.awt.Color(0, 0, 0));
        textIdProprietario.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jPanel1.add(textIdProprietario, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 90, 240, -1));

        textMarca.setBackground(new java.awt.Color(255, 255, 255));
        textMarca.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        textMarca.setForeground(new java.awt.Color(0, 0, 0));
        textMarca.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jPanel1.add(textMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 190, 240, -1));

        textModelo.setBackground(new java.awt.Color(255, 255, 255));
        textModelo.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        textModelo.setForeground(new java.awt.Color(0, 0, 0));
        textModelo.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jPanel1.add(textModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 140, 240, -1));

        textAno.setBackground(new java.awt.Color(255, 255, 255));
        textAno.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        textAno.setForeground(new java.awt.Color(0, 0, 0));
        textAno.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jPanel1.add(textAno, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 240, 240, -1));

        textInfoExtra.setBackground(new java.awt.Color(255, 255, 255));
        textInfoExtra.setForeground(new java.awt.Color(0, 0, 0));
        textInfoExtra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textInfoExtraActionPerformed(evt);
            }
        });
        jPanel1.add(textInfoExtra, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 290, 240, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 720, 430));

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

        jLabel3.setFont(new java.awt.Font("Gabriola", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("CADASTRO DE VEÍCULOS");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, 590, -1));

        jLabel1.setBackground(new java.awt.Color(102, 102, 102));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Imagens/CARROVERMELHO.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1120, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoHomeActionPerformed
        new MenuPrincipalOficina().setVisible(true);      
        this.dispose();
    }//GEN-LAST:event_botaoHomeActionPerformed

    private void textIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textIDActionPerformed

    }//GEN-LAST:event_textIDActionPerformed

    private void botaoLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLimparActionPerformed

        int confirm = javax.swing.JOptionPane.showConfirmDialog(
            this,
            "Tem certeza que deseja limpar os campos?",
            "Confirmação",
            javax.swing.JOptionPane.YES_NO_OPTION
        );

        if (confirm == javax.swing.JOptionPane.YES_OPTION) {
            textModelo.setText("");
            textMarca.setText("");
            textIdProprietario.setText("");
            textAno.setText("");
            textInfoExtra.setText("");
        }
        
    }//GEN-LAST:event_botaoLimparActionPerformed

    private void botaoEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEnviarActionPerformed

       if (!validarCampos()) {
            JOptionPane.showMessageDialog(null, "Por favor, preencha todos os campos.");
            return;
        }

        try {
            int anoInt = Integer.parseInt(textAno.getText().trim());
            int idProp = Integer.parseInt(textIdProprietario.getText().trim());
            String tipo = (String) comboTipo.getSelectedItem();
            String modelo = textModelo.getText().trim();
            String marca = textMarca.getText().trim();
            String infoExtra = textInfoExtra.getText().trim();

            if (!validarAno(anoInt)) {
                JOptionPane.showMessageDialog(null, "Ano inválido.");
                return;
            }

            boolean sucesso = cadastrarVeiculo(tipo, modelo, marca, idProp, anoInt, infoExtra);
            if (sucesso) {
                JOptionPane.showMessageDialog(null, tipo + " cadastrado com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao cadastrar " + tipo.toLowerCase() + ".");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ano, ID do Proprietário e o campo extra devem ser números inteiros.");
        }
    }

    private boolean validarCampos() {
        return !textModelo.getText().trim().isEmpty() &&
               !textMarca.getText().trim().isEmpty() &&
               !textIdProprietario.getText().trim().isEmpty() &&
               !textAno.getText().trim().isEmpty() &&
               !textInfoExtra.getText().trim().isEmpty();
    }

    private boolean validarAno(int ano) {
        int anoAtual = java.time.Year.now().getValue();
        return ano >= 1900 && ano <= anoAtual;
    }

    private boolean cadastrarVeiculo(String tipo, String modelo, String marca, int idProp, int ano, String infoExtra) {
        if ("Carro".equalsIgnoreCase(tipo)) {
            int portas = Integer.parseInt(infoExtra);
            return controller.cadastrarCarro(modelo, marca, idProp, ano, portas);
        } else if ("Moto".equalsIgnoreCase(tipo)) {
            int cilindrada = Integer.parseInt(infoExtra);
            return controller.cadastrarMoto(modelo, marca, idProp, ano, cilindrada);
        }
        return false;
    }//GEN-LAST:event_botaoEnviarActionPerformed

    
    
    private void comboTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboTipoActionPerformed
        String tipo = (String) comboTipo.getSelectedItem();
        if("Carro".equalsIgnoreCase(tipo)) {
            labelInfoExtra.setText("Quantidade de Portas:");
            textInfoExtra.setVisible(true);
            textInfoExtra.setText("");
        } else if ("Moto".equalsIgnoreCase(tipo)) {
            labelInfoExtra.setText("Cilindrada:");
            textInfoExtra.setVisible(true);
            textInfoExtra.setText("");
        } else {
            labelInfoExtra.setText("Tipo");
            textInfoExtra.setVisible(false);
        }
    }//GEN-LAST:event_comboTipoActionPerformed

    private void textInfoExtraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textInfoExtraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textInfoExtraActionPerformed

    
    
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(TelaCadastroVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroVeiculo().setVisible(true);
            }
        });
    }

    public JTextField getTextAno() {
        return textAno;
    }

    public void setTextAno(JTextField textAno) {
        this.textAno = textAno;
    }

    public JTextField getTextID() {
        return textID;
    }

    public void setTextID(JTextField textID) {
        this.textID = textID;
    }

    public JTextField getTextIdProprietario() {
        return textIdProprietario;
    }

    public void setTextIdProprietario(JTextField textIdProprietario) {
        this.textIdProprietario = textIdProprietario;
    }

    public JTextField getTextInfoExtra() {
        return textInfoExtra;
    }

    public void setTextInfoExtra(JTextField textInfoExtra) {
        this.textInfoExtra = textInfoExtra;
    }

    public JTextField getTextMarca() {
        return textMarca;
    }

    public void setTextMarca(JTextField textMarca) {
        this.textMarca = textMarca;
    }

    public JTextField getTextModelo() {
        return textModelo;
    }

    public void setTextModelo(JTextField textModelo) {
        this.textModelo = textModelo;
    }

    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoEnviar;
    private javax.swing.JButton botaoHome;
    private javax.swing.JButton botaoLimpar;
    private javax.swing.JComboBox<String> comboTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelAno;
    private javax.swing.JLabel labelCodProprietario;
    private javax.swing.JLabel labelId;
    private javax.swing.JLabel labelInfoExtra;
    private javax.swing.JLabel labelMarca;
    private javax.swing.JLabel labelModelo;
    private javax.swing.JTextField textAno;
    private javax.swing.JTextField textID;
    private javax.swing.JTextField textIdProprietario;
    private javax.swing.JTextField textInfoExtra;
    private javax.swing.JTextField textMarca;
    private javax.swing.JTextField textModelo;
    // End of variables declaration//GEN-END:variables
}
