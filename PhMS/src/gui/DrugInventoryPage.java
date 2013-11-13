package gui;

import java.awt.*;

import javax.swing.*;
@SuppressWarnings("serial")
public class DrugInventoryPage extends JPanel {
	private JLabel enterNameL;
	private JLabel LIWarning;
	private JTextField enterNameT;
	private JButton addNew;
	private JButton restock;
	private JButton remove;
	private JButton search;
	private JButton back;
	DrugInventoryPage(Gui frame){
		
		GridBagConstraints c = new GridBagConstraints();
		JLabel picLabel=new JLabel(new ImageIcon("img/bg.jpg"));
		   this.add(picLabel);
		   picLabel.setLayout(new GridBagLayout());
			this.setLayout(new GridBagLayout());
			
			this.enterNameL = new JLabel ("Drug Name:");
			 enterNameL.setFont(new Font("Comic Sans",Font.BOLD, 15));
			 c.insets= new Insets(0,0,10,0);
			 c.gridx=0;
			 c.gridy=0;
			 c.gridwidth=4;
			 picLabel.add(enterNameL,c);
			 this.enterNameT= new JTextField(15);
			 c.insets= new Insets(0,0,20,0);
			 enterNameT.setFont(new Font("Comic Sans",Font.BOLD, 15));
			 c.gridx=0;
			 c.gridy=1;
			 c.gridwidth=4;
			 picLabel.add(enterNameT,c);
			 this.search = new JButton ("Search");
			 search.setPreferredSize(new Dimension(100, 20));
			 c.insets= new Insets(0,0,20,0);
			 c.gridx=3;
			 c.gridy=1;
			 c.gridwidth=1;
			 picLabel.add(search,c);
			 
			 String[] columnNames={"Drug Name", "Quantity", "General Info", "Side Effects", "Controlled Flag" };
				Object[][] data={{"Drug Name","Quantity","General Info","Side Effects","Controlled Flag"},{1,11,1,1,1}};
				JTable table = new JTable(data, columnNames);
				table.setPreferredSize(new Dimension(650,100 ));
				table.setRowHeight(50);
				c.insets= new Insets(0,0,20,0);
				c.gridx=0;
				c.gridy=2;
				c.gridwidth=4;
				picLabel.add(table,c);
				
				 this.addNew = new JButton ("Add New");
				 addNew.addActionListener(frame);
				 addNew.setPreferredSize(new Dimension(120, 40));
				 c.insets= new Insets(0,10,15,0);
				 c.gridx=0;
				 c.gridy=3;
				 c.gridwidth=1;
				 picLabel.add(addNew,c);
				 
				 this.restock = new JButton ("Restock");
				 restock.addActionListener(frame);
				 restock.setPreferredSize(new Dimension(120, 40));
				 c.insets= new Insets(0,50,15,0);
				 c.gridx=1;
				 c.gridy=3;
				 c.gridwidth=1;
				 picLabel.add(restock,c);
				 
				 
				 this.remove = new JButton ("Remove");
				  remove.setPreferredSize(new Dimension(120, 40));
				 c.insets= new Insets(0,10,15,0);
				 c.gridx=0;
				 c.gridy=4;
				 c.gridwidth=1;
				 picLabel.add(remove,c);
				 
				 this.back = new JButton ("Back");
				  back.setPreferredSize(new Dimension(120, 40));
				 c.insets= new Insets(0,50,15,0);
				 c.gridx=1;
				 c.gridy=4;
				 c.gridwidth=1;
				 picLabel.add(back,c);
				 back.addActionListener(frame);
				 
				this.LIWarning = new JLabel ("<html>Low Inventory" + "<br>" +"   " +"Warning</html>");
				LIWarning.setFont(new Font("Comic Sans",Font.BOLD, 20));
					c.insets= new Insets(0,0,0,0);
					c.gridx=3;
					c.gridy=3;
					c.gridwidth=1;
					picLabel.add(LIWarning,c);
					
				 String[] dcolumnName={"Low Inventory Warning" };
				 Object[][] ddata={{1},{1},{1},{1},{1},{1},{1},{1}};
				 JTable drugHistory = new JTable(ddata, dcolumnName);
				 drugHistory.setRowHeight(25);
			 	 drugHistory.setPreferredSize(new Dimension(200,200 ));
				 c.insets= new Insets(0,0,0,0);
				 c.gridx=3;
				 c.gridy=4;
				 c.gridheight=7;
				 picLabel.add(drugHistory,c);
				
				
	}
	JButton getAddButton() {
		return this.addNew;
   }
	JButton getRestockButton() {
		return this.restock;
   }
	JButton getBackButton(){
		return this.back;
	}
}
