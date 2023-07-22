package classWork.humanExample;

public class Human {
    private String firstName;
    private String secondName;

    public Human(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
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
        setSecondName(secondName + " (ранее " + tmp + ")");
        System.out.println( getFio());
    }
}
