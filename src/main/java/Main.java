import services.UserService;
import ui.Application;

public class Main {
    public static void main(String[] args) {
        new Application(new UserService()).run();
    }
}