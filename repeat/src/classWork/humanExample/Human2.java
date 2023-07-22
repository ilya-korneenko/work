package classWork.humanExample;

import java.util.Arrays;

public class Human2 {
    private String firstName;
    private String secondName;
    private String[] oldLastName;

    public Human2(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.oldLastName = new String[0];
    }

    public String[] getOldLastName() {
        return this.oldLastName;
    }
    public String getFirstName() {
        return this.firstName;
    }

    public String getSecondName() {
        return this.secondName;
    }

    private void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    private void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getFio() {
        return getFirstName() + " " + getSecondName();
    }

    public void changeSecondName(String secondName) {
        String tmp = this.secondName;
        oldLastName = Arrays.copyOf(oldLastName, oldLastName.length + 1);
        oldLastName[oldLastName.length - 1] = tmp;
        this.secondName = secondName;
    }
}
