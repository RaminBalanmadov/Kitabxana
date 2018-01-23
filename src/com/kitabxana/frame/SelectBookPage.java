/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kitabxana.frame;

import javax.swing.SpringLayout;
import javax.swing.table.DefaultTableModel;
import com.kitabxana.model.AddKitabxana;
import com.kitabxana.model.BookSort;
import com.kitabxana.dboperation.DBOperation;
import com.kitabxana.model.LoginStudent;
import com.kitabxana.model.NowLoginStudent;
import com.kitabxana.model.UnivercityStudent;

/**
 *
 * @author Ramin
 */
public class SelectBookPage extends javax.swing.JFrame {

    /**
     * Creates new form SelectBookPage
     */
    DBOperation db = new DBOperation();

    private String bookSortName;

    private String bookName;

    private String name;
    private String surname;
    private String tbSeriaNumber;

    public SelectBookPage(String bookSortName,String name, String surname, String tbSeriaNumber) {
        initComponents();
        this.name = name;
        this.surname = surname;
        this.tbSeriaNumber = tbSeriaNumber;
        this.bookSortName = bookSortName;
    }

    public SelectBookPage() {
        initComponents();
    }

    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbYazici = new javax.swing.JTable();
        tfSeeBook = new javax.swing.JTextField();
        btnSeeBook = new javax.swing.JButton();
        lblMainMenu = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblBookSortName = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        taBookAbout = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        lblBooksPage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        tbYazici.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Yazıçının adı", "Kitabın adı"
            }
        ));
        tbYazici.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tbYazici.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbYaziciMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbYazici);

        btnSeeBook.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSeeBook.setText("Kitabın yeri");
        btnSeeBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeeBookActionPerformed(evt);
            }
        });

        lblMainMenu.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblMainMenu.setText("Ana səhifə");
        lblMainMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMainMenuMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Azərbaycan Dövlət Neft Akademiyası");

        lblBookSortName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        taBookAbout.setColumns(20);
        taBookAbout.setLineWrap(true);
        taBookAbout.setRows(5);
        jScrollPane2.setViewportView(taBookAbout);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Kitab haqqında məlumat");

        lblBooksPage.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblBooksPage.setText("Kitablar");
        lblBooksPage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBooksPageMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tfSeeBook, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(btnSeeBook)
                        .addGap(18, 18, 18)
                        .addComponent(lblMainMenu))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(24, 24, 24))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(94, 94, 94)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblBookSortName, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(146, 146, 146))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblBooksPage, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblBooksPage)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblBookSortName, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfSeeBook, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSeeBook)
                    .addComponent(lblMainMenu))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSeeBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeeBookActionPerformed

        int rowNum = tbYazici.getSelectedRow();
        bookName = (tbYazici.getValueAt(rowNum, 0).toString());
        tfSeeBook.setText(tbYazici.getValueAt(rowNum, 1).toString());
        
        new BookPlacePage(tfSeeBook.getText(), bookName,name, surname, tbSeriaNumber).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnSeeBookActionPerformed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked

    }//GEN-LAST:event_formMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        lblBookSortName.setText(bookSortName);

        DefaultTableModel tableModel = (DefaultTableModel) tbYazici.getModel();

        for (AddKitabxana ak : db.allBook()) {
            if (ak.getBookSort().equalsIgnoreCase(lblBookSortName.getText())) {

                tableModel.addRow(new Object[]{ak.getYaziciName(), ak.getBookName()});

            }
            

        }

    }//GEN-LAST:event_formWindowOpened

    private void tbYaziciMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbYaziciMouseClicked
        int rowNum = tbYazici.getSelectedRow();
        tfSeeBook.setText(tbYazici.getValueAt(rowNum, 1).toString());
        DefaultTableModel tableModel = (DefaultTableModel) tbYazici.getModel();

        for (AddKitabxana ak : db.allBook()) {
            if (ak.getBookName().equalsIgnoreCase(tfSeeBook.getText())) {

                taBookAbout.setText(ak.getBookAbout());
            }

        }

    }//GEN-LAST:event_tbYaziciMouseClicked

    private void lblBooksPageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBooksPageMouseClicked
        new BooksPage().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lblBooksPageMouseClicked

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
            java.util.logging.Logger.getLogger(SelectBookPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SelectBookPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SelectBookPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SelectBookPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SelectBookPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSeeBook;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblBookSortName;
    private javax.swing.JLabel lblBooksPage;
    private javax.swing.JLabel lblMainMenu;
    private javax.swing.JTextArea taBookAbout;
    private javax.swing.JTable tbYazici;
    private javax.swing.JTextField tfSeeBook;
    // End of variables declaration//GEN-END:variables
}
