import java.util.Scanner;

public class SecuredNotepad extends SimpleNotepad {

    private final String password;

    SecuredNotepad(String password) {
        this.password = password;
    }

    private boolean passwordCheck() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            System.out.printf("Input password:");
            String newPassword = sc.nextLine();
            if (newPassword.equalsIgnoreCase(this.password)) {
                System.out.println("Correct!");
                return true;
            } else {
                System.out.println("The password is incorrect!");
            }
        }
        return false;
    }

    @Override
    public void createPage(String title, String text) {
        if (passwordCheck()) {
            super.createPage(title, text);
        } else {
            System.out.println("Operation createPage WONT happen");
        }
    }

    @Override
    public void previewAllPages() {
        if (passwordCheck()) {
            super.previewAllPages();
        } else {
            System.out.println("The page is not secure!");
        }
    }
}
