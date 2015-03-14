package guis;

import javax.swing.*;

import java.awt.*;
import javax.swing.border.LineBorder;
public class Donate extends JFrame {

	private JPanel contentPane;
	private JTextField txtQty;
	private JTextField txtPhp;
	private JTextField txtQtyItem1;
	private JTextField txtTotalitem1;
	private JTextField txtQtyItem2;
	private JTextField txtTotalitem2;
	private JTextField txtQtyItem3;
	private JTextField txtTotalitem3;
	private JTextField txtQtyItem4;
	private JTextField txtTotalitem4;
	private JTextField txtQtyItem5;
	private JTextField txtTotalitem5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Donate frame = new Donate();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Donate() {
		this.setSize(new Dimension(600, 500));
		this.setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel mainPanel = new JPanel();
		contentPane.add(mainPanel);
		mainPanel.setLayout(new BorderLayout(0, 0));
		
		JPanel headerPanel = new JPanel();
		headerPanel.setBackground(Color.GRAY);
		mainPanel.add(headerPanel, BorderLayout.NORTH);
		headerPanel.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel lblHi = new JLabel("Hi John Caingles!");
		lblHi.setHorizontalAlignment(SwingConstants.RIGHT);
		lblHi.setForeground(Color.WHITE);
		headerPanel.add(lblHi);
		
		JPanel contentPanel = new JPanel();
		mainPanel.add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new GridLayout(2, 1, 0, 0));
		
		JPanel bundlePanel = new JPanel();
		contentPanel.add(bundlePanel);
		bundlePanel.setLayout(new BorderLayout(0, 0));
		
		JPanel donateTypePanel = new JPanel();
		bundlePanel.add(donateTypePanel, BorderLayout.NORTH);
		donateTypePanel.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
		
		JLabel lblDonateType = new JLabel("Package:");
		lblDonateType.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDonateType.setHorizontalAlignment(SwingConstants.LEFT);
		donateTypePanel.add(lblDonateType);
		
		JPanel packageImagePanel = new JPanel();
		bundlePanel.add(packageImagePanel, BorderLayout.CENTER);
		
		JLabel lblPackageimg = new JLabel("<img>");
		packageImagePanel.add(lblPackageimg);
		lblPackageimg.setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel bundleDonatePanel = new JPanel();
		bundlePanel.add(bundleDonatePanel, BorderLayout.SOUTH);
		
		JLabel lblQty = new JLabel("Qty:");
		bundleDonatePanel.add(lblQty);
		
		txtQty = new JTextField();
		bundleDonatePanel.add(txtQty);
		txtQty.setColumns(3);
		
		JLabel lblTotal = new JLabel("Total:");
		bundleDonatePanel.add(lblTotal);
		
		txtPhp = new JTextField();
		txtPhp.setText("PHP 150.00");
		txtPhp.setEditable(false);
		bundleDonatePanel.add(txtPhp);
		txtPhp.setColumns(10);
		
		JButton btnDonate = new JButton("Donate!");
		bundleDonatePanel.add(btnDonate);
		
		JPanel singlePanel = new JPanel();
		contentPanel.add(singlePanel);
		singlePanel.setLayout(new BorderLayout(0, 0));
		
		JPanel donateTypePanel2 = new JPanel();
		FlowLayout flowLayout = (FlowLayout) donateTypePanel2.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		singlePanel.add(donateTypePanel2, BorderLayout.NORTH);
		
		JLabel lblIndividual = new JLabel("Individual:");
		lblIndividual.setHorizontalAlignment(SwingConstants.LEFT);
		lblIndividual.setFont(new Font("Tahoma", Font.BOLD, 11));
		donateTypePanel2.add(lblIndividual);
		
		JPanel itemsPanel = new JPanel();
		itemsPanel.setBackground(SystemColor.control);
		singlePanel.add(itemsPanel, BorderLayout.CENTER);
		itemsPanel.setLayout(new GridLayout(0, 5, 0, 0));
		
		JPanel itemOnePanel = new JPanel();
		itemOnePanel.setBackground(Color.WHITE);
		itemOnePanel.setBorder(new LineBorder(new Color(0, 0, 0)));
		itemsPanel.add(itemOnePanel);
		itemOnePanel.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel itemImagePanel = new JPanel();
		itemOnePanel.add(itemImagePanel);
		itemImagePanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblitemImage = new JLabel("<img>");
		lblitemImage.setHorizontalAlignment(SwingConstants.CENTER);
		itemImagePanel.add(lblitemImage);
		
		Component verticalStrut = Box.createVerticalStrut(20);
		itemImagePanel.add(verticalStrut);
		
		JLabel lblitemLabel = new JLabel("Century Tuna 250g");
		itemImagePanel.add(lblitemLabel);
		
		JPanel singleDonatePanel = new JPanel();
		itemOnePanel.add(singleDonatePanel);
		
		JLabel lblQtyItem1 = new JLabel("Qty:");
		singleDonatePanel.add(lblQtyItem1);
		
		txtQtyItem1 = new JTextField();
		txtQtyItem1.setColumns(3);
		singleDonatePanel.add(txtQtyItem1);
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		singleDonatePanel.add(horizontalStrut);
		
		JLabel lblTotalitem1 = new JLabel("Total:");
		singleDonatePanel.add(lblTotalitem1);
		
		txtTotalitem1 = new JTextField();
		txtTotalitem1.setText("PHP 40.00");
		txtTotalitem1.setEditable(false);
		txtTotalitem1.setColumns(8);
		singleDonatePanel.add(txtTotalitem1);
		
		JButton btnDonateItem1 = new JButton("Donate!");
		singleDonatePanel.add(btnDonateItem1);
		
		JPanel itemTwoPanel = new JPanel();
		itemTwoPanel.setBorder(new LineBorder(new Color(0, 0, 0)));
		itemTwoPanel.setBackground(Color.WHITE);
		itemsPanel.add(itemTwoPanel);
		itemTwoPanel.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel itemImagePanel2 = new JPanel();
		itemTwoPanel.add(itemImagePanel2);
		itemImagePanel2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblitemImage2 = new JLabel("<img>");
		lblitemImage2.setHorizontalAlignment(SwingConstants.CENTER);
		itemImagePanel2.add(lblitemImage2);
		
		Component verticalStrut_1 = Box.createVerticalStrut(20);
		itemImagePanel2.add(verticalStrut_1);
		
		JLabel lblitemLabel2 = new JLabel("Payless Chicken Flavor");
		itemImagePanel2.add(lblitemLabel2);
		
		JPanel singleDonatePanel2 = new JPanel();
		itemTwoPanel.add(singleDonatePanel2);
		
		JLabel lblQtyItem2 = new JLabel("Qty:");
		singleDonatePanel2.add(lblQtyItem2);
		
		txtQtyItem2 = new JTextField();
		txtQtyItem2.setColumns(3);
		singleDonatePanel2.add(txtQtyItem2);
		
		Component horizontalStrut_1 = Box.createHorizontalStrut(20);
		singleDonatePanel2.add(horizontalStrut_1);
		
		JLabel lblTotalitem2 = new JLabel("Total:");
		singleDonatePanel2.add(lblTotalitem2);
		
		txtTotalitem2 = new JTextField();
		txtTotalitem2.setText("PHP 15.00");
		txtTotalitem2.setEditable(false);
		txtTotalitem2.setColumns(8);
		singleDonatePanel2.add(txtTotalitem2);
		
		JButton btnDonateItem2 = new JButton("Donate!");
		singleDonatePanel2.add(btnDonateItem2);
		
		JPanel itemThreePanel = new JPanel();
		itemThreePanel.setBorder(new LineBorder(new Color(0, 0, 0)));
		itemThreePanel.setBackground(Color.WHITE);
		itemsPanel.add(itemThreePanel);
		itemThreePanel.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel itemImagePanel3 = new JPanel();
		itemThreePanel.add(itemImagePanel3);
		itemImagePanel3.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblitemImage3 = new JLabel("<img>");
		lblitemImage3.setHorizontalAlignment(SwingConstants.CENTER);
		itemImagePanel3.add(lblitemImage3);
		
		Component verticalStrut_2 = Box.createVerticalStrut(20);
		itemImagePanel3.add(verticalStrut_2);
		
		JLabel lblitemLabel3 = new JLabel("Soya Fresh Soy Milk");
		itemImagePanel3.add(lblitemLabel3);
		
		JPanel singleDonatePanel3 = new JPanel();
		itemThreePanel.add(singleDonatePanel3);
		
		JLabel lblQtyItem3 = new JLabel("Qty:");
		singleDonatePanel3.add(lblQtyItem3);
		
		txtQtyItem3 = new JTextField();
		txtQtyItem3.setColumns(3);
		singleDonatePanel3.add(txtQtyItem3);
		
		Component horizontalStrut_2 = Box.createHorizontalStrut(20);
		singleDonatePanel3.add(horizontalStrut_2);
		
		JLabel lblTotalitem3 = new JLabel("Total:");
		singleDonatePanel3.add(lblTotalitem3);
		
		txtTotalitem3 = new JTextField();
		txtTotalitem3.setText("PHP 25.00");
		txtTotalitem3.setEditable(false);
		txtTotalitem3.setColumns(8);
		singleDonatePanel3.add(txtTotalitem3);
		
		JButton btnDonateItem3 = new JButton("Donate!");
		singleDonatePanel3.add(btnDonateItem3);
		
		JPanel itemFourPanel = new JPanel();
		itemFourPanel.setBorder(new LineBorder(new Color(0, 0, 0)));
		itemFourPanel.setBackground(Color.WHITE);
		itemsPanel.add(itemFourPanel);
		itemFourPanel.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel itemImagePanel4 = new JPanel();
		itemFourPanel.add(itemImagePanel4);
		itemImagePanel4.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblitemImage4 = new JLabel("<img>");
		lblitemImage4.setHorizontalAlignment(SwingConstants.CENTER);
		itemImagePanel4.add(lblitemImage4);
		
		Component verticalStrut_3 = Box.createVerticalStrut(20);
		itemImagePanel4.add(verticalStrut_3);
		
		JLabel lblitemLabel4 = new JLabel("555 Sardines 200g");
		itemImagePanel4.add(lblitemLabel4);
		
		JPanel singleDonatePanel4 = new JPanel();
		itemFourPanel.add(singleDonatePanel4);
		
		JLabel lblQtyItem4 = new JLabel("Qty:");
		singleDonatePanel4.add(lblQtyItem4);
		
		txtQtyItem4 = new JTextField();
		txtQtyItem4.setColumns(3);
		singleDonatePanel4.add(txtQtyItem4);
		
		Component horizontalStrut_3 = Box.createHorizontalStrut(20);
		singleDonatePanel4.add(horizontalStrut_3);
		
		JLabel lblTotalitem4 = new JLabel("Total:");
		singleDonatePanel4.add(lblTotalitem4);
		
		txtTotalitem4 = new JTextField();
		txtTotalitem4.setText("PHP 35.00");
		txtTotalitem4.setEditable(false);
		txtTotalitem4.setColumns(8);
		singleDonatePanel4.add(txtTotalitem4);
		
		JButton btnDonateItem4 = new JButton("Donate!");
		singleDonatePanel4.add(btnDonateItem4);
		
		JPanel itemFivePanel = new JPanel();
		itemFivePanel.setBorder(new LineBorder(new Color(0, 0, 0)));
		itemFivePanel.setBackground(Color.WHITE);
		itemsPanel.add(itemFivePanel);
		itemFivePanel.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel itemImagePanel5 = new JPanel();
		itemFivePanel.add(itemImagePanel5);
		itemImagePanel5.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblitemImage5 = new JLabel("<img>");
		lblitemImage5.setHorizontalAlignment(SwingConstants.CENTER);
		itemImagePanel5.add(lblitemImage5);
		
		Component verticalStrut_4 = Box.createVerticalStrut(20);
		itemImagePanel5.add(verticalStrut_4);
		
		JLabel lblitemLabel5 = new JLabel("Summit Water 500g");
		itemImagePanel5.add(lblitemLabel5);
		
		JPanel singleDonatePanel5 = new JPanel();
		itemFivePanel.add(singleDonatePanel5);
		
		JLabel lblQtyItem5 = new JLabel("Qty:");
		singleDonatePanel5.add(lblQtyItem5);
		
		txtQtyItem5 = new JTextField();
		txtQtyItem5.setColumns(3);
		singleDonatePanel5.add(txtQtyItem5);
		
		Component horizontalStrut_4 = Box.createHorizontalStrut(20);
		singleDonatePanel5.add(horizontalStrut_4);
		
		JLabel lblTotalitem5 = new JLabel("Total:");
		singleDonatePanel5.add(lblTotalitem5);
		
		txtTotalitem5 = new JTextField();
		txtTotalitem5.setText("PHP 13.00");
		txtTotalitem5.setEditable(false);
		txtTotalitem5.setColumns(8);
		singleDonatePanel5.add(txtTotalitem5);
		
		JButton btnDonateItem5 = new JButton("Donate!");
		singleDonatePanel5.add(btnDonateItem5);
		
		
	}

}
