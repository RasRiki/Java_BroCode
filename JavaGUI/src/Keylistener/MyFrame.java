package Keylistener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyFrame extends JFrame implements KeyListener {

    JLabel label;

    MyFrame(){

        this.getContentPane().setBackground(new Color(255,255,255)); // change color of the background*/
        this.setTitle("JFrame Title");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out application ( di solito al posto di exit c'è HIDE_ON_CLOSE)
        this.setLayout(null);
        this.setResizable(false); // prevent this from being resize
        this.setSize(420, 420); // Sets the x-dimension and y-dimension
        this.addKeyListener(this);



        label = new JLabel();
        label.setBounds(0,0,100,100);
        label.setBackground(Color.red);
        label.setOpaque(true);

        this.add(label);

        this.setVisible(true);// make this visible

        //ImageIcon image = new ImageIcon("Path files"); // Create an image icon
        // frame.setIconImage(image.getImage()); CHANGE ICON OF THE this

    }



    @Override
    public void keyTyped(KeyEvent e) {
        // keyTyped = Invoked when a key is typed. Uses keyChar, char output

        switch(e.getKeyChar()){
                case 'w':{
                    label.setLocation(label.getX(), label.getY() - 5);
                    break;
            }
            case 's': {
                label.setLocation(label.getX(),label.getY() + 5);
                break;
            }
            case 'a': {
                label.setLocation(label.getX()-5,label.getY());
                break;
            }
            case 'd': {
                label.setLocation(label.getX()+5,label.getY());
                break;
            }

        }
        System.out.println("X = " + label.getX());
        System.out.println("Y = " + label.getY());
    }

    @Override
    public void keyPressed(KeyEvent e) {
        // keyPressed = Invoked when a physical ke is pressed down. Uses KeyCode, int output
        switch(e.getKeyCode()){
            case 37:{
                label.setLocation(label.getX() - 5, label.getY());
                break;
            }
            case 38: {
                label.setLocation(label.getX(),label.getY() - 5);
                break;
            }
            case 39: {
                label.setLocation(label.getX() + 5,label.getY());
                break;
            }
            case 40: {
                label.setLocation(label.getX() ,label.getY() + 5);
                break;
            }

        }
        System.out.println("X = " + label.getX());
        System.out.println("Y = " + label.getY());
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // keyReleased = called whenever a button is released
        System.out.println("You released a key char: " + e.getKeyChar());
        System.out.println("You released a key code: " + e.getKeyCode());
    }
}
