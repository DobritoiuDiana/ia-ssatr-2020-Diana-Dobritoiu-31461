import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DoubleD
 */
public class signupForm extends javax.swing.JFrame {

    /**
     * Creates new form signupForm
     */
    String imagePht = null;
    public signupForm() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldUsername = new javax.swing.JTextField();
        jPasswordFieldPassword = new javax.swing.JPasswordField();
        jCheckBoxShowPass = new javax.swing.JCheckBox();
        jButtonCancel = new javax.swing.JButton();
        jButtonLogin1 = new javax.swing.JButton();
        jLabelCreateAccount = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabelClose = new javax.swing.JLabel();
        jLabelMin = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldPrenume = new javax.swing.JTextField();
        jPasswordFieldPassword1 = new javax.swing.JPasswordField();
        jButtonCancel1 = new javax.swing.JButton();
        jButtonCreare = new javax.swing.JButton();
        jLabelCreateAccount1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldNume = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldUsername3 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jPasswordFieldPassword2 = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        jLabelFoto = new javax.swing.JLabel();
        jButtonAlegeFisier = new javax.swing.JButton();

        jPanel2.setBackground(new java.awt.Color(44, 62, 80));
        jPanel2.setPreferredSize(new java.awt.Dimension(436, 240));
        jPanel2.setLayout(null);

        jLabel1.setBackground(new java.awt.Color(236, 240, 241));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(236, 240, 241));
        jLabel1.setText("Parola:");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(40, 130, 70, 30);

        jLabel2.setBackground(new java.awt.Color(236, 240, 241));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(236, 240, 241));
        jLabel2.setText("Username:");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(10, 70, 100, 30);

        jTextFieldUsername.setBackground(new java.awt.Color(108, 122, 137));
        jTextFieldUsername.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextFieldUsername.setForeground(new java.awt.Color(253, 227, 167));
        jTextFieldUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUsernameActionPerformed(evt);
            }
        });
        jPanel2.add(jTextFieldUsername);
        jTextFieldUsername.setBounds(120, 70, 220, 30);

        jPasswordFieldPassword.setBackground(new java.awt.Color(108, 122, 137));
        jPasswordFieldPassword.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPasswordFieldPassword.setForeground(new java.awt.Color(253, 227, 167));
        jPanel2.add(jPasswordFieldPassword);
        jPasswordFieldPassword.setBounds(120, 130, 220, 30);

        jCheckBoxShowPass.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBoxShowPass.setText("Arată parola");
        jCheckBoxShowPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxShowPassActionPerformed(evt);
            }
        });
        jPanel2.add(jCheckBoxShowPass);
        jCheckBoxShowPass.setBounds(360, 130, 110, 30);

        jButtonCancel.setBackground(new java.awt.Color(242, 38, 19));
        jButtonCancel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonCancel.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCancel.setText("Renunță");
        jPanel2.add(jButtonCancel);
        jButtonCancel.setBounds(80, 180, 120, 40);

        jButtonLogin1.setBackground(new java.awt.Color(30, 139, 195));
        jButtonLogin1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonLogin1.setForeground(new java.awt.Color(255, 255, 255));
        jButtonLogin1.setText("Logare");
        jPanel2.add(jButtonLogin1);
        jButtonLogin1.setBounds(270, 180, 120, 40);

        jLabelCreateAccount.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabelCreateAccount.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCreateAccount.setText("Nou user? Click aici pentru a-ți crea cont");
        jLabelCreateAccount.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelCreateAccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCreateAccountMouseClicked(evt);
            }
        });
        jPanel2.add(jLabelCreateAccount);
        jLabelCreateAccount.setBounds(120, 230, 240, 20);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(46, 204, 113));

        jLabelClose.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelClose.setForeground(new java.awt.Color(255, 255, 255));
        jLabelClose.setText("X");
        jLabelClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCloseMouseClicked(evt);
            }
        });

        jLabelMin.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelMin.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMin.setText("_");
        jLabelMin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelMin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMinMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Creare cont nou");

        jPanel3.setBackground(new java.awt.Color(44, 62, 80));
        jPanel3.setPreferredSize(new java.awt.Dimension(436, 240));

        jLabel4.setBackground(new java.awt.Color(236, 240, 241));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(236, 240, 241));
        jLabel4.setText("Parola:");

        jLabel5.setBackground(new java.awt.Color(236, 240, 241));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(236, 240, 241));
        jLabel5.setText("Prenume:");

        jTextFieldPrenume.setBackground(new java.awt.Color(108, 122, 137));
        jTextFieldPrenume.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextFieldPrenume.setForeground(new java.awt.Color(253, 227, 167));

        jPasswordFieldPassword1.setBackground(new java.awt.Color(108, 122, 137));
        jPasswordFieldPassword1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPasswordFieldPassword1.setForeground(new java.awt.Color(253, 227, 167));

        jButtonCancel1.setBackground(new java.awt.Color(242, 38, 19));
        jButtonCancel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonCancel1.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCancel1.setText("Renunță");
        jButtonCancel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancel1ActionPerformed(evt);
            }
        });

        jButtonCreare.setBackground(new java.awt.Color(30, 139, 195));
        jButtonCreare.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonCreare.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCreare.setText("Creare cont");
        jButtonCreare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCreareActionPerformed(evt);
            }
        });

        jLabelCreateAccount1.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabelCreateAccount1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCreateAccount1.setText("Ai deja un cont? Click aici pentru a te loga");
        jLabelCreateAccount1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelCreateAccount1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCreateAccount1MouseClicked(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(236, 240, 241));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(236, 240, 241));
        jLabel6.setText("Nume:");

        jTextFieldNume.setBackground(new java.awt.Color(108, 122, 137));
        jTextFieldNume.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextFieldNume.setForeground(new java.awt.Color(253, 227, 167));

        jLabel7.setBackground(new java.awt.Color(236, 240, 241));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(236, 240, 241));
        jLabel7.setText("Username:");

        jTextFieldUsername3.setBackground(new java.awt.Color(108, 122, 137));
        jTextFieldUsername3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextFieldUsername3.setForeground(new java.awt.Color(253, 227, 167));

        jLabel8.setBackground(new java.awt.Color(236, 240, 241));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(236, 240, 241));
        jLabel8.setText("Fotografie:");

        jPasswordFieldPassword2.setBackground(new java.awt.Color(108, 122, 137));
        jPasswordFieldPassword2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPasswordFieldPassword2.setForeground(new java.awt.Color(253, 227, 167));

        jLabel9.setBackground(new java.awt.Color(236, 240, 241));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(236, 240, 241));
        jLabel9.setText("Confirmă Parola:");

        jLabelFoto.setBackground(new java.awt.Color(108, 122, 137));
        jLabelFoto.setOpaque(true);

        jButtonAlegeFisier.setBackground(new java.awt.Color(255, 255, 255));
        jButtonAlegeFisier.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonAlegeFisier.setText("Alege fișier");
        jButtonAlegeFisier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlegeFisierActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelCreateAccount1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(157, 157, 157))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(jButtonCancel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(jButtonCreare))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jTextFieldNume, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel5)
                        .addGap(10, 10, 10)
                        .addComponent(jTextFieldPrenume, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jTextFieldUsername3, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jPasswordFieldPassword1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jPasswordFieldPassword2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabelFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jButtonAlegeFisier, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(60, 60, 60))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNume, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldPrenume, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldUsername3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordFieldPassword1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordFieldPassword2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAlegeFisier, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCreare, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCancel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelCreateAccount1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelMin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelClose))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelClose)
                            .addComponent(jLabel3)))
                    .addComponent(jLabelMin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabelCloseMouseClicked

    private void jLabelMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabelMinMouseClicked

    private void jTextFieldUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUsernameActionPerformed

    private void jCheckBoxShowPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxShowPassActionPerformed

        if(jCheckBoxShowPass.isSelected()){
            jPasswordFieldPassword.setEchoChar((char)0);
        }
        else{
            jPasswordFieldPassword.setEchoChar('*');
        }
    }//GEN-LAST:event_jCheckBoxShowPassActionPerformed

    private void jLabelCreateAccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCreateAccountMouseClicked
        loginForm logf = new loginForm();
        logf.setVisible(true);
        logf.pack();
        logf.setLocationRelativeTo(null);
        logf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jLabelCreateAccountMouseClicked

    private void jLabelCreateAccount1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCreateAccount1MouseClicked
        loginForm logf = new loginForm();
        logf.setVisible(true);
        logf.pack();
        logf.setLocationRelativeTo(null);
        logf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jLabelCreateAccount1MouseClicked

    public boolean isUsernameExist(String un){
        
        boolean uExist = false;
        Connection con = myConnection.getConnection();
        PreparedStatement ps;
        ResultSet rs;
                
        try {
            ps =con.prepareStatement("SELECT * FROM `user` WHERE `Username` = ?");
            ps.setString(1, jTextFieldUsername3.getText());            
            rs = ps.executeQuery();
            
            if (rs.next()){
                uExist = true;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(loginForm.class.getName()).log(Level.SEVERE, null, ex);
        }            
        return  uExist;
    }
    
    
//    public ImageIcon resizePic(String picPath) {
//        ImageIcon myImg = new ImageIcon(picPath);
//        Image img = myImg.getImage().getScaledInstance(jLabelFoto.getWidth(), jLabelFoto.getHeight(), Image.SCALE_SMOOTH);
//        ImageIcon myPicture = new ImageIcon(img);
//        return myPicture;
//    }
    
    private void jButtonAlegeFisierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlegeFisierActionPerformed
      
        MyFunction mf = new MyFunction();
        imagePht = mf.incarcaFisier(jLabelFoto);
           
        
    }//GEN-LAST:event_jButtonAlegeFisierActionPerformed

    public boolean verifData(){
        // daca campurile nume, prenume, username, parola sunt goale
        if(jTextFieldNume.getText().equals("") && jTextFieldPrenume.getText().equals("")
                || jTextFieldUsername3.getText().equals("") 
                || String.valueOf(jPasswordFieldPassword1.getPassword()).equals(""))
        {
            JOptionPane.showMessageDialog(null, "Unul sau mai multe câmpuri nu au fost completate");
            return false;
        }
        // in cazul in are parolele nu corespund            
        
        else if(!String.valueOf(jPasswordFieldPassword1.getPassword()).equals(String.valueOf(jPasswordFieldPassword2.getPassword())))
        {
            JOptionPane.showMessageDialog(null, "Parolele nu corespund");
            return  false;
        }
        // daca nu a fost selectata o imagine
        else if(imagePht == null)
        {
            JOptionPane.showMessageDialog(null, "Nu ați încărcat nici o imagine");
            return false;
        }
        // daca totul e in regula vom crea contul
        else
        {
            return true; 
        }      
    }
    
    @SuppressWarnings("UseSpecificCatch")
    private void jButtonCreareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCreareActionPerformed
        
        if (verifData()){
            
        Connection con = myConnection.getConnection();
        PreparedStatement ps;
        
        try {
            ps =  con.prepareStatement("INSERT INTO `user`(`Nume`, `Prenume`, `Username`, `Parola`, `Imagine`) VALUES (?,?,?,?,?)");
            ps.setString(1, jTextFieldNume.getText());
            ps.setString(2, jTextFieldPrenume.getText());
            ps.setString(3, jTextFieldUsername3.getText());
            ps.setString(4, String.valueOf(jPasswordFieldPassword1.getPassword()));
            
            InputStream img = new FileInputStream(new File(imagePht));            
            ps.setBlob(5, img);
            
            if(isUsernameExist(jTextFieldUsername3.getText())){
                JOptionPane.showMessageDialog(null, "Username-ul există");
            }
            else{
               if (ps.executeUpdate() != 0){
                    JOptionPane.showMessageDialog(null, "Cont creat");
            }
                else{
                    JOptionPane.showMessageDialog(null, "Ceva nu a mers");
                } 
                }         
                       
        } catch (Exception ex) {
            Logger.getLogger(signupForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        }       
        
    }//GEN-LAST:event_jButtonCreareActionPerformed

    private void jButtonCancel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancel1ActionPerformed
       System.exit(0);
    }//GEN-LAST:event_jButtonCancel1ActionPerformed

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
            java.util.logging.Logger.getLogger(signupForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(signupForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(signupForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(signupForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @SuppressWarnings("override")
            public void run() {
                new signupForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAlegeFisier;
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonCancel1;
    private javax.swing.JButton jButtonCreare;
    private javax.swing.JButton jButtonLogin1;
    private javax.swing.JCheckBox jCheckBoxShowPass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelClose;
    private javax.swing.JLabel jLabelCreateAccount;
    private javax.swing.JLabel jLabelCreateAccount1;
    private javax.swing.JLabel jLabelFoto;
    private javax.swing.JLabel jLabelMin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField jPasswordFieldPassword;
    private javax.swing.JPasswordField jPasswordFieldPassword1;
    private javax.swing.JPasswordField jPasswordFieldPassword2;
    private javax.swing.JTextField jTextFieldNume;
    private javax.swing.JTextField jTextFieldPrenume;
    private javax.swing.JTextField jTextFieldUsername;
    private javax.swing.JTextField jTextFieldUsername3;
    // End of variables declaration//GEN-END:variables
}
