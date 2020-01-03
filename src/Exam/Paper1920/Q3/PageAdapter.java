package Exam.Paper1920.Q3;

public class PageAdapter implements PageAccess {
    private PageControl pc;

    public PageAdapter(PageControl pc) {
        this.pc = pc;
    }

    public int getPageNumber() {
        return pc.getPageId();
    }

    public void nextPage() {
        pc.forward(1);
    }

    public void previousPage() {
        pc.backward(1);
    }

    public void goTo(int pageNo) {
        pc.setPageId(pageNo);
    }
}
