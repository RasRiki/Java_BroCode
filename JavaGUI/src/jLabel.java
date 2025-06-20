import javax.swing.*;

public class jLabel {

    public static void main(String[] args){

        //JLabel = a GUI display area for a string of text, an image, or both

        ImageIcon icon = new ImageIcon("PathFile");

        JLabel label = new JLabel();
        label.setText("DDDD");
        label.setIcon(icon);
        label.setHorizontalTextPosition(JLabel.CENTER); // set text LEFT,CENTER, RIGHT of ImageIcon
        label.setVerticalTextPosition(JLabel.TOP); // set text TOP,CENTER, BOTTOM of ImageIcon
        

        MyFrame frame = new MyFrame();

        frame.add(label);

    }
}
