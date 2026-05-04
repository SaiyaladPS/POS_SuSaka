package applicationFrom;

import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class Main extends javax.swing.JFrame {
    
    private String emp_id;
    
    public Main(String id, String name, String status) {
        initComponents();
        this.emp_id = id;
//        System.out.println("id: " + id + "name: " + "status: " + status);
        this.setTitle("ໂປຣແກຮມຂາຍເຄືອງຫນ້າຮ້ານ");
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/images/logo.png")));
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        getRootPane().putClientProperty(FlatClientProperties.TITLE_BAR_SHOW_ICON, false);
        
        //ປຽນສີແຖບ Title bar ດ້ານເທິງ
        getRootPane().putClientProperty(FlatClientProperties.TITLE_BAR_BACKGROUND, new Color(211, 211, 211));
        getRootPane().putClientProperty(FlatClientProperties.TITLE_BAR_FOREGROUND, new Color(30, 30, 30));
        
        if(status == null || !status.trim().equalsIgnoreCase("Admin")){
        jMenuData.setVisible(false);
        jMenuOrder_Import.setVisible(false);
         jMenuReport.setVisible(false);
        }
    }

    Main() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenuData = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMenuOrder_Import = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenu9 = new javax.swing.JMenu();
        jMenu10 = new javax.swing.JMenu();
        jMenu11 = new javax.swing.JMenu();
        jMenuReport = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenu13 = new javax.swing.JMenu();
        jMenu14 = new javax.swing.JMenu();
        jMenuItemLight = new javax.swing.JMenuItem();
        jMenuItemDark = new javax.swing.JMenuItem();
        jMenuItemMacDark = new javax.swing.JMenuItem();
        jMenuExit = new javax.swing.JMenu();

        jMenu1.setText("jMenu1");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jMenu4.setText("jMenu4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home_Page.png"))); // NOI18N
        jMenu5.setText("ໜ້າຫຼັກ");
        jMenu5.setFont(new java.awt.Font("Lao_SomVang", 0, 14)); // NOI18N
        jMenu5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenu5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jMenuBar2.add(jMenu5);

        jMenu7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add_Database.png"))); // NOI18N
        jMenu7.setText("ຈັດການຂໍໍ້ມູນ");
        jMenu7.setFont(new java.awt.Font("Lao_SomVang", 0, 14)); // NOI18N
        jMenu7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenu7.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jMenuData.setFont(new java.awt.Font("Lao_SomVang", 0, 14)); // NOI18N
        jMenuData.setText("ຈັດການຂໍ້ມູນຍີ່ຫໍ້");
        jMenu7.add(jMenuData);

        jMenuItem2.setFont(new java.awt.Font("Lao_SomVang", 0, 14)); // NOI18N
        jMenuItem2.setText("ຈັດການຂໍ້ມູນປະເພດ");
        jMenu7.add(jMenuItem2);

        jMenuItem3.setFont(new java.awt.Font("Lao_SomVang", 0, 14)); // NOI18N
        jMenuItem3.setText("ຈັດການຂໍ້ມູນສິນຄ້າ");
        jMenu7.add(jMenuItem3);

        jMenuItem4.setFont(new java.awt.Font("Lao_SomVang", 0, 14)); // NOI18N
        jMenuItem4.setText("ຈັດການຂໍ້ມູນພະນັກງານ");
        jMenu7.add(jMenuItem4);

        jMenuItem5.setFont(new java.awt.Font("Lao_SomVang", 0, 14)); // NOI18N
        jMenuItem5.setText("ຈັດການຂໍ້ມູນອັດຕາແລກປ່ຽນ");
        jMenu7.add(jMenuItem5);

        jMenuItem6.setFont(new java.awt.Font("Lao_SomVang", 0, 14)); // NOI18N
        jMenuItem6.setText("ຈັດການຂໍ້ມູນຜູ້ສະໜອງ");
        jMenu7.add(jMenuItem6);

        jMenuBar2.add(jMenu7);

        jMenu8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/order_Import.png"))); // NOI18N
        jMenu8.setText("ສັ່ງຊື້-ນຳເຂົ້າ");
        jMenu8.setFont(new java.awt.Font("Lao_SomVang", 0, 14)); // NOI18N
        jMenu8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenu8.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jMenuOrder_Import.setFont(new java.awt.Font("Lao_SomVang", 0, 14)); // NOI18N
        jMenuOrder_Import.setText("ຈັດການຂໍ້ມູນສັ່ງຊື້ສິນຄ້າ");
        jMenuOrder_Import.addActionListener(this::jMenuOrder_ImportActionPerformed);
        jMenu8.add(jMenuOrder_Import);

        jMenuItem16.setFont(new java.awt.Font("Lao_SomVang", 0, 14)); // NOI18N
        jMenuItem16.setText("ຈັດການຂໍ້ມູນນຳເຂົ້າສິນຄ້າ");
        jMenu8.add(jMenuItem16);

        jMenuBar2.add(jMenu8);

        jMenu9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/customer.png"))); // NOI18N
        jMenu9.setText("ລູກຄ້າ");
        jMenu9.setFont(new java.awt.Font("Lao_SomVang", 0, 14)); // NOI18N
        jMenu9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenu9.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jMenuBar2.add(jMenu9);

        jMenu10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sale_Product.png"))); // NOI18N
        jMenu10.setText("ຂາຍສິນຄ້າ");
        jMenu10.setFont(new java.awt.Font("Lao_SomVang", 0, 14)); // NOI18N
        jMenu10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenu10.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jMenuBar2.add(jMenu10);

        jMenu11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search_Property.png"))); // NOI18N
        jMenu11.setText("ຄົ້ນຫາສິນຄ້າ");
        jMenu11.setFont(new java.awt.Font("Lao_SomVang", 0, 14)); // NOI18N
        jMenu11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenu11.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jMenuBar2.add(jMenu11);

        jMenuReport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/report_Card.png"))); // NOI18N
        jMenuReport.setText("ລາຍງານ");
        jMenuReport.setFont(new java.awt.Font("Lao_SomVang", 0, 14)); // NOI18N
        jMenuReport.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenuReport.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jMenuItem7.setFont(new java.awt.Font("Lao_SomVang", 0, 14)); // NOI18N
        jMenuItem7.setText("ລາຍງານຂໍ້ມູນການຂາຍ");
        jMenuReport.add(jMenuItem7);

        jMenuItem8.setFont(new java.awt.Font("Lao_SomVang", 0, 14)); // NOI18N
        jMenuItem8.setText("ລາຍງານຂໍ້ມູນສິນຄ້າໃນຮ້ານ");
        jMenuReport.add(jMenuItem8);

        jMenuItem9.setFont(new java.awt.Font("Lao_SomVang", 0, 14)); // NOI18N
        jMenuItem9.setText("ລາຍງານຂໍ້ມູນສິນຄ້າໃກ້ໝົດ");
        jMenuReport.add(jMenuItem9);

        jMenuItem10.setFont(new java.awt.Font("Lao_SomVang", 0, 14)); // NOI18N
        jMenuItem10.setText("ໃບບິນ");
        jMenuReport.add(jMenuItem10);

        jMenuItem11.setFont(new java.awt.Font("Lao_SomVang", 0, 14)); // NOI18N
        jMenuItem11.setText("ລາຍງານຂໍ້ມູນສັ່ງຊື້ສິນຄ້າ");
        jMenuReport.add(jMenuItem11);

        jMenuItem12.setFont(new java.awt.Font("Lao_SomVang", 0, 14)); // NOI18N
        jMenuItem12.setText("ລາຍງານຂໍ້ມູນນຳເຂົ້າສິນຄ້າ");
        jMenuReport.add(jMenuItem12);

        jMenuItem13.setFont(new java.awt.Font("Lao_SomVang", 0, 14)); // NOI18N
        jMenuItem13.setText("ລາຍງານຂໍ້ມູນລູກຄ້າ");
        jMenuReport.add(jMenuItem13);

        jMenuItem14.setFont(new java.awt.Font("Lao_SomVang", 0, 14)); // NOI18N
        jMenuItem14.setText("ລາຍງານຂໍ້ມູນພະນັກງານ");
        jMenuReport.add(jMenuItem14);

        jMenuBar2.add(jMenuReport);

        jMenu13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/profile.png"))); // NOI18N
        jMenu13.setText("ໂປຣໄຟລ");
        jMenu13.setFont(new java.awt.Font("Lao_SomVang", 0, 14)); // NOI18N
        jMenu13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenu13.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jMenuBar2.add(jMenu13);

        jMenu14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/change_Theme.png"))); // NOI18N
        jMenu14.setText("ສີພື້ນຫລັງ");
        jMenu14.setFont(new java.awt.Font("Lao_SomVang", 0, 14)); // NOI18N
        jMenu14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenu14.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jMenuItemLight.setFont(new java.awt.Font("Lao_SomVang", 0, 14)); // NOI18N
        jMenuItemLight.setText("FlatLaf Light");
        jMenuItemLight.addActionListener(this::jMenuItemLightActionPerformed);
        jMenu14.add(jMenuItemLight);

        jMenuItemDark.setFont(new java.awt.Font("Lao_SomVang", 0, 14)); // NOI18N
        jMenuItemDark.setText("FlatLaf Dark");
        jMenuItemDark.addActionListener(this::jMenuItemDarkActionPerformed);
        jMenu14.add(jMenuItemDark);

        jMenuItemMacDark.setFont(new java.awt.Font("Lao_SomVang", 0, 14)); // NOI18N
        jMenuItemMacDark.setText("FlatLaf MacOSDatk");
        jMenuItemMacDark.addActionListener(this::jMenuItemMacDarkActionPerformed);
        jMenu14.add(jMenuItemMacDark);

        jMenuBar2.add(jMenu14);

        jMenuExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/shutdown.png"))); // NOI18N
        jMenuExit.setText("ອອກຈາກລະບົບ");
        jMenuExit.setFont(new java.awt.Font("Lao_SomVang", 0, 14)); // NOI18N
        jMenuExit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenuExit.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jMenuExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuExitMouseClicked(evt);
            }
        });
        jMenuBar2.add(jMenuExit);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 806, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 415, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuExitMouseClicked
        int data = JOptionPane.showConfirmDialog(
                this,
                "ທ່ານຕ້ອງການອອກຈາກລະບົບແທ້ ຫຼື ບໍ່?",
                "ຢື້ນຢັນ",
                JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE
        );

        if (data == 0) {
            FlatLightLaf.setup();
            Login login = new Login();
            login.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_jMenuExitMouseClicked

    private void jMenuOrder_ImportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuOrder_ImportActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuOrder_ImportActionPerformed

    private void jMenuItemLightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemLightActionPerformed
        getRootPane().putClientProperty(FlatClientProperties.TITLE_BAR_BACKGROUND, new Color(204, 209, 209));
        getRootPane().putClientProperty(FlatClientProperties.TITLE_BAR_FOREGROUND, new Color(23, 32, 42));
        SwingUtilities.invokeLater(() -> {
            try {
                UIManager.setLookAndFeel(new FlatLightLaf());
                SwingUtilities.updateComponentTreeUI(this);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, e);
            }
        });
    }//GEN-LAST:event_jMenuItemLightActionPerformed

    private void jMenuItemDarkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemDarkActionPerformed
        getRootPane().putClientProperty(FlatClientProperties.TITLE_BAR_BACKGROUND, new Color(33, 47, 61));
        getRootPane().putClientProperty(FlatClientProperties.TITLE_BAR_FOREGROUND, new Color(253, 254, 254));
        SwingUtilities.invokeLater(() -> {
            try {
                UIManager.setLookAndFeel(new FlatDarkLaf());
                SwingUtilities.updateComponentTreeUI(this);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, e);
            }
        });
    }//GEN-LAST:event_jMenuItemDarkActionPerformed

    private void jMenuItemMacDarkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemMacDarkActionPerformed
        getRootPane().putClientProperty(FlatClientProperties.TITLE_BAR_BACKGROUND, new Color(28, 40, 51));
        getRootPane().putClientProperty(FlatClientProperties.TITLE_BAR_FOREGROUND, new Color(253, 254, 254));
        SwingUtilities.invokeLater(() -> {
            try {
                UIManager.setLookAndFeel(new FlatMacDarkLaf());
                SwingUtilities.updateComponentTreeUI(this);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, e);
            }
        });
    }//GEN-LAST:event_jMenuItemMacDarkActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu13;
    private javax.swing.JMenu jMenu14;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuData;
    private javax.swing.JMenu jMenuExit;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JMenuItem jMenuItemDark;
    private javax.swing.JMenuItem jMenuItemLight;
    private javax.swing.JMenuItem jMenuItemMacDark;
    private javax.swing.JMenuItem jMenuOrder_Import;
    private javax.swing.JMenu jMenuReport;
    // End of variables declaration//GEN-END:variables
}
