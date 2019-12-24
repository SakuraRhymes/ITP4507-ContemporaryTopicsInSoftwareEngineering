package Exam.PastPaper18.Q2;

public class Member {
    int id;
    String lastname;
    String initials;

    public Member(int id, String lastname, String initials) {
        this.id = id;
        this.lastname = lastname;
        this.initials = initials;
    }

    public int getId() {
        return id;
    }

    public String getLastname() {
        return lastname;
    }

    public String getInitials() {
        return initials;
    }
}
