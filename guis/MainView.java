package guis;

import animohacks.AnimoHacksController;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
public class MainView extends JFrame{
    private AnimoHacksController ahc;
	public MainView() throws IOException {
            //this.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("C:/Users/KingstonAnthony/Desktop/images.jpg")))));
		getContentPane().setLayout(new BorderLayout(0, 0));
                

		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(600, 500);
		this.setResizable(false);
                this.setLocationRelativeTo(null);
		
		final JPanel mainPanel = new JPanel();
		mainPanel.setBackground(new Color(173, 216, 230));
		getContentPane().add(mainPanel);
		mainPanel.setLayout(new BorderLayout(0, 0));
		
		JPanel titlePanel = new JPanel();
		titlePanel.setBackground(new Color(0, 100, 0));
		titlePanel.setForeground(Color.BLACK);
		mainPanel.add(titlePanel, BorderLayout.NORTH);
		
		JLabel lblHeader = new JLabel("header");
		titlePanel.add(lblHeader);
		
		final JPanel contentPanel = new JPanel();
		contentPanel.setBackground(new Color(173, 216, 230));
		mainPanel.add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new GridLayout(3, 1, 0, 0));
		
		JPanel topPanel = new JPanel();
		contentPanel.add(topPanel);
		topPanel.setLayout(new GridLayout(1, 1, 0, 0));
		
		Component verticalStrutTop = Box.createVerticalStrut(10);
		verticalStrutTop.setEnabled(false);
		topPanel.add(verticalStrutTop);
		
		JPanel autoManualPanel = new JPanel();
		contentPanel.add(autoManualPanel);
		GridBagLayout gbl_autoManualPanel = new GridBagLayout();
		gbl_autoManualPanel.columnWidths = new int[]{50, 202, 85, 0};
		gbl_autoManualPanel.rowHeights = new int[]{23, 23, 0, 0, 0};
		gbl_autoManualPanel.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_autoManualPanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		autoManualPanel.setLayout(gbl_autoManualPanel);
		
		JLabel lblLogo = new JLabel("Select an organization");
                //lblLogo.setBounds(610, 80, 355, 355);
                
		GridBagConstraints gbc_lblLogo = new GridBagConstraints();
		gbc_lblLogo.anchor = GridBagConstraints.NORTH;
		gbc_lblLogo.insets = new Insets(0, 0, 5, 5);
		gbc_lblLogo.gridheight = 2;
		gbc_lblLogo.gridx = 2;
		gbc_lblLogo.gridy = 0;
		autoManualPanel.add(lblLogo, gbc_lblLogo);
		//lblLogo.setIcon(new ImageIcon("logo.jpg"));
		lblLogo.setPreferredSize(new Dimension(500, 50));
                
                lblLogo.addMouseListener(new MouseAdapter()  
                {  
                public void mouseClicked(MouseEvent e)  
                {  
                    try
                    {
                        lblLogo.setPreferredSize(new Dimension(100, 50));
                        ahc.SelectOrg();
                        
                        if(ahc.getSelectedOrg() != null)
                        {
                        BufferedImage img = null;

                            img = ImageIO.read(new File(ahc.getImageLocation()));
                            Image dimg = img.getScaledInstance(lblLogo.getWidth(), lblLogo.getHeight(), Image.SCALE_DEFAULT);
                            ImageIcon imageIcon = new ImageIcon(dimg);
                            lblLogo.setIcon(imageIcon);
                        }
                    } catch (SQLException ex)
                    {
                        Logger.getLogger(MainView.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (IOException ex)
                    {
                        Logger.getLogger(MainView.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }  
                }); 
                
       
		
		JButton btnAutomated = new JButton("Automated");
		btnAutomated.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPanel.setVisible(false);
			}
		});
		GridBagConstraints gbc_btnAutomated = new GridBagConstraints();
		gbc_btnAutomated.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnAutomated.anchor = GridBagConstraints.NORTH;
		gbc_btnAutomated.insets = new Insets(0, 0, 5, 0);
		gbc_btnAutomated.gridx = 2;
		gbc_btnAutomated.gridy = 2;
		autoManualPanel.add(btnAutomated, gbc_btnAutomated);
		btnAutomated.setToolTipText("The automated setting allows the system to set your donations automatically.");
		
		JButton btnManual = new JButton("Manual");
		GridBagConstraints gbc_btnManual = new GridBagConstraints();
		gbc_btnManual.anchor = GridBagConstraints.NORTH;
		gbc_btnManual.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnManual.gridx = 2;
		gbc_btnManual.gridy = 3;
		autoManualPanel.add(btnManual, gbc_btnManual);
		btnManual.setToolTipText("The automated setting allows the system to set your donations automatically.");
		
		JPanel bottomPanel = new JPanel();
		contentPanel.add(bottomPanel);
		
		Component verticalStrutBottom = Box.createVerticalStrut(10);
		verticalStrutBottom.setEnabled(false);
		bottomPanel.add(verticalStrutBottom);
	}
	 public void setController(AnimoHacksController ahc)
    {
        this.ahc = ahc;
    }
}
