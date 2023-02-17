import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Мой проект");
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        GUIform startForm = new GUIform();
        frame.add(startForm.getRootPanel());
        frame.setVisible(true);
    }
}