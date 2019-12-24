package Exam.PastPaper18.Q2;

public class MemAP extends Client {
    private Member member;

    public MemAP(Member member) {
        this.member = member;
    }

    @Override
    public String getClientId() {
        return "m" + member.getId();
    }

    @Override
    public String getClientName() {
        return member.getInitials() + ", " + member.lastname;
    }
}
