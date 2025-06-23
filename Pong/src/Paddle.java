import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class Paddle extends Rectangle{

    int id;
    int yVelocity;
    int speed = 7;

    Paddle(int x, int y, int PADDLE_WIDTH, int PADDLE_HEIGHT, int id){
        super(x,y,PADDLE_WIDTH,PADDLE_HEIGHT);
        this.id = id;
    }

    public void keyPressed(KeyEvent e){
        if(id==1){
            if(e.getKeyCode() == 87){
                setYDirection(-speed);
                move();
            }else if(e.getKeyCode() == 83){
                setYDirection(speed);
                move();
            }
        }else {
            if(e.getKeyCode() == 38){
                setYDirection(-speed);
                move();
        }else if(e.getKeyCode() == 40){
                setYDirection(speed);
                move();
        }
    }
    }

    public void keyReleased(KeyEvent e){
        if(id==1){
            if(e.getKeyCode() == 87){
                setYDirection(0);
                move();
            }else if(e.getKeyCode() == 83){
                setYDirection(0);
                move();
            }
        }else {
            if(e.getKeyCode() == 38){
                setYDirection(0);
                move();
            }else if(e.getKeyCode() == 40){
                setYDirection(0);
                move();
            }
        }
    }

    public void setYDirection(int yDirection){
        yVelocity = yDirection;
    }
    public void move(){
        y = y + yVelocity;
    }
    public void draw(Graphics g){
        if(id == 1){
            g.setColor(Color.blue);
            g.fillRect(x,y,width,height);
        }else
        {
            g.setColor(Color.red);
            g.fillRect(x,y,width,height);
        }
    }

}
