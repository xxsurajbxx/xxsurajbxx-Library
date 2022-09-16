package xxsurajbxx.game;import javax.swing.JFrame;
import javax.swing.JPanel;import xxsurajbxx.game.Input;public class GameFrame extends JFrame {    public GameFrame(int WIDTH, int HEIGHT, String TITLE, JPanel p, Input i) {
        super(TITLE);
        this.setSize(WIDTH, HEIGHT);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setFocusable(true);        this.add(p);        this.addKeyListener(i);        this.addMouseListener(i);        this.addMouseMotionListener(i);        this.setVisible(true);        this.pack();
	}}