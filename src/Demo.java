public class Demo {
    public static void main(String[] args) {
        SimpleNotepad book = new SimpleNotepad();

        book.createPage("1st", "The beginning");
        book.createPage("2", "ThePlot");
        book.createPage("3", "The Plot");
        book.createPage("4", "The Plot");
        book.createPage("5", "The end");

        try {
            book.replaceText(33, "ReplacedText");
        } catch (PageNotFoundException e) {
            e.printStackTrace();
        }

        try {
            book.deleteText(10);
        } catch (PageNotFoundException e) {
            e.printStackTrace();
        }

        book.previewAllPages();


        SimpleNotepad privateBook = new SecuredNotepad("p@rolk@");


        privateBook.createPage("1st", "The beginning");

        privateBook.createPage("2", "ThePlot");
        privateBook.createPage("5", "The Plot");
        privateBook.createPage("6", "The Plot");
        privateBook.createPage("7", "The end");

        try {
            privateBook.replaceText(2, "bla");
        } catch (PageNotFoundException e) {
            e.printStackTrace();
        }


        try {
            privateBook.deleteText(3);
        } catch (PageNotFoundException e) {
            e.printStackTrace();
        }

        privateBook.previewAllPages();

    }
}
