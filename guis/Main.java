package guis;

import animohacks.AnimoHacksController;
import animohacks.Post;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;
public class Main extends JFrame{
        private AnimoHacksController ahc;
	private JPanel btnDonatePanel;
        private JLabel lblIcon;
        private JLabel lblNews;
        private JLabel donors;
        private JLabel lblTarget;
        
        private JLabel lblIcon2;
        private JLabel lblNews2;
        private JLabel lblDonor2;
        private JLabel lblTarget2;
        
        private JLabel lblIcon3;
        private JLabel lblNews3;
        private JLabel lblDonor3;
        private JLabel lblTarget3;
        
        private JLabel lblIcon4;
        private JLabel lblNews4;
        private JLabel lblDonor4;
        private JLabel lblTarget4;
        
	public Main(AnimoHacksController ahc,String username) {
                this.setLocationRelativeTo(null);
		getContentPane().setLayout(new BorderLayout(0, 0));
		this.setSize(new Dimension(600, 500));
		this.setResizable(false);
		
		final JPanel mainPanel = new JPanel();
		getContentPane().add(mainPanel);
		mainPanel.setLayout(new BorderLayout(0, 0));
		
		JPanel headerPanel = new JPanel();
		headerPanel.setBackground(SystemColor.windowBorder);
		mainPanel.add(headerPanel, BorderLayout.NORTH);
		headerPanel.setLayout(new GridLayout(0, 1, 0, 5));
		
		JLabel lblHi = new JLabel("Hi "+username);
		lblHi.setForeground(Color.WHITE);
		lblHi.setHorizontalAlignment(SwingConstants.RIGHT);
		headerPanel.add(lblHi);
		
		JPanel menuPanel = new JPanel();
		mainPanel.add(menuPanel, BorderLayout.WEST);
		menuPanel.setLayout(new GridLayout(6, 1, 0, 0));
		
		final JPanel manualPanel = new JPanel();
		final JPanel autoPanel = new JPanel();
//		mainPanel.add(autoPanel, BorderLayout.CENTER);
		
		JButton btnManual = new JButton("Manual");
		btnManual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainPanel.add(manualPanel, BorderLayout.CENTER);
				manualPanel.setVisible(true);
				autoPanel.setVisible(false);
				mainPanel.repaint();
				mainPanel.validate();
			}
		});
		btnManual.setPreferredSize(new Dimension(20, 10));
		menuPanel.add(btnManual);
		
		JButton btnAutomated = new JButton("Automated");
		btnAutomated.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainPanel.add(autoPanel, BorderLayout.CENTER);
				autoPanel.setVisible(true);
				manualPanel.setVisible(false);
				mainPanel.repaint();
				mainPanel.validate();
			}
		});
		menuPanel.add(btnAutomated);
		
		manualPanel.setLayout(new GridLayout(4, 1, 0, 0));
		
		JPanel feedPanel = new JPanel();
		feedPanel.setBackground(Color.WHITE);
		feedPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		lblIcon = new JLabel("");
                lblIcon.setSize(50,50);
		feedPanel.add(lblIcon);
		
		lblNews = new JLabel("Donate here news feed news feed news feed news feed news feed news feed news feed.");
		lblNews.setFont(new Font("Tahoma", Font.PLAIN, 12));
		feedPanel.add(lblNews);
		
		JPanel targetPanel = new JPanel();
		feedPanel.add(targetPanel);
		targetPanel.setLayout(new GridLayout(0, 6, 5, 0));
		
		donors = new JLabel("Donors: 45");
		donors.setFont(new Font("Tahoma", Font.PLAIN, 12));
		targetPanel.add(donors);
		
		lblTarget = new JLabel("Target: 50");
		lblTarget.setFont(new Font("Tahoma", Font.PLAIN, 12));
		targetPanel.add(lblTarget);
		
		JLabel lblBlank2 = new JLabel("");
		lblBlank2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		targetPanel.add(lblBlank2);
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		targetPanel.add(horizontalStrut);
		
		JLabel lblBlank3 = new JLabel("");
		lblBlank3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		targetPanel.add(lblBlank3);
		
		JButton btnDonate = new JButton("Donate!");
		btnDonate.setFont(new Font("Tahoma", Font.PLAIN, 11));
		targetPanel.add(btnDonate);
		manualPanel.add(feedPanel);
		
		JPanel feedPanel2 = new JPanel();
		feedPanel2.setBackground(Color.WHITE);
		manualPanel.add(feedPanel2);
		feedPanel2.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		lblIcon2 = new JLabel("");
                lblIcon2.setSize(50,50);
		feedPanel2.add(lblIcon2);
                
		
		lblNews2 = new JLabel("Donate here news feed news feed news feed news feed news feed news feed news feed.");
		lblNews2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		feedPanel2.add(lblNews2);
		
		JPanel targetPanel2 = new JPanel();
		feedPanel2.add(targetPanel2);
		targetPanel2.setLayout(new GridLayout(0, 6, 5, 0));
		
		lblDonor2 = new JLabel("Donors: 45");
		lblDonor2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		targetPanel2.add(lblDonor2);
		
		lblTarget2 = new JLabel("Target: 50");
		lblTarget2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		targetPanel2.add(lblTarget2);
		
		JLabel lblBlank4 = new JLabel("");
		lblBlank4.setFont(new Font("Tahoma", Font.PLAIN, 11));
		targetPanel2.add(lblBlank4);
		
		Component horizontalStrut_1 = Box.createHorizontalStrut(20);
		targetPanel2.add(horizontalStrut_1);
		
		JLabel lblBlank5 = new JLabel("");
		lblBlank5.setFont(new Font("Tahoma", Font.PLAIN, 11));
		targetPanel2.add(lblBlank5);
		
		JButton btnDonate2 = new JButton("Donate!");
		btnDonate2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		targetPanel2.add(btnDonate2);
		autoPanel.setLayout(new GridLayout(6, 1, 0, 0));
		
		JPanel blankPanel = new JPanel();
		autoPanel.add(blankPanel);
		
//		mainPanel.add(manualPanel, BorderLayout.CENTER);
		
		JPanel feedPanel3 = new JPanel();
		feedPanel3.setBackground(Color.WHITE);
		manualPanel.add(feedPanel3);
		feedPanel3.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		lblIcon3 = new JLabel("");
                lblIcon3.setSize(50,50);
		feedPanel3.add(lblIcon3);
		
		lblNews3 = new JLabel("Donate here news feed news feed news feed news feed news feed news feed news feed.");
		lblNews3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		feedPanel3.add(lblNews3);
		
		JPanel targetPanel3 = new JPanel();
		feedPanel3.add(targetPanel3);
		targetPanel3.setLayout(new GridLayout(0, 6, 5, 0));
		
		lblDonor3 = new JLabel("Donors: 45");
		lblDonor3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		targetPanel3.add(lblDonor3);
		
		lblTarget3 = new JLabel("Target: 50");
		lblTarget3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		targetPanel3.add(lblTarget3);
		
		JLabel lblBlank6 = new JLabel("");
		lblBlank6.setFont(new Font("Tahoma", Font.PLAIN, 11));
		targetPanel3.add(lblBlank6);
		
		Component horizontalStrut_2 = Box.createHorizontalStrut(20);
		targetPanel3.add(horizontalStrut_2);
		
		JLabel lblBlank7 = new JLabel("");
		lblBlank7.setFont(new Font("Tahoma", Font.PLAIN, 11));
		targetPanel3.add(lblBlank7);
		
		JButton btnDonate3 = new JButton("Donate!");
		btnDonate3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		targetPanel3.add(btnDonate3);
		
//		JPanel feedPanel4 = new JPanel();
//		feedPanel4.setBackground(Color.WHITE);
//		manualPanel.add(feedPanel4);
//		feedPanel4.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
//		
//		lblIcon4 = new JLabel("");
//                lblIcon4.setSize(20,20);
//		feedPanel4.add(lblIcon4);
//		
//		lblNews4 = new JLabel("Donate here news feed news feed news feed news feed news feed news feed news feed.");
//		lblNews4.setFont(new Font("Tahoma", Font.PLAIN, 11));
//		feedPanel4.add(lblNews4);
//		
//		JPanel targetPanel4 = new JPanel();
//		feedPanel4.add(targetPanel4);
//		targetPanel4.setLayout(new GridLayout(0, 6, 5, 0));
//		
//		lblDonor4 = new JLabel("Donors: 45");
//		lblDonor4.setFont(new Font("Tahoma", Font.PLAIN, 11));
//		targetPanel4.add(lblDonor4);
//		
//		lblTarget4 = new JLabel("Target: 50");
//		lblTarget4.setFont(new Font("Tahoma", Font.PLAIN, 11));
//		targetPanel4.add(lblTarget4);
//		
//		JLabel lblBlank8 = new JLabel("");
//		lblBlank8.setFont(new Font("Tahoma", Font.PLAIN, 11));
//		targetPanel4.add(lblBlank8);
//		
//		Component horizontalStrut_3 = Box.createHorizontalStrut(20);
//		targetPanel4.add(horizontalStrut_3);
//		
//		JLabel lblBlank9 = new JLabel("");
//		lblBlank9.setFont(new Font("Tahoma", Font.PLAIN, 11));
//		targetPanel4.add(lblBlank9);
//		
//		JButton btnDonate4 = new JButton("Donate!");
//		btnDonate4.setFont(new Font("Tahoma", Font.PLAIN, 11));
//		targetPanel4.add(btnDonate4);
//		
//		JLabel lblimg = new JLabel("<img>");
//		lblimg.setHorizontalAlignment(SwingConstants.CENTER);
//		autoPanel.add(lblimg);
//		
		btnDonatePanel = new JPanel();
		autoPanel.add(btnDonatePanel);
		
		JLabel lblOrgOfChoice = new JLabel("Org of Choice");
		btnDonatePanel.add(lblOrgOfChoice);
		lblOrgOfChoice.setHorizontalAlignment(SwingConstants.CENTER);
		lblOrgOfChoice.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JButton btnDonate_1 = new JButton("Donate!");
		btnDonatePanel.add(btnDonate_1);
		
		JPanel scrollPanel = new JPanel();
		mainPanel.add(scrollPanel, BorderLayout.EAST);
		scrollPanel.setLayout(new GridLayout(0, 1, 0, 0));
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setEnabled(false);
		scrollPanel.add(scrollBar);
	}

    public void setPost(ArrayList<Post> post) throws IOException
    {
        //lblIcon.setText(post.get(0).get);
        lblNews.setText(post.get(0).getMessage());
        donors.setText("Donors: "+post.get(0).getDonated());
        lblTarget.setText("Target: "+post.get(0).getTarget());
        
        //lblIcon.setText(post.get(0).get);
        lblNews2.setText(post.get(1).getMessage());
        lblDonor2.setText("Donors: "+post.get(1).getDonated());
        lblTarget2.setText("Target: "+post.get(1).getTarget());
        
        //lblIcon.setText(post.get(0).get);
        lblNews3.setText(post.get(2).getMessage());
        lblDonor3.setText("Donors: "+post.get(2).getDonated());
        lblTarget3.setText("Target: "+post.get(2).getTarget());
        
        //lblIcon.setText(post.get(0).get);
//        lblNews4.setText(post.get(3).getMessage());
//        lblDonor4.setText("Donors: "+post.get(3).getDonated());
//        lblTarget4.setText("Target: "+post.get(3).getTarget());
            BufferedImage img = null;
        
         if(post.get(0).getCompany_id().equals("1")){
             img = ImageIO.read(new File("C:/Users/KingstonAnthony/Desktop/redcross.png"));
             Image dimg = img.getScaledInstance(lblIcon.getWidth(), lblIcon.getHeight(), Image.SCALE_DEFAULT);
             ImageIcon imageIcon = new ImageIcon(dimg);
             lblIcon.setIcon(imageIcon);}
         else if(post.get(0).getCompany_id().equals("2")){
             img = ImageIO.read(new File("C:/Users/KingstonAnthony/Desktop/unicef.png"));
             Image dimg = img.getScaledInstance(lblIcon.getWidth(), lblIcon.getHeight(), Image.SCALE_DEFAULT);
             ImageIcon imageIcon = new ImageIcon(dimg);
             lblIcon.setIcon(imageIcon);}
         else if(post.get(0).getCompany_id().equals("3")){
             img = ImageIO.read(new File("C:/Users/KingstonAnthony/Desktop/who.png"));
             Image dimg = img.getScaledInstance(lblIcon.getWidth(), lblIcon.getHeight(), Image.SCALE_DEFAULT);
             ImageIcon imageIcon = new ImageIcon(dimg);
             lblIcon.setIcon(imageIcon);}
         
         if(post.get(1).getCompany_id().equals("1")){
             img = ImageIO.read(new File("C:/Users/KingstonAnthony/Desktop/redcross.png"));
             Image dimg = img.getScaledInstance(lblIcon2.getWidth(), lblIcon2.getHeight(), Image.SCALE_DEFAULT);
             ImageIcon imageIcon = new ImageIcon(dimg);
             lblIcon2.setIcon(imageIcon);}
         else if(post.get(1).getCompany_id().equals("2")){
             img = ImageIO.read(new File("C:/Users/KingstonAnthony/Desktop/unicef.png"));
             Image dimg = img.getScaledInstance(lblIcon2.getWidth(), lblIcon2.getHeight(), Image.SCALE_DEFAULT);
             ImageIcon imageIcon = new ImageIcon(dimg);
             lblIcon2.setIcon(imageIcon);}
         else if(post.get(1).getCompany_id().equals("3")){
             img = ImageIO.read(new File("C:/Users/KingstonAnthony/Desktop/who.png"));
             Image dimg = img.getScaledInstance(lblIcon2.getWidth(), lblIcon2.getHeight(), Image.SCALE_DEFAULT);
             ImageIcon imageIcon = new ImageIcon(dimg);
             lblIcon2.setIcon(imageIcon);}
         
         if(post.get(2).getCompany_id().equals("1")){
             img = ImageIO.read(new File("C:/Users/KingstonAnthony/Desktop/redcross.png"));
             Image dimg = img.getScaledInstance(lblIcon3.getWidth(), lblIcon3.getHeight(), Image.SCALE_DEFAULT);
             ImageIcon imageIcon = new ImageIcon(dimg);
             lblIcon3.setIcon(imageIcon);}
         else if(post.get(2).getCompany_id().equals("2")){
             img = ImageIO.read(new File("C:/Users/KingstonAnthony/Desktop/unicef.png"));
             Image dimg = img.getScaledInstance(lblIcon3.getWidth(), lblIcon3.getHeight(), Image.SCALE_DEFAULT);
             ImageIcon imageIcon = new ImageIcon(dimg);
             lblIcon3.setIcon(imageIcon);}
         else if(post.get(2).getCompany_id().equals("3")){
             img = ImageIO.read(new File("C:/Users/KingstonAnthony/Desktop/who.png"));
             Image dimg = img.getScaledInstance(lblIcon3.getWidth(), lblIcon3.getHeight(), Image.SCALE_DEFAULT);
             ImageIcon imageIcon = new ImageIcon(dimg);
             lblIcon3.setIcon(imageIcon);}
         
//         if(post.get(3).getCompany_id().equals("1")){
//             img = ImageIO.read(new File("C:/Users/KingstonAnthony/Desktop/redcross.png"));
//             Image dimg = img.getScaledInstance(lblIcon4.getWidth(), lblIcon4.getHeight(), Image.SCALE_DEFAULT);
//             ImageIcon imageIcon = new ImageIcon(dimg);
//             lblIcon4.setIcon(imageIcon);}
//         else if(post.get(3).getCompany_id().equals("2")){
//             img = ImageIO.read(new File("C:/Users/KingstonAnthony/Desktop/unicef.png"));
//             Image dimg = img.getScaledInstance(lblIcon4.getWidth(), lblIcon4.getHeight(), Image.SCALE_DEFAULT);
//             ImageIcon imageIcon = new ImageIcon(dimg);
//             lblIcon4.setIcon(imageIcon);}
//         else if(post.get(3).getCompany_id().equals("3")){
//             img = ImageIO.read(new File("C:/Users/KingstonAnthony/Desktop/who.png"));
//             Image dimg = img.getScaledInstance(lblIcon4.getWidth(), lblIcon4.getHeight(), Image.SCALE_DEFAULT);
//             ImageIcon imageIcon = new ImageIcon(dimg);
//             lblIcon4.setIcon(imageIcon);}
         
     
         
    }

}
