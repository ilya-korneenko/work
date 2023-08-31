package streamWork.dto;

import java.io.Serializable;

public class Student implements Serializable {
    private String name;
    private String secondName;
    private String midleName;
    private String FIO;
    private double assessment;
    public Student(){
    }

    public Student(String name, String secondName, String midleName, double assessment, String FIO) {
        this.name = name;
        this.secondName = secondName;
        this.midleName = midleName;
        this.assessment = assessment;
        this.FIO = FIO;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public String getFIO() {
        return FIO;
    }

    public String getName() {
        return name;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getMidleName() {
        return midleName;
    }

    public void setAssessment(double assessment) {
        this.assessment = assessment;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public double getAssessment() {
        return assessment;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", secondName='" + secondName + '\'' +
                ", midleName='" + midleName + '\'' +
                ", FIO='" + FIO + '\'' +
                ", assessment=" + assessment +
                '}';
    }

    public void setMidleName(String midleName) {
        this.midleName = midleName;
    }
}

