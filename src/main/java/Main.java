import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Технический осмотр: Помощник");
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        StartForm form = new StartForm();
        frame.add(form.getRootPanel());
        frame.setVisible(true);
    }
}