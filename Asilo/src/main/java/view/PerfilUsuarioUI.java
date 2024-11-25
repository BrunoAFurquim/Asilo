/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.UsuarioController;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import model.Usuario;

/**
 *
 * @author saraa
 */
public class PerfilUsuarioUI extends javax.swing.JFrame {

    UsuarioController controll = new UsuarioController();
    Usuario usuario;
    Color bgColor = new Color(35, 31, 31);
    Color txtColor = new Color(86, 86, 86);

    public PerfilUsuarioUI(Usuario u) {
        try {
            UIManager.setLookAndFeel("FlatLaf");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
        }

        initComponents();
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.usuario = u;
        this.txtNome.setText(usuario.getNome());
        this.txtEmail.setText(usuario.getEmail());
        this.txtTel.setText(usuario.getTelefone());
        this.txtEnd.setText(usuario.getEndereco());

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        head = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtTel = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtEnd = new javax.swing.JTextField();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane3.setViewportView(jTextArea2);

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jScrollPane4.setViewportView(jTextArea3);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(35, 31, 31));
        jPanel1.setForeground(new java.awt.Color(196, 187, 187));
        jPanel1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        head.setBackground(new java.awt.Color(196, 187, 187));
        head.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        head.setForeground(new java.awt.Color(200, 200, 200));
        head.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        head.setText("Dados Pessoais");

        jLabel2.setBackground(new java.awt.Color(196, 187, 187));
        jLabel2.setForeground(new java.awt.Color(200, 200, 200));
        jLabel2.setText("Nome");

        jLabel3.setBackground(new java.awt.Color(196, 187, 187));
        jLabel3.setForeground(new java.awt.Color(200, 200, 200));
        jLabel3.setText("E-mail");

        jLabel4.setBackground(new java.awt.Color(196, 187, 187));
        jLabel4.setForeground(new java.awt.Color(200, 200, 200));
        jLabel4.setText("Tel");

        btn.setBackground(new java.awt.Color(102, 102, 102));
        btn.setForeground(new java.awt.Color(220, 220, 200));
        btn.setText("Editar");
        btn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));
        btn.setFocusPainted(false);
        btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActionPerformed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(196, 187, 187));
        jLabel5.setForeground(new java.awt.Color(200, 200, 200));
        jLabel5.setText("Enderço");

        txtTel.setBackground(new java.awt.Color(35, 31, 31));
        txtTel.setForeground(new java.awt.Color(200, 200, 200));
        txtTel.setBorder(null);
        txtTel.setCaretColor(new java.awt.Color(196, 187, 187));
        txtTel.setDisabledTextColor(new java.awt.Color(196, 187, 187));
        txtTel.setEnabled(false);
        txtTel.setPreferredSize(new java.awt.Dimension(64, 26));

        txtEmail.setBackground(new java.awt.Color(35, 31, 31));
        txtEmail.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(200, 200, 200));
        txtEmail.setBorder(null);
        txtEmail.setCaretColor(new java.awt.Color(196, 187, 187));
        txtEmail.setDisabledTextColor(new java.awt.Color(196, 187, 187));
        txtEmail.setEnabled(false);
        txtEmail.setPreferredSize(new java.awt.Dimension(64, 26));

        txtNome.setBackground(new java.awt.Color(35, 31, 31));
        txtNome.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        txtNome.setForeground(new java.awt.Color(200, 200, 200));
        txtNome.setBorder(null);
        txtNome.setCaretColor(new java.awt.Color(196, 187, 187));
        txtNome.setDisabledTextColor(new java.awt.Color(196, 187, 187));
        txtNome.setEnabled(false);
        txtNome.setPreferredSize(new java.awt.Dimension(64, 26));

        txtEnd.setBackground(new java.awt.Color(35, 31, 31));
        txtEnd.setForeground(new java.awt.Color(200, 200, 200));
        txtEnd.setBorder(null);
        txtEnd.setCaretColor(new java.awt.Color(196, 187, 187));
        txtEnd.setDisabledTextColor(new java.awt.Color(196, 187, 187));
        txtEnd.setEnabled(false);
        txtEnd.setMinimumSize(new java.awt.Dimension(64, 26));
        txtEnd.setPreferredSize(new java.awt.Dimension(64, 26));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(head)
                        .addGap(73, 73, 73))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addGap(18, 18, 18)
                            .addComponent(txtEnd, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel3)
                                .addComponent(jLabel2))
                            .addGap(28, 28, 28)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtTel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(head)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtEnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(btn, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jMenu1.setText("Configurações");

        jMenuItem1.setText("Alterar senha");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Excluir conta");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActionPerformed

        if (this.btn.getText() == "Editar") {
            this.txtNome.setEnabled(true);
            this.txtEmail.setEnabled(true);
            this.txtTel.setEnabled(true);
            this.txtEnd.setEnabled(true);
            this.btn.setText("Salvar");
            this.txtNome.setBackground(txtColor);
            this.txtEmail.setBackground(txtColor);
            this.txtTel.setBackground(txtColor);
            this.txtEnd.setBackground(txtColor);
        } else {
            String nome = this.txtNome.getText();
            String email = this.txtEmail.getText();
            String tel = this.txtTel.getText();
            String end = this.txtEnd.getText();

            controll.atualizarUsuario(usuario.getId(), nome, email, end, tel);

            this.txtNome.setEnabled(false);
            this.txtEmail.setEnabled(false);
            this.txtTel.setEnabled(false);
            this.txtEnd.setEnabled(false);
            this.btn.setText("Editar");
            this.txtNome.setBackground(bgColor);
            this.txtEmail.setBackground(bgColor);
            this.txtTel.setBackground(bgColor);
            this.txtEnd.setBackground(bgColor);
        }
    }//GEN-LAST:event_btnActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        Object[] options = {"Confirmar", "Cancelar"};
        int excluir = JOptionPane.showOptionDialog(null, "Tem certeza disso?", "Informação", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);
        if(excluir == 0){
            this.controll.removerUsuario(this.usuario.getId());
            this.dispose();
            new LoginUI().setVisible(true);
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        AtualizarSenhaUI senhaUI = new AtualizarSenhaUI(this.usuario);
        senhaUI.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn;
    private javax.swing.JLabel head;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEnd;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtTel;
    // End of variables declaration//GEN-END:variables
}