package pkg.set_7_objects_and_classes;

public class TV {
    private final int CHANNEL_LIMIT = 120;
    private final int VOLUME_LEVEL_LIMIT = 7;

    private int channel;
    private int volumeLevel;
    private boolean on;

    public TV(){
        this.channel = 1;
        this.volumeLevel = 1;
        this.on = false;

    }

    public TV(int channel, int volumeLevel, boolean on){
        this.channel = channel;
        this.volumeLevel = volumeLevel;
        this.on = on;
    }

    public void turnOn(){
        on = true;
    }

    public void turnOff(){
        on = false;
    }

    public void setChannel(int newChannel){
        if(newChannel <= CHANNEL_LIMIT && newChannel > 0){
            channel = newChannel;
        }
    }

    public void setVolume(int newVolumeLevel){
        if(newVolumeLevel <= VOLUME_LEVEL_LIMIT && newVolumeLevel > 0){
            channel = newVolumeLevel;
        }
    }

    public void channelUp(){
        if(channel + 1 <= CHANNEL_LIMIT){
            channel++;
        }
    }

    public void channelDown(){
        if(channel - 1 > 0){
            channel++;
        }
    }

    public void volumeUp(){
        if(volumeLevel + 1 <= VOLUME_LEVEL_LIMIT){
            volumeLevel++;
        }
    }

    public void volumeDown(){
        if(volumeLevel - 1 > 0){
            volumeLevel--;
        }
    }
}
