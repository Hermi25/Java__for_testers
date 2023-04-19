package computer;

public class Laptop extends Computer implements Music, Video {


    public int batteryLevel;

    public Laptop(String name, String type, Hdd hdd, Ram ram, int batteryLevel) {
        super(name, type, hdd, ram);
        this.batteryLevel = batteryLevel;
    }

    public Laptop(String name, String type, int i, int i1, int batteryLevel) {
        super( );
    }


    public int volumeUp() {
        return volumeLevel += 5;
    }

    @Override
    public int volumeUp(int newVolumeLevel) {
        volumeLevel = volumeLevel + newVolumeLevel;
        if (volumeLevel >= 100) {
            return 100;
        } else {
            return volumeLevel;
        }
    }

    @Override
    public int volumeDown(int newVolumeLevel) {
        volumeLevel = volumeLevel - newVolumeLevel;
        if (volumeLevel <= 0) {
            return 0;
        } else {
            return volumeLevel;
        }

    }

    @Override
    public void switchOn() {
        System.out.println("Checking battery level ");
        if (batteryLevel > 0) {
            super.switchOn();
        } else {
            System.out.println("battery level low");
        }
    }

    @Override
    public void switchOff() {
        System.out.println("Uruchamiam laptop " + name);
        state = false;
    }

    public void setBatteryLevel(int newBatteryLevel) {
        batteryLevel = newBatteryLevel;
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }

    /*
        @Override
        public int volumeUp() {
            return 0;
        }
    */

    @Override
    public void sayHello(){
        Music.super.sayHello();
    }


    @Override
    public int volumeDown() {
        return 0;
    }

    @Override
    public void playMusic() {
        System.out.println("Play music");
    }

    @Override
    public void pauseMusic() {
        System.out.println("Pause Music");
    }

    @Override
    public void stopMusic() {
        System.out.println("Stop Music");

    }

    @Override
    public void playVideo() {
        System.out.println("play video");
    }

    @Override
    public void pauseVideo() {
        System.out.println("pause video");
    }

    @Override
    public void stopVideo() {
        System.out.println("stop video");
    }
}
