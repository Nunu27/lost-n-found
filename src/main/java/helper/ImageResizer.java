/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helper;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/**
 *
 * @author wisnu
 */
public class ImageResizer {

    private String path;

    public ImageResizer(String path) {
        this.path = path.startsWith("/") ? getClass().getResource(path).getPath() : path;
    }

    public Image resize(int width, int height) {
        try {
            BufferedImage originalImage = ImageIO.read(new File(path));
            double oldRatio = (double) originalImage.getWidth() / originalImage.getHeight();
            double newRatio = (double) width / height;

            if (oldRatio > newRatio) {
                width = (int) (height * oldRatio);
            } else {
                height = (int) (width / oldRatio);
            }

            BufferedImage resizedImage = new BufferedImage(width, height, originalImage.getType());
            resizedImage.createGraphics().drawImage(originalImage.getScaledInstance(width, height, java.awt.Image.SCALE_SMOOTH), 0, 0, null);
            return resizedImage;
        } catch (IOException ex) {
            Logger.getLogger(ImageResizer.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
