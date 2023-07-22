package collection.dto;

import java.time.LocalDate;
import java.util.Objects;

public class Passport {

    private final String number;
    private final String humanId;
    private final LocalDate issueDate;
    private final LocalDate expiresDate;

    public Passport(String number,
                    String humanId,
                    LocalDate issueDate,
                    LocalDate expiresDate) {
        this.number = number;
        this.humanId = humanId;
        this.issueDate = issueDate;
        this.expiresDate = expiresDate;
    }

    public String getNumber() {
        return number;
    }

    public String getHumanId() {
        return humanId;
    }

    public LocalDate getIssueDate() {
        return issueDate;
    }

    public LocalDate getExpiresDate() {
        return expiresDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passport passport = (Passport) o;
        return Objects.equals(number, passport.number) && Objects.equals(humanId, passport.humanId) && Objects.equals(issueDate, passport.issueDate) && Objects.equals(expiresDate, passport.expiresDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, humanId, issueDate, expiresDate);
    }

    @Override
    public String toString() {
        return "Passport{" +
                "number='" + number + '\'' +
                ", humanId='" + humanId + '\'' +
                ", issueDate=" + issueDate +
                ", expiresDate=" + expiresDate +
                '}';
    }
}
