package guis;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class Main extends JFrame{
	public Main() {
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
		
		JLabel lblHi = new JLabel("Hi John Caingles!");
		lblHi.setForeground(Color.WHITE);
		lblHi.setHorizontalAlignment(SwingConstants.RIGHT);
		headerPanel.add(lblHi);
		
		JPanel menuPanel = new JPanel();
		mainPanel.add(menuPanel, BorderLayout.WEST);
		menuPanel.setLayout(new GridLayout(6, 1, 0, 0));
		
		final JPanel manualPanel = new JPanel();
		final JPanel autoPanel = new JPanel();
		mainPanel.add(manualPanel, BorderLayout.CENTER);
		
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
		
//		mainPanel.add(manualPanel, BorderLayout.CENTER);
		manualPanel.setLayout(new GridLayout(5, 1, 5, 0));
		
		JPanel feedPanel = new JPanel();
		feedPanel.setBackground(Color.WHITE);
		feedPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		manualPanel.add(feedPanel);
		
		JLabel lblIcon = new JLabel("<icon>");
		feedPanel.add(lblIcon);
		
		JLabel lblNews = new JLabel("Donate here news feed news feed news feed news feed news feed news feed news feed.");
		lblNews.setFont(new Font("Tahoma", Font.PLAIN, 11));
		feedPanel.add(lblNews);
		
		JPanel targetPanel = new JPanel();
		feedPanel.add(targetPanel);
		targetPanel.setLayout(new GridLayout(0, 6, 5, 0));
		
		JLabel donors = new JLabel("Donors: 45");
		donors.setFont(new Font("Tahoma", Font.PLAIN, 11));
		targetPanel.add(donors);
		
		JLabel lblTarget = new JLabel("Target: 50");
		lblTarget.setFont(new Font("Tahoma", Font.PLAIN, 11));
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
		
		JPanel feedPanel2 = new JPanel();
		feedPanel2.setBackground(Color.WHITE);
		manualPanel.add(feedPanel2);
		feedPanel2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblIcon2 = new JLabel("<icon>");
		feedPanel2.add(lblIcon2);
		
		JLabel lblNews2 = new JLabel("Donate here news feed news feed news feed news feed news feed news feed news feed.");
		lblNews2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		feedPanel2.add(lblNews2);
		
		JPanel targetPanel2 = new JPanel();
		feedPanel2.add(targetPanel2);
		targetPanel2.setLayout(new GridLayout(0, 6, 5, 0));
		
		JLabel lblDonors2 = new JLabel("Donors: 45");
		lblDonors2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		targetPanel2.add(lblDonors2);
		
		JLabel lblTarget2 = new JLabel("Target: 50");
		lblTarget2.setFont(new Font("Tahoma", Font.PLAIN, 11));
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
		
//		mainPanel.add(autoPanel, BorderLayout.CENTER);
		
		JLabel lblAuto = new JLabel("auto");
		autoPanel.add(lblAuto);
		
		JPanel scrollPanel = new JPanel();
		mainPanel.add(scrollPanel, BorderLayout.EAST);
		scrollPanel.setLayout(new GridLayout(0, 1, 0, 0));
		
		JScrollBar scrollBar = new JScrollBar();
		scrollPanel.add(scrollBar);
	}

}
