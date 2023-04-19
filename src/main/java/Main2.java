import java.util.*;

public class Main2 {

    public static void main(String[] args) {
        List<Bug> bugs = new ArrayList<>();
        bugs.add(new Bug("Bug 2", new BugReporter("Lusia", "Kopytko", "lusia.kopytko@o2.pl")));
        bugs.add(new Bug("Bug 1", new BugReporter("Imka", "Kopytko", "imka.kopytko@o2.pl")));
        bugs.add(new Bug("Bug 2", new BugReporter("Lusia", "Kopytko", "lusia.kopytko@o2.pl")));
        bugs.add(new Bug("Bug 2", new BugReporter("Lusia", "Kopytko", "lusia.kopytko@o2.pl")));
        bugs.add(new Bug("Bug 4", new BugReporter("Gucio", "Kopytko", "gucio.kopytko@o2.pl")));
        bugs.add(new Bug("Bug 3", new BugReporter("Nadia", "Kopytko", "nadia.kopytko@o2.pl")));

        for (Bug bug : bugs) {
            System.out.println(bug.getBugDescription());
        }

        System.out.println("--------------------");

        Set<Bug> bugSet = new HashSet<>(bugs);

        for (Bug bug : bugSet) {
            System.out.println(bug.getBugDescription());

        }
        System.out.println("--------------------");

        Set<Bug> bugTreeSet = new TreeSet<>(bugSet);
        for (Bug bug : bugTreeSet) {
            System.out.println(bug.getBugDescription());
        }
        System.out.println("--------------------");

    }

    public Main2() {
        super();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }


}

