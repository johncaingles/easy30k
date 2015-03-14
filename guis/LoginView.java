package guis;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
 
public class LoginView{
    String Username = "james3302";
    String Password = "pass";
    String msg = " ";
     
     
    public static void main(String[] args){
        LoginView gui = new LoginView();
        gui.go();
    }
    public void go(){
        JFrame frame = new JFrame();
        frame.setLocationRelativeTo(null);
        //frame.setSize(, 9999);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        JLabel lblUsername = new JLabel("Username:");   
        JLabel lblPassword = new JLabel("Password:");
        JTextField txtUsername = new JTextField(20);
        JPasswordField txtPassword = new JPasswordField(20);
        JButton btnLogin = new JButton("Login");
        //btnLogin.addActionListener(new LoginListener());
        JButton btnCancel = new JButton("Cancel");
        //btnCancel.addActionListener(new CancelListener());
     
 
        panel.add(lblUsername);
        panel.add(txtUsername);
        panel.add(lblPassword);
        panel.add(txtPassword);         
        frame.getContentPane().add(BorderLayout.CENTER,panel);
 
 
 
        frame.setSize(300,300);
        frame.setVisible(true);
 
 
    }
 

}