package main;

import javax.swing.JPanel;
import java.awt.*;

public class GamePanel extends JPanel{


        //SCREEN SETTINGS
        final int originalTileSize = 16; // 16x16 tile
        final int scale = 3;

        final int tileSize = originalTileSize * scale; // Si creano in 16x16 ma verranno mostrati in size*scale
        final int maxScreenCol = 16;
        final int maxScreenRow = 12;
        final int screenWidth = tileSize * maxScreenCol; // 768 pixels
        final int screenHeigh = tileSize * maxScreenRow; // 576 pixels

        public GamePanel(){
            this.setPreferredSize(new Dimension(screenWidth, screenHeigh));
            this.setBackground(Color.black);
            this.setDoubleBuffered(true); //Vengono fatti in un offscreen painting buffer, migliora la rendering


    }
}
