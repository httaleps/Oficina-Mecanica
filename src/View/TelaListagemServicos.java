/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Model.DAO.ServicoDAO;
import Model.Servico;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Polícia Civil
 */
public class TelaListagemServicos extends javax.swing.JFrame {

    public TelaListagemServicos() {
        initComponents();
        carregarTabelaServicos();
    }
    
    private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    
    private void carregarTabelaServicos() {
    try {
        ServicoDAO dao = new ServicoDAO();
        List<Servico> lista = dao.listar();
        DefaultTableModel modelo = (DefaultTableModel) tabelaListagemServicos.getModel();
        modelo.setRowCount(0);
        for (Servico s : lista) {
            modelo.addRow(new Object[]{
                s.getId(),
                s.getVeiculoId(),
                s.getTipoServico(),
                s.getDataServico() != null ? dtf.format(s.getDataServico()) : "",
                s.getCusto()
            });
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Erro ao carregar serviços: " + e.getMessage());
    }
    }
    
    @Override
    public void setVisible(boolean visible) {
        super.setVisible(visible);
        if (visible) {
            carregarTabelaServicos();
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botaoHome = new javax.swing.JButton();
        labelSubTitulo = new javax.swing.JLabel();
        jButtonEditar = new javax.swing.JButton();
        jButtonDeletar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaListagemServicos = new javax.swing.JTable();
        labelTitulo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botaoHome.setBackground(new java.awt.Color(153, 153, 153));
        botaoHome.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        botaoHome.setText("Voltar Menu");
        botaoHome.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botaoHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoHomeActionPerformed(evt);
            }
        });
        getContentPane().add(botaoHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 610, -1, -1));

        labelSubTitulo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelSubTitulo.setForeground(new java.awt.Color(0, 0, 0));
        labelSubTitulo.setText("Oficina Mecânica - Os Silveiras (Sob nova direção do mecânico Gustavo)");
        getContentPane().add(labelSubTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, -1, -1));

        jButtonEditar.setText("Editar");
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(872, 610, 80, 30));

        jButtonDeletar.setText("Deletar");
        jButtonDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeletarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonDeletar, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 610, 80, 30));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tabelaListagemServicos.setBackground(new java.awt.Color(204, 204, 204));
        tabelaListagemServicos.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tabelaListagemServicos.setForeground(new java.awt.Color(0, 0, 0));
        tabelaListagemServicos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo do Serviço", "Código do Veículo", "Tipo de Serviço", "Data do Serviço", "Custo"
            }
        ));
        jScrollPane1.setViewportView(tabelaListagemServicos);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1001, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 1040, 450));

        labelTitulo.setFont(new java.awt.Font("Gabriola", 1, 48)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(0, 0, 0));
        labelTitulo.setText("LISTAGEM DE SERVIÇOS");
        getContentPane().add(labelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, 590, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Imagens/CARROVERMELHO.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1120, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoHomeActionPerformed
        new MenuPrincipalOficina().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botaoHomeActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        editarServico();
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jButtonDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeletarActionPerformed
        excluirServico();
    }//GEN-LAST:event_jButtonDeletarActionPerformed

    private void editarServico() {
        int linhaSelecionada = tabelaListagemServicos.getSelectedRow();

        if (linhaSelecionada == -1) {
            JOptionPane.showMessageDialog(this, "Selecione um serviço para editar.");
            return;
        }

        int id = (int) tabelaListagemServicos.getValueAt(linhaSelecionada, 0);

        ServicoDAO dao = new ServicoDAO();
        Servico servicoOriginal = dao.listar()
                                     .stream()
                                     .filter(s -> s.getId() == id)
                                     .findFirst()
                                     .orElse(null);

        if (servicoOriginal == null) {
            JOptionPane.showMessageDialog(this, "Serviço não encontrado.");
            return;
        }

        // Solicita novos dados ao usuário
        String novoTipo = JOptionPane.showInputDialog(this, "Novo tipo de serviço:", servicoOriginal.getTipoServico());
        if (novoTipo == null) return; // Cancelado

        String novoCustoStr = JOptionPane.showInputDialog(this, "Novo custo:", servicoOriginal.getCusto());
        if (novoCustoStr == null) return; // Cancelado

        double novoCusto;
        try {
            novoCusto = Double.parseDouble(novoCustoStr);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Custo inválido.");
            return;
        }

        // Atualiza os campos desejados
        servicoOriginal.setTipoServico(novoTipo);
        servicoOriginal.setCusto(novoCusto);

        dao.atualizar(servicoOriginal);
        carregarTabelaServicos();
        JOptionPane.showMessageDialog(this, "Serviço atualizado com sucesso.");
    }

    
    private void excluirServico() {
        int linha = tabelaListagemServicos.getSelectedRow();
        if (linha != -1) {
            int confirm = JOptionPane.showConfirmDialog(this, "Deseja excluir o serviço?", "Confirmar", JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION) {
                try {
                    int id = (int) tabelaListagemServicos.getValueAt(linha, 0);
                    ServicoDAO dao = new ServicoDAO();
                    dao.excluir(id);  // Você precisa ter esse método no DAO

                    carregarTabelaServicos();
                    JOptionPane.showMessageDialog(this, "Serviço excluído com sucesso.");
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, "Erro ao excluir: " + e.getMessage());
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Selecione um serviço para excluir.");
        }
    }

    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaListagemServicos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoHome;
    private javax.swing.JButton jButtonDeletar;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelSubTitulo;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JTable tabelaListagemServicos;
    // End of variables declaration//GEN-END:variables
}
