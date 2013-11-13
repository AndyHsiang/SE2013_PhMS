package gui;
import java.awt.*;

import javax.swing.*;
@SuppressWarnings("serial")
public class NewDrugPage extends JPanel {
	private JTextField drugNameT;
	private JTextField quantityT;
	private JTextArea generalT;
	private JTextArea sideT;
	private JTextField controlledT;
	private JLabel drugNameL;
	private JLabel quantityL;
	private JLabel generalL;
	private JLabel sideL;
	private JLabel controlledL;
	private JButton cancel;
	private JButton submit;
	private JScrollPane i;
	private JScrollPane j;
	NewDrugPage(Gui frame){
		
		GridBagConstraints c = new GridBagConstraints();
		JLabel picLabel=new JLabel(new ImageIcon("img/bg.jpg"));
		   this.add(picLabel);
		   picLabel.setLayout(new GridBagLayout());
			this.setLayout(new GridBagLayout());
			
			
			this.drugNameL = new JLabel ("Drug Name:");
			drugNameL.setFont(new Font("Comic Sans",Font.BOLD, 15));
			 c.insets= new Insets(0,0,20,0);
			 c.gridx=0;
			 c.gridy=0;
			 c.gridwidth=1;
			 picLabel.add(drugNameL,c);
			 this.drugNameT= new JTextField(20);
			 c.insets= new Insets(0,0,20,0);
			 drugNameT.setFont(new Font("Comic Sans",Font.BOLD, 15));
			 c.gridx=1;
			 c.gridy=0;
			 c.gridwidth=1;
			 picLabel.add(drugNameT, c);
				 this.quantityL = new JLabel ("Quantity:");
				 quantityL.setFont(new Font("Comic Sans",Font.BOLD, 15));
				 c.insets= new Insets(0,0,20,0);
				 c.gridx=0;
				 c.gridy=1;
				 c.gridwidth=1;
				 picLabel.add(quantityL,c);
				 this.quantityT= new JTextField(20);
				 c.insets= new Insets(0,0,20,0);
				 quantityT.setFont(new Font("Comic Sans",Font.BOLD, 15));
				 c.gridx=1;
				 c.gridy=1;
				 c.gridwidth=1;
				 picLabel.add(quantityT,c);
				 this.generalL = new JLabel ("General Information:");
				 generalL.setFont(new Font("Comic Sans",Font.BOLD, 15));
				 c.insets= new Insets(0,0,20,0);
				 c.gridx=0;
				 c.gridy=2;
				 c.gridwidth=1;
				 picLabel.add(generalL,c);
				 this.generalT= new JTextArea();
				 generalT.setColumns(15);
				 generalT.setRows(20);
				 generalT.setLineWrap(true);
				 i = new JScrollPane(generalT);
				 i.setPreferredSize(new Dimension(235, 100));
				 generalT.setWrapStyleWord(true);
				 generalT.setPreferredSize(new Dimension(170, 120));
				 c.insets= new Insets(0,0,20,0);
				 drugNameT.setFont(new Font("Comic Sans",Font.BOLD, 15));
				 c.gridx=1;
				 c.gridy=2;
				 c.gridwidth=1;
				 picLabel.add(i,c);
				 this.sideL = new JLabel ("Side Effects:");
				 sideL.setFont(new Font("Comic Sans",Font.BOLD, 15));
				 c.insets= new Insets(0,0,20,0);
				 c.gridx=0;
				 c.gridy=3;
				 c.gridwidth=1;
				 picLabel.add(sideL,c);
				 this.sideT= new JTextArea();
				 sideT.setColumns(15);
				 sideT.setRows(20);
				 sideT.setLineWrap(true);
				 j = new JScrollPane(sideT);
				 j.setPreferredSize(new Dimension(235, 100));
				 sideT.setWrapStyleWord(true);
				 sideT.setPreferredSize(new Dimension(170, 120));
				 c.insets= new Insets(0,0,20,0);
				 drugNameT.setFont(new Font("Comic Sans",Font.BOLD, 15));
				 c.gridx=1;
				 c.gridy=3;
				 c.gridwidth=1;
				 picLabel.add(j,c);

				 this.controlledL = new JLabel ("Controlled Substance:");
				 controlledL.setFont(new Font("Comic Sans",Font.BOLD, 15));
				 c.insets= new Insets(0,0,20,0);
				 c.gridx=0;
				 c.gridy=4;
				 c.gridwidth=1;
				 picLabel.add(controlledL,c);
				 this.controlledT= new JTextField(20);
				 c.insets= new Insets(0,0,20,0);
				 controlledT.setFont(new Font("Comic Sans",Font.BOLD, 15));
				 c.gridx=1;
				 c.gridy=4;
				 c.gridwidth=1;
				 picLabel.add(controlledT,c);
				 
				 
				 this.submit = new JButton ("Submit");
				  submit.setPreferredSize(new Dimension(100, 40));

				 c.insets= new Insets(0,0,0,0);
				 c.gridx=0;
				 c.gridy=6;
				 picLabel.add(submit,c);
				 
				 this.cancel = new JButton ("Cancel");
				 cancel.addActionListener(frame);
				  cancel.setPreferredSize(new Dimension(100, 40));

				 c.insets= new Insets(0,0,0,0);
				 c.gridx=1;
				 c.gridy=6;
				 picLabel.add(cancel,c);
				 
			
	   
	}
	JButton getCancelButton(){
		return this.cancel;
	}
	
}