import java.awt.*;

public class Score extends Rectangle{

    static int GAME_WIDTH;
    static int GAME_HEIGHT;
    int p1 = 0;
    int p2 = 0;

    Score(int GAME_WIDTH, int GAME_HEIGHT){
        Score.GAME_WIDTH = GAME_WIDTH;
        Score.GAME_HEIGHT = GAME_HEIGHT;


    }
    public void draw(Graphics g){

        g.setColor(Color.CYAN);
        g.setFont(new Font("Consolas",Font.BOLD, 60));
        g.drawLine(GAME_WIDTH / 2, 0, GAME_WIDTH / 2, GAME_HEIGHT);

        g.setColor(Color.YELLOW);
        g.drawString(String.valueOf(p1), (GAME_WIDTH / 2) - 50, 50);
        g.setColor(Color.MAGENTA);
        g.drawString(String.valueOf(p2), (GAME_WIDTH / 2) + 18, 50);
    }
}
