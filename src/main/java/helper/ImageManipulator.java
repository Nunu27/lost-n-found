/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helper;

import java.awt.Graphics2D;
import java.awt.geom.RoundRectangle2D;
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
public class ImageManipulator {

    private BufferedImage image;
    private int width;
    private int height;
    
    public ImageManipulator(String path) {
        path = path.startsWith("/") ? getClass().getResource(path).getPath() : path;

        try {
            image = ImageIO.read(new File(path));
            height = image.getHeight();
            width = image.getWidth();
        } catch (IOException ex) {
            Logger.getLogger(ImageManipulator.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public BufferedImage getImage() {
        return image;
    }

    public ImageManipulator resize(int width, int height) {
        double oldRatio = (double) image.getWidth() / image.getHeight();
        double newRatio = (double) width / height;

        this.width = width;
        this.height = height;

        if (oldRatio > newRatio) {
            width = (int) (height * oldRatio);
        } else {
            height = (int) (width / oldRatio);
        }

        BufferedImage resizedImage = new BufferedImage(width, height, image.getType());
        Graphics2D g2d = resizedImage.createGraphics();

        g2d.drawImage(image.getScaledInstance(width, height, java.awt.Image.SCALE_SMOOTH), 0, 0, null);
        g2d.dispose();
        image = resizedImage;

        return this;
    }

    public ImageManipulator setRoundedCorner(int cornerRadius) {
        BufferedImage roundedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = roundedImage.createGraphics();

        RoundRectangle2D roundRect = new RoundRectangle2D.Float(0, 0, width, height, cornerRadius, cornerRadius);
        g2d.clip(roundRect);
        g2d.drawImage(image, 0, 0, null);
        g2d.dispose();
        image = roundedImage;

        return this;
    }
}
