/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kelompok_empat.component;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author wisnu
 */
public class ImageResizer {

    private String path;

    public ImageResizer(String path) {
        this.path = path;
    }

    public Image resize(int width, int height) {
        Image img = new ImageIcon(getClass().getResource(path)).getImage();
        return img.getScaledInstance(width, height, java.awt.Image.SCALE_SMOOTH);
    }
}
