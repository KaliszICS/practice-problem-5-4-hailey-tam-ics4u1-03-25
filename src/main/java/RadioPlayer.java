class RadioPlayer implements Player{
    private boolean onOff;
    private double[] stationList;
    private int volume;
    private double station;
    private int index;

    public RadioPlayer(double[] stationList){
        this.stationList = stationList;
        this.volume = 0;
        this.onOff = false;
        this.station = 0;
        this.index = 0;
    }

    @Override 
    public void start(){
        if (!onOff){
            onOff = true;
            this.station = this.stationList[0];
        }
    }

    @Override
    public void stop(){
        if (onOff){
            onOff = false;
            this.station = 0;
        }
    }

    public boolean getOnOff(){
        return this.onOff;
    }

    @Override
    public void volumeUp(){
        this.volume += 2;
    }

    @Override
    public void volumeDown(){
        this.volume -= 2;
    }

    public int getVolume(){
        return this.volume;
    }

    public void next(){
        this.station = this.stationList[this.index+=1];
    }

    public void previous(){
        this.station = this.stationList[this.index-=1];
    }

    public double getStation(){
        return this.station;
    }
}