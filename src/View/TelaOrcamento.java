
package View;

import Controller.OrcamentoController;
import Model.DAO.OrcamentoDAO;

public class TelaOrcamento extends javax.swing.JFrame {

    public TelaOrcamento() {
        initComponents();
        OrcamentoDAO dao = new OrcamentoDAO();
        OrcamentoController controller = new OrcamentoController(this, dao);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jTextFieldStatus = new javax.swing.JTextField();
        jTextFieldCodOrcamento = new javax.swing.JTextField();
        jTextFieldCodServico = new javax.swing.JTextField();
        jTextFieldValor = new javax.swing.JTextField();
        jTextFieldData = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabelCodOrcamento = new javax.swing.JLabel();
        jLabelCodServico = new javax.swing.JLabel();
        jLabelValor = new javax.swing.JLabel();
        jLabelData = new javax.swing.JLabel();
        jLabelStatus = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Oficina Mecânica - Os Silveiras (Sob nova direção do mecânico Gustavo)");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, -1, -1));

        jButton2.setBackground(new java.awt.Color(255, 0, 0));
        jButton2.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("ENVIAR");
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 490, 120, 50));

        jButton1.setBackground(new java.awt.Color(0, 204, 0));
        jButton1.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("LIMPAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 490, 120, 50));

        jButton3.setBackground(new java.awt.Color(153, 153, 153));
        jButton3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton3.setText("Voltar Menu");
        jButton3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 590, -1, -1));

        jTextFieldStatus.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldStatus.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jTextFieldStatus.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldStatus.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        getContentPane().add(jTextFieldStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 410, 220, -1));

        jTextFieldCodOrcamento.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldCodOrcamento.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jTextFieldCodOrcamento.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldCodOrcamento.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jTextFieldCodOrcamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCodOrcamentoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldCodOrcamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 210, 220, -1));

        jTextFieldCodServico.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldCodServico.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jTextFieldCodServico.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldCodServico.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        getContentPane().add(jTextFieldCodServico, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 260, 220, -1));

        jTextFieldValor.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldValor.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jTextFieldValor.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldValor.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        getContentPane().add(jTextFieldValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 310, 220, -1));

        jTextFieldData.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldData.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jTextFieldData.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldData.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jTextFieldData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDataActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldData, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 360, 220, -1));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabelCodOrcamento.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabelCodOrcamento.setForeground(new java.awt.Color(0, 0, 0));
        jLabelCodOrcamento.setText("Código do Orçamento:");

        jLabelCodServico.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabelCodServico.setForeground(new java.awt.Color(0, 0, 0));
        jLabelCodServico.setText("Código do Serviço");

        jLabelValor.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabelValor.setForeground(new java.awt.Color(0, 0, 0));
        jLabelValor.setText("Valor Estimado:");

        jLabelData.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabelData.setForeground(new java.awt.Color(0, 0, 0));
        jLabelData.setText("Data do Orçamento:");

        jLabelStatus.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabelStatus.setForeground(new java.awt.Color(0, 0, 0));
        jLabelStatus.setText("Status:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelCodOrcamento)
                    .addComponent(jLabelCodServico, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelValor, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelData, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(450, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabelCodOrcamento)
                .addGap(18, 18, 18)
                .addComponent(jLabelCodServico)
                .addGap(18, 18, 18)
                .addComponent(jLabelValor)
                .addGap(26, 26, 26)
                .addComponent(jLabelData, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelStatus)
                .addContainerGap(129, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 720, 430));

        jLabel3.setFont(new java.awt.Font("Gabriola", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("ORÇAMENTO");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, 300, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Imagens/CARROVERMELHO.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1120, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        new MenuPrincipalOficina().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextFieldDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDataActionPerformed

    private void jTextFieldCodOrcamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCodOrcamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCodOrcamentoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(TelaOrcamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaOrcamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaOrcamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaOrcamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaOrcamento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jButton1;
    public javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelCodOrcamento;
    private javax.swing.JLabel jLabelCodServico;
    private javax.swing.JLabel jLabelData;
    private javax.swing.JLabel jLabelStatus;
    private javax.swing.JLabel jLabelValor;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JTextField jTextFieldCodOrcamento;
    public javax.swing.JTextField jTextFieldCodServico;
    public javax.swing.JTextField jTextFieldData;
    public javax.swing.JTextField jTextFieldStatus;
    public javax.swing.JTextField jTextFieldValor;
    // End of variables declaration//GEN-END:variables
}
