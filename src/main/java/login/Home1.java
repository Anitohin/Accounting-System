package login;

import AP.Account_Payable;
import javax.swing.JFrame;
import login.Signin.SignIn; // Ensure the correct import for your login frame

/**
 * Home1 class to manage the main application window and logout functionality.
 */
public class Home1 extends javax.swing.JFrame {

    /**
     * Creates new form Home1
     */
    public Home1() {
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

        jPanel1 = new javax.swing.JPanel();
        dLegder = new javax.swing.JPanel();
        dL1 = new javax.swing.JLabel();
        dAccPay = new javax.swing.JPanel();
        dL2 = new javax.swing.JLabel();
        dPayroll = new javax.swing.JPanel();
        dL3 = new javax.swing.JLabel();
        dExpense = new javax.swing.JPanel();
        dL4 = new javax.swing.JLabel();
        dLogOut = new javax.swing.JPanel();
        dL5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(7, 59, 76));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dLegder.setBackground(new java.awt.Color(11, 92, 118));
        dLegder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dLegderMouseClicked(evt);
            }
        });
        dLegder.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dL1.setBackground(new java.awt.Color(255, 255, 255));
        dL1.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        dL1.setForeground(new java.awt.Color(255, 255, 255));
        dL1.setText("General Ledger");
        dLegder.add(dL1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 140, 50));

        jPanel1.add(dLegder, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 150, 50));

        dAccPay.setBackground(new java.awt.Color(11, 92, 118));
        dAccPay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dAccPayMouseClicked(evt);
            }
        });

        dL2.setBackground(new java.awt.Color(255, 255, 255));
        dL2.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        dL2.setForeground(new java.awt.Color(255, 255, 255));
        dL2.setText("Account Payable");

        javax.swing.GroupLayout dAccPayLayout = new javax.swing.GroupLayout(dAccPay);
        dAccPay.setLayout(dAccPayLayout);
        dAccPayLayout.setHorizontalGroup(
            dAccPayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dAccPayLayout.createSequentialGroup()
                .addGap(0, 10, Short.MAX_VALUE)
                .addComponent(dL2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        dAccPayLayout.setVerticalGroup(
            dAccPayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dL2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel1.add(dAccPay, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 150, 50));

        dPayroll.setBackground(new java.awt.Color(11, 92, 118));
        dPayroll.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dPayrollMouseClicked(evt);
            }
        });

        dL3.setBackground(new java.awt.Color(255, 255, 255));
        dL3.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        dL3.setForeground(new java.awt.Color(255, 255, 255));
        dL3.setText("Payroll");

        javax.swing.GroupLayout dPayrollLayout = new javax.swing.GroupLayout(dPayroll);
        dPayroll.setLayout(dPayrollLayout);
        dPayrollLayout.setHorizontalGroup(
            dPayrollLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dPayrollLayout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(dL3, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        dPayrollLayout.setVerticalGroup(
            dPayrollLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dL3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel1.add(dPayroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 150, 50));

        dExpense.setBackground(new java.awt.Color(11, 92, 118));
        dExpense.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dExpenseMouseClicked(evt);
            }
        });

        dL4.setBackground(new java.awt.Color(255, 255, 255));
        dL4.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        dL4.setForeground(new java.awt.Color(255, 255, 255));
        dL4.setText("Expense Tracker");

        javax.swing.GroupLayout dExpenseLayout = new javax.swing.GroupLayout(dExpense);
        dExpense.setLayout(dExpenseLayout);
        dExpenseLayout.setHorizontalGroup(
            dExpenseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dExpenseLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(dL4, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        dExpenseLayout.setVerticalGroup(
            dExpenseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dL4, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel1.add(dExpense, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 150, 50));

        dLogOut.setBackground(new java.awt.Color(11, 92, 118));
        dLogOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dLogOutMouseClicked(evt);
            }
        });

        dL5.setBackground(new java.awt.Color(255, 255, 255));
        dL5.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        dL5.setForeground(new java.awt.Color(255, 255, 255));
        dL5.setText("Log Out");

        javax.swing.GroupLayout dLogOutLayout = new javax.swing.GroupLayout(dLogOut);
        dLogOut.setLayout(dLogOutLayout);
        dLogOutLayout.setHorizontalGroup(
            dLogOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dLogOutLayout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(dL5, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        dLogOutLayout.setVerticalGroup(
            dLogOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dL5, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel1.add(dLogOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 150, 50));

        jPanel2.setBackground(new java.awt.Color(7, 59, 76));
        jPanel2.setForeground(new java.awt.Color(7, 59, 76));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 702, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 554, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dLegderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dLegderMouseClicked
        // TODO add your handling code here:
        dL1.setVisible(true);
        dL2.setVisible(false);
        dL3.setVisible(false);
        dL4.setVisible(false);
        dL5.setVisible(false);
        
    }//GEN-LAST:event_dLegderMouseClicked

    private void dAccPayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dAccPayMouseClicked
        // TODO add your handling code here:
        dL1.setVisible(false);
        dL2.setVisible(true);
        dL3.setVisible(false);
        dL4.setVisible(false);
        dL5.setVisible(false);
    }//GEN-LAST:event_dAccPayMouseClicked

    private void dPayrollMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dPayrollMouseClicked
        // TODO add your handling code here:
        dL1.setVisible(false);
        dL2.setVisible(false);
        dL3.setVisible(true);
        dL4.setVisible(false);
        dL5.setVisible(false);
    }//GEN-LAST:event_dPayrollMouseClicked

    private void dExpenseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dExpenseMouseClicked
        // TODO add your handling code here:
        dL1.setVisible(false);
        dL2.setVisible(false);
        dL3.setVisible(false);
        dL4.setVisible(true);
        dL5.setVisible(false);
    }//GEN-LAST:event_dExpenseMouseClicked

    private void dLogOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dLogOutMouseClicked
        // TODO add your handling code here:
        dL1.setVisible(false);
        dL2.setVisible(false);
        dL3.setVisible(false);
        dL4.setVisible(false);
        dL5.setVisible(true);
    }//GEN-LAST:event_dLogOutMouseClicked

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
            java.util.logging.Logger.getLogger(Home1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel dAccPay;
    private javax.swing.JPanel dExpense;
    private javax.swing.JLabel dL1;
    private javax.swing.JLabel dL2;
    private javax.swing.JLabel dL3;
    private javax.swing.JLabel dL4;
    private javax.swing.JLabel dL5;
    private javax.swing.JPanel dLegder;
    private javax.swing.JPanel dLogOut;
    private javax.swing.JPanel dPayroll;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
