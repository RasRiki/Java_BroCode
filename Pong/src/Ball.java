import java.awt.*;
import java.util.*;

public class Ball extends Rectangle{

    Random random;
    int xVelocity;
    int yVelocity;
    int speed = 2;


    Ball(int x, int y, int width, int height){
        super(x,y,width,height);
        random = new Random();
        int randomXDirection = random.nextInt(2);// 0 o 1, quindi o va a sinistra o a destra
        if(randomXDirection == 0)
            randomXDirection--;

        setXDirection(randomXDirection * speed);

        int randomYDirection = random.nextInt(2);
        if(randomYDirection == 0)
            randomYDirection--;

        setYDirection(randomYDirection * speed);

    }
    public void setYDirection(int randomYDirection){
        yVelocity = randomYDirection;
    }
    public void setXDirection(int randomXDirection){
        xVelocity = randomXDirection;
    }
    public void move(){
        x += xVelocity;
        y += yVelocity;
    }
    public void draw(Graphics g){
        g.setColor(Color.green);
        g.fillOval(x,y,width,height);
    }
}
