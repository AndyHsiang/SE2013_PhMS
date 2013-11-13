package gui;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class ManageEmployeePage extends JPanel {
	
	public ManageEmployeePage(Gui frame){
		GridBagConstraints c = new GridBagConstraints();	
		JLabel picLabel=new JLabel(new ImageIcon("img/bg.jpg"));
		this.add(picLabel);
		picLabel.setLayout(new GridBagLayout());
		c.insets = new Insets(0,10,10,10);
		c.gridy=1;
	}
}
