/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package n3dshop;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LayoutManager;
import java.awt.RenderingHints;
import java.sql.Connection;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author HP
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        Username.setBackground(new Color(0,0,0,0));
        Password.setBackground(new Color(0,0,0,0));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Masuk = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new RoundedPanel(50, getForeground());
        jLabel3 = new javax.swing.JLabel();
        Username = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Password = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Level = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Masuk.setBackground(new java.awt.Color(0, 9, 87));
        Masuk.setForeground(new java.awt.Color(52, 76, 183));
        Masuk.setPreferredSize(new java.awt.Dimension(1322, 924));
        Masuk.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FIleGambar/Group.png"))); // NOI18N
        Masuk.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 40, -1, -1));

        jPanel2.setBackground(new java.awt.Color(78, 80, 130));
        jPanel2.setForeground(new java.awt.Color(78, 80, 130));
        jPanel2.setOpaque(false);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FIleGambar/Line 32.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 153, 430, 13));

        Username.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Username.setForeground(new java.awt.Color(255, 255, 255));
        Username.setBorder(null);
        Username.setCaretColor(new java.awt.Color(255, 255, 255));
        Username.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        Username.setOpaque(false);
        jPanel2.add(Username, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 116, 420, 31));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("USERNAME");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 108, 28));

        Password.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Password.setForeground(new java.awt.Color(255, 255, 255));
        Password.setBorder(null);
        Password.setCaretColor(new java.awt.Color(255, 255, 255));
        Password.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        Password.setOpaque(false);
        jPanel2.add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 237, 430, 31));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FIleGambar/Line 32.png"))); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 274, 430, 18));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("PASSWORD");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 201, 109, 28));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("LEVEL");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 65, 28));

        Level.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Level.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SILAHKAN DIPILIH", "OWNER", "KASIR" }));
        jPanel2.add(Level, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 344, 430, 36));

        jButton1.setBackground(new java.awt.Color(255, 232, 22));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("MASUK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 430, 114, 42));

        Masuk.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 100, 492, 576));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FIleGambar/Angkringan__5_-removebg-preview 1.png"))); // NOI18N
        Masuk.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 6, 187, 133));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FIleGambar/Group 8.png"))); // NOI18N
        Masuk.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 561, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FIleGambar/Group 9.png"))); // NOI18N
        Masuk.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 0, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FIleGambar/Group 7.png"))); // NOI18N
        Masuk.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Masuk, javax.swing.GroupLayout.PREFERRED_SIZE, 1280, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Masuk, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
            String sql = "SELECT Username, Password, Lavel from petugas WHERE Username='" + Username.getText()
                    + "'AND Password='" + Password.getText() 
                    + "'AND Lavel='"+ Level.getSelectedItem()+"'";
            java.sql.Connection conn = (Connection) Koneksi.getkoneksi();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            java.sql.ResultSet rs = pst.executeQuery(sql);

            if (rs.next()) {
                if (Username.getText().equals(rs.getString("Username"))
                        && Password.getText().equals(rs.getString("Password"))
                        && Level.getSelectedItem().equals(rs.getString("Lavel"))) {
                    JOptionPane.showMessageDialog(null, "Anda Berhasil Login");
                    this.setVisible(false);
                    new MenuUtama().setVisible(true);

                }
            } else {
                JOptionPane.showMessageDialog(null, "Username atau Password salah");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Level;
    private javax.swing.JPanel Masuk;
    private javax.swing.JTextField Password;
    private javax.swing.JTextField Username;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
class RoundedPanel extends JPanel
    {
        private Color backgroundColor;
        private int cornerRadius = 15;
        public RoundedPanel(LayoutManager layout, int radius) {
            super(layout);
            cornerRadius = radius;
        }
        public RoundedPanel(LayoutManager layout, int radius, Color bgColor) {
            super(layout);
            cornerRadius = radius;
            backgroundColor = bgColor;
        }
        public RoundedPanel(int radius) {
            super();
            cornerRadius = radius;
            
        }
        public RoundedPanel(int radius, Color bgColor) {
            super();
            cornerRadius = radius;
            backgroundColor = bgColor;
        }
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Dimension arcs = new Dimension(cornerRadius, cornerRadius);
            int width = getWidth();
            int height = getHeight();
            Graphics2D graphics = (Graphics2D) g;
            graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            //Draws the rounded panel with borders.
            if (backgroundColor != null) {
                graphics.setColor(backgroundColor);
            } else {
                graphics.setColor(getBackground());
            }
            graphics.fillRoundRect(0, 0, width-1, height-1, arcs.width, arcs.height); //paint background
            graphics.setColor(getForeground());
//            graphics.drawRoundRect(0, 0, width-1, height-1, arcs.width, arcs.height); //paint border
//             
        }
    }
}
