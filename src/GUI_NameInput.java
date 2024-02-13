import javax.swing.JOptionPane;
public class GUI_NameInput {

    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Please give your name");
        String message = String.format("Welcome %s", name);

        JOptionPane.showMessageDialog(null, message);
    }
}
