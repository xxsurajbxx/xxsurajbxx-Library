package xxsurajbxx.game;import java.awt.image.BufferedImage;public class SpriteAnimations {    public BufferedImage frame;    public SpriteSheet.Sprite frameInfo;    private SpriteSheet spriteSheet;    private int spritesPerGroup[];    private int numOfGroups;
    private int maxFramesPerGroup;
    private int maxNumofGroups;
    private int group;
    private int img;    private SpriteSheet.Sprite SpriteGroups[][];    private long start;    public SpriteAnimations(SpriteSheet ss, int numberOfSpriteGroups, int maxNumofFramesPerGroup) {        spriteSheet = ss;        maxFramesPerGroup = maxNumofFramesPerGroup;
        maxNumofGroups = numberOfSpriteGroups;
        SpriteGroups = new SpriteSheet.Sprite[numberOfSpriteGroups][maxNumofFramesPerGroup];
        spritesPerGroup = new int[numberOfSpriteGroups];
        numOfGroups=0;    }
    public void createSpriteGroup(int begin, int end) {
        if(end-begin<=maxFramesPerGroup&&numOfGroups<maxNumofGroups) {
            for(int i=begin; i<end; i++) {
                SpriteGroups[numOfGroups][i-begin] = spriteSheet.sprites[i];
            }            spritesPerGroup[numOfGroups++] = end-begin;
        }
    }
    public void setAnimation(int index) {        if(group!=index-1) {
            if(index<=maxNumofGroups) {
                group = index-1;
                img=0;
                if(SpriteGroups[group][img].time!=0) {start = System.nanoTime();}
                frame = spriteSheet.sheet.getSubimage(SpriteGroups[group][img].x, SpriteGroups[group][img].y, SpriteGroups[group][img].width, SpriteGroups[group][img].height);                frameInfo = SpriteGroups[group][img];            }        }
    }
    public void updateImage() {        if(SpriteGroups[group][img].time!=0) {
            if(System.nanoTime()-start>=SpriteGroups[group][img].time) {                if(spritesPerGroup[group]-1>img) {
                    img++;
                }
                else {img=0;}
                frame = spriteSheet.sheet.getSubimage(SpriteGroups[group][img].x, SpriteGroups[group][img].y, SpriteGroups[group][img].width, SpriteGroups[group][img].height);                frameInfo = SpriteGroups[group][img];
                start = System.nanoTime();
            }        }
    }}