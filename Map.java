package xxsurajbxx.game;import xxsurajbxx.game.TileHandler;import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;import java.awt.Graphics;
import java.awt.Graphics2D;

public class Map {
    private int map[][];    private BufferedReader br;    private int len, wid;    public Map(int x, int y, String path) {
        map = new int[y][x];        len = x;        wid = y;        try{br = new BufferedReader(new FileReader(new File(path)));}
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
    }    public void displayMap(Graphics g, TileHandler THandler, int posx, int posy) {        Graphics2D g2 = (Graphics2D)g;        int x1=0, y1=0;        for(int y=0; y<wid; y++) {            x1=0;
            for(int x=0; x<len; x++) {
                g2.drawImage(THandler.getTile(map[y][x]), null, posx+x+x1, posy+y+y1);                x1+=THandler.getTileSize(map[y][x]);
            }            y1+=THandler.getTileSize(map[y][0]);
        }    }
}