package com.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegisterFrame extends JFrame implements ActionListener {

    private JTextField txtFname, txtLname;
    private JLabel lblMessage;
    private JButton btnRegister;

    public RegisterFrame() {
        super("Registration");
        setLayout(new FlowLayout());

        lblMessage = new JLabel("Enter names");
        add(lblMessage);
        txtFname = new JTextField(15);
        add(txtFname);
        txtLname = new JTextField(15);
        add(txtLname);
        btnRegister = new JButton("Register");
        add(btnRegister);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnRegister){
            lblMessage.setText("Welcome: "+txtFname.getText());
            JOptionPane.showMessageDialog(null, "Registration successful",
                    "Success", JOptionPane.PLAIN_MESSAGE);
        }
    }

    public static void main(String[] args){
        RegisterFrame frame = new RegisterFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 300);
        frame.setVisible(true);
    }
}
