package Test.Adapter;

public class MemAP extends Client {
    private Member member;

    public MemAP(Member member) {
        this.member = member;
    }

    @Override
    public String getClientId() {
        return "m" + member.id;
    }

    @Override
    public String getClientName() {
        return member.initials + "," + member.lastname;
    }
}
