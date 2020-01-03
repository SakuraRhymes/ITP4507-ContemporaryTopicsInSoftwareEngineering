package Exam.Paper1920.Q3;

public interface PageAccess {
    public int getPageNumber();
    // get the current page    number

    public void nextPage();
    //increase the page    number by 1

    public void previousPage();
    //decrease the page    number by 1

    public void goTo(int pageNo);
    // set the page number
}
