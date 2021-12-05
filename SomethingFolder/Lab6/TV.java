package Lab6;

public class TV {
    private boolean state = false;
    private int volume = 10;
    public int channel = 2;

    /// set
    // set Channel
    public void setChannel(int chan) {
        channel = chan;
    }

    // set Volume
    public void setVolumeUp() {
        if(volume > 20){
            System.out.println("Max Volume");
        }else{
            volume++;
        }
        
    }

    public void setVolumeDown() {
        if(volume < 20){
            System.out.println("Min Volume");
        }else{
            volume--;
        }
        
    }

    // set state
    public void setState() {
        state = !state;
    }

    /// get
    // get Channel
    public int getChannel() {
        return channel;
    }

    // get Volume
    public int getVolume() {
        return volume;
    }

    // get state
    public boolean getState() {
        return state;
    }
}
