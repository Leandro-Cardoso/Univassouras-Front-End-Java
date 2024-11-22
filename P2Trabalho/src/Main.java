import java.util.List;
import java.util.ArrayList;

public class Main {
    private static List<User> users = new ArrayList<>();
    
    public static void openScreen(javax.swing.JFrame frame) {
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public static void add(User user) {
        users.add(user);
    }

    public static List<User> getUsers() {
        return users;
    }
    
    public static void main(String[] args) {
        openScreen(new TelaIntroducao());
    }
}
