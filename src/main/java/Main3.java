import computer.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main3 {

    public static void main(String[] args) {

        List<computer.Computer> computers = new ArrayList<>();
        computers.add(new Laptop("MB PRO 1 ", "Pro 1", new Hdd("Dell", 500), new Ram("Dell", 120), 50));
        computers.add(new Laptop("MB PRO 2 ", "Pro 2", new Hdd("HP", 600), new Ram("HP", 100), 10));
        computers.add(new Laptop("MB PRO 3 ", "Pro 3", new Hdd("Samsung", 800), new Ram("Omega", 140), 100));
        computers.add(new Laptop("MB PRO 4 ", "Pro 4", new Hdd("MC", 500), new Ram("Alfa", 150), 10));
        computers.add(new Laptop("MB PRO 5 ", "Pro 5", new Hdd("HP", 600), new Ram("Beta", 180), 10));
        computers.add(new Laptop("MB PRO 6 ", "Pro 6", new Hdd("Dell", 900), new Ram("Hp", 120), 90));
        computers.add(new Pc("Lusiator 3000", "PROMAX", new Hdd("ULTRAMAX", 9000), new Ram("KING", 32), true));
        computers.add(new Pc("ImkaMAx", "Max", new Hdd("ULTRAMAX", 9000), new Ram("QUEEN", 32), true));
        computers.add(new Pc("Guciotronik", "Turbohiper", new Hdd("Turbo", 9000), new Ram("KING", 32), true));


        computers.stream()
                .filter(str -> str.startsWith("G"))
                .filter(str -> str.contains("i"))
               // .filter(str -> str.endsWith("t"))
                .forEach(str -> System.out.println(str));


        // zadanie 1
        long count = computers.stream()
                .filter(com -> com.getRam().getSize() > 120)
                .count();

        System.out.println(count);

        //zadanie 2
        computers.stream()
                .map(computer.Computer::getType)
                .forEach(System.out::println);

        //zadanie 3
        Optional<computer.Computer> max1 = computers.stream()
               .max((o1, o2) ->
               {
                   int ram1 = o1.getRam().getSize();
                   int ram2 = o2.getRam().getSize();
                   return Math.max(ram1, ram2);
               });

        Optional<Integer> max2 = computers.stream()
                .map(computer.Computer::getRam)
                .map(Ram::getSize)
                .max(Comparator.naturalOrder());

        //zadanie 4
        List<computer.Computer> collect = computers.stream()
                .filter(com ->com.getHdd().getSize()<500)
                .collect(Collectors.toList());

        for (computer.Computer com :collect){
            System.out.println(com.getName() + " " +com.getHdd());
        }


















    }



}