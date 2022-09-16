package xxsurajbxx.game;public abstract class FramesPerSecond implements Runnable {    public void run() {}    private static long updateTimer;
    private static long fpsTimer;
    private static int frames;
    private static long fpsCap;    public static int fps;    static {        frames=0;        fps=0;    }    public static void setFPSCap(int f) {        fpsCap = 1000000000/f;    }    public static void start() {        updateTimer = System.nanoTime();        fpsTimer = System.nanoTime();    }    public static void addFrame() {        frames++;    }    public static boolean updateTime() {        if(System.nanoTime()-updateTimer>=fpsCap) {            updateTimer = System.nanoTime();            return true;        }        else {return false;}    }    public static void updateFPS() {        if(System.nanoTime()-fpsTimer>=1000000000) {            fps=frames;
            frames=0;
            fpsTimer = System.nanoTime();        }    }}