import java.util.Objects;

public class Bug implements ConsoleNotification, Comparable<Bug>{

    private String bugDescription;

    private int bugPriority;
    private boolean bugStatus;
    private BugReporter bugReporter;

    public Bug(String bugDescription, int bugPriority, boolean bugStatus, BugReporter bugReporter) {
        this.bugDescription = bugDescription;
        this.bugPriority = bugPriority;
        this.bugStatus = bugStatus;
        this.bugReporter = bugReporter;
    }

    public Bug(String bugDescription, BugReporter bugReporter, int bugPriority) {
        this.bugDescription = bugDescription;
        this.bugReporter = bugReporter;
        this.bugPriority = bugPriority;
        this.bugStatus = false;
    }

    public Bug(String bugDescription, BugReporter bugReporter) {
    this.bugDescription=bugDescription;
    this.bugReporter=bugReporter;
    }

    public String getBugDescription() {
        return bugDescription;
    }

    public void setBugDescription(String bugDescription) {
        if (bugDescription.length() < 10) {
            System.out.println("Incorrect bug description");
        } else {
            this.bugDescription = bugDescription;
        }
    }


    public int getBugPriority() {

        return bugPriority;
    }

    public void setBugPriority(int bugPriority) {
        switch (bugPriority) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                this.bugPriority = bugPriority;
                break;
            default: {
                System.out.println("Incorrect bug priority range");
            }
        }
    }

    public boolean isBugStatus() {
        return bugStatus;
    }

    public void setBugStatus(boolean bugStatus) {

        this.bugStatus = bugStatus;
    }

    public BugReporter getBugReporter() {

        return bugReporter;
    }

    public void setBugReporter(BugReporter bugReporter) {
        notifyStatusChange();
        this.bugReporter = bugReporter;
    }

    public void showEmail(){

        System.out.println("Email"+ bugReporter.getEmail());
    }

    public void showBugStatus(){

        System.out.println("model.Bug status "+bugStatus);
    }


    @Override
    public void notifyStatusChange() {
        System.out.println("Bug has change!!!");
    }

    @Override
    public String toString() {
        return "Bug{" +
                "bugDescription='" + bugDescription + '\'' +
                ", bugPriority=" + bugPriority +
                ", bugStatus=" + bugStatus +
                ", bugReporter=" + bugReporter +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bug)) return false;
        Bug bug = (Bug) o;
        return bugPriority == bug.bugPriority && bugStatus == bug.bugStatus && Objects.equals(bugDescription, bug.bugDescription) && Objects.equals(bugReporter, bug.bugReporter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bugDescription, bugPriority, bugStatus, bugReporter);
    }

    @Override
    public int compareTo(Bug bug) {
        return this.getBugDescription().compareTo(bug.getBugDescription());
    }
}

