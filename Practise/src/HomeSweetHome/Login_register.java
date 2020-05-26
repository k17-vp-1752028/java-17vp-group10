package HomeSweetHome;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login_register extends JFrame{
    private JPanel rootPanel;
    private JButton loginButton;
    private JButton cancleButton;
    private JTextField textTextField;
    private JPasswordField passwordPasswordField;

    public Login_register() {
        //This uses the form designer form
        add(rootPanel);
        setTitle("Login Register");
        setSize(500,200);
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(rootPanel, "Ahihi");
            }
        });
        cancleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(rootPanel, "Ohoho");
            }
        });
    }
}
