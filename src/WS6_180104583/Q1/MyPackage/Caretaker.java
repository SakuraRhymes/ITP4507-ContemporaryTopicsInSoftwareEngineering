package WS6_180104583.Q1.MyPackage;

import java.util.Stack;

public class Caretaker {
    private Stack<Memento> undoList;
    private Stack<Memento> redoList;

    public Caretaker() {
        undoList = new Stack<>();
        redoList = new Stack<>();
    }

    public void saveMyClass(MyClass myClass) {
        undoList.add(new Memento(myClass));
    }

    public void undo() {
        Memento memento = undoList.pop();
        redoList.add(new Memento(memento.myClass));
        memento.restore();
    }

    public void redo() {
        Memento memento = redoList.pop();
        undoList.add(new Memento(memento.myClass));
        memento.restore();
    }
}
