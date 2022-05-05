public interface INotepad {

    void createPage(String title, String text);

    void replaceText(int pageNumber, String text) throws PageNotFoundException;

    void deleteText(int pageNumber) throws PageNotFoundException;

    void previewAllPages();
}
