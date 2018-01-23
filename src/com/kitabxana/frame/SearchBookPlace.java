package com.kitabxana.frame;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import com.kitabxana.model.AddKitabxana;
import com.kitabxana.dboperation.DBOperation;
import com.kitabxana.model.NowLoginStudent;

/**
 *
 * @author Ramin
 */
public class SearchBookPlace extends javax.swing.JFrame {

    DBOperation db = new DBOperation();

    private String name;
    private String surname;
    private String tbSeriaNumber;
    private String bookName;
    private String yaziciName;

    public SearchBookPlace() {
        initComponents();
    }

    public SearchBookPlace(String bookName, String yaziciName, String name, String surname, String tbSeriaNumber) {
        initComponents();
        this.name = name;
        this.surname = surname;
        this.tbSeriaNumber = tbSeriaNumber;
        this.bookName = bookName;
        this.yaziciName = yaziciName;

    }

    public SearchBookPlace(String bookName) {
        initComponents();
        this.bookName = bookName;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblMessage = new javax.swing.JLabel();
        btnBuyBook = new javax.swing.JButton();
        lblBookName = new javax.swing.JLabel();
        lblBooks = new javax.swing.JLabel();
        lblMainMenu = new javax.swing.JLabel();
        tfRef = new javax.swing.JTextField();
        tfSutun = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        tfSira = new javax.swing.JTextField();
        lblYaziciName = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbNowUsingBook = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Rəf :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Sıra :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Hal-hazırda istifadədə olan kitablar");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Sütun :");

        btnBuyBook.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnBuyBook.setText("Kitabı al");
        btnBuyBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuyBookActionPerformed(evt);
            }
        });

        lblBookName.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        lblBooks.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblBooks.setText("Kitablar");
        lblBooks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBooksMouseClicked(evt);
            }
        });

        lblMainMenu.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblMainMenu.setText("Ana səhifə");
        lblMainMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMainMenuMouseClicked(evt);
            }
        });
        lblMainMenu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lblMainMenuKeyPressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Azərbaycan Dövlət Neft Akademiyası");

        lblYaziciName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        tbNowUsingBook.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tbNowUsingBook.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Yazıçının adı", "kitabın adı"
            }
        ));
        jScrollPane1.setViewportView(tbNowUsingBook);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(343, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblMainMenu)
                        .addGap(139, 139, 139))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(58, 58, 58)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(80, 80, 80))
                                .addComponent(lblMessage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 716, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(29, 29, 29)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addGap(86, 86, 86)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(btnBuyBook)
                                                .addComponent(tfSutun, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(tfSira, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(tfRef, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblBooks, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(119, 119, 119)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addComponent(lblBookName, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lblYaziciName, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(67, 67, 67)))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(126, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblMainMenu)
                .addGap(19, 19, 19))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                            .addGap(187, 187, 187)
                            .addComponent(btnBuyBook)))
                    .addGap(4, 4, 4)
                    .addComponent(lblMessage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void lblMainMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMainMenuMouseClicked
        new StartPage().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lblMainMenuMouseClicked

    private void lblMainMenuKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lblMainMenuKeyPressed

    }//GEN-LAST:event_lblMainMenuKeyPressed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        AddKitabxana book = new AddKitabxana();

        lblBookName.setText(bookName);
        for (AddKitabxana ak : db.allBook()) {
            if (bookName.equalsIgnoreCase(ak.getBookName())) {

                tfRef.setText(ak.getRefNumber());
                tfSira.setText(ak.getSiraNumber());
                tfSutun.setText(ak.getSutunNumber());

            }
        }
        DefaultTableModel tableModel = (DefaultTableModel) tbNowUsingBook.getModel();
        for (NowLoginStudent nls : db.allReadBook()) {
            tableModel.addRow(new Object[]{nls.getYaziciName(), nls.getBookName()});

        }

    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed


    }//GEN-LAST:event_formWindowClosed

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
            java.util.logging.Logger.getLogger(SearchBookPlace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchBookPlace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchBookPlace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchBookPlace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchBookPlace().setVisible(true);
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
    private javax.swing.JLabel lblBookName;
    private javax.swing.JLabel lblBooks;
    private javax.swing.JLabel lblMainMenu;
    private javax.swing.JLabel lblMessage;
    private javax.swing.JLabel lblYaziciName;
    private javax.swing.JTable tbNowUsingBook;
    private javax.swing.JTextField tfRef;
    private javax.swing.JTextField tfSira;
    private javax.swing.JTextField tfSutun;
    // End of variables declaration//GEN-END:variables
}
