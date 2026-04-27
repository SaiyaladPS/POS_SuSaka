package applicationFrom;

import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.extras.FlatSVGIcon;
import config.ThemeConfig;
import includeClass.PasswordHashing;
import org.mindrot.jbcrypt.BCrypt;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import java.sql.*;
import mysql_connect.Mysql_connect;

public class Login extends javax.swing.JFrame {
    
    Connection conn = null;         //ເກັບການເຊື່ອມຕໍ່ຖານຂໍ້ມູນ
    PreparedStatement pst = null;   //ກຽມຄໍາສັ່ງ sql
    ResultSet rs = null;            //ເກັບຜົນໄດ້ຮັບຈາກການປະມວນຜົນຄໍາສັ່ງ sql
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Login.class.getName());

    public Login() {
        initComponents();
        this.setTitle("ໂປຣແກຮມຂາຍເຄືອງຫນ້າຮ້ານ");
        this.setLocationRelativeTo(this);
        this.setResizable(false);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/images/logo.png")));
        
        // ໃສ່ຮູບໂລໂກລ໋ອກອິນ
        sVGImage1.setSvgImage("images_svg/login-form.svg", 100, 100);
        
        //ປຽນສີແຖບ Title bar ດ້ານເທິງ
        getRootPane().putClientProperty(FlatClientProperties.TITLE_BAR_BACKGROUND, new Color(211, 211, 211));
        getRootPane().putClientProperty(FlatClientProperties.TITLE_BAR_FOREGROUND, new Color(30, 30, 30));

        //PlaceHolder
        txtUsername.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "ບັນຊີເຂົ້າໃຊ້");
        txtPassword.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "ລະຫັດຜ່ານ");

        //ລືບ
        txtUsername.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
        txtPassword.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);

        //ໃສ່ຮູບໃນ txtUsername ແລະ txtPassword
        txtUsername.putClientProperty(FlatClientProperties.TEXT_FIELD_LEADING_ICON, new FlatSVGIcon("images_svg/username.svg"));
        txtPassword.putClientProperty(FlatClientProperties.TEXT_FIELD_LEADING_ICON, new FlatSVGIcon("images_svg/password.svg"));

        //ໃສຮູບທີ່ປຸ່ມ ເຂົ້າໃຊ້ງານ
        btnLogin.setIcon(new FlatSVGIcon("images_svg/login.svg"));

        //ສະແດງລະຫັດຜ່ານ ແລະ ສະຖານະປຸ່ມ capslock
        txtPassword.putClientProperty(FlatClientProperties.STYLE, "showRevealButton:true;" + "showCapsLock:true");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sVGImage1 = new includeClass.SVGImage();
        txtPassword = new javax.swing.JPasswordField();
        txtUsername = new javax.swing.JTextField();
        btnLogin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        sVGImage1.setText("sVGImage1");
        sVGImage1.setName(""); // NOI18N

        txtPassword.addActionListener(this::txtPasswordActionPerformed);

        txtUsername.addActionListener(this::txtUsernameActionPerformed);

        btnLogin.setBackground(new java.awt.Color(0, 51, 204));
        btnLogin.setFont(new java.awt.Font("Phetsarath OT", 1, 14)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("ເຂົ້າໃຊ້ງານ");
        btnLogin.addActionListener(this::btnLoginActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(103, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtPassword)
                    .addComponent(txtUsername)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(sVGImage1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65))
                    .addComponent(btnLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE))
                .addContainerGap(104, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(sVGImage1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed

        if (txtUsername.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "ກະລຸນາປ້ອນຂໍ້ມູນໃຫ້ຄົບດວ້ຍ");
            txtUsername.requestFocus();
            return;
        }
        txtPassword.requestFocus();
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        btnLogin.doClick();
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // ຖ້າບໍ່ປ້ອນບັນຊີເຂົ້າໃຊ້ ຫຼື ລະຫັດຜ່ານ ໃຫ້ແຈ້ງເຕືອນ
        if (txtUsername.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "ກະລຸນາປ້ອນຂໍ້ມູນໃຫ້ຄົບດວ້ຍ");
            txtUsername.requestFocus();
            return;
        }
        
        if (txtPassword.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "ກະລຸນາປ້ອນຂໍ້ມູນໃຫ້ຄົບດວ້ຍ");
            txtPassword.requestFocus();
            return;
        }
        
        try {
            conn = Mysql_connect.connectDb();

            String sql = """
                SELECT emp_id,
                       CONCAT(emp_name, ' ', emp_lname) AS NAME,
                       status,
                       password
                FROM employee
                WHERE username = ?
            """;

            pst = conn.prepareStatement(sql);
            pst.setString(1, txtUsername.getText());

            rs = pst.executeQuery();

            if (rs.next()) {
                String hashedPasswordFromDB = rs.getString("password");

                // 🔥 เช็ค password ด้วย bcrypt
                if (BCrypt.checkpw(txtPassword.getText(), hashedPasswordFromDB)) {
                    Main m = new Main();
                    m.setVisible(true);
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(this, "ລະຫັດຜ່ານບໍ່ຖືກ", "ຜິດພາດ", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "ບໍ່ພົບຜູ້ໃຊ້", "ຜິດພາດ", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    public static void main(String args[]) {
        ThemeConfig.config();

        java.awt.EventQueue.invokeLater(() -> new Login().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private includeClass.SVGImage sVGImage1;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
