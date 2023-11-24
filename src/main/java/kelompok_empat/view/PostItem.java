/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package kelompok_empat.view;

import javax.swing.ImageIcon;
import kelompok_empat.component.ImageResizer;
import kelompok_empat.entity.Post;

/**
 *
 * @author wisnu
 */
public class PostItem extends javax.swing.JPanel {

    private NavbarLayout navbarLayout;
    private Post post;

    public PostItem(NavbarLayout navbarLayout, Post post) {
        this.navbarLayout = navbarLayout;
        this.post = post;

        initComponents();
        updateData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblFoto = new javax.swing.JLabel();
        lblJudul = new javax.swing.JLabel();
        lblNama = new javax.swing.JLabel();
        lblLokasi = new javax.swing.JLabel();
        lblAuthor = new javax.swing.JLabel();
        lblTimestamp = new javax.swing.JLabel();

        setBackground(new java.awt.Color(241, 241, 241));
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setMaximumSize(new java.awt.Dimension(32767, 102));
        setMinimumSize(new java.awt.Dimension(361, 102));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        lblFoto.setText("Foto");
        lblFoto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblJudul.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblJudul.setText("Judul");
        lblJudul.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblNama.setText("Nama Barang");
        lblNama.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblLokasi.setText("Lokasi");
        lblLokasi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblAuthor.setText("Ditemukan oleh John Doe");
        lblAuthor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblTimestamp.setText("5 menit yang lalu");
        lblTimestamp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblJudul, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblAuthor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                        .addComponent(lblTimestamp))
                    .addComponent(lblNama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblLokasi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 8, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblJudul)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNama)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblLokasi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAuthor)
                            .addComponent(lblTimestamp)))
                    .addComponent(lblFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        navbarLayout.viewPost(post);
    }//GEN-LAST:event_formMouseClicked

    private void updateData() {
        if (post.getPathFoto().isBlank()) {
            lblFoto.setIcon(null);
        } else {
            lblFoto.setIcon(new ImageIcon(new ImageResizer(post.getPathFoto()).resize(92, 92)));
        }

        lblJudul.setText(post.getJudul());
        lblNama.setText(post.getNamaBarang());
        lblLokasi.setText(post.getAlamat());
        lblAuthor.setText("Diposting oleh " + post.getDipostingOleh().getNama());
        lblTimestamp.setText(post.getRelativeTime());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblAuthor;
    private javax.swing.JLabel lblFoto;
    private javax.swing.JLabel lblJudul;
    private javax.swing.JLabel lblLokasi;
    private javax.swing.JLabel lblNama;
    private javax.swing.JLabel lblTimestamp;
    // End of variables declaration//GEN-END:variables
}
