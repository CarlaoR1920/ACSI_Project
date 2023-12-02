package Frontend;

import javax.swing.*;

public class Registar extends JFrame {
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JPanel registoPanel;
    private JButton cancelarButton;
    private JButton confirmarButton;

    public Registar() {
        setContentPane(registoPanel);
        setTitle("Regista-te");
        setSize(500, 450);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
}
