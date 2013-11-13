package gui;

import java.awt.*;

import javax.swing.*;


@SuppressWarnings("serial")
public class PatientProfilePage extends JPanel{
	private JLabel pNameLabel;
	private JLabel pDobLabel;
	private JLabel pDoctorLabel;
	private JLabel phoneNumberLabel;
	private JLabel pAddressLabel;
	private JTextField pName;
	private JTextField pDob;
	private JTextField pDoctor;
	private JTextField phoneNumber;
	private JTextField pAddress;
	private JLabel drugHist;
	private JButton fillPrescription;
	private JButton removePrescription;
	private JButton exitProfile;
	 PatientProfilePage(Gui frame){
		 GridBagConstraints c = new GridBagConstraints();
			JLabel picLabel=new JLabel(new ImageIcon("img/bg.jpg"));
			   this.add(picLabel);
			   picLabel.setLayout(new GridBagLayout());
				this.setLayout(new GridBagLayout());
				
				this.pNameLabel= new JLabel("Patient Name:");
				c.insets= new Insets(0,0,10,0);
				 c.gridx=0;
				 c.gridy=0;
				 c.gridwidth=1;
				 picLabel.add(pNameLabel,c);
				
				this.pDobLabel= new JLabel("DOB:");
					 c.gridy=1;
					 
					 picLabel.add(pDobLabel,c);
					 
			    this.pDoctorLabel= new JLabel("Primary Doctor:");
						 c.gridy=2;
						
						 picLabel.add(pDoctorLabel,c);
			    this.phoneNumberLabel= new JLabel("Phone Number:");
							c.gridy=3;
							
							 picLabel.add(phoneNumberLabel,c);
				this.pAddressLabel= new JLabel("Address:");
							c.gridy=4;								 
								 picLabel.add(pAddressLabel,c);
	
				this.pName= new JTextField("David",15);
				c.gridy=0;
								 c.gridx=1;
								 picLabel.add(pName,c);
				this.pDob= new JTextField(15);
				c.gridy=1;
				c.gridx=1;
				 picLabel.add(pDob,c);
				 this.pDoctor= new JTextField(15);
					c.gridy=2;
					c.gridx=1;
					 picLabel.add(pDoctor,c);
					 this.phoneNumber= new JTextField(15);
						c.gridy=3;
						c.gridx=1;
						 picLabel.add(phoneNumber,c);
						 this.pAddress= new JTextField(15);
							c.gridy=4;
							c.gridx=1;
							 picLabel.add(pAddress,c);
	
				this.fillPrescription= new JButton("Fill Prescription");
				c.insets= new Insets(20,0,0,0);
				c.gridx=0;
				c.gridy=5;
				c.gridwidth=2;
				fillPrescription.setPreferredSize(new Dimension(155, 35));
				picLabel.add(fillPrescription, c);
				fillPrescription.addActionListener(frame);
				this.removePrescription= new JButton("Remove Prescription");
				
				
				c.gridy=6;
				removePrescription.setPreferredSize(new Dimension(155, 35));
				picLabel.add(removePrescription, c);
				this.exitProfile= new JButton("Exit Patient Profile");
				exitProfile.addActionListener(frame);
				exitProfile.setPreferredSize(new Dimension(155, 35));
				c.gridy=7;
				picLabel.add(exitProfile, c);
				this.drugHist=new JLabel("Drug History");
				c.insets= new Insets(0,100,0,0);
				drugHist.setFont(new Font("Comic Sans",Font.BOLD, 28));
				c.gridx=2;
				c.gridy=0;
				c.gridwidth=2;
				picLabel.add(drugHist,c);
				String[] dcolumnName={"Drug History" };
				Object[][] ddata={{"diiiiiiiiiiiicks"},{11},{1},{1},{1},{1},{1},{1}};
				JTable drugHistory = new JTable(ddata, dcolumnName);
				drugHistory.setRowHeight(25);
				drugHistory.setPreferredSize(new Dimension(200,200 ));
				c.insets= new Insets(-25,100,0,0);
				c.gridy=1;
				c.gridheight=7;
				picLabel.add(drugHistory,c);
	
	
	String[] columnNames={"FirstName", "LastName", "Sport", "#ofYears", "hey" };
	Object[][] data={{"Prescription Number","Drug Name","Dose","Date Filled","Refills rm"},{1,11,1,1,1},{1,11,1,1,1},{1,11,1,1,1},{1,11,1,1,1}};
	JTable table = new JTable(data, columnNames);
	table.setPreferredSize(new Dimension(650,100 ));
	table.setRowHeight(20);
	c.insets= new Insets(20,0,0,0);
	c.gridx=0;
	c.gridy=8;
	c.gridwidth=4;
	picLabel.add(table,c);
	
}
	   JButton getfillButton() {
			return this.fillPrescription;
	   }
	   JButton getExitButton(){
		   return this.exitProfile;
	   }
	public JTextField getpName() {
		return pName;
	}
	public void setpName(JTextField pName) {
		this.pName = pName;
	}
	public JTextField getpDob() {
		return pDob;
	}
	public void setpDob(JTextField pDob) {
		this.pDob = pDob;
	}
	public JTextField getpDoctor() {
		return pDoctor;
	}
	public void setpDoctor(JTextField pDoctor) {
		this.pDoctor = pDoctor;
	}
	public JTextField getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(JTextField phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public JTextField getpAddress() {
		return pAddress;
	}
	public void setpAddress(JTextField pAddress) {
		this.pAddress = pAddress;
	}
	   }
