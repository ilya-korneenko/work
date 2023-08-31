package streamWork.dto;

public class StudentsBuilder {
    private String name;
    private String secondName;
    private String midleName;
    private String FIO;

    private double assessment;

    private StudentsBuilder(){

    }

    public StudentsBuilder setName(String name){
        this.name = name;
        return this;
    }

    public StudentsBuilder setSecondName(String secondName){
        this.secondName = secondName;
        return this;
    }

    public StudentsBuilder setMidleName(String midleName){
        this.midleName = midleName;
        return this;
    }
    public StudentsBuilder setFIO(String FIO) {
        this.FIO = FIO;
        return this;
    }
    public StudentsBuilder setAssessment(double assessment){
        this.assessment = assessment;
        return this;
    }

    public Student build(){
        return new Student(name,secondName,midleName,assessment,FIO);
    }

    public static StudentsBuilder create(){
        return new StudentsBuilder();
    }


}
