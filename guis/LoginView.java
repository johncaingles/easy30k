package guis;

import animohacks.AnimoHacksController;
import animohacks.AnimoHacksModel;
import animohacks.DBConnection;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
 
public class LoginView{
    private String Username = "";
    private String Password = "";
    private String msg = "";
    private AnimoHacksController ahc;

    public LoginView(AnimoHacksController ahc)
    {
        this.ahc = ahc;
    }
     
     

    public void go(){
        JFrame frame = new JFrame("Welcome to Donate!");
        frame.setLocationRelativeTo(null);
        frame.setSize(500, 500);
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
     
        //btnLogin.setBounds(50, 140, 100, 20);
        panel.add(lblUsername);
        panel.add(txtUsername);
        panel.add(lblPassword);
        panel.add(txtPassword);
        panel.add(btnLogin);
        panel.add(btnCancel);
        frame.getContentPane().add(BorderLayout.CENTER,panel);
 
 
 
        frame.setSize(350,200);
        frame.setVisible(true);
        
        	btnLogin.addActionListener(new ActionListener() {
                        @Override
			public void actionPerformed(ActionEvent e) {
                            boolean checkAccount = false;
                            try
                            {
                                checkAccount = ahc.checkAccount(txtUsername.getText(),new String(txtPassword.getPassword()));
                            } catch (SQLException ex)
                            {
                                Logger.getLogger(LoginView.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            if(checkAccount == false)
                                JOptionPane.showMessageDialog(null, "Sorry you have entered inavalid username or password");
                            else
                                //System.out.println("hello");
                            {
                            Main start = new Main(ahc,txtUsername.getText());
                            
                            frame.setVisible(false);
                                try
                                {
                                    ahc.CreateMain();
                                } catch (SQLException ex)
                                {
                                    Logger.getLogger(LoginView.class.getName()).log(Level.SEVERE, null, ex);
                                }
                                try
                                {
                                    start.setPost(ahc.getPost());
                                } catch (IOException ex)
                                {
                                    Logger.getLogger(LoginView.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            start.setVisible(true);
                            
                            }
                                
                            

                                
			}
		});
 
 
    }
 

}