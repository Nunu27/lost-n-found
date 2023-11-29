/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package kelompok_empat.view;

/**
 *
 * @author Jhiven Agnar
 */
public class NotFound extends javax.swing.JPanel {

    /**
     * Creates new form NotFound
     */
    public NotFound() {
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
        java.awt.GridBagConstraints gridBagConstraints;

        content = new javax.swing.JPanel();
        lblTidakDitemukan = new javax.swing.JLabel();
        lblGantiPencarian = new javax.swing.JLabel();
        fotoTidakDitemukan = new javax.swing.JLabel();

        setLayout(new java.awt.GridBagLayout());

        lblTidakDitemukan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTidakDitemukan.setText("Yahh.. perncarianmu ngga ada ");

        lblGantiPencarian.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGantiPencarian.setText("Coba pake keyword lain");

        fotoTidakDitemukan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kelompok_empat/resources/not_found.png"))); // NOI18N
        fotoTidakDitemukan.setText(".");

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fotoTidakDitemukan, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(lblTidakDitemukan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblGantiPencarian, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fotoTidakDitemukan, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTidakDitemukan)
                .addGap(0, 0, 0)
                .addComponent(lblGantiPencarian)
                .addContainerGap())
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 100, 6, 111);
        add(content, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel content;
    private javax.swing.JLabel fotoTidakDitemukan;
    private javax.swing.JLabel lblGantiPencarian;
    private javax.swing.JLabel lblTidakDitemukan;
    // End of variables declaration//GEN-END:variables
}
