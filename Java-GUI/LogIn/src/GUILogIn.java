
import java.awt.Color;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Javi
 */
public class GUILogIn extends javax.swing.JFrame {
    ColeccionRegistro lista = new ColeccionRegistro();
    /**
     * Creates new form GUILogIn
     */
    public GUILogIn() {
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

        jComboBox1 = new javax.swing.JComboBox<>();
        bgWhite = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txUsuario = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        txpContrasenia = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        btnEnviar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaLista = new javax.swing.JTextArea();
        lblMensaje = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bgWhite.setBackground(new java.awt.Color(255, 255, 255));
        bgWhite.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(51, 51, 51));
        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Logo");
        bgWhite.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/LogIn.png"))); // NOI18N
        bgWhite.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 0, 200, 500));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Iniciar Sesión");
        bgWhite.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Usuario");
        bgWhite.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        txUsuario.setBackground(new java.awt.Color(255, 255, 255));
        txUsuario.setForeground(new java.awt.Color(204, 204, 204));
        txUsuario.setBorder(null);
        bgWhite.add(txUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 390, -1));

        jSeparator1.setForeground(new java.awt.Color(153, 153, 153));
        bgWhite.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 390, -1));

        txpContrasenia.setBackground(new java.awt.Color(255, 255, 255));
        txpContrasenia.setBorder(null);
        bgWhite.add(txpContrasenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 390, -1));

        jLabel5.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Contraseña");
        bgWhite.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        jSeparator2.setForeground(new java.awt.Color(153, 153, 153));
        bgWhite.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 390, -1));

        jSeparator3.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator3.setForeground(new java.awt.Color(153, 153, 153));
        bgWhite.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 390, 20));

        btnEnviar.setBackground(new java.awt.Color(34, 93, 139));
        btnEnviar.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        btnEnviar.setForeground(new java.awt.Color(255, 255, 255));
        btnEnviar.setText("Iniciar sesión");
        btnEnviar.setBorder(null);
        btnEnviar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });
        bgWhite.add(btnEnviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 120, 30));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(null);
        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));

        txaLista.setBackground(new java.awt.Color(255, 255, 255));
        txaLista.setColumns(20);
        txaLista.setForeground(new java.awt.Color(102, 102, 102));
        txaLista.setRows(5);
        jScrollPane1.setViewportView(txaLista);

        bgWhite.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, -1, -1));

        lblMensaje.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        bgWhite.add(lblMensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 370, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgWhite, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgWhite, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        // Boton de accion 
         String user = txUsuario.getText();
         String pass = txpContrasenia.getText();
              
        if (user.equals("ADMIN")) {
            if (pass.equals("J1234")) {
                lblMensaje.setText("Agregado Correctamente");   
                lblMensaje.setForeground(Color.green);                
                txaLista.setEditable(false);
                Registro re = new Registro(user,pass);
                String listar = lista.addRegistro(re);
                txaLista.setText(listar);
                txaLista.setForeground(Color.green);
                txaLista.setText(lista.listarRegistros());
            }else{
                
                lblMensaje.setText("Usuario Incorrecto");
                txaLista.setText("No agregado");
                txaLista.setForeground(Color.red);
                lblMensaje.setForeground(Color.red);
            }
        }else{
                lblMensaje.setText("Usuario Incorrecto");
                txaLista.setText("No agregado");
                txaLista.setForeground(Color.red);
                lblMensaje.setForeground(Color.red);            
        }
        

        
    }//GEN-LAST:event_btnEnviarActionPerformed

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
            java.util.logging.Logger.getLogger(GUILogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUILogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUILogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUILogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUILogIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bgWhite;
    private javax.swing.JButton btnEnviar;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lblMensaje;
    private javax.swing.JTextField txUsuario;
    private javax.swing.JTextArea txaLista;
    private javax.swing.JPasswordField txpContrasenia;
    // End of variables declaration//GEN-END:variables
}
