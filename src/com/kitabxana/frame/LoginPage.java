package com.kitabxana.frame;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import com.kitabxana.dboperation.DBOperation;
import com.kitabxana.model.Login;
import com.kitabxana.model.LoginStudent;
import com.kitabxana.model.NowLoginStudent;
import com.kitabxana.model.SignIn;
import com.kitabxana.model.UnivercityStudent;

/**
 *
 * @author Ramin
 */
public class LoginPage extends javax.swing.JFrame {

    DBOperation db = new DBOperation();

    public LoginPage() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblSurname = new javax.swing.JLabel();
        lblFatherName = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        tfName = new javax.swing.JTextField();
        tfSurname = new javax.swing.JTextField();
        tfFatherName = new javax.swing.JTextField();
        cmbDay = new javax.swing.JComboBox();
        cmbMonth = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfTBSeriaNumber = new javax.swing.JTextField();
        btnLogin = new javax.swing.JButton();
        lblMainMenu = new javax.swing.JLabel();
        tfYear = new javax.swing.JTextField();
        lblMessage = new javax.swing.JLabel();
        tfPassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Azərbaycan Dövlət Neft Akademiyası");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Kitabxanada qeydiyyatdan keç");

        lblName.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblName.setText("Ad :");

        lblSurname.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblSurname.setText("Soyad :");

        lblFatherName.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblFatherName.setText("Ata adı :");

        lblAge.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblAge.setText("Yaş :");

        tfName.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        tfSurname.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        tfFatherName.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        cmbDay.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Gün", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        cmbMonth.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ay", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("TB seria nömrəsi :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Kod :");

        tfTBSeriaNumber.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        btnLogin.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnLogin.setText("Qeydiyyatdan keç");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        lblMainMenu.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblMainMenu.setText("Ana səhifə");
        lblMainMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMainMenuMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnLogin)
                        .addGap(48, 48, 48)
                        .addComponent(lblMainMenu)))
                .addGap(55, 55, 55))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblName)
                            .addComponent(lblFatherName)
                            .addComponent(lblSurname)
                            .addComponent(lblAge)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(tfPassword, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfTBSeriaNumber, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfName, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(cmbDay, 0, 59, Short.MAX_VALUE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cmbMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tfYear, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(2, 2, 2))
                                .addComponent(tfSurname, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfFatherName, javax.swing.GroupLayout.Alignment.LEADING))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSurname)
                    .addComponent(tfSurname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFatherName)
                    .addComponent(tfFatherName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAge)
                    .addComponent(cmbDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfTBSeriaNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(tfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogin)
                    .addComponent(lblMainMenu))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(lblMessage)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblMainMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMainMenuMouseClicked
        new StartPage().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lblMainMenuMouseClicked

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        LoginStudent ls = new LoginStudent();
        SignIn signIn = new SignIn();
        String text = "";
        String textStudent = "";
        for (LoginStudent student : db.allLoginStudets()) {

            if (tfName.getText().equalsIgnoreCase(student.getName())
                    && tfSurname.getText().equalsIgnoreCase(student.getSurname())
                    && tfTBSeriaNumber.getText().equalsIgnoreCase(student.getTbSeriaNumber())
                    && tfFatherName.getText().equalsIgnoreCase(student.getFatherName())) {

                textStudent = tfName.getText();
            }
        }
        for (UnivercityStudent student : db.allUnivercityStudent()) {

            if (!(textStudent.equalsIgnoreCase(""))) {
                JOptionPane.showMessageDialog(this, tfName.getText() + " " + tfSurname.getText() + " adında tələbə artıq qeydiyyatdan keçib!");
                break;
            }
            if (tfName.getText().equalsIgnoreCase(student.getName())
                    && tfSurname.getText().equalsIgnoreCase(student.getSurname())
                    && tfTBSeriaNumber.getText().equalsIgnoreCase(student.getTbSeriaNumber())
                    && tfFatherName.getText().equalsIgnoreCase(student.getFatherName())) {

                ls.setName(tfName.getText());
                ls.setSurname(tfSurname.getText());
                ls.setFatherName(tfFatherName.getText());
                ls.setAge(cmbDay.getSelectedItem() + "/" + cmbMonth.getSelectedItem() + "/" + tfYear.getText());
                ls.setTbSeriaNumber(tfTBSeriaNumber.getText());
                ls.setPassword(tfPassword.getText());
                

                db.insertLoginStudents(ls);

                new BooksPage(tfName.getText(), tfSurname.getText(), tfTBSeriaNumber.getText());;
                this.setVisible(false);
                text = tfName.getText();
            }

        }
        if (text.equals("")) {

            JOptionPane.showMessageDialog(this, tfName.getText() + " " + tfSurname.getText() + " adında tələbə universtetdə qeydiyyatda deyil!");

        }

        Login login = new Login();
        login.setName(tfName.getText());
        login.setSurname(tfSurname.getText());
        login.setTbSeriaNumber(tfTBSeriaNumber.getText());

        tfName.setText("");
        tfSurname.setText("");
        tfFatherName.setText("");
        tfSurname.setText("");
        tfTBSeriaNumber.setText("");
        tfYear.setText("");
        tfPassword.setText("");
    }//GEN-LAST:event_btnLoginActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JComboBox cmbDay;
    private javax.swing.JComboBox cmbMonth;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblFatherName;
    private javax.swing.JLabel lblMainMenu;
    private javax.swing.JLabel lblMessage;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblSurname;
    private javax.swing.JTextField tfFatherName;
    private javax.swing.JTextField tfName;
    private javax.swing.JPasswordField tfPassword;
    private javax.swing.JTextField tfSurname;
    private javax.swing.JTextField tfTBSeriaNumber;
    private javax.swing.JTextField tfYear;
    // End of variables declaration//GEN-END:variables
}
