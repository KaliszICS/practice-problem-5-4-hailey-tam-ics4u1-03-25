class MusicPlayer implements Player{

    private boolean onOff;
    private String[] musicList;
    private String currentSong;
    private int volume;
    private int index;

    public MusicPlayer(String[] musicList){
        this.musicList = musicList;
        this.volume = 0;
        this.onOff = false;
        this.currentSong = new String[0];
        this.index = 0;
    }

    @Override
    public void start(){
        if (!onOff){
            onOff = true;
            this.currentSong = this.musicList[0];
        }
    }

    @Override
    public void stop(){
        if (onOff){
            onOff = false;
            this.currentSong = new String[0];
        }
    }

    public boolean getOnOff(){
        return this.onOff;
    }

    @Override
    public void volumeUp(){
        this.volume++;
    }

    @Override
    public void volumeDown(){
        this.volume--;
    }

    @Override
    public int getVolume(){
        return this.volume;
    }

    public void next(){
        this.currentSong = this.musicList[this.index++];
    }

    public void previous(){
        this.currentSong =  this.musicList[this.index--];
    }

    public String getCurrentSong(){
        return this.currentSong;
    } 
}