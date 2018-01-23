package com.kitabxana.frame;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import com.kitabxana.model.AddKitabxana;
import com.kitabxana.dboperation.DBOperation;
import com.kitabxana.model.LoginStudent;
import com.kitabxana.model.NowLoginStudent;
import com.kitabxana.model.UnivercityStudent;

/**
 *
 * @author Ramin
 */
public class BookPlacePage extends javax.swing.JFrame {

    /**
     * Creates new form BookPlacePage
     */
    DBOperation db = new DBOperation();

    private String bookName;
    private String yaziciName;
    private String name;
    private String surname;
    private String tbSeriaNumber;

    public BookPlacePage() {
        initComponents();
    }

    public BookPlacePage(String bookName, String yaziciname, String name, String surname, String tbSeriaNumber) {
        initComponents();
        this.bookName = bookName;
        this.yaziciName = yaziciname;
        this.name = name;
        this.surname = surname;
        this.tbSeriaNumber = tbSeriaNumber;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSpinner1 = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        lblYaziciName = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnBuyBook = new javax.swing.JButton();
        lblSira = new javax.swing.JLabel();
        lblCerge = new javax.swing.JLabel();
        lblMainMenu = new javax.swing.JLabel();
        tfRef = new javax.swing.JTextField();
        tfSutun = new javax.swing.JTextField();
        tfSira = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbNowUsingBook = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        lblBookName = new javax.swing.JLabel();
        lblBooks = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Azərbaycan Dövlət Neft Akademiyası");

        lblYaziciName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Rəf :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Sıra :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Sütun :");

        btnBuyBook.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnBuyBook.setText("Kitabı al");
        btnBuyBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuyBookActionPerformed(evt);
            }
        });

        lblMainMenu.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblMainMenu.setText("Ana səhifə");
        lblMainMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMainMenuMouseClicked(evt);
            }
        });

        tbNowUsingBook.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tbNowUsingBook.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Yazıçının adı", "kitabın adı"
            }
        ));
        jScrollPane1.setViewportView(tbNowUsingBook);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Hal-hazırda istifadədə olan kitablar");

        lblBookName.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        lblBooks.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblBooks.setText("Kitablar");
        lblBooks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBooksMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(205, 205, 205)
                                        .addComponent(lblSira, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(86, 86, 86)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnBuyBook)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblMainMenu)
                                        .addGap(85, 85, 85))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tfSutun, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(tfSira)
                                                .addComponent(tfRef, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblCerge, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(lblBooks, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(119, 119, 119)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(lblBookName, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblYaziciName, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblBooks, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblYaziciName, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                    .addComponent(lblBookName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblSira)
                        .addGap(42, 42, 42)
                        .addComponent(lblCerge)
                        .addGap(142, 142, 142))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(tfRef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(tfSira, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(tfSutun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblMainMenu)
                                    .addComponent(btnBuyBook))))
                        .addGap(38, 38, 38))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblMainMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMainMenuMouseClicked
        new StartPage().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lblMainMenuMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        lblBookName.setText(bookName);
        for (AddKitabxana ak : db.allBook()) {

            if (bookName.equalsIgnoreCase(ak.getBookName())) {
                tfRef.setText(ak.getRefNumber());
                tfSira.setText(ak.getSiraNumber());
                tfSutun.setText(ak.getSutunNumber());

            }

        }
        DefaultTableModel tableModel = (DefaultTableModel) tbNowUsingBook.getModel();
        for (NowLoginStudent b : db.allReadBook()) {
            tableModel.addRow(new Object[]{b.getYaziciName(), b.getBookName()});

        }

    }//GEN-LAST:event_formWindowOpened

    private void btnBuyBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuyBookActionPerformed

        String text = "";
        NowLoginStudent student = new NowLoginStudent();
        if (db.allReadBook().isEmpty()) {
            student.setBookName(bookName);
            student.setYaziciName(yaziciName);
            student.setName(name);
            student.setSurname(surname);
            student.setTbSeriaNumber(tbSeriaNumber);
            db.insertReadBook(student);
            JOptionPane.showMessageDialog(this, "Siz " + "'" + bookName + "'" + " kitabını götürdünüz.Kitabı geri qaytarmaq üçün kitabxana işçisinə yaxınlaşın");
            text = bookName;
        }
        String tex = "";
        for (NowLoginStudent nls : db.allReadBook()) {

            if (bookName.equalsIgnoreCase(nls.getBookName())) {
                tex = bookName;
                break;
            }

        }

        if (tex.isEmpty()) {
            student.setBookName(bookName);
            student.setYaziciName(yaziciName);
            student.setName(name);
            student.setSurname(surname);
            student.setTbSeriaNumber(tbSeriaNumber);

            db.insertReadBook(student);
            JOptionPane.showMessageDialog(this, "Siz " + "'" + bookName + "'" + " kitabını götürdünüz.Kitabı geri qaytarmaq üçün kitabxana işçisinə yaxınlaşın");
            text = bookName;

        }
        if (text.equals("")) {

            JOptionPane.showMessageDialog(this, "" + "'" + bookName + "'" + " kitabı artıq başqası tərəfindən götürülüb!");

        }

        DefaultTableModel tableModel = (DefaultTableModel) tbNowUsingBook.getModel();
        tableModel.setRowCount(0);
        formWindowOpened(null);


    }//GEN-LAST:event_btnBuyBookActionPerformed

    private void lblBooksMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBooksMouseClicked
        new BooksPage().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lblBooksMouseClicked

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
            java.util.logging.Logger.getLogger(BookPlacePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookPlacePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookPlacePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookPlacePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookPlacePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuyBook;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JLabel lblBookName;
    private javax.swing.JLabel lblBooks;
    private javax.swing.JLabel lblCerge;
    private javax.swing.JLabel lblMainMenu;
    private javax.swing.JLabel lblSira;
    private javax.swing.JLabel lblYaziciName;
    private javax.swing.JTable tbNowUsingBook;
    private javax.swing.JTextField tfRef;
    private javax.swing.JTextField tfSira;
    private javax.swing.JTextField tfSutun;
    // End of variables declaration//GEN-END:variables
}
