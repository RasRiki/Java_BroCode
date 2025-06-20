import javax.swing.*;

public class NewPage {

    JFrame frame = new JFrame();
    JLabel label = new JLabel("HELLO");

    NewPage(){

        label.setBounds(0,0,100,50);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.add(label);

    }
}
