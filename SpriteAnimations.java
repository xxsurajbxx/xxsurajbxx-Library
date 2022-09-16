package xxsurajbxx.game;
    private int maxFramesPerGroup;
    private int maxNumofGroups;
    private int group;
    private int img;
        maxNumofGroups = numberOfSpriteGroups;
        SpriteGroups = new SpriteSheet.Sprite[numberOfSpriteGroups][maxNumofFramesPerGroup];
        spritesPerGroup = new int[numberOfSpriteGroups];
        numOfGroups=0;
    public void createSpriteGroup(int begin, int end) {
        if(end-begin<=maxFramesPerGroup&&numOfGroups<maxNumofGroups) {
            for(int i=begin; i<end; i++) {
                SpriteGroups[numOfGroups][i-begin] = spriteSheet.sprites[i];
            }
        }
    }
    public void setAnimation(int index) {
            if(index<=maxNumofGroups) {
                group = index-1;
                img=0;
                if(SpriteGroups[group][img].time!=0) {start = System.nanoTime();}
                frame = spriteSheet.sheet.getSubimage(SpriteGroups[group][img].x, SpriteGroups[group][img].y, SpriteGroups[group][img].width, SpriteGroups[group][img].height);
    }
    public void updateImage() {
            if(System.nanoTime()-start>=SpriteGroups[group][img].time) {
                    img++;
                }
                else {img=0;}
                frame = spriteSheet.sheet.getSubimage(SpriteGroups[group][img].x, SpriteGroups[group][img].y, SpriteGroups[group][img].width, SpriteGroups[group][img].height);
                start = System.nanoTime();
            }
    }