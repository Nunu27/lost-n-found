/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kelompok_empat.view;

import javax.swing.JFrame;

/**
 *
 * @author hp
 */
public class MyPostTest {
    JFrame frame = new JFrame();
    MyPost panel = new MyPost();    
    
    private void initialize(){
        
        for(int i = 1; i <= 10; i++){
            panel.tambahMyPost();
        }        
        frame.setSize(700, 365);
        frame.add(panel);
        frame.setVisible(true);
        
    }
       
    
    public static void main(String[] args) {
        new MyPostTest().initialize();
    }
}
