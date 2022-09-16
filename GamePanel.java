package xxsurajbxx.game;import javax.swing.JPanel;import java.awt.Dimension;import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Font;public class GamePanel extends JPanel {    public GamePanel() {
        super(true);        this.setPreferredSize(new Dimension(Game.WIDTH, Game.HEIGHT));        this.setMaximumSize(new Dimension(Game.WIDTH, Game.HEIGHT));        this.setMinimumSize(new Dimension(Game.WIDTH, Game.HEIGHT));
    }
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
    }    public void drawFPS(Graphics g) {        Graphics2D g2 = (Graphics2D)g;        g2.setFont(new Font("Monospaced", Font.PLAIN, 25));         g2.setColor(Color.GREEN);        g2.drawString(String.format("FPS:%d",FramesPerSecond.fps),5,22);    }}