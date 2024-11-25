package view;

import com.google.zxing.WriterException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.RowFilter;
import javax.swing.RowSorter;
import javax.swing.table.TableRowSorter;
import model.Necessidade;
import model.util.TabelaNecessidades;
import model.Usuario;
import model.util.Cliente;
import model.util.InterfaceBancaria;
import model.util.InterfaceCliente;
import model.util.QRCode;
import model.util.ServidorBancario;

/**
 *
 * @author saraa
 */
public class UsuarioPanelUI extends javax.swing.JFrame {

    private final TabelaNecessidades tabNecessidades;
    private Usuario usuario;
    private TableRowSorter<TabelaNecessidades> rowSorter;
    private InterfaceBancaria interfaceBancaria;

    public UsuarioPanelUI(Usuario u) throws RemoteException, InterruptedException, NotBoundException, MalformedURLException {
        tabNecessidades = new TabelaNecessidades();
        rowSorter = new TableRowSorter<>(tabNecessidades);
        this.usuario = u;
        InterfaceCliente c = new Cliente();
        new ServidorBancario();
        Thread.sleep(2000);
        this.interfaceBancaria = (InterfaceBancaria)Naming.lookup("rmi://localhost/ServicoBancario");
        this.interfaceBancaria.incluirCliente(c);
        initComponents();
        setLocationRelativeTo(null);
        var qr = new QRCode();
        try {
            qr.generateQRCodeImage();
        } catch (WriterException | IOException ex) {
            Logger.getLogger(UsuarioPanelUI.class.getName()).log(Level.SEVERE, null, ex);

        }
    }
    

    private RowSorter getRowSorter(){
        return this.rowSorter;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        categoriaSelect = new javax.swing.JComboBox<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        jMenuItem3.setText("jMenuItem3");

        jMenuItem4.setText("jMenuItem4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(35, 31, 31));
        jPanel1.setForeground(new java.awt.Color(196, 187, 187));
        jPanel1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jPanel1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                jPanel1ComponentHidden(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(220, 220, 220));
        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(187, 187, 187));
        jLabel1.setText("Meta de arrecadação:  R$");

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(200, 200, 200));
        jLabel2.setText("0,00");

        jButton1.setBackground(new java.awt.Color(102, 102, 102));
        jButton1.setForeground(new java.awt.Color(200, 200, 200));
        jButton1.setText("Doar agora");
        jButton1.setOpaque(true);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable1.setModel(tabNecessidades);
        jTable1.setRowSorter(getRowSorter());
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel3.setText("Filtrar por categoria");

        categoriaSelect.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        categoriaSelect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todas", "Higiene", "Serviços manuais", "Medicamentos", "Roupas", "Itens diversos" }));
        categoriaSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoriaSelectActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addComponent(jLabel3)
                            .addGap(18, 18, 18)
                            .addComponent(categoriaSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 710, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(categoriaSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        jLabel1.getAccessibleContext().setAccessibleName("");
        categoriaSelect.getAccessibleContext().setAccessibleName("Categorias");

        jMenuBar1.setBackground(new java.awt.Color(35, 31, 31));
        jMenuBar1.setBorder(null);
        jMenuBar1.setForeground(new java.awt.Color(196, 187, 187));
        jMenuBar1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jMenuBar1.setPreferredSize(new java.awt.Dimension(156, 50));

        jMenu3.setBorder(null);
        jMenu3.setForeground(new java.awt.Color(200, 200, 200));
        jMenu3.setText("Perfil");
        jMenu3.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jMenu3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenu3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenu3.setMargin(new java.awt.Insets(30, 11, 30, 11));
        jMenu3.setMinimumSize(new java.awt.Dimension(100, 26));
        jMenu3.setPreferredSize(new java.awt.Dimension(80, 46));
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });

        jMenuItem5.setText("Ver perfil");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem5);

        jMenuBar1.add(jMenu3);

        jMenu2.setBorder(null);
        jMenu2.setForeground(new java.awt.Color(200, 200, 200));
        jMenu2.setText("Edital");
        jMenu2.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jMenu2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenu2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenu2.setMargin(new java.awt.Insets(30, 11, 30, 11));
        jMenu2.setMinimumSize(new java.awt.Dimension(100, 16));
        jMenu2.setPreferredSize(new java.awt.Dimension(100, 16));

        jMenuItem1.setBackground(new java.awt.Color(60, 60, 60));
        jMenuItem1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jMenuItem1.setForeground(new java.awt.Color(200, 200, 200));
        jMenuItem1.setText("Tranparência");
        jMenuItem1.setBorder(null);
        jMenuItem1.setPreferredSize(new java.awt.Dimension(100, 40));
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuItem2.setBackground(new java.awt.Color(60, 60, 60));
        jMenuItem2.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jMenuItem2.setForeground(new java.awt.Color(200, 200, 200));
        jMenuItem2.setText("Arrecadações");
        jMenuItem2.setBorder(null);
        jMenuItem2.setPreferredSize(new java.awt.Dimension(100, 40));
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DoacaoUI pagUI = new DoacaoUI();
        pagUI.setVisible(true);
        double valor = Math.random() * 10.0;
        String email = this.usuario.getEmail();
        String metodo = "pix";
        try {
            this.interfaceBancaria.Doar(valor, email, metodo);
        } catch (RemoteException ex) {
            Logger.getLogger(UsuarioPanelUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jPanel1ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanel1ComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1ComponentHidden

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        if (evt.getClickCount() == 2) {
            int selectedRow = jTable1.getSelectedRow();
            Necessidade n = tabNecessidades.getNecessidade(selectedRow);
            DoarNecessidadeUI doarDoarNecessidadeUI = new DoarNecessidadeUI(n);
            doarDoarNecessidadeUI.setVisible(true);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked

    }//GEN-LAST:event_jMenu3MouseClicked

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        PerfilUsuarioUI perfilUI = new PerfilUsuarioUI(this.usuario);
        perfilUI.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void categoriaSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoriaSelectActionPerformed
        String item = this.categoriaSelect.getSelectedItem().toString();
        if(item == "Todas"){
            rowSorter.setRowFilter(null);
        }
        else{
            rowSorter.setRowFilter(RowFilter.regexFilter(item, 1));
            
        }
    }//GEN-LAST:event_categoriaSelectActionPerformed

 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> categoriaSelect;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
