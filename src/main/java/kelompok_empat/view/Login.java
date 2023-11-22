/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package kelompok_empat.view;

import com.formdev.flatlaf.FlatLightLaf;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import kelompok_empat.controller.PostController;
import kelompok_empat.controller.RootController;
import kelompok_empat.controller.UserController;
import kelompok_empat.entity.User;

/**
 *
 * @author wisnu
 */
public class Login extends RootController {

    /**
     * Creates new form Login
     */
    public Login() {
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

        lblTitle = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        tfEmail = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        tfPassword = new javax.swing.JPasswordField();
        pnlFooter = new javax.swing.JPanel();
        txtFooter = new javax.swing.JLabel();
        btnRegister = new javax.swing.JButton();
        btnLogin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setMinimumSize(new java.awt.Dimension(313, 227));
        setName("login"); // NOI18N
        setResizable(false);

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("LostNFound");

        lblEmail.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblEmail.setText("Email");

        tfEmail.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        lblPassword.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblPassword.setText("Password");

        tfPassword.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        txtFooter.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtFooter.setText("Belum punya akun?");
        pnlFooter.add(txtFooter);

        btnRegister.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnRegister.setForeground(new java.awt.Color(0, 102, 255));
        btnRegister.setText("register");
        btnRegister.setBorder(null);
        btnRegister.setContentAreaFilled(false);
        btnRegister.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });
        pnlFooter.add(btnRegister);

        btnLogin.setBackground(new java.awt.Color(255, 151, 22));
        btnLogin.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("Login");
        btnLogin.setRolloverEnabled(false);
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTitle, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
                    .addComponent(tfEmail, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfPassword, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(pnlFooter, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblEmail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlFooter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        bukaFrame("register");
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        User user = getUserController().login(tfEmail.getText(), new String(tfPassword.getPassword()));

        if (user == null) {
            JOptionPane.showMessageDialog(this, "Email atau password salah!", "Login gagal", JOptionPane.WARNING_MESSAGE);
        } else {
            bukaFrame("beranda");
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Login frame = new Login();
                UserController userController = new UserController();
                PostController postController = new PostController();

                userController.addUser("", "", "081217610185", "");
                userController.addUser("Wisnu", "wisnu.agung.001@gmail.com", "081217610185", "123456");
                postController.tambahPost(userController.getCurrentUser(), "Jam Tangan", "Rolex", "Keputih", "/kelompok_empat/resources/posts/rolex.png", "", "Lost");
                postController.tambahPost(userController.getCurrentUser(), "Geprek", "Joder", "Keputih", "", "", "Lost");
                postController.tambahPost(userController.getCurrentUser(), "Pensil", "2B", "Keputih", "", "", "Lost");
                postController.tambahPost(userController.getCurrentUser(), "Pensil", "2B", "Keputih", "", "", "Lost");

                userController.logout();

                frame.setLocationRelativeTo(null);
                frame.loadController(userController, postController);
                frame.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnRegister;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel pnlFooter;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JPasswordField tfPassword;
    private javax.swing.JLabel txtFooter;
    // End of variables declaration//GEN-END:variables
}
