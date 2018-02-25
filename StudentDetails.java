package com.bijay.studentinfo.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.Color;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class StudentDetails extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable studentTable;
	private JTable studentTbl;

	private final JScrollPane scrollPane = new JScrollPane();
	private JTextField searchTxtField;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentDetails frame = new StudentDetails();
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
	public StudentDetails() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new TitledBorder(null, "Student Details", TitledBorder.LEADING, TitledBorder.TOP, null, Color.RED));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		studentTbl = new JTable();
		studentTbl.setBounds(10, 56, 424, 179);
		contentPane.add(studentTbl);
		String[] columNames= {"ID" ,"Student Name","College Name","Gender","Email","roll","DOB","Subject","Department"};
		DefaultTableModel tableModel=new DefaultTableModel(columNames,0);
		studentTbl.setModel(tableModel);
		
		 JScrollPane scrollPane=new JScrollPane(studentTbl);
		 scrollPane.setBounds(10, 56, 424, 179);
		 contentPane.add(scrollPane);
		 
		 JButton btnNewButton = new JButton("New\r\n");
		 btnNewButton.setBounds(20, 246, 89, 23);
		 contentPane.add(btnNewButton);
		 
		 JButton btnNewButton_1 = new JButton("Edit");
		 btnNewButton_1.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent arg0) {
		 	}
		 });
		 btnNewButton_1.setBounds(162, 246, 89, 23);
		 contentPane.add(btnNewButton_1);
		 
		 JButton btnDelete = new JButton("Delete");
		 btnDelete.setBounds(278, 246, 89, 23);
		 contentPane.add(btnDelete);
		 
		 searchTxtField = new JTextField();
		 searchTxtField.setBounds(318, 25, 116, 20);
		 contentPane.add(searchTxtField);
		 searchTxtField.setColumns(10);
		 
		
	
		
		
	}
}
