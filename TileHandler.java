package xxsurajbxx.game;
import java.io.FileReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.imageio.ImageIO;
        BufferedImage TileSheet;
            for(int x=0; x<cols; x++) {
                tiles[numofTiles] = TileSheet.getSubimage(x*tileSize, y*tileSize, tileSize, tileSize);
            }
        }