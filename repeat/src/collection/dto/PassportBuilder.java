package collection.dto;

import java.time.LocalDate;

public class PassportBuilder {
    private String number;
    private String humanId;
    private LocalDate issueDate;
    private LocalDate expiresDate;

    private PassportBuilder(){
    }

    public PassportBuilder setNumber(String number) {
        this.number = number;
        return this;
    }

    public PassportBuilder setHumanId(String humanId) {
        this.humanId = humanId;
        return this;
    }

    public PassportBuilder setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
        return this;
    }

    public PassportBuilder setExpiresDate(LocalDate expiresDate) {
        this.expiresDate = expiresDate;
        return this;
    }

    public static PassportBuilder create(){
        return new PassportBuilder();
    }

    public Passport build(){
        return  new Passport(number,humanId,issueDate,expiresDate);
    }
}
