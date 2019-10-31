package Test.Adapter;

class Member {
    String id;
    String lastname;
    String initials;

    public Member(String id, String lastname, String initials) {
        this.id = id;
        this.lastname = lastname;
        this.initials = initials;
    }

    public String getId() {
        return id;
    }

    public String getLastname() {
        return lastname;
    }

    public String getInitials() {
        return initials;
    }
}