
package com.addktabxanastudent.frame;

import com.addkitabxanastudent.model.UnivercityWorker;
import com.addktabxanastudent.dboperation.DBOperation;
import javax.swing.table.DefaultTableModel;


public class AddKitabxanaWorker extends javax.swing.JFrame {

    
    DBOperation db = new DBOperation();

    public AddKitabxanaWorker() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmbDay = new javax.swing.JComboBox();
        tfMobilPhone = new javax.swing.JTextField();
        cmbMonth = new javax.swing.JComboBox();
        tfFatherName = new javax.swing.JTextField();
        tfYear = new javax.swing.JTextField();
        tfWorkerCode = new javax.swing.JTextField();
        tfName = new javax.swing.JTextField();
        btnDeleteWorker = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbWorker = new javax.swing.JTable();
        lblName1 = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblSurname = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnAddWorker = new javax.swing.JButton();
        tfSurname = new javax.swing.JTextField();
        tfWorkerId = new javax.swing.JTextField();
        lblFatherName = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        tfEpoct = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        tfPassword = new javax.swing.JTextField();
        lblAge1 = new javax.swing.JLabel();
        lblMainMenu = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        cmbDay.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Gün", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        tfMobilPhone.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        cmbMonth.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ay", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));

        tfFatherName.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        tfWorkerCode.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        tfName.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        btnDeleteWorker.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnDeleteWorker.setText("Silmək");
        btnDeleteWorker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteWorkerActionPerformed(evt);
            }
        });

        tbWorker.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "İD", "Ad", "Soyad", "Ata adı", "Yaş", "İşçi nömrəsi", "Kod", "E-poçt", "Mobil nömrə"
            }
        ));
        tbWorker.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tbWorker.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbWorkerMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbWorker);

        lblName1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblName1.setText("Yaş :");

        lblAge.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblAge.setText("İşçi nömrəsi :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Mobil nömrə :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("E-poçt :");

        lblSurname.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblSurname.setText("Soyadı :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("ID :");

        btnAddWorker.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnAddWorker.setText("İşçi əlavə et");
        btnAddWorker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddWorkerActionPerformed(evt);
            }
        });

        tfSurname.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        lblFatherName.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblFatherName.setText("Ata adı :");

        lblName.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblName.setText("Adı :");

        tfEpoct.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Kitabxanaya işçi əlavə edin");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Azərbaycan Dövlət Neft Akademiyası");

        tfPassword.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        lblAge1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblAge1.setText("Kod :");

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
            .addGroup(layout.createSequentialGroup()
                .addGap(234, 234, 234)
                .addComponent(btnAddWorker)
                .addGap(85, 85, 85)
                .addComponent(btnDeleteWorker, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(lblMainMenu)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(290, 290, 290))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblName1)
                            .addComponent(lblAge)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(lblFatherName)
                            .addComponent(lblSurname)
                            .addComponent(lblName)
                            .addComponent(lblAge1))
                        .addGap(72, 72, 72)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfSurname, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfFatherName, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfWorkerCode, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cmbDay, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cmbMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfYear, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tfEpoct, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfMobilPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfWorkerId, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cmbDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cmbMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tfYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblName1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfWorkerCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAge))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAge1)
                            .addComponent(tfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfEpoct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfMobilPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfWorkerId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddWorker)
                    .addComponent(btnDeleteWorker)
                    .addComponent(lblMainMenu))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteWorkerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteWorkerActionPerformed
        UnivercityWorker worker = new UnivercityWorker();
        worker.setId(Integer.parseInt(tfWorkerId.getText()));
        db.deleteWorkerByID(worker);

        DefaultTableModel tableModel = (DefaultTableModel) tbWorker.getModel();
        tableModel.setRowCount(0);
        formWindowOpened(null);

        tfName.setText("");
        tfEpoct.setText("");
        tfFatherName.setText("");
        tfMobilPhone.setText("");
        tfPassword.setText("");
        tfWorkerId.setText("");
        tfSurname.setText("");
        tfWorkerCode.setText("");
        tfYear.setText("");
        cmbDay.setSelectedItem("");
        cmbMonth.setSelectedItem("");

    }//GEN-LAST:event_btnDeleteWorkerActionPerformed

    private void tbWorkerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbWorkerMouseClicked
        int rowNum = tbWorker.getSelectedRow();
        tfWorkerId.setText(tbWorker.getValueAt(rowNum, 0).toString());
        tfName.setText(tbWorker.getValueAt(rowNum, 1).toString());
        tfSurname.setText(tbWorker.getValueAt(rowNum, 2).toString());
        tfFatherName.setText(tbWorker.getValueAt(rowNum, 3).toString());
        tfWorkerCode.setText(tbWorker.getValueAt(rowNum, 5).toString());
        tfPassword.setText(tbWorker.getValueAt(rowNum, 6).toString());
        tfEpoct.setText(tbWorker.getValueAt(rowNum, 7).toString());
        tfMobilPhone.setText(tbWorker.getValueAt(rowNum, 8).toString());

    }//GEN-LAST:event_tbWorkerMouseClicked

    private void btnAddWorkerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddWorkerActionPerformed

        UnivercityWorker worker = new UnivercityWorker();
        worker.setName(tfName.getText());
        worker.setSurname(tfSurname.getText());
        worker.setFatherName(tfFatherName.getText());
        worker.setePoct(tfEpoct.getText());
        worker.setMobuilNumber(tfMobilPhone.getText());
        worker.setWorkerCode(tfWorkerCode.getText());
        worker.setPassword(tfPassword.getText());
        worker.setAge(cmbDay.getSelectedItem() + "/" + cmbMonth.getSelectedItem() + "/" + tfYear.getText());
        db.insertWorker(worker);

        DefaultTableModel tableModel = (DefaultTableModel) tbWorker.getModel();
        tableModel.setRowCount(0);
        formWindowOpened(null);

        tfName.setText("");
        tfEpoct.setText("");
        tfFatherName.setText("");
        tfMobilPhone.setText("");
        tfWorkerId.setText("");
        tfPassword.setText("");
        tfSurname.setText("");
        tfWorkerCode.setText("");
        tfYear.setText("");

    }//GEN-LAST:event_btnAddWorkerActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        DefaultTableModel tableModel = (DefaultTableModel) tbWorker.getModel();
        for (UnivercityWorker uw: db.allUnivercityWorker()) {
            tableModel.addRow(new Object[]{uw.getId(),uw.getName(),uw.getSurname(),uw.getFatherName(),uw.getAge(),uw.getWorkerCode(),uw.getPassword(),uw.getePoct(),uw.getMobuilNumber()});
            
        }
    }//GEN-LAST:event_formWindowOpened

    private void lblMainMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMainMenuMouseClicked
        new StartPage().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lblMainMenuMouseClicked

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
            java.util.logging.Logger.getLogger(AddKitabxanaWorker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddKitabxanaWorker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddKitabxanaWorker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddKitabxanaWorker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddKitabxanaWorker().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddWorker;
    private javax.swing.JButton btnDeleteWorker;
    private javax.swing.JComboBox cmbDay;
    private javax.swing.JComboBox cmbMonth;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblAge1;
    private javax.swing.JLabel lblFatherName;
    private javax.swing.JLabel lblMainMenu;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblName1;
    private javax.swing.JLabel lblSurname;
    private javax.swing.JTable tbWorker;
    private javax.swing.JTextField tfEpoct;
    private javax.swing.JTextField tfFatherName;
    private javax.swing.JTextField tfMobilPhone;
    private javax.swing.JTextField tfName;
    private javax.swing.JTextField tfPassword;
    private javax.swing.JTextField tfSurname;
    private javax.swing.JTextField tfWorkerCode;
    private javax.swing.JTextField tfWorkerId;
    private javax.swing.JTextField tfYear;
    // End of variables declaration//GEN-END:variables
}
