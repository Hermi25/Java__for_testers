import computer.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Bug> bugs = new ArrayList<>();

        BugReporter bugReporter = new BugReporter("Buka", "Bułkowata", "buka.buka@buka.pl");
        bugs.add(new Bug("Kopytka bola", bugReporter, 1));
        Bug bug = new Bug("internet is no ok", bugReporter, 5);

        System.out.println(bug);
        bug.setBugStatus(true);
        System.out.println(bug);

        bugs.forEach(System.out::println);

        Hdd hdd = new Hdd("Samsung", 500);
        Ram ram = new Ram("AAA", 128);
        Laptop mac = new Laptop("MAC", "Pro", hdd, ram, 100);
        System.out.println(mac.getRam().getSize());

        Pc officeComputer = new Pc("Office Computer", "HP",  hdd, ram, true);
        Laptop laptop = new Laptop("Gaming Computer", "HP Games", 500, 256, 100) {
            @Override
            public int volumeUp() {
                return 0;
            }

            @Override
            public int volumeDown() {
                return 0;
            }
        };

        officeComputer.switchOn();
        System.out.println(officeComputer.isState());

        laptop.switchOn();
        System.out.println(laptop.isState());


        officeComputer.volumeUp();
        System.out.println(officeComputer.getVolumeLevel());
        officeComputer.volumeUp(50);
        System.out.println(officeComputer.getVolumeLevel());

        officeComputer.volumeUp();
        System.out.println(officeComputer.getVolumeLevel());
        officeComputer.volumeDown(10);
        System.out.println(officeComputer.getVolumeLevel());
        //// zle liczy bo jest n -
        officeComputer.volumeUp();
        officeComputer.volumeDown(100);
        System.out.println(officeComputer.getVolumeLevel());


        laptop.playMusic();
        laptop.pauseMusic();
        laptop.stopMusic();

        laptop.sayHello();


        laptop.playVideo();
        laptop.pauseVideo();
        laptop.stopVideo();


    }
}

