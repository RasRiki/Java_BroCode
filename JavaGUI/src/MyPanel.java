import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;

public class MyPanel extends JPanel implements ActionListener {

    final int PANEL_WIDTH = 500;
    final int PANEL_HEIGHT = 500;
    final int BALL_WIDTH = 30;
    final int BALL_HEIGHT = 30;
    JButton button;
    Timer timer;
    Image image;
    int xVelocity = 1;
    int yVelocity = 1;
    int x = 0;
    int y = 0;

    MyPanel(){
        this.setPreferredSize(new Dimension(PANEL_WIDTH,PANEL_HEIGHT));
        this.setBackground(Color.red);
        image = new ImageIcon("car.png").getImage();
        timer = new Timer(10,this);
        timer.start();


        this.setVisible(true);
    }

    public void paint(Graphics g){

        super.paint(g); // paint background

        Graphics2D g2D = (Graphics2D) g;
        //g2D.drawImage(image,x,y,null);
        g2D.fillOval(x,y,BALL_WIDTH,BALL_HEIGHT);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(x >= PANEL_WIDTH - image.getWidth(null) || x < 0){
            xVelocity = xVelocity * -1;// Moltiplica per -1 così andrà in negativo
        }

        if(y >= PANEL_HEIGHT - image.getHeight(null) || y < 0){
            yVelocity = yVelocity * -1;
        }
        x = x + xVelocity;

        y = y + yVelocity;
        repaint();
    }

    /*public void paint(Graphics g){

        Graphics2D g2D = (Graphics2D) g;

        g2D.setPaint(Color.blue);
        g2D.setStroke(new BasicStroke(5));
        g2D.drawLine(0,0,500,500);
        //g2D.drawRect(0,0,100,200);
        g2D.setPaint(Color.red);
        g2D.fillRect(0,0,100,200);
        //g2D.drawImage(image,0,0,null); Si posiziona come uno sfondo

    }*/
}
