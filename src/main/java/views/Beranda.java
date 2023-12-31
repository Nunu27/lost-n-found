/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package views;

import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.JSeparator;
import entity.Post;

/**
 *
 * @author wisnu
 */
public class Beranda extends javax.swing.JPanel implements DataConsumer {

    private NavbarLayout navbarLayout;

    /**
     * Creates new form BerandaNew
     *
     * @param navbarLayout
     */
    public Beranda(NavbarLayout navbarLayout) {
        this.navbarLayout = navbarLayout;

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

        tfKeyword = new javax.swing.JTextField();
        cbKategori = new javax.swing.JComboBox<>();
        btnCari = new javax.swing.JButton();
        contentScroller = new javax.swing.JScrollPane();
        contentContainer = new javax.swing.JPanel();

        setBackground(new java.awt.Color(241, 241, 241));

        tfKeyword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfKeywordActionPerformed(evt);
            }
        });

        cbKategori.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cbKategori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Semua", "Lost", "Found" }));

        btnCari.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnCari.setText("Cari");
        btnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariActionPerformed(evt);
            }
        });

        contentContainer.setBackground(new java.awt.Color(255, 255, 255));
        contentContainer.setLayout(new javax.swing.BoxLayout(contentContainer, javax.swing.BoxLayout.Y_AXIS));
        contentScroller.setViewportView(contentContainer);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(tfKeyword, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbKategori, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCari)
                .addGap(5, 5, 5))
            .addComponent(contentScroller)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfKeyword, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(cbKategori)
                    .addComponent(btnCari, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contentScroller, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public void updateData() {
        filterPost();
    }
    
    private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
        filterPost();
    }//GEN-LAST:event_btnCariActionPerformed

    private void tfKeywordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfKeywordActionPerformed
        filterPost();
    }//GEN-LAST:event_tfKeywordActionPerformed

    public void filterPost() {
        String keyword = tfKeyword.getText();
        String kategori = cbKategori.getSelectedItem().toString();

        setListContent(navbarLayout.getPostController().searchPost(keyword, kategori));
    }

    public void setListContent(ArrayList<Post> posts) {
        contentContainer.removeAll();

        if (posts.isEmpty()) {
            contentContainer.add(new NotFound());
        } else {
            for (Post post : posts) {
                JSeparator separator = new JSeparator();
                separator.setMaximumSize(new Dimension(32767, 3));

                contentContainer.add(new PostItem(navbarLayout, post));
                contentContainer.add(separator);
            }
        }

        contentContainer.updateUI();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCari;
    private javax.swing.JComboBox<String> cbKategori;
    private javax.swing.JPanel contentContainer;
    private javax.swing.JScrollPane contentScroller;
    private javax.swing.JTextField tfKeyword;
    // End of variables declaration//GEN-END:variables
}
