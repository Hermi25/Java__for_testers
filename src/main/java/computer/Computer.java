package computer;

public abstract class Computer {


    public String name;
    private String type;
    private Hdd hdd;
    private Ram ram;
    protected boolean state;
    protected int volumeLevel;


    public Computer(String name, String type, Hdd hdd, Ram ram) {
        this.name = name;
        this.type = type;
        this.hdd = hdd;
        this.ram = ram;
        this.state = false;
        volumeLevel = 0;
    }

    public Computer() {

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Hdd getHdd() {
        return hdd;
    }

    public void setHdd(Hdd hdd) {
        this.hdd = hdd;
    }

    public Ram getRam() {
        return ram;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public void switchOn() {
        System.out.println("Ustawiam pole na true");
        state = true;
    }

    public void switchOff() {
        state = false;
        System.out.println("Rozłaczam komputer" + name);
    }


    public abstract int volumeUp();

    public abstract int volumeUp(int newVolumeLevel);


    public abstract int volumeDown();

    public abstract int volumeDown(int newVolumeLevel);

    public void setVolumeLevel(int volumeLevel) {
        this.volumeLevel = volumeLevel;
    }

    public int getVolumeLevel() {
        return volumeLevel;
    }

    public boolean startsWith(String g) {
        return false;
    }

    public boolean contains(String i) {
        return false;
    }
}
