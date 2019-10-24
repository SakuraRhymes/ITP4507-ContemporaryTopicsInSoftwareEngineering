package WS6_180104583.Q1.MyPackage;

public class Memento {
    MyClass myClass;
    private int mState;

    public Memento(MyClass myClass) {
        this.myClass = myClass;
        mState = myClass.state;
    }

    public void restore() {
        myClass.state = mState;
    }
}
