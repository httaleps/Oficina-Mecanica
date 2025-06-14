/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Model.DAO.ProprietarioDAO;
import Model.Proprietario;
import javax.swing.JOptionPane;

/**
 *
 * @author Polícia Civil
 */
public class TelaCadastroProprietario extends javax.swing.JFrame {

    private static MenuPrincipalOficina menuPrincipalInstance = null; 
    
    public TelaCadastroProprietario() {
        initComponents();
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jButtonEnviar = new javax.swing.JButton();
        jButtonLimpar = new javax.swing.JButton();
        jButtonHome = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabelId = new javax.swing.JLabel();
        jLabelNomeProprietario = new javax.swing.JLabel();
        jLabelTelefone = new javax.swing.JLabel();
        jLabelEmail = new javax.swing.JLabel();
        jLabelEndereco = new javax.swing.JLabel();
        jTextFieldEndereco = new javax.swing.JTextField();
        jTextFieldEmail = new javax.swing.JTextField();
        jTextFieldTelefone = new javax.swing.JTextField();
        jTextFieldNomeProprietario = new javax.swing.JTextField();
        jTextFieldId = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Oficina Mecânica - Os Silveiras (Sob nova direção do mecânico Gustavo)");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, -1, -1));

        jButtonEnviar.setBackground(new java.awt.Color(0, 204, 0));
        jButtonEnviar.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jButtonEnviar.setForeground(new java.awt.Color(0, 0, 0));
        jButtonEnviar.setText("ENVIAR");
        jButtonEnviar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEnviarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonEnviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 490, 120, 50));

        jButtonLimpar.setBackground(new java.awt.Color(255, 0, 0));
        jButtonLimpar.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jButtonLimpar.setForeground(new java.awt.Color(0, 0, 0));
        jButtonLimpar.setText("LIMPAR");
        jButtonLimpar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 490, 120, 50));

        jButtonHome.setBackground(new java.awt.Color(153, 153, 153));
        jButtonHome.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButtonHome.setForeground(new java.awt.Color(0, 0, 0));
        jButtonHome.setText("Voltar Menu");
        jButtonHome.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHomeActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 590, -1, -1));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelId.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabelId.setForeground(new java.awt.Color(0, 0, 0));
        jLabelId.setText("Código do Proprietário:");
        jPanel1.add(jLabelId, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 330, 40));

        jLabelNomeProprietario.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabelNomeProprietario.setForeground(new java.awt.Color(0, 0, 0));
        jLabelNomeProprietario.setText("Nome:");
        jPanel1.add(jLabelNomeProprietario, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 330, 40));

        jLabelTelefone.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabelTelefone.setForeground(new java.awt.Color(0, 0, 0));
        jLabelTelefone.setText("Telefone:");
        jPanel1.add(jLabelTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 330, 40));

        jLabelEmail.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabelEmail.setForeground(new java.awt.Color(0, 0, 0));
        jLabelEmail.setText("E-mail:");
        jPanel1.add(jLabelEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 330, 40));

        jLabelEndereco.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabelEndereco.setForeground(new java.awt.Color(0, 0, 0));
        jLabelEndereco.setText("Endereço:");
        jPanel1.add(jLabelEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 330, 40));

        jTextFieldEndereco.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldEndereco.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jTextFieldEndereco.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldEndereco.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jPanel1.add(jTextFieldEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 260, 320, -1));

        jTextFieldEmail.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldEmail.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jTextFieldEmail.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldEmail.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jPanel1.add(jTextFieldEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 210, 320, -1));

        jTextFieldTelefone.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldTelefone.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jTextFieldTelefone.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldTelefone.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jPanel1.add(jTextFieldTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 160, 320, -1));

        jTextFieldNomeProprietario.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldNomeProprietario.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jTextFieldNomeProprietario.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldNomeProprietario.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jPanel1.add(jTextFieldNomeProprietario, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, 320, -1));

        jTextFieldId.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldId.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jTextFieldId.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldId.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jTextFieldId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIdActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldId, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 60, 320, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 720, 430));

        jLabel3.setFont(new java.awt.Font("Gabriola", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("CADASTRO DE PROPRIETÁRIO");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 590, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Imagens/CARROVERMELHO.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1120, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHomeActionPerformed
        MenuPrincipalOficina.closeInstance();
        MenuPrincipalOficina menu = MenuPrincipalOficina.getInstance();
        menu.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_jButtonHomeActionPerformed

    private void jTextFieldIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldIdActionPerformed

    private void jButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparActionPerformed
        limparCampos();
    }//GEN-LAST:event_jButtonLimparActionPerformed

    private void jButtonEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEnviarActionPerformed
        
        try {
            int id = Integer.parseInt(jTextFieldId.getText().trim());
            String nome = jTextFieldNomeProprietario.getText().trim();
            String telefone = jTextFieldTelefone.getText().trim();
            String email = jTextFieldEmail.getText().trim();
            String endereco = jTextFieldEndereco.getText().trim();

            if (nome.isEmpty() || telefone.isEmpty() || email.isEmpty() || endereco.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Todos os campos devem ser preenchidos!", "Erro", JOptionPane.WARNING_MESSAGE);
                return;
            }

            Proprietario p = new Proprietario(id, nome, telefone, email, endereco);
            boolean sucesso = ProprietarioDAO.adicionarProprietario(p);

            if (sucesso) {
                JOptionPane.showMessageDialog(this, "Proprietário cadastrado com sucesso!");
                limparCampos();
            } else {
                JOptionPane.showMessageDialog(this, "Já existe um proprietário com esse ID.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "O campo ID deve conter apenas números.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonEnviarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
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
            java.util.logging.Logger.getLogger(TelaCadastroProprietario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroProprietario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroProprietario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroProprietario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroProprietario().setVisible(true);
            }
        });
    }
    
    private void limparCampos() {
            jTextFieldId.setText("");
            jTextFieldNomeProprietario.setText("");
            jTextFieldTelefone.setText("");
            jTextFieldEmail.setText("");
            jTextFieldEndereco.setText("");
        }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEnviar;
    private javax.swing.JButton jButtonHome;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelEndereco;
    private javax.swing.JLabel jLabelId;
    private javax.swing.JLabel jLabelNomeProprietario;
    private javax.swing.JLabel jLabelTelefone;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldEndereco;
    private javax.swing.JTextField jTextFieldId;
    private javax.swing.JTextField jTextFieldNomeProprietario;
    private javax.swing.JTextField jTextFieldTelefone;
    // End of variables declaration//GEN-END:variables
}

    
