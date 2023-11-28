/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package kelompok_empat.view;

import java.awt.FlowLayout;

/**
 *
 * @author hp
 */
public class MyPostItem extends javax.swing.JPanel {

    /**
     * Creates new form MyPost
     */
    public MyPostItem() {
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

        panelPostingan = new javax.swing.JPanel();
        labelFoto = new javax.swing.JLabel();
        labelJudul = new javax.swing.JLabel();
        labelNamaBarang = new javax.swing.JLabel();
        labelKategori = new javax.swing.JLabel();
        labelTanggal = new javax.swing.JLabel();

        panelPostingan.setForeground(new java.awt.Color(255, 204, 204));

        labelFoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelFoto.setText("FOTO");
        labelFoto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        labelJudul.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelJudul.setText("Ini Bagian Judul");

        labelNamaBarang.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelNamaBarang.setText("Ini Bagian Nama Barang");

        labelKategori.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelKategori.setText("Ini Kategori");

        labelTanggal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelTanggal.setText("Ini Tanggal");

        javax.swing.GroupLayout panelPostinganLayout = new javax.swing.GroupLayout(panelPostingan);
        panelPostingan.setLayout(panelPostinganLayout);
        panelPostinganLayout.setHorizontalGroup(
            panelPostinganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPostinganLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPostinganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPostinganLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(labelFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(labelJudul, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelNamaBarang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelPostinganLayout.createSequentialGroup()
                        .addComponent(labelKategori, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panelPostinganLayout.setVerticalGroup(
            panelPostinganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPostinganLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelJudul)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelNamaBarang)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPostinganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelKategori)
                    .addComponent(labelTanggal))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPostingan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPostingan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel labelFoto;
    private javax.swing.JLabel labelJudul;
    private javax.swing.JLabel labelKategori;
    private javax.swing.JLabel labelNamaBarang;
    private javax.swing.JLabel labelTanggal;
    private javax.swing.JPanel panelPostingan;
    // End of variables declaration//GEN-END:variables
}
