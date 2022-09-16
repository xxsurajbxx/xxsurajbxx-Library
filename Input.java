package xxsurajbxx.game;import java.awt.event.KeyListener;import java.awt.event.MouseListener;import java.awt.event.MouseMotionListener;import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;public abstract class Input implements KeyListener, MouseListener, MouseMotionListener {    public boolean keys[];    public Input() {        keys = new boolean[256];    }    public abstract void handleInput();    public void keyPressed(KeyEvent key) {keys[key.getKeyCode()] = true;}

    public void keyReleased(KeyEvent key) {keys[key.getKeyCode()] = false;}
    public void mouseClicked(MouseEvent mouse) {}
    public void mouseMoved(MouseEvent mouse) {}
    public void keyTyped(KeyEvent key) {}
    public void mouseEntered(MouseEvent mouse) {}
    public void mouseExited(MouseEvent mouse) {}
    public void mousePressed(MouseEvent mouse) {}
    public void mouseReleased(MouseEvent mouse) {}
    public void mouseDragged(MouseEvent mouse) {}}