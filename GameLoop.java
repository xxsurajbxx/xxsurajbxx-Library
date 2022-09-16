package xxsurajbxx.game;public abstract class GameLoop {    public static boolean loss;    public static void loop(Game g) {        loss=false;        FramesPerSecond.start();        while(!loss) {            if(FramesPerSecond.updateTime()) {
				g.update();
			}
            FramesPerSecond.updateFPS();        }    }}