package xxsurajbxx.game;
import java.io.FileReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.awt.Graphics2D;

public class Map {
    private int map[][];
        map = new int[y][x];
        catch(FileNotFoundException e) {e.printStackTrace();}
        String line;
        int z=0;
        try {
            while((line=br.readLine())!=null) {
                for(int i=0; i<line.length(); i++) {
                    map[z][i] = Integer.parseInt(line.substring(i,i+1));
                }
                z++;
            }
        }
        catch(IOException e) {e.printStackTrace();}
    }
            for(int x=0; x<len; x++) {
                g2.drawImage(THandler.getTile(map[y][x]), null, posx+x+x1, posy+y+y1);
            }
        }
}