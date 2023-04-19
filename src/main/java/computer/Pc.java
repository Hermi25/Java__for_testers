package computer;

public class Pc extends Computer {
    private boolean ispowerSupply;

    public Pc(String name, String type, Hdd hdd, Ram ram, boolean powerSupply) {
        super(name, type, hdd, ram);
        this.ispowerSupply = false;
    }

    public void showComputerName() {
        System.out.println(name);
    }

    public void setIspowerSupply(boolean ispowerSupply) {
        this.ispowerSupply = ispowerSupply;
    }

    public int volumeUp() {
        return volumeLevel += 1;
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
    public int volumeDown() {
        volumeLevel -= 1;
        if (volumeLevel <= 0) {
            return 0;
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
        System.out.println("checking power supply");
        {
            if (ispowerSupply) {
                super.switchOn();
            } else {
                System.out.println("Power supply is missing");
            }
        }
    }

    @Override
    public void switchOff() {
        System.out.println("Wyłacz PC" + name);
        state = false;
    }
}
