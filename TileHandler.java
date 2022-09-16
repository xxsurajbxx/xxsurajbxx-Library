package xxsurajbxx.game;import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.imageio.ImageIO;import java.awt.image.BufferedImage;public class TileHandler {    private int numofTiles;    private BufferedImage tiles[];    private int tileSizes[];    public TileHandler(int numofTiles) {        this.numofTiles = 0;        tiles = new BufferedImage[numofTiles];        tileSizes = new int[numofTiles];    }    public TileHandler(String path, int rows, int cols, int tileSize) {        this(rows*cols);        addTileSheet(path, rows, cols, tileSize);    }    public void addTileSheet(String path, int rows, int cols, int tileSize) {
        BufferedImage TileSheet;        try {TileSheet = ImageIO.read(new File(path));}        catch(IOException e) {e.printStackTrace(); return;}        for(int y=0; y<rows; y++) {
            for(int x=0; x<cols; x++) {
                tiles[numofTiles] = TileSheet.getSubimage(x*tileSize, y*tileSize, tileSize, tileSize);                tileSizes[numofTiles++] = tileSize;
            }
        }    }    public void addTile(String path, int tileSize) {        try {tiles[numofTiles] = ImageIO.read(new File(path));}        catch(IOException e) {e.printStackTrace();}        tileSizes[numofTiles++] = tileSize;    }    public BufferedImage getTile(int index) {        return tiles[index];    }    public int getTileSize(int index) {        return tileSizes[index];    }}