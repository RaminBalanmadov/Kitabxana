
package com.kitabxana.frame;

import javax.swing.table.DefaultTableModel;
import com.kitabxana.model.AddKitabxana;
import com.kitabxana.dboperation.DBOperation;

/**
 *
 * @author Ramin
 */
public class SearchBook extends javax.swing.JFrame {

    /**
     * Creates new form SearchBook
     */
    private String yaziciName = "";
    DBOperation db = new DBOperation();
    private String bookSearch;
    private String name;
    private String surname;
    private String tbSeriaNumber;

   
    public SearchBook(String bookSearch,String name, String surname, String tbSeriaNumber) {
        initComponents();
        this.name = name;
        this.surname = surname;
        this.tbSeriaNumber = tbSeriaNumber;
        this.bookSearch = bookSearch;
    }
    
    public SearchBook() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbSearchResault = new javax.swing.JTable();
        lblSearchResault = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnSelectBook = new javax.swing.JButton();
        tfBookName = new javax.swing.JTextField();
        lblMainMenu = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        taBookAbout = new javax.swing.JTextArea();
        lblBooksPage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        tbSearchResault.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tbSearchResault.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Yazıçının adı", "kitabın adı"
            }
        ));
        tbSearchResault.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbSearchResaultMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbSearchResault);

        lblSearchResault.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Azərbaycan Dövlət Neft Akademiyası");

        btnSelectBook.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSelectBook.setText("Seç");
        btnSelectBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectBookActionPerformed(evt);
            }
        });

        tfBookName.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        lblMainMenu.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblMainMenu.setText("Ana səhifə");
        lblMainMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMainMenuMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Kitab haqqında məlumat");

        taBookAbout.setColumns(20);
        taBookAbout.setLineWrap(true);
        taBookAbout.setRows(5);
        jScrollPane2.setViewportView(taBookAbout);

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
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(jLabel2))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(lblSearchResault, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(28, 28, 28)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(tfBookName)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnSelectBook, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(50, 50, 50)
                                        .addComponent(lblMainMenu))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(7, 7, 7)
                            .addComponent(lblBooksPage, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel1))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblBooksPage))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSearchResault, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSelectBook)
                    .addComponent(tfBookName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMainMenu))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbSearchResaultMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbSearchResaultMouseClicked
        
        int rowNum = tbSearchResault.getSelectedRow();
        tfBookName.setText(tbSearchResault.getValueAt(rowNum, 1).toString());
        yaziciName = (tbSearchResault.getValueAt(rowNum, 0).toString());

        DefaultTableModel tableModel = (DefaultTableModel) tbSearchResault.getModel();

        for (AddKitabxana ak : db.allBook()) {
            if (ak.getBookName().equalsIgnoreCase(tfBookName.getText())) {

                taBookAbout.setText(ak.getBookAbout());
            }

        }


    }//GEN-LAST:event_tbSearchResaultMouseClicked

    private void btnSelectBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectBookActionPerformed

        new SearchBookPlace(tfBookName.getText(),yaziciName,name,surname,tbSeriaNumber).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnSelectBookActionPerformed

    private void lblMainMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMainMenuMouseClicked
        new StartPage().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lblMainMenuMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
        lblSearchResault.setText("' " + bookSearch + " ' " + " üçün axtarış nəticəsi");
        DefaultTableModel tableModel = (DefaultTableModel) tbSearchResault.getModel();
        db.allBookSelectLikeWhereBookName(bookSearch);
        for (AddKitabxana ak : db.allBookSelectLikeWhereBookName(bookSearch)) {

                tableModel.addRow(new Object[]{ak.getYaziciName(), ak.getBookName()});
          

        }
        for (AddKitabxana ak : db.allBookSelectLikeWhereYaziciName(bookSearch)) {
           
                tableModel.addRow(new Object[]{ak.getYaziciName(), ak.getBookName()});
           
        }

    }//GEN-LAST:event_formWindowOpened

    private void lblBooksPageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBooksPageMouseClicked
        new BooksPage().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lblBooksPageMouseClicked

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
            java.util.logging.Logger.getLogger(SearchBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSelectBook;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblBooksPage;
    private javax.swing.JLabel lblMainMenu;
    private javax.swing.JLabel lblSearchResault;
    private javax.swing.JTextArea taBookAbout;
    private javax.swing.JTable tbSearchResault;
    private javax.swing.JTextField tfBookName;
    // End of variables declaration//GEN-END:variables

}
