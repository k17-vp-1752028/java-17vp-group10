package HomeSweetHome;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login_register1 extends JFrame{
    private JPanel rootPanel;
    private JButton loginButton;
    private JButton cancleButton;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JRadioButton maleRadioButton;
    private JRadioButton femaleRadioButton;
    private JTextField textTextField;
    private JPasswordField passwordPasswordField;

    public Login_register1() {
        //This uses the form designer form
        add(rootPanel);
        setTitle("Login Register");
        setSize(500,200);
        setLayout(new FlowLayout(FlowLayout.CENTER, 10000, 10));
        JHyperlink linkLabel = new JHyperlink("Create new account");
        linkLabel.setURL("https://www.youtube.com/watch?v=G1Zo3UKzB4A");
        getContentPane().add(linkLabel);



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

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
