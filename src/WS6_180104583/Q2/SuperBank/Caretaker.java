package WS6_180104583.Q2.SuperBank;

import java.util.Stack;

public class Caretaker {
    private Stack<Memento> undoList;
    private Stack<Memento> redoList;

    public Caretaker() {
        undoList = new Stack<>();
        redoList = new Stack<>();
    }

    public void saveAccount(Account account) {
        undoList.add(new AccountMemento(account));
    }

    public void saveCustomer(Customer customer) {
        undoList.add(new CustomerMemento(customer));
    }

    public void undo() {
        Memento memento = undoList.pop();
        System.out.print("\nUndo");
        if (memento instanceof AccountMemento) {
            redoList.add(new AccountMemento(((AccountMemento) memento).account));
        } else if (memento instanceof CustomerMemento) {
            redoList.add(new CustomerMemento(((CustomerMemento) memento).customer));
        }
        memento.restore();
    }

    public void redo() {
        Memento memento = redoList.pop();
        System.out.print("\nRedo");
        if (memento instanceof AccountMemento) {
            undoList.add(new AccountMemento(((AccountMemento) memento).account));
        } else if (memento instanceof CustomerMemento) {
            undoList.add(new CustomerMemento(((CustomerMemento) memento).customer));
        }
        memento.restore();
    }
}
