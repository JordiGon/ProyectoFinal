/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

/**
 *
 * @author jordi
 */
public class Ingreso_Materia_p extends javax.swing.JFrame {

    /**
     * Creates new form Ingreso_Materia_p
     */
    public Ingreso_Materia_p() {
        initComponents();
        this.setLocationRelativeTo(null);
        autorizacion.setBackground(new java.awt.Color(0,0,0,1));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Codigo_m = new javax.swing.JTextField();
        Can = new javax.swing.JTextField();
        Tip = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        mostrar = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        autorizacion = new javax.swing.JTextField();
        cod_autorizacion = new javax.swing.JPasswordField();
        salir = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel2.setText("INGRESO DE MATERIA PRIMA");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel3.setText("Codigo Materia Prima: ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel4.setText("Cantidad a producir: ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel5.setText("Tipo Prod:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel6.setText("Codigo de Autorización:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, -1, -1));

        Codigo_m.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        getContentPane().add(Codigo_m, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, 140, -1));

        Can.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        getContentPane().add(Can, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, 140, -1));

        Tip.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        getContentPane().add(Tip, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, 140, -1));

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jButton1.setText("INGRESAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, -1, -1));

        mostrar.setText("Mostrar");
        mostrar.setBorder(null);
        mostrar.setOpaque(false);
        mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarActionPerformed(evt);
            }
        });
        getContentPane().add(mostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 240, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel7.setText("Estatus:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 340, -1, -1));

        autorizacion.setEditable(false);
        autorizacion.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        autorizacion.setBorder(null);
        autorizacion.setOpaque(false);
        autorizacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                autorizacionActionPerformed(evt);
            }
        });
        getContentPane().add(autorizacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 340, 130, -1));
        getContentPane().add(cod_autorizacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, 130, -1));

        salir.setText("X");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        getContentPane().add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, 40, 30));

        jButton2.setText("Go back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 80, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String dato, Cantidad, Codigom, Tipo;
        dato= cod_autorizacion.getText();
        Cantidad= Can.getText();
        Codigom= Codigo_m.getText();
        Tipo= Tip.getText();
        
        if((("autorizar".equals(dato) && !"".equals(Cantidad)) && !"".equals(Codigom)) && !"".equals(Tipo))
        {
            this.autorizacion.setText("Ingreso autorizado");    
        }
        else
        {
            this.autorizacion.setText("Ingreso no autorizado");    
        }
        this.Can.setText("");
        this.Codigo_m.setText("");
        this.Tip.setText("");
        this.cod_autorizacion.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void autorizacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_autorizacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_autorizacionActionPerformed

    private void mostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarActionPerformed
        // TODO add your handling code here:
        if(mostrar.isSelected())
        {
         cod_autorizacion.setEchoChar((char)0);
        }
        else
        {
         cod_autorizacion.setEchoChar('*');
        }
    }//GEN-LAST:event_mostrarActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_salirActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        menu ventana=new menu();
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Ingreso_Materia_p.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ingreso_Materia_p.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ingreso_Materia_p.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ingreso_Materia_p.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ingreso_Materia_p().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Can;
    private javax.swing.JTextField Codigo_m;
    private javax.swing.JTextField Tip;
    private javax.swing.JTextField autorizacion;
    private javax.swing.JPasswordField cod_autorizacion;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JCheckBox mostrar;
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables
}
