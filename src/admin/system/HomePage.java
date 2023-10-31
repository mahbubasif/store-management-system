package admin.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class HomePage extends JFrame implements ActionListener{
	
	JButton addCustomerButton, addProductButton, addOrderButton, searchButton, editButton, deleteButton, showAllButton, showCustomerButton, showOrderButton; 
	
	HomePage(){
		setLayout(null);
		
		// Image 
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/1.jpg"));
		Image i2 = i1.getImage().getScaledInstance(1100, 700, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel image1 = new JLabel(i3);
		image1.setBounds(0,0,1120,630);
		add(image1);
		
		// Label
		JLabel headerJLabel = new JLabel("Main Page");
		headerJLabel.setForeground(Color.white);
		headerJLabel.setBounds(650, 20, 400, 40);
		headerJLabel.setFont(new Font("Serif", Font.BOLD, 40));
		image1.add(headerJLabel);
		
		//Button for add product
		addProductButton = new JButton("Add Product");
		addProductButton.setBounds(650,80,150,40);
		addProductButton.addActionListener(this);
		image1.add(addProductButton);
		
		// Button for add customer
		addCustomerButton = new JButton("Add Customer");
		addCustomerButton.setBounds(820,80,150,40);
		addCustomerButton.addActionListener(this);
		image1.add(addCustomerButton);
		
		//Button for add order
		addOrderButton = new JButton("Add new order");
		addOrderButton.setBounds(650,140,150,40);
		addOrderButton.addActionListener(this);
		image1.add(addOrderButton);
		
		// Button for search
		searchButton = new JButton("Search Product, Customer, or Order");
		searchButton.setBounds(820,140,150,40);
		searchButton.addActionListener(this);
		image1.add(searchButton);
		
		// Button for search
		deleteButton = new JButton("Delete Product, Customer, or Order");
		deleteButton.setBounds(650,200,150,40);
		deleteButton.addActionListener(this);
		image1.add(deleteButton);
		
		//button for edit
		editButton = new JButton("Edit Product, Customer, or Order");
		editButton.setBounds(820,200,150,40);
		editButton.addActionListener(this);
		image1.add(editButton);
		
		//button for show all 
		showAllButton = new JButton("Show all products");
		showAllButton.setBounds(650,260,150,40);
		showAllButton.addActionListener(this);
		image1.add(showAllButton);
		
		//button for show all customer
		showCustomerButton = new JButton("Show all customer");
		showCustomerButton.setBounds(820,260,150,40);
		showCustomerButton.addActionListener(this);
		image1.add(showCustomerButton);
		
		//button for show all order
		showOrderButton = new JButton("Show all customer");
		showOrderButton.setBounds(650, 320,150,40);
		showOrderButton.addActionListener(this);
		image1.add(showOrderButton);
		
		setSize(1120,630);
		setLocation(250,100);
		setVisible(true);
		setFocusable(false);
	}
	
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource() == addCustomerButton) {
			
		}
		else if(ae.getSource() == addOrderButton) {
			
		}
		else if(ae.getSource() == addProductButton) {
			
		}
		else if(ae.getSource() == searchButton) {
			
		}
		else if(ae.getSource() == deleteButton) {
			
		}
		else if(ae.getSource() == editButton) {
			
		}
		else if(ae.getSource() == showAllButton) {
			
		}
		else if(ae.getSource() == showCustomerButton) {
			
		}
		else if(ae.getSource() == showOrderButton){
			
		}
	}


	public static void main(String[] args) {
		new HomePage();
	}

}
