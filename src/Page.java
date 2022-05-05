public class Page {
    private String title;
    private String text;
    private int pageNum;

    Page() {
    }

    Page(String title, String text) {
        this.title = title;
        this.text = text;
    }

    void addText(String newText) {
        this.text = this.text + newText;
    }


    void deleteText() {
        this.text = null;
    }

    String previewPage() {

        return this.title + this.text;
    }

    @Override
    public String toString() {
        return "Page{" +
                "title='" + title + '\'' +
                ", text='" + text + '\'' +
                ", pageNum=" + pageNum +
                '}';
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }
}