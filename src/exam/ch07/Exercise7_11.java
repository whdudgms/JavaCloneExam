package exam.ch07;

class MyTv{
    private boolean isPowenOn;
    private int volume;
    private int channel;

    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 0;

    public boolean isPowenOn() {
        return isPowenOn;
    }

    public void setPowenOn(boolean powenOn) {
        isPowenOn = powenOn;
    }

    public int getChannel() {
        return channel;
    }

        public void setChannel(int channel) {
        this.channel = channel;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}

public class Exercise7_11 {
}
