package Frontend;

import javax.swing.*;

public class Login extends JFrame{
    private JTextField tfPass;
    private JTextField tfUser;
    private JPanel loginPanel;
    private JButton registerBtn;
    private JButton Register;

    public Login() {
    setContentPane(loginPanel);
    setTitle("TubMobile");
    setSize(500,450);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLocationRelativeTo(null);

    setVisible(true);
}

}
