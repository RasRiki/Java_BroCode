import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    MyFrame(){
        
        this.setTitle("JFrame Title");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out application ( di solito al posto di exit c'è HIDE_ON_CLOSE)
        this.setResizable(false); // prevent this from being resize
        this.setSize(420, 420); // Sets the x-dimension and y-dimension
        this.setVisible(true);// make this visible

        //ImageIcon image = new ImageIcon("Path files"); // Create an image icon
        // frame.setIconImage(image.getImage()); CHANGE ICON OF THE this
        this.getContentPane().setBackground(new Color(255,255,255)); // change color of the background*/


    }
}
