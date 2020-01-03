package Exam.Paper1920.Q3;

public class PageControl {
    // current Page id and page topic
    private int pageId = 0;
    String topic;

    public PageControl(String topic) {
        this.topic = topic;
    }

    public int getPageId() {
        return pageId;
    } // get the page id

    public int forward(int n) { // increase the page id by n
        pageId = pageId + n;
        return getPageId();
    }

    public int backward(int n) { // decrease the page id by n
        pageId = pageId - n;
        return getPageId();
    }

    public int setPageId(int id) { // set page id
        pageId = id;
        return getPageId();
    }
}