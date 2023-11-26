/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package kelompok_empat.view;

import java.awt.CardLayout;
import java.awt.Color;
import kelompok_empat.controller.RootController;
import kelompok_empat.component.ImageResizer;
import kelompok_empat.entity.Post;

/**
 *
 * @author wisnu
 */
public class NavbarLayout extends RootController {

    private String currentPage = "beranda";

    /**
     * Creates new form NavbarLayout
     */
    public NavbarLayout() {
        initComponents();

        pnlContent.add(new Beranda(this), "beranda");
        pnlContent.add(new Profile(getUserController().getCurrentUser()), "profile");

        setBarColor(Color.decode("#FF9717"));
        setTitleColor(Color.white);
    }

    public NavbarLayout(String page) {
        this();
        switchPage("beranda");
    }

    @Override
    public void afterOpen() {
        if ("beranda".equals(currentPage)) {
            ((Beranda) pnlContent.getComponent(0)).filterPost();
        }
    }

    private void switchPage(String page) {
        CardLayout layout = (CardLayout) pnlContent.getLayout();
        layout.show(pnlContent, page);

        setButtonColor(currentPage, Color.decode("#FF9717"));
        setButtonColor(page, Color.decode("#E27D00"));

        currentPage = page;
    }

    private void setButtonColor(String page, Color color) {
        switch (page) {
            case "beranda" -> {
                btnBeranda.setBackground(color);
            }
            case "profile" -> {
                btnProfile.setBackground(color);
            }
        }
    }

    public void viewPost(Post post) {
        System.out.println("hai " + post.getJudul());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlSidebar = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        btnBeranda = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        btnProfile = new javax.swing.JButton();
        btnPostinganSaya = new javax.swing.JButton();
        pnlContent = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(853, 453));

        pnlSidebar.setBackground(new java.awt.Color(255, 151, 22));

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("LostNFound");

        btnBeranda.setBackground(new java.awt.Color(255, 151, 22));
        btnBeranda.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBeranda.setForeground(new java.awt.Color(255, 255, 255));
        btnBeranda.setIcon(new javax.swing.ImageIcon(new ImageResizer("/kelompok_empat/resources/icons/beranda.png").resize(24, 24)));
        btnBeranda.setText("Beranda");
        btnBeranda.setBorder(javax.swing.BorderFactory.createEmptyBorder(4, 10, 4, 4));
        btnBeranda.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnBeranda.setIconTextGap(10);
        btnBeranda.setInheritsPopupMenu(true);
        btnBeranda.setMargin(new java.awt.Insets(2, 30, 3, 14));
        btnBeranda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBerandaActionPerformed(evt);
            }
        });

        btnLogout.setBackground(new java.awt.Color(255, 151, 22));
        btnLogout.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(255, 255, 255));
        btnLogout.setIcon(new javax.swing.ImageIcon(new ImageResizer("/kelompok_empat/resources/icons/logout.png").resize(24, 24)));
        btnLogout.setText("Logout");
        btnLogout.setBorder(javax.swing.BorderFactory.createEmptyBorder(4, 10, 4, 4));
        btnLogout.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnLogout.setIconTextGap(10);
        btnLogout.setInheritsPopupMenu(true);
        btnLogout.setMargin(new java.awt.Insets(2, 30, 3, 14));
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        btnProfile.setBackground(new java.awt.Color(255, 151, 22));
        btnProfile.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnProfile.setForeground(new java.awt.Color(255, 255, 255));
        btnProfile.setIcon(new javax.swing.ImageIcon(new ImageResizer("/kelompok_empat/resources/icons/profile.png").resize(24, 24)));
        btnProfile.setText("Profile");
        btnProfile.setBorder(javax.swing.BorderFactory.createEmptyBorder(4, 10, 4, 4));
        btnProfile.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnProfile.setIconTextGap(10);
        btnProfile.setInheritsPopupMenu(true);
        btnProfile.setMargin(new java.awt.Insets(2, 30, 3, 14));
        btnProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProfileActionPerformed(evt);
            }
        });

        btnPostinganSaya.setBackground(new java.awt.Color(255, 151, 22));
        btnPostinganSaya.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnPostinganSaya.setForeground(new java.awt.Color(255, 255, 255));
        btnPostinganSaya.setIcon(new javax.swing.ImageIcon(new ImageResizer("/kelompok_empat/resources/icons/post.png").resize(24, 24)));
        btnPostinganSaya.setText("Postingan Saya");
        btnPostinganSaya.setBorder(javax.swing.BorderFactory.createEmptyBorder(4, 10, 4, 4));
        btnPostinganSaya.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnPostinganSaya.setIconTextGap(10);
        btnPostinganSaya.setInheritsPopupMenu(true);
        btnPostinganSaya.setMargin(new java.awt.Insets(2, 30, 3, 14));
        btnPostinganSaya.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPostinganSayaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlSidebarLayout = new javax.swing.GroupLayout(pnlSidebar);
        pnlSidebar.setLayout(pnlSidebarLayout);
        pnlSidebarLayout.setHorizontalGroup(
            pnlSidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnBeranda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnLogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnProfile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnPostinganSaya, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
        );
        pnlSidebarLayout.setVerticalGroup(
            pnlSidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSidebarLayout.createSequentialGroup()
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(btnBeranda, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnPostinganSaya, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        pnlContent.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlSidebar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnlContent, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlSidebar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBerandaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBerandaActionPerformed
        switchPage("beranda");
    }//GEN-LAST:event_btnBerandaActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        getUserController().logout();
        openFrame("login");
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProfileActionPerformed
        switchPage("profile");
    }//GEN-LAST:event_btnProfileActionPerformed

    private void btnPostinganSayaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPostinganSayaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPostinganSayaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBeranda;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnPostinganSaya;
    private javax.swing.JButton btnProfile;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel pnlContent;
    private javax.swing.JPanel pnlSidebar;
    // End of variables declaration//GEN-END:variables
}
