package Exam.Paper1920.Q4;

import java.util.Stack;

public class CareTaker {
    private Stack<StudentMemento> undoList;

    public CareTaker() {
        undoList = new Stack<>();
    }

    public void saveStudent(Student std) {
        undoList.push(new StudentMemento(std));
    }

    public void undo() {
        if (!undoList.empty()) {
            undoList.pop().restore();
        }
    }
}
