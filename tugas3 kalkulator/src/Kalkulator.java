/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Kalkulator extends javax.swing.JFrame {
    String angka;
    double jumlah,angka1,angka2;
    int pilih;
    /**
     * Creates new form TampilanKalkulator
     */
    public Kalkulator() {
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

        btnSamadengan = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnAngka7 = new javax.swing.JButton();
        btnKurang = new javax.swing.JButton();
        btnTambah = new javax.swing.JButton();
        btnBagi = new javax.swing.JButton();
        btnKali = new javax.swing.JButton();
        btnAngka9 = new javax.swing.JButton();
        btnAngka8 = new javax.swing.JButton();
        btnAngka4 = new javax.swing.JButton();
        btnAngka5 = new javax.swing.JButton();
        btnAngka6 = new javax.swing.JButton();
        btnAngka1 = new javax.swing.JButton();
        btnAngka2 = new javax.swing.JButton();
        btnAngka3 = new javax.swing.JButton();
        btnAngka0 = new javax.swing.JButton();
        btnKoma = new javax.swing.JButton();
        btnAngka00 = new javax.swing.JButton();
        display = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("KalkulatorSederhana");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSamadengan.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSamadengan.setText("=");
        btnSamadengan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSamadenganActionPerformed(evt);
            }
        });
        getContentPane().add(btnSamadengan, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 60, 40));

        btnHapus.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnHapus.setText("empty");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });
        getContentPane().add(btnHapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 180, 40));

        btnAngka7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAngka7.setText("7");
        btnAngka7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAngka7ActionPerformed(evt);
            }
        });
        getContentPane().add(btnAngka7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 60, 40));

        btnKurang.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnKurang.setText("-");
        btnKurang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKurangActionPerformed(evt);
            }
        });
        getContentPane().add(btnKurang, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 60, 40));

        btnTambah.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnTambah.setText("+");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });
        getContentPane().add(btnTambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 60, 40));

        btnBagi.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnBagi.setText("/");
        btnBagi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBagiActionPerformed(evt);
            }
        });
        getContentPane().add(btnBagi, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 60, 40));

        btnKali.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnKali.setText("x");
        btnKali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKaliActionPerformed(evt);
            }
        });
        getContentPane().add(btnKali, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 60, 40));

        btnAngka9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAngka9.setText("9");
        btnAngka9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAngka9ActionPerformed(evt);
            }
        });
        getContentPane().add(btnAngka9, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 60, 40));

        btnAngka8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAngka8.setText("8");
        btnAngka8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAngka8ActionPerformed(evt);
            }
        });
        getContentPane().add(btnAngka8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 60, 40));

        btnAngka4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAngka4.setText("4");
        btnAngka4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAngka4ActionPerformed(evt);
            }
        });
        getContentPane().add(btnAngka4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 60, 40));

        btnAngka5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAngka5.setText("5");
        btnAngka5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAngka5ActionPerformed(evt);
            }
        });
        getContentPane().add(btnAngka5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 60, 40));

        btnAngka6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAngka6.setText("6");
        btnAngka6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAngka6ActionPerformed(evt);
            }
        });
        getContentPane().add(btnAngka6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 60, 40));

        btnAngka1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAngka1.setText("1");
        btnAngka1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAngka1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnAngka1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 60, 40));

        btnAngka2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAngka2.setText("2");
        btnAngka2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAngka2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnAngka2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 60, 40));

        btnAngka3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAngka3.setText("3");
        btnAngka3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAngka3ActionPerformed(evt);
            }
        });
        getContentPane().add(btnAngka3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 60, 40));

        btnAngka0.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAngka0.setText("0");
        btnAngka0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAngka0ActionPerformed(evt);
            }
        });
        getContentPane().add(btnAngka0, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 60, 40));

        btnKoma.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnKoma.setText(",");
        btnKoma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKomaActionPerformed(evt);
            }
        });
        getContentPane().add(btnKoma, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 60, 40));

        btnAngka00.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAngka00.setText("00");
        btnAngka00.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAngka00ActionPerformed(evt);
            }
        });
        getContentPane().add(btnAngka00, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 60, 40));

        display.setEditable(false);
        display.setFont(new java.awt.Font("Courier New", 1, 36)); // NOI18N
        display.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        display.setText("0");
        getContentPane().add(display, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 240, 70));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSamadenganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSamadenganActionPerformed
        // TODO add your handling code here:
        switch(pilih){
            case 1:
                angka2 = Double.parseDouble(angka);
                jumlah = angka1 + angka2;
                angka = Double.toString(jumlah);
                display.setText(angka);
                break;
            case 2:
                angka2 = Double.parseDouble(angka);
                jumlah = angka1 - angka2;
                angka = Double.toString(jumlah);
                display.setText(angka);
                break;
            case 3:
                angka2 = Double.parseDouble(angka);
                jumlah = angka1 * angka2;
                angka = Double.toString(jumlah);
                display.setText(angka);
                break;
            case 4:
                angka2 = Double.parseDouble(angka);
                jumlah = angka1 / angka2;
                angka = Double.toString(jumlah);
                display.setText(angka);
                break;
                default:
                break;
        } 
    }//GEN-LAST:event_btnSamadenganActionPerformed

    private void btnKurangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKurangActionPerformed
        // TODO add your handling code here:
        angka1=Double.parseDouble(angka);
        display.setText("-");
        angka="";
        pilih=2;
    }//GEN-LAST:event_btnKurangActionPerformed

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        // TODO add your handling code here:
            angka1=Double.parseDouble(angka);
            display.setText("+");
            angka="";
            pilih=1;
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnAngka7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAngka7ActionPerformed
        // TODO add your handling code here:
        angka += "7";
        display.setText(angka);
    }//GEN-LAST:event_btnAngka7ActionPerformed

    private void btnAngka0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAngka0ActionPerformed
        // TODO add your handling code here:
        angka += "0";
        display.setText(angka);
    }//GEN-LAST:event_btnAngka0ActionPerformed

    private void btnAngka1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAngka1ActionPerformed
        // TODO add your handling code here:
        angka += "1";
        display.setText(angka);
    }//GEN-LAST:event_btnAngka1ActionPerformed

    private void btnAngka2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAngka2ActionPerformed
        // TODO add your handling code here:
        angka += "2";
        display.setText(angka);    
    }//GEN-LAST:event_btnAngka2ActionPerformed

    private void btnAngka3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAngka3ActionPerformed
        // TODO add your handling code here:
        angka += "3";
        display.setText(angka);    
    }//GEN-LAST:event_btnAngka3ActionPerformed

    private void btnAngka4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAngka4ActionPerformed
        // TODO add your handling code here:
        angka += "4";
        display.setText(angka);
    }//GEN-LAST:event_btnAngka4ActionPerformed

    private void btnAngka5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAngka5ActionPerformed
        // TODO add your handling code here:
        angka += "5";
        display.setText(angka);
    }//GEN-LAST:event_btnAngka5ActionPerformed

    private void btnAngka6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAngka6ActionPerformed
        // TODO add your handling code here:
        angka += "6";
        display.setText(angka);
    }//GEN-LAST:event_btnAngka6ActionPerformed

    private void btnAngka8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAngka8ActionPerformed
        // TODO add your handling code here:
        angka += "8";
        display.setText(angka);
    }//GEN-LAST:event_btnAngka8ActionPerformed

    private void btnAngka9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAngka9ActionPerformed
        // TODO add your handling code here:
        angka += "9";
        display.setText(angka);
    }//GEN-LAST:event_btnAngka9ActionPerformed

    private void btnAngka00ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAngka00ActionPerformed
        // TODO add your handling code here:
        angka += "00";
        display.setText(angka);
    }//GEN-LAST:event_btnAngka00ActionPerformed

    private void btnKomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKomaActionPerformed
        // TODO add your handling code here:
        angka += ".";
        display.setText(angka);
    }//GEN-LAST:event_btnKomaActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        // TODO add your handling code here:
        display.setText("");
        angka1=0.0;
        angka2=0.0;
        jumlah=0.0;
        angka="";
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnKaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKaliActionPerformed
        // TODO add your handling code here:
        angka1=Double.parseDouble(angka);
        display.setText("*");
        angka="";
        pilih=3;
    }//GEN-LAST:event_btnKaliActionPerformed

    private void btnBagiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBagiActionPerformed
        // TODO add your handling code here:
        angka1=Double.parseDouble(angka);
        display.setText("/");
        angka="";
        pilih=4;
    }//GEN-LAST:event_btnBagiActionPerformed

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
            java.util.logging.Logger.getLogger(Kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Kalkulator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAngka0;
    private javax.swing.JButton btnAngka00;
    private javax.swing.JButton btnAngka1;
    private javax.swing.JButton btnAngka2;
    private javax.swing.JButton btnAngka3;
    private javax.swing.JButton btnAngka4;
    private javax.swing.JButton btnAngka5;
    private javax.swing.JButton btnAngka6;
    private javax.swing.JButton btnAngka7;
    private javax.swing.JButton btnAngka8;
    private javax.swing.JButton btnAngka9;
    private javax.swing.JButton btnBagi;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnKali;
    private javax.swing.JButton btnKoma;
    private javax.swing.JButton btnKurang;
    private javax.swing.JButton btnSamadengan;
    private javax.swing.JButton btnTambah;
    private javax.swing.JTextField display;
    // End of variables declaration//GEN-END:variables
}