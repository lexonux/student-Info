package com.bijay.studentinfo.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.border.TitledBorder;

import com.bijay.studentinfo.dao.StudentDao;
import com.bijay.studentinfo.dao.StudentDaoImpl;
import com.bijay.studentinfo.dto.StudentDto;
import com.toedter.calendar.JDateChooser;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;

public class StudentForm extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	File file;
	public JLabel picLbl;
	public JTextField snameTxtBox;
	public JTextField cnameTxtBox;
	private JLabel lblNewLabel_1;
	public JTextField emailTxtBox;
	private JLabel lblRoll;
	public JTextField rollTxtBox;
	private JLabel lblCalender;
	public JLabel lblGender;
	public JRadioButton maleRdBtn;
	public JRadioButton femaleRdBtn;
	public JCheckBox netTxtBox;
	public JCheckBox phpTxtBox;
	public JCheckBox androidTxtBox;
	public JCheckBox javaTxtBox;
	private JLabel lblNewLabel_3;
	public JComboBox<String> departComboBox;
	public JButton cancelBtn;
	public JButton submitBtn;
 
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentForm frame = new StudentForm();
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
	public StudentForm() {
		setTitle("Student Registration Form\r\n\r\n");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 632, 419);
		contentPane = new JPanel();
		contentPane.setBorder(new TitledBorder(null, "Student Registration Form", TitledBorder.LEADING, TitledBorder.TOP, null, Color.RED));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
	 picLbl = new JLabel("           upload ");
		picLbl.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				JFileChooser imageChooser=new JFileChooser();
				if(imageChooser.showOpenDialog(picLbl)==JFileChooser.APPROVE_OPTION) {
					file=imageChooser.getSelectedFile();
					ImageIcon imageicon = new ImageIcon(imageChooser.getSelectedFile().getPath());
					Image image=imageicon.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
					picLbl.setIcon(new ImageIcon(image));
				}
			}
		});
		picLbl.setBounds(529, 11, 87, 95);
		contentPane.add(picLbl);
		
		JLabel nameLbl = new JLabel("Name");
		nameLbl.setBounds(10, 26, 108, 21);
		contentPane.add(nameLbl);
		
		snameTxtBox = new JTextField();
		snameTxtBox.setBounds(160, 26, 298, 20);
		contentPane.add(snameTxtBox);
		snameTxtBox.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("College Name");
		lblNewLabel.setBounds(10, 68, 65, 14);
		contentPane.add(lblNewLabel);
		
		cnameTxtBox = new JTextField();
		cnameTxtBox.setBounds(160, 65, 298, 20);
		contentPane.add(cnameTxtBox);
		cnameTxtBox.setColumns(10);
		
		lblNewLabel_1 = new JLabel("Email");
		lblNewLabel_1.setBounds(10, 109, 81, 14);
		contentPane.add(lblNewLabel_1);
		
		emailTxtBox = new JTextField();
		emailTxtBox.setBounds(160, 106, 298, 20);
		contentPane.add(emailTxtBox);
		emailTxtBox.setColumns(10);
		
		lblRoll = new JLabel("Roll");
		lblRoll.setBounds(10, 148, 46, 14);
		contentPane.add(lblRoll);
		
		rollTxtBox = new JTextField();
		rollTxtBox.setBounds(160, 145, 298, 20);
		contentPane.add(rollTxtBox);
		rollTxtBox.setColumns(10);
		
		lblCalender = new JLabel("Calender");
		lblCalender.setBounds(10, 182, 46, 14);
		contentPane.add(lblCalender);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(160, 182, 91, 20);
		contentPane.add(dateChooser);
		
		lblGender = new JLabel("Gender");
		lblGender.setBounds(10, 213, 46, 14);
		contentPane.add(lblGender);
		
		maleRdBtn = new JRadioButton("MAle");
		maleRdBtn.setBounds(160, 213, 109, 23);
		contentPane.add(maleRdBtn);
		
		femaleRdBtn = new JRadioButton("Female");
		femaleRdBtn.setBounds(299, 209, 109, 23);
		contentPane.add(femaleRdBtn);
		
		ButtonGroup genderGroup=new ButtonGroup();
		genderGroup.add(maleRdBtn);
		genderGroup.add(femaleRdBtn);
		
		JLabel lblNewLabel_2 = new JLabel("Subjects");
		lblNewLabel_2.setBounds(10, 238, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		javaTxtBox = new JCheckBox("Java");
		javaTxtBox.setBounds(154, 239, 97, 23);
		contentPane.add(javaTxtBox);
		
		androidTxtBox = new JCheckBox("Android");
		androidTxtBox.setBounds(266, 239, 97, 23);
		contentPane.add(androidTxtBox);
		
		phpTxtBox = new JCheckBox("Php");
		phpTxtBox.setBounds(384, 239, 97, 23);
		contentPane.add(phpTxtBox);
		
		netTxtBox = new JCheckBox(".NET");
		netTxtBox.setBounds(483, 234, 97, 23);
		contentPane.add(netTxtBox);
		
		lblNewLabel_3 = new JLabel("Departments");
		lblNewLabel_3.setBounds(10, 278, 65, 14);
		contentPane.add(lblNewLabel_3);
		
		departComboBox = new JComboBox<>();
		departComboBox.setModel(new DefaultComboBoxModel(new String[] {"IT", "Computer\t", "Electrical", "Electronics"}));
		departComboBox.setBounds(160, 275, 149, 20);
		contentPane.add(departComboBox);
		
		 submitBtn = new JButton("submit");
		submitBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				StudentDto studentDto =new StudentDto();
				studentDto.setStudentName(snameTxtBox.getText());
				studentDto.setCollegeName(cnameTxtBox.getText());
				studentDto.setEmail(emailTxtBox.getText());
				studentDto.setRoll(Integer.parseInt(rollTxtBox.getText()));
				studentDto.setDepartment((String)departComboBox.getSelectedItem());
				studentDto.setDob(dateChooser.getDate());
				if(maleRdBtn.isSelected()) {
					studentDto.setGender("male");
				}else {
					studentDto.setGender("Female");
				}
				String subject="";
				if(javaTxtBox.isSelected()) {
					subject=subject+javaTxtBox.getText()+"/";
				}if (phpTxtBox.isSelected()) {
					subject=subject+phpTxtBox.getText()+"/";
					
				}
				if(androidTxtBox.isSelected()) {
					subject=subject+androidTxtBox.getText()+"/";
					
				}
				if(netTxtBox.isSelected()) {
					subject=subject+netTxtBox.getText()+"/";
				}
				studentDto.setSubject(subject);
				StudentDao studentDao=new StudentDaoImpl();
				int saved=studentDao.saveStudentInfo(studentDto);
				if(saved>0){
					JOptionPane.showMessageDialog(StudentForm.this,"Success","saved successfully",JOptionPane.PLAIN_MESSAGE);
				}else {
					JOptionPane.showMessageDialog(StudentForm.this, "Error","Database error!!!",JOptionPane.ERROR_MESSAGE);
				}
				
			}
		});
		submitBtn.setBounds(162, 324, 89, 23);
		contentPane.add(submitBtn);
		
		 cancelBtn = new JButton("Cancel");
		cancelBtn.setBounds(284, 324, 89, 23);
		contentPane.add(cancelBtn);
		
		
	
		
	}
}
