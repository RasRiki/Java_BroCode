import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class Score extends Rectangle{

    static int GAME_WIDTH;
    static int GAME_HEIGHT;
    int p1 = 0;
    int p2 = 0;

    Score(int GAME_WIDTH, int GAME_HEIGHT){
        super(GAME_WIDTH,GAME_HEIGHT);
    }
    public void draw(Graphics g){

        g.setColor(Color.CYAN);
        g.drawRect(GAME_WIDTH / 4, GAME_HEIGHT / 4, 100, 50);
        String s = String.valueOf(p1);

        //g.drawString(p1, GAME_WIDTH, GAME_HEIGHT);
    }
}
