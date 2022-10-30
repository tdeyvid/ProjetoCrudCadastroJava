/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Connection.ModuloConexao;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Deyvid
 */
public class TelaPrincipal extends javax.swing.JFrame {
    
    public static boolean cadastro;
    public static boolean consulta;
    public static boolean listagem;
    
    Connection conexao = null;

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        initComponents();
        
        conexao = ModuloConexao.conector();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jdpPrincipal = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jLHora = new javax.swing.JLabel();
        jLData = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMCadastro = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMConsulta = new javax.swing.JMenuItem();
        jMListagem = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        RelatorioClientes = new javax.swing.JMenuItem();
        jMAjuda = new javax.swing.JMenu();
        jMSobre = new javax.swing.JMenuItem();
        jMOpcoes = new javax.swing.JMenu();
        jMSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Clientes");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        javax.swing.GroupLayout jdpPrincipalLayout = new javax.swing.GroupLayout(jdpPrincipal);
        jdpPrincipal.setLayout(jdpPrincipalLayout);
        jdpPrincipalLayout.setHorizontalGroup(
            jdpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 860, Short.MAX_VALUE)
        );
        jdpPrincipalLayout.setVerticalGroup(
            jdpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 496, Short.MAX_VALUE)
        );

        jLHora.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLHora.setForeground(new java.awt.Color(0, 102, 255));
        jLHora.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLHora.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLData.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLData.setForeground(new java.awt.Color(0, 102, 255));
        jLData.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLData.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLData, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLHora, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLData, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLHora, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jMenu1.setText("Cadastro");

        jMCadastro.setText("Cadastro de Clientes");
        jMCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMCadastroActionPerformed(evt);
            }
        });
        jMenu1.add(jMCadastro);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Consulta");

        jMConsulta.setText("Consulta de Clientes");
        jMConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMConsultaActionPerformed(evt);
            }
        });
        jMenu2.add(jMConsulta);

        jMListagem.setText("Listagem de Clientes");
        jMListagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMListagemActionPerformed(evt);
            }
        });
        jMenu2.add(jMListagem);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Relatório");

        RelatorioClientes.setText("Clientes");
        RelatorioClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RelatorioClientesActionPerformed(evt);
            }
        });
        jMenu3.add(RelatorioClientes);

        jMenuBar1.add(jMenu3);

        jMAjuda.setText("Ajuda");
        jMAjuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMAjudaActionPerformed(evt);
            }
        });

        jMSobre.setText("Sobre");
        jMSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMSobreActionPerformed(evt);
            }
        });
        jMAjuda.add(jMSobre);

        jMenuBar1.add(jMAjuda);

        jMOpcoes.setText("Opções");
        jMOpcoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMOpcoesActionPerformed(evt);
            }
        });

        jMSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F14, java.awt.event.InputEvent.ALT_MASK));
        jMSair.setText("Sair");
        jMSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMSairActionPerformed(evt);
            }
        });
        jMOpcoes.add(jMSair);

        jMenuBar1.add(jMOpcoes);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpPrincipal)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jdpPrincipal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        setBounds(0, 0, 876, 587);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.setExtendedState(MAXIMIZED_BOTH);
        TelaPrincipal.cadastro = false;
        TelaPrincipal.consulta = false;
        TelaPrincipal.listagem = false;
        
        //DATA
        //Date dataSistema = new Date();
        java.util.Date dataSistema = new java.util.Date();
        SimpleDateFormat formato = new SimpleDateFormat ("dd/MM/yyyy");
        jLData.setText(formato.format(dataSistema));
        
        //HORA
        Timer timer = new Timer(1000, new hora());
        timer.start();
        
        
    }//GEN-LAST:event_formWindowOpened

    private void jMCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMCadastroActionPerformed
        if(cadastro == false){
            TelaCadastro obj = new TelaCadastro();
            jdpPrincipal.add(obj);
            obj.setVisible(true);
        }
    }//GEN-LAST:event_jMCadastroActionPerformed

    private void jMConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMConsultaActionPerformed
        if(consulta == false){
            TelaConsulta obj = new TelaConsulta();
            jdpPrincipal.add(obj);
            obj.setVisible(true);
        }
    }//GEN-LAST:event_jMConsultaActionPerformed

    private void jMListagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMListagemActionPerformed
         if(listagem == false){
            TelaListagem obj = new TelaListagem();
            jdpPrincipal.add(obj);
            obj.setVisible(true);
        }
    }//GEN-LAST:event_jMListagemActionPerformed

    private void jMOpcoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMOpcoesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMOpcoesActionPerformed

    private void jMSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMSairActionPerformed
        int sair = JOptionPane.showConfirmDialog(null, "Tem certez que deseja sair?","Atenção",JOptionPane.YES_NO_OPTION);
        if(sair == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_jMSairActionPerformed

    private void jMAjudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMAjudaActionPerformed
      
    }//GEN-LAST:event_jMAjudaActionPerformed

    private void jMSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMSobreActionPerformed
         TelaSobre sobre= new TelaSobre();
         jdpPrincipal.add(sobre);
         sobre.setVisible(true);
         
    }//GEN-LAST:event_jMSobreActionPerformed

    private void RelatorioClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RelatorioClientesActionPerformed
        // gerando o relatório completo
        int confirmar = JOptionPane.showConfirmDialog(null,"Confirma a impressaão?" ,"Atenção", JOptionPane.YES_OPTION);
        if (confirmar == JOptionPane.YES_OPTION){
            //imprime o relatorio
            try{
                JasperPrint print = JasperFillManager.fillReport("C:/Users/Deyvid/Documents/FIC/2022.1/"
                        + "/Programação II/ProjetoCrudCadastro/src/Report/clientes.jasper", null,conexao);
                JasperViewer.viewReport(print, false);
            }catch(Exception erro){
                JOptionPane.showInputDialog(null, erro);
            }
        }
        
        
        
    }//GEN-LAST:event_RelatorioClientesActionPerformed

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
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    class hora implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            Calendar now = Calendar.getInstance();
            jLHora.setText(String.format("%1$tH:%1$tM:%1$tS", now));
        }
        
    }
   
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem RelatorioClientes;
    private javax.swing.JLabel jLData;
    private javax.swing.JLabel jLHora;
    private javax.swing.JMenu jMAjuda;
    private javax.swing.JMenuItem jMCadastro;
    private javax.swing.JMenuItem jMConsulta;
    private javax.swing.JMenuItem jMListagem;
    private javax.swing.JMenu jMOpcoes;
    private javax.swing.JMenuItem jMSair;
    private javax.swing.JMenuItem jMSobre;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JDesktopPane jdpPrincipal;
    // End of variables declaration//GEN-END:variables
}
