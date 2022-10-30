package Interface;

import Connection.ModuloConexao;
import Controle.ExcluirDAO;
import Controle.IncluirEditarDAO;
import Controle.PesquisaDAO;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import Model.Clientes;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Deyvid
 */
public class TelaCadastro extends javax.swing.JInternalFrame {

    int status;
    int acao;

    Clientes objclientes = new Clientes();
    IncluirEditarDAO IEDAO;
    ExcluirDAO EXDAO;
    PesquisaDAO PESDAO;

    Connection conexao = null;
    PreparedStatement pstmt = null;
    ResultSet rs;

    public TelaCadastro() {
        initComponents();
        conexao = ModuloConexao.conector();
        
    }

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastro().setVisible(true);
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgSituacao = new javax.swing.ButtonGroup();
        bgWhatsapp = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        TxtNome = new javax.swing.JTextField();
        TxtEmail = new javax.swing.JTextField();
        TxtCod = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnBusca = new javax.swing.JButton();
        jtDate = new com.toedter.calendar.JDateChooser();
        jRAtivo = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jRInativo = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        TxtCelular = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        TextCpf = new javax.swing.JFormattedTextField();
        TxtRg = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnNovo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TxtEndereco = new javax.swing.JTextPane();
        jLabel12 = new javax.swing.JLabel();
        jRSim = new javax.swing.JRadioButton();
        jRNao = new javax.swing.JRadioButton();
        TxtSexo = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("COD.");

        TxtNome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TxtNome.setEnabled(false);

        TxtEmail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TxtEmail.setEnabled(false);

        TxtCod.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Nome:");

        btnBusca.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnBusca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/pesquisar.png"))); // NOI18N
        btnBusca.setText("Busca");
        btnBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscaActionPerformed(evt);
            }
        });

        jtDate.setEnabled(false);
        jtDate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        bgSituacao.add(jRAtivo);
        jRAtivo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRAtivo.setText("Ativo");
        jRAtivo.setActionCommand("Ativo");
        jRAtivo.setEnabled(false);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Sistuação do Cadastro");

        bgSituacao.add(jRInativo);
        jRInativo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRInativo.setSelected(true);
        jRInativo.setText("Inativo");
        jRInativo.setActionCommand("Inativo");
        jRInativo.setEnabled(false);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Email:");

        try {
            TxtCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#.####.####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        TxtCelular.setEnabled(false);
        TxtCelular.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("WhatsApp");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("CPF:");

        try {
            TextCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        TextCpf.setEnabled(false);
        TextCpf.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        try {
            TxtRg.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        TxtRg.setEnabled(false);
        TxtRg.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("RG:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Celular:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Data do Cadastro");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Sexo:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Endereço:");

        btnNovo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/novo.png"))); // NOI18N
        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnEditar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/editar.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.setEnabled(false);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnSalvar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/salvar.png"))); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.setEnabled(false);
        btnSalvar.setMaximumSize(new java.awt.Dimension(73, 33));
        btnSalvar.setMinimumSize(new java.awt.Dimension(73, 33));
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnExcluir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/excluir.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.setEnabled(false);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/cancelar.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnSair.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/exit.png"))); // NOI18N
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        TxtEndereco.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TxtEndereco.setEnabled(false);
        jScrollPane1.setViewportView(TxtEndereco);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/user.png"))); // NOI18N

        bgWhatsapp.add(jRSim);
        jRSim.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRSim.setSelected(true);
        jRSim.setText("SIM");
        jRSim.setActionCommand("SIM");
        jRSim.setEnabled(false);

        bgWhatsapp.add(jRNao);
        jRNao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRNao.setText("NÃO");
        jRNao.setActionCommand("NÃO");
        jRNao.setEnabled(false);

        TxtSexo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TxtSexo.setEnabled(false);
        TxtSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtSexoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TextCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtRg, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(TxtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRAtivo)
                                .addGap(18, 18, 18)
                                .addComponent(jRInativo))
                            .addComponent(jLabel3))
                        .addGap(57, 57, 57))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(btnNovo)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(btnEditar)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(TxtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(29, 29, 29)
                                        .addComponent(jLabel5))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jRSim)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jRNao)))))
                        .addContainerGap(22, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel12))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TxtCod, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(TxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(35, 35, 35))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtCod, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(jLabel8)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(TxtEmail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                            .addComponent(TxtCelular, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jRSim)
                                .addComponent(jRNao))))
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jRInativo)
                                .addComponent(jRAtivo)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(TextCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TxtRg, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnNovo)
                            .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCancelar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSair)
                            .addComponent(btnEditar)
                            .addComponent(btnExcluir))))
                .addGap(22, 22, 22))
        );

        setBounds(320, 20, 868, 457);
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed

        acao = 1;
        novo();

    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed

        acao = 2;
        editar();
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
     
        if (jRAtivo.isSelected()) {
            status = 1;
        }
        if (jRInativo.isSelected()) {
            status = 0;
        }

        int cod;

        objclientes = new Clientes();
        preencher_objetos();

        try {

            IEDAO = new IncluirEditarDAO();

            //açao =1 sera para Incluir um novo registro.
            if (acao == 1) {
                cod = IEDAO.Incluir(objclientes);
                TxtCod.setText(String.valueOf(cod));
                JOptionPane.showMessageDialog(this, "Salvo com sucesso!");
                salvar();
            }

            if (acao == 2) {
                objclientes.setDad_id(Integer.parseInt(TxtCod.getText()));
                if (IEDAO.Editar(objclientes)) {
                    JOptionPane.showMessageDialog(this, "Alterado com sucesso!");
                    salvar();
                }
            }

        } catch (SQLException error) {
            System.out.println("Errro: " + error);
            JOptionPane.showMessageDialog(this, "Operação não realizada " + error.getMessage());

        }

    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed

        if(TxtCod.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Digite o codigo !" );
        }else{
            int codigo = Integer.parseInt(TxtCod.getText());
            
            EXDAO = new ExcluirDAO();
            
            try{
                if(JOptionPane.showConfirmDialog(this,"Confirma a Exclução !", "Confimação",
                        JOptionPane.YES_NO_CANCEL_OPTION) == JOptionPane.YES_NO_OPTION){
                    
                    if(EXDAO.Excluir(codigo)){
                    JOptionPane.showMessageDialog(this,"Excluido com sucesso !");
                    cancelar();
                    }else{
                     JOptionPane.showMessageDialog(this,"Erro ao excluir o registro!");
                    }
                }else{
                    JOptionPane.showMessageDialog(this,"Operação cancelada !");
                    cancelar();
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(TelaCadastro.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        

    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed

        cancelar();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed

        dispose();

    }//GEN-LAST:event_btnSairActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        TelaPrincipal.cadastro = true;
        jRAtivo.setSelected(true);
    }//GEN-LAST:event_formInternalFrameOpened

    private void btnBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaActionPerformed
        objclientes = new Clientes();

        if (TxtCod.getText().equals("")) {
            //chama a tela consulta
            TelaConsulta objconsulta = new TelaConsulta();
            TelaPrincipal.jdpPrincipal.add(objconsulta);
            objconsulta.setVisible(true);
            TelaPrincipal.jdpPrincipal.setComponentZOrder(objconsulta, 0);
        } else {
            objclientes.setDad_id(Integer.parseInt(TxtCod.getText()));

            PESDAO = new PesquisaDAO();

            try {
                if (PESDAO.PesquisarTela(objclientes)) {

                    if ((objclientes != null)) {
                        pesquisa();

                    }
                }
            } catch (Exception erro) {
                System.out.println("Erro: " + erro);
                JOptionPane.showMessageDialog(this, "Erro ao pesquisar !" + erro.getMessage());
            }

        }
    }//GEN-LAST:event_btnBuscaActionPerformed

    private void TxtSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtSexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtSexoActionPerformed
   
    
    public static void recebeid(Clientes objclientes){
        TxtCod.setText(String.valueOf(objclientes.getDad_id()));
        TxtCod.requestFocus();
    }
 
    public void pesquisa() {
        TxtNome.setText(objclientes.getDad_nome().trim());
        jtDate.setDate(objclientes.getDad_data());
        TxtEmail.setText(objclientes.getDad_email().trim());
        TxtCelular.setText(objclientes.getDad_celular().trim());
        TextCpf.setText(objclientes.getDad_cpf().trim());
        TxtRg.setText(objclientes.getDad_rg().trim());
        TxtSexo.setText(objclientes.getDad_sexo());
        TxtEndereco.setText(objclientes.getDad_endereco().trim());
        jRSim.setSelected(true);
        jRNao.setSelected(true);
       

        // status = obj.setDad_id();
        if (status == 1) {
            jRAtivo.setSelected(true);
        }
        if (status == 0) {
            jRInativo.setSelected(true);
        }

        btnEditar.setEnabled(true);
    }

    public void preencher_objetos() {
        objclientes.setDad_nome(TxtNome.getText());
        objclientes.setDad_data(new java.sql.Date(jtDate.getDate().getTime()));
        objclientes.setDad_email(TxtEmail.getText());
        objclientes.setDad_celular(TxtCelular.getText());
        objclientes.setDad_situacao(bgSituacao.getSelection().getActionCommand());
        objclientes.setDad_whatsapp(bgWhatsapp.getSelection().getActionCommand());
        objclientes.setDad_cpf(TextCpf.getText());
        objclientes.setDad_rg(TxtRg.getText());
        objclientes.setDad_sexo(TxtSexo.getText());
        objclientes.setDad_endereco(TxtEndereco.getText());

    }

    public void salvar() {
        TxtCod.setEnabled(true);
        TxtNome.setEnabled(false);
        jtDate.setEnabled(false);
        TxtEmail.setEnabled(false);
        TxtCelular.setEnabled(false);
        TextCpf.setEnabled(false);
        TxtRg.setEnabled(false);
        TxtEndereco.setEnabled(false);
        TxtSexo.setEnabled(false);

        jRAtivo.setEnabled(false);
        jRInativo.setSelected(false);
        jRSim.setEnabled(false);
        jRNao.setEnabled(false);

        btnEditar.setEnabled(true);
        btnSalvar.setEnabled(false);
        btnExcluir.setEnabled(false);
        btnNovo.setEnabled(false);
        btnSair.setEnabled(false);
    }

    public void editar() {
        TxtCod.setEnabled(false);
        TxtNome.setEnabled(true);
        jtDate.setEnabled(true);
        TxtEmail.setEnabled(true);
        TxtCelular.setEnabled(true);
        TextCpf.setEnabled(true);
        TxtRg.setEnabled(true);
        TxtEndereco.setEnabled(true);
        TxtSexo.setEnabled(true);

        jRAtivo.setEnabled(true);
        jRInativo.setEnabled(true);
        jRSim.setEnabled(true);
        jRNao.setEnabled(true);

        btnSalvar.setEnabled(true);
        btnEditar.setEnabled(true);
        btnExcluir.setEnabled(true);
        btnNovo.setEnabled(true);
        btnSair.setEnabled(true);

    }

    public void cancelar() {
        TxtNome.setText("");
        TxtEmail.setText("");
        TxtCelular.setText("");
        TextCpf.setText("");
        TxtRg.setText("");
        TxtEndereco.setText("");
        TxtSexo.setText("");
      
        TxtCod.setEnabled(true);
        TxtNome.setEnabled(false);
        jtDate.setEnabled(false);
        TxtEmail.setEnabled(false);
        TxtCelular.setEnabled(false);
        TextCpf.setEnabled(false);
        TxtRg.setEnabled(false);
        TxtEndereco.setEnabled(false);

        btnSalvar.setEnabled(false);
        btnEditar.setEnabled(false);
        btnExcluir.setEnabled(false);
        btnNovo.setEnabled(true);
        btnSair.setEnabled(true);

        jRAtivo.setEnabled(false);
        jRInativo.setEnabled(false);
        TxtSexo.setEnabled(false);
        jRSim.setEnabled(false);
        jRNao.setEnabled(false);

    }

    public void novo() {
        TxtCod.setEnabled(false);
        TxtNome.setEnabled(true);
        jtDate.setEnabled(true);
        TxtEmail.setEnabled(true);
        TxtCelular.setEnabled(true);
        TextCpf.setEnabled(true);
        TxtRg.setEnabled(true);
        TxtEndereco.setEnabled(true);

        btnSalvar.setEnabled(true);
        btnEditar.setEnabled(true);
        btnExcluir.setEnabled(true);

        jRAtivo.setEnabled(true);
        jRInativo.setEnabled(true);
        TxtSexo.setEnabled(true);
        jRSim.setEnabled(true);
        jRNao.setEnabled(true);

        //limpar dados
        TxtNome.setText("");
        TxtEmail.setText("");
        TxtCelular.setText("");
        TextCpf.setText("");
        TxtRg.setText("");
        TxtEndereco.setText("");
        TxtSexo.setText("");

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField TextCpf;
    private javax.swing.JFormattedTextField TxtCelular;
    private static javax.swing.JTextField TxtCod;
    private javax.swing.JTextField TxtEmail;
    private javax.swing.JTextPane TxtEndereco;
    private javax.swing.JTextField TxtNome;
    private javax.swing.JFormattedTextField TxtRg;
    private javax.swing.JTextField TxtSexo;
    private javax.swing.ButtonGroup bgSituacao;
    private javax.swing.ButtonGroup bgWhatsapp;
    private javax.swing.JButton btnBusca;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRAtivo;
    private javax.swing.JRadioButton jRInativo;
    private javax.swing.JRadioButton jRNao;
    private javax.swing.JRadioButton jRSim;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser jtDate;
    // End of variables declaration//GEN-END:variables
}
