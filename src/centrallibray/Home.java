/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package centrallibray;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author USER
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
        this.setLocationRelativeTo(null);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        REGISTRATION = new javax.swing.JMenu();
        registration = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        addbook = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        borrowitem = new javax.swing.JMenuItem();
        returnbook = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        booklist = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        stdLoan = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 153, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("IIUC Central Library");

        jDesktopPane1.setBackground(new java.awt.Color(51, 153, 0));

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 447, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(254, 254, 254)
                .addComponent(jLabel1)
                .addContainerGap(364, Short.MAX_VALUE))
            .addComponent(jDesktopPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDesktopPane1))
        );

        jMenu1.setText("File");

        jMenuItem1.setText("jMenuItem1");
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        REGISTRATION.setText("Student");
        REGISTRATION.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                REGISTRATIONItemStateChanged(evt);
            }
        });
        REGISTRATION.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                REGISTRATIONMenuSelected(evt);
            }
        });
        REGISTRATION.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REGISTRATIONActionPerformed(evt);
            }
        });

        registration.setText("Registration");
        registration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrationActionPerformed(evt);
            }
        });
        REGISTRATION.add(registration);

        jMenuItem3.setText("Information");
        jMenuItem3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jMenuItem3ItemStateChanged(evt);
            }
        });
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        REGISTRATION.add(jMenuItem3);

        jMenuBar1.add(REGISTRATION);

        jMenu2.setText("Book");

        addbook.setText("Add Book");
        addbook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbookActionPerformed(evt);
            }
        });
        jMenu2.add(addbook);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Borrow");

        borrowitem.setText("Borrow Book");
        borrowitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrowitemActionPerformed(evt);
            }
        });
        jMenu3.add(borrowitem);

        returnbook.setText("Return Book");
        returnbook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnbookActionPerformed(evt);
            }
        });
        jMenu3.add(returnbook);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("BookList");

        booklist.setText("Show Book list");
        booklist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                booklistActionPerformed(evt);
            }
        });
        jMenu4.add(booklist);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Loan");

        stdLoan.setText("Student Loan");
        stdLoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stdLoanActionPerformed(evt);
            }
        });
        jMenu5.add(stdLoan);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void REGISTRATIONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REGISTRATIONActionPerformed
       Registration reg=new Registration();
       jDesktopPane1.add(reg);
       reg.show();
    }//GEN-LAST:event_REGISTRATIONActionPerformed

    private void REGISTRATIONMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_REGISTRATIONMenuSelected
       
    }//GEN-LAST:event_REGISTRATIONMenuSelected

    private void REGISTRATIONItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_REGISTRATIONItemStateChanged
        // TODO add your handling code here:
       
    }//GEN-LAST:event_REGISTRATIONItemStateChanged

    private void jMenuItem3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jMenuItem3ItemStateChanged
        
    }//GEN-LAST:event_jMenuItem3ItemStateChanged

    private void registrationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrationActionPerformed
       Registration reg=new Registration();
       jDesktopPane1.add(reg);
       reg.show();
    }//GEN-LAST:event_registrationActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        
         information imf=new information();
       jDesktopPane1.add(imf);
       imf.show();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void addbookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbookActionPerformed
        AddBook adb=new AddBook();
       jDesktopPane1.add(adb);
       adb.show();
    }//GEN-LAST:event_addbookActionPerformed

    private void borrowitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrowitemActionPerformed
       BorrowBook borrow=new BorrowBook();
       jDesktopPane1.add(borrow);
       borrow.show();
        
    }//GEN-LAST:event_borrowitemActionPerformed

    private void stdLoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stdLoanActionPerformed
      StudentLoan stl=new StudentLoan();
       jDesktopPane1.add(stl);
       stl.show();
    }//GEN-LAST:event_stdLoanActionPerformed

    private void booklistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_booklistActionPerformed
         booklist bklist=new booklist();
       jDesktopPane1.add(bklist);
       bklist.show();
    }//GEN-LAST:event_booklistActionPerformed

    private void returnbookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnbookActionPerformed
     ReturnBook returnbk=new ReturnBook();
       jDesktopPane1.add(returnbk);
       returnbk.show();
    }//GEN-LAST:event_returnbookActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu REGISTRATION;
    private javax.swing.JMenuItem addbook;
    private javax.swing.JMenuItem booklist;
    private javax.swing.JMenuItem borrowitem;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem registration;
    private javax.swing.JMenuItem returnbook;
    private javax.swing.JMenuItem stdLoan;
    // End of variables declaration//GEN-END:variables
}
