/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package kelompok_empat.component;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileFilter;

/**
 *
 * @author wisnu
 */
public class ImageUpload extends javax.swing.JPanel {

    public String directory;
    public String fileName;
    public String extension = null;

    /**
     * Creates new form ImageUpload2
     */
    public ImageUpload() {

        initComponents();

        fileChooser.setFileFilter(new FileFilter() {
            @Override
            public boolean accept(File file) {
                String fileName = file.getName().toLowerCase();
                return file.isDirectory() || fileName.endsWith(".jpg") || fileName.endsWith(".jpeg")
                        || fileName.endsWith(".png") || fileName.endsWith(".gif") || fileName.endsWith(".bmp");
            }

            @Override
            public String getDescription() {
                return "Image Files (.jpg, .jpeg, .png, .gif, .bmp)";
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fileChooser = new javax.swing.JFileChooser();
        btnUpload = new javax.swing.JButton();

        btnUpload.setBackground(new java.awt.Color(255, 151, 23));
        btnUpload.setForeground(new java.awt.Color(255, 255, 255));
        btnUpload.setIcon(new javax.swing.ImageIcon(new ImageResizer("/kelompok_empat/resources/icons/upload.png").resize(24, 24)));
        btnUpload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUploadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnUpload, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnUpload, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    public void deleteFile() {
        if (getImagePath() == null) {
            return;
        }
        Path path = Paths.get(getImagePath());

        if (Files.exists(path)) {
            try {
                Files.delete(path);
            } catch (IOException e) {
                System.err.println("Error deleting file: " + e.getMessage());
            }
        }
    }

    private void btnUploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUploadActionPerformed

        int result = fileChooser.showOpenDialog(this);

        if (result == JFileChooser.APPROVE_OPTION) {
            deleteFile();
            try {
                File file = fileChooser.getSelectedFile();
                String rawName = file.getName();
                String fileExtension = rawName.substring(rawName.lastIndexOf('.'));
                String destinationPath = getDirectory() + fileName + fileExtension;

                Path destination = new File(destinationPath).toPath();
                Files.copy(file.toPath(), destination, StandardCopyOption.REPLACE_EXISTING);
                extension = fileExtension;
            } catch (IOException ex) {
                Logger.getLogger(getClass().getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnUploadActionPerformed

    private String getDirectory() {
        return System.getProperty("user.dir") + "/src/main/java" + directory;
    }

    public String getImagePath() {
        if (extension == null) {
            return null;
        }
        return getDirectory() + fileName + extension;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnUpload;
    private javax.swing.JFileChooser fileChooser;
    // End of variables declaration//GEN-END:variables
}