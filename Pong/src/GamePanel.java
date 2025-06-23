import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class GamePanel extends JPanel implements Runnable{

    static final int GAME_WIDTH = 750;
    static final int GAME_HEIGHT = 500;
    static final Dimension SCREEN_SIZE = new Dimension(GAME_WIDTH, GAME_HEIGHT);
    static final int BALL_DIAMETER = 10;
    static final int PADDLE_WIDTH = 15;
    static final int PADDLE_HEIGHT = 50;

    Thread gameThread;
    Image image;
    Graphics graphics;
    Random random;
    Paddle p1;
    Paddle p2;
    Ball ball;
    Score score;

    GamePanel(){
        newBall();
        newPaddle();
        score = new Score(GAME_WIDTH,GAME_HEIGHT);
        this.addKeyListener(new ActionListener());
        this.setFocusable(true);
        this.setPreferredSize(SCREEN_SIZE);
        this.setVisible(true);

        gameThread = new Thread(this);
        gameThread.start();
    }

    public void newBall(){
        random = new Random();

        ball = new Ball((GAME_WIDTH / 2) - (BALL_DIAMETER / 2), (GAME_HEIGHT / 2) - (BALL_DIAMETER / 2), BALL_DIAMETER, BALL_DIAMETER);
    }

    public void newPaddle(){
        p1 = new Paddle(0, (GAME_HEIGHT / 2) - (PADDLE_HEIGHT / 2), PADDLE_WIDTH, PADDLE_HEIGHT,1);
        p2 = new Paddle(GAME_WIDTH - PADDLE_WIDTH, (GAME_HEIGHT / 2) - (PADDLE_HEIGHT / 2), PADDLE_WIDTH, PADDLE_HEIGHT,2);
    }

    public void paint(Graphics g){
        image = createImage(getWidth(),getHeight());
        graphics = image.getGraphics();
        draw(graphics);
        g.drawImage(image,0,0,this);
    }

    public void draw(Graphics g){
        p1.draw(g);
        p2.draw(g);
        ball.draw(g);
    }

    public void move(){
        p1.move();
        p2.move();
        ball.move();
    }

    public void checkCollision(){
        //RACCHETTE
        if(p1.y <= 0){ // Se la prima racchetta tocca il bordo superiore si ferma
            p1.y = 0;
        }
        if(p1.y >= GAME_HEIGHT - PADDLE_HEIGHT){// Se la prima racchetta tocca il bordo inferiore si ferma
            p1.y = GAME_HEIGHT - PADDLE_HEIGHT;
        }
        if(p2.y <= 0){// Se la seconda racchetta tocca il bordo inferiore si ferma
            p2.y = 0;
        }
        if(p2.y >= GAME_HEIGHT - PADDLE_HEIGHT){// Se la seconda racchetta tocca il bordo superiore si ferma
            p2.y = GAME_HEIGHT - PADDLE_HEIGHT;
        }

        //PALLA CON MURO SOPRA E SOTTO
        if(ball.y <= 0 || ball.y >= GAME_HEIGHT - (BALL_DIAMETER / 2)){
            ball.setYDirection(ball.yVelocity * -1);
        }

        //PALLA CON RACCHETTA 1
        /*if(ball.x == PADDLE_WIDTH){
            if(ball.y >= p1.y && ball.y <= (p1.y + PADDLE_HEIGHT)){
                ball.xVelocity++;


                ball.setXDirection(ball.xVelocity * -1);
            }
        }*/

        if (ball.x + BALL_DIAMETER >= p1.x &&
                ball.x <= p1.x + PADDLE_WIDTH &&
                ball.y + BALL_DIAMETER >= p1.y &&
                ball.y <= p1.y + PADDLE_HEIGHT){

            ball.xVelocity++;
            ball.yVelocity++;

            ball.setXDirection(ball.xVelocity * -1);

        }

        //PALLA CON RACCHETTA 2
        /*if(ball.x + BALL_DIAMETER == (GAME_WIDTH - PADDLE_WIDTH))
            if(ball.y >= p2.y && ball.y <= (p2.y + PADDLE_HEIGHT)) {
                ball.xVelocity++;
                ball.yVelocity++;

                ball.setXDirection(ball.xVelocity * -1);
            }*/
        if (ball.x + BALL_DIAMETER >= p2.x &&
                ball.x <= p2.x + PADDLE_WIDTH &&
                ball.y + BALL_DIAMETER >= p2.y &&
                ball.y <= p2.y + PADDLE_HEIGHT){

            ball.xVelocity++;
            ball.yVelocity++;

            ball.setXDirection(ball.xVelocity * -1);

        }

    }

    public void run(){
        //Game loop
        long lastTime  = System.nanoTime();
        double amountOfTicks = 60.0;
        double ns = 1000000000 / amountOfTicks;
        double delta = 0;
        while(true){
            long now = System.nanoTime();
            delta += (now - lastTime) / ns;
            lastTime = now;
            if(delta >= 1){
                move();
                checkCollision();
                repaint();
                delta--;
                //System.out.println("TEST");
            }
        }
    }

    public class ActionListener extends KeyAdapter{
        public void keyPressed(KeyEvent e){
            p1.keyPressed(e);// Tasti W e S
            p2.keyPressed(e);// Tasti freccia SU e Freccia GIU
        }
        public void keyReleased(KeyEvent e){
            p1.keyReleased(e);// Quando W o S vengono rilasciati la racchetta si ferma
            p2.keyReleased(e);// Quando Freccia SU o Freccia GIU vengono rilasciati la racchetta si ferma
        }
    }
}
