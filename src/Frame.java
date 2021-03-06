import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;

public class Frame extends JFrame {
	JPanel p;
	public void run() {
		
		//label1
		JLabel l1 = new JLabel("Rc Element");
		l1.setBounds(60,20,100,30);
//		l1.setHorizontalAlignment(JLabel.CENTER);  
			
	    //combobox1
		String a1[] = {"none" ,"Beam" ,"Slab"};
		final JComboBox c1 = new JComboBox(a1);
		c1.setBounds(180, 20, 100, 30);
		c1.setBackground(new Color(240, 240, 245));

		//label2
		JLabel l2 = new JLabel("Calculate");
		l2.setBounds(60,80,100,30);
		
		//combobox2
		String a2[] = {"none" , "Mu" , "As" , "As & Assume d"};
		final JComboBox c2 = new JComboBox(a2);
		c2.setBounds(180, 80, 100, 30);
		c2.setBackground(new Color(240, 240, 245));

/***********************************************************************************/	
		//input panel
		p = new JPanel(null);
		p.setBorder(BorderFactory.createTitledBorder("Input"));
		p.setBounds(50, 120, 400, 250);
		p.setBackground(new Color(210, 210, 224));   //rgb values
		Font myy = new Font("Arial" , Font.ITALIC , 20);
		((javax.swing.border.TitledBorder) p.getBorder()).setTitleFont(myy);
		p.repaint();

		// result panel
		JPanel pr = new JPanel(null);
		pr.setBorder(BorderFactory.createTitledBorder("result"));
		pr.setBounds(20, 440, 500, 70);
		pr.setBackground(new Color(210, 210, 224));   //rgb values
		Font rf = new Font("Arial" , Font.ITALIC , 20);
		((javax.swing.border.TitledBorder) pr.getBorder()).setTitleFont(rf);
		pr.repaint();
		
/**********************************************************************************/
		//labelforinput
		JLabel il1 = new JLabel("b");
		il1.setBounds(60,30,30,30);
		il1.setToolTipText("Width");

		JTextField it1 = new JTextField();
		it1.setBounds(180,30,60,30);


		JLabel il2 = new JLabel("d");
		il2.setBounds(60,70,30,30);
		il2.setToolTipText("Depth");

		JTextField it2 = new JTextField();
		it2.setBounds(180,70,60,30);

		
		JLabel il3 = new JLabel("fy");
		il3.setBounds(60,110,30,30);
		il3.setToolTipText("Steel Strength");

		//combobox3
		String a3[] = {"none" , "240" , "280" , "360" , "400", "460"};
		final JComboBox c3 = new JComboBox(a3);
		c3.setBounds(180, 110, 60, 30);
		c3.setBackground(new Color(240, 240, 245));
	
		JLabel il4 = new JLabel("Fcu");
		il4.setBounds(60,150,30,30);
		il4.setToolTipText("Concrete Strength");
	
		JTextField it4 = new JTextField();
		it4.setBounds(180,150,60,30);
			
		JLabel il5 = new JLabel();
		il5.setBounds(60,190,30,30);
			
		JTextField it5 = new JTextField();
		it5.setBounds(180,190,60,30);
	
		//result lable
		JLabel tt = new JLabel();
		tt.setBounds(30,15,350,60);	
		JLabel tt2 = new JLabel();
		tt2.setBounds(110,15,70,60);

		pr.add(tt2);

		
	/***********************************************************************************/	
		//button
				JButton b = new JButton("Progress");
				b.setBounds(100,390,100,40);
				b.setBackground(new Color(210, 210, 224));

		//clear button
				JButton b1 = new JButton("Clear All");
				b1.setBounds(270,390,100,40);
				b1.setBackground(new Color(210, 210, 224));
					
		/*-----------------------------------------------------------------------------------*/
		//add units
		JLabel u1 = new JLabel("mm");
		u1.setBounds(260,30,60,30);
		JLabel u2 = new JLabel("mm");
		u2.setBounds(260,70,60,30);
		JLabel u3 = new JLabel("N/mm\u00B2");
		u3.setBounds(260,110,60,30);
		JLabel u4 = new JLabel("N/mm\u00B2");
		u4.setBounds(260,150,60,30); 
		JLabel u5 = new JLabel();
		u5.setBounds(260,190,60,30);
		/***********************************************************************************/	
		//no of bars
		JLabel use = new JLabel("used diameter");
		use.setBounds(30,30,100,30);
		
		JLabel result = new JLabel("result =");
		result.setBounds(60,75,60,30);
		
		JLabel unit1 = new JLabel("mm");
		unit1.setBounds(220,30,40,30);
		
		JLabel unit2 = new JLabel("bars");
		unit2.setBounds(220,75,60,30);
		
		JButton hh = new JButton("calculate no of bars");
		hh.setBounds(150,520,150,35);
		hh.setBackground(new Color(210, 210, 224));
		
		JButton h = new JButton("calculate");
		h.setBounds(270,30,100,30);
		h.setBackground(new Color(195, 195, 213));
		String a4[] = {"none" , "6" , "8" , "10" , "13", "16","19","22","25","28","32","38","40"};
		
		JComboBox c4 = new JComboBox(a4);
		c4.setBounds(150, 30, 60, 30);
		c4.setBackground(new Color(240, 240, 245));

		JTextField rr = new JTextField();
		rr.setBounds(150,75,60,30);
		JPanel pv = new JPanel(null);
		pv.setBorder(BorderFactory.createTitledBorder("NO.BARS"));
		pv.setBounds(20, 570, 500, 120);
		pv.setBackground(new Color(210, 210, 224));   //rgb values
		Font uu = new Font("Arial" , Font.ITALIC , 15);
		((javax.swing.border.TitledBorder) pv.getBorder()).setTitleFont(rf);
		pv.repaint();
		add(pv);
		pv.add(use);
		pv.add(result);
		pv.add(unit1);
		pv.add(unit2);
		add(hh);
		pv.add(h);
		pv.add(c4);
		pv.add(rr);
		pv.setVisible(false);
		hh.setVisible(false);

	/***********************************************************************************/	
	
		//ActionListener
		c1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				l2.setVisible(true);
				c2.setVisible(true);
			}
		});
		
		c2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s2 = (String) c2.getSelectedItem();
				switch(s2) {
				case "Mu":
					p.setVisible(true);
					b.setVisible(true);
					b1.setVisible(true);
					it2.setEditable(true);
					pv.setVisible(false);
					hh.setVisible(false);
					il5.setText("As");
					u5.setText("mm\u00B2");
					il5.setToolTipText("Area of steel");
					tt.setText("");
					tt2.setText("");
					break;
				case "As":
					p.setVisible(true);
					b.setVisible(true);
					b1.setVisible(true);
					it2.setEditable(true);
					tt.setText("");
					tt2.setText("");
					il5.setText("Mu");
					u5.setText("kN.m");
					il5.setToolTipText("Moment");
					break;
				case "As & Assume d":
					p.setVisible(true);
					b.setVisible(true);
					b1.setVisible(true);
					it2.setEditable(false);
					tt.setText("");
					tt2.setText("");
					il5.setText("Mu");
					u5.setText("kN.m");
					il5.setToolTipText("Moment");
					break;
				case "none":
					p.setVisible(false);
					b.setVisible(false);
					b1.setVisible(false);
					break;
				}
			}
			});

		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(it1.getText().isEmpty() || it4.getText().isEmpty() || it5.getText().isEmpty() || c2.getSelectedIndex()==0 ) {
					JOptionPane.showMessageDialog(null, "please enter values", "Empty fields" , JOptionPane.INFORMATION_MESSAGE);
				}
				else {
				pr.setVisible(true);
				String s1 = (String) c1.getSelectedItem();
				String s2 = (String) c2.getSelectedItem();
				switch(s1) {
				case "Beam" :
					switch(s2) {
					case "Mu":
						if(it2.getText().isEmpty()) {
							JOptionPane.showMessageDialog(null, "please enter values", "Empty fields" , JOptionPane.INFORMATION_MESSAGE);
						}
						else {
						int x =checkFcu(it4 , 20 , 50);
						switch(x) {
						case 1:
							ChildMu m1 = new ChildMu(it1.getText(), it2.getText(), (String) c3.getSelectedItem(), it4.getText() , it5.getText());
							tt.setText(String.format("Required Mu = %.5f kN.m\n", m1.calculateMu()));
							break;
						case 0:
							JOptionPane.showMessageDialog(null, "Fcu value must be between 20 and 50", "Fcu value" , JOptionPane.INFORMATION_MESSAGE);
							break;
						}
						}
						break;
						
					case "As":
						if(it2.getText().isEmpty()) {
							JOptionPane.showMessageDialog(null, "please enter values", "Empty fields" , JOptionPane.INFORMATION_MESSAGE);
						}
						else {
						int y =checkFcu(it4 , 20 , 50);
						switch(y) {
						case 1:
							ChildAs m2 = new ChildAs(it1.getText(), it2.getText(), (String) c3.getSelectedItem(), it4.getText() , it5.getText());
							m2.calculateAs();
							m2.BeamAsMinMax();
							switch(m2.checkAsB()) {
							case 1:
								tt.setText(String.format("Required As =                                   mm\u00B2 \n"));
								tt2.setText(String.format("%.2f \n", m2.calculateAs()));
								hh.setVisible(true);

								break;
							case 0:
								JOptionPane.showMessageDialog(null, "You should increase the dimensions", "Unsafe Slab" , JOptionPane.WARNING_MESSAGE);
								tt.setText(null);
								break; 
							case 2:
								tt.setText(String.format("Required As =         mm\u00B2 is less than As minimum %.2f mm\u00B2 \n" , m2.AsminS));
								tt2.setText(String.format("%.2f \n", m2.calculateAs()));
								hh.setVisible(true);
								break;
								
							}
							
							break;
						case 0:
							JOptionPane.showMessageDialog(null, "Fcu value must be between 20 and 50", "Fcu value" , JOptionPane.INFORMATION_MESSAGE);
							break;
						}
						}
						break;
					case "As & Assume d":						
						int z =checkFcu(it4 , 20 , 50);
						switch(z) {
						case 1:
							ChildAsD m3 = new ChildAsD(it1.getText(), "0", (String) c3.getSelectedItem(), it4.getText() , it5.getText());
							m3.d = m3.calculate_d();
							m3.calculateAs();
							m3.BeamAsMinMax();
							switch(m3.checkAsS()) {
							case 1:
								tt.setText(String.format("Required As =                         mm\u00B2 and d = %.2f mm \n", m3.d));
								tt2.setText(String.format("%.2f \n", m3.calculateAs()));
								hh.setVisible(true);
								break;
							case 2:
								tt.setText(String.format("Required As = %.2f mm\u00B2 is less than As minimum %.2f mm\u00B2 \n Required d = %.2f mm \n", m3.calculateAs() , m3.AsminS, m3.d));
								
								hh.setVisible(true);
								break;
								
/*							case 0:
								JOptionPane.showMessageDialog(null, "You should increase the dimensions", "Unsafe Slab" , JOptionPane.WARNING_MESSAGE);
								break;
*/							} 
							break;
						case 0:
							JOptionPane.showMessageDialog(null, "Fcu value must be between 20 and 50", "Fcu value" , JOptionPane.INFORMATION_MESSAGE);
							break;
						}
						break;
					}
				case "Slab":
					switch(s2) {
					case "Mu":
						if(it2.getText().isEmpty()) {
							JOptionPane.showMessageDialog(null, "please enter values", "Empty fields" , JOptionPane.INFORMATION_MESSAGE);
						}
						else {
						int q =checkFcu(it4 , 20 , 50);
						switch(q) {
						case 1:
							ChildMu m4 = new ChildMu(it1.getText(), it2.getText(), (String) c3.getSelectedItem(), it4.getText() , it5.getText());
							tt.setText(String.format("Required Mu = %.5f kN.m \n", m4.calculateMu()));
							break;
						case 0:
							JOptionPane.showMessageDialog(null, "Fcu value must be between 20 and 50", "Fcu value" , JOptionPane.INFORMATION_MESSAGE);
							break;
						}
						}
						break;
						
					case "As":
						if(it2.getText().isEmpty()) {
							JOptionPane.showMessageDialog(null, "please enter values", "Empty fields" , JOptionPane.INFORMATION_MESSAGE);
						}
						else {
						int w =checkFcu(it4 , 20 , 50);
						switch(w) {
						case 1:
							ChildAs m5 = new ChildAs(it1.getText(), it2.getText(), (String) c3.getSelectedItem(), it4.getText() , it5.getText());
							m5.calculateAs();
							m5.SlabAsMinMax();
							switch(m5.checkAsS()) {
							case 1:
								tt.setText(String.format("Required As =                    mm\u00B2 \n"));
								tt2.setText(String.format("%.2f \n", m5.calculateAs()));
								hh.setVisible(true);

								break;
							case 2:
								tt.setText(String.format("Required As =                    mm\u00B2 is less than As minimum %.2f mm\u00B2 \n", m5.AsminS));
								tt2.setText(String.format("%.2f \n", m5.calculateAs()));
								hh.setVisible(true);
								break;
								
							case 0:
								JOptionPane.showMessageDialog(null, "You should increase the dimensions", "Unsafe Slab" , JOptionPane.WARNING_MESSAGE);
								break;
							}

							break;
						case 0:
							JOptionPane.showMessageDialog(null, "Fcu value must be between 20 and 50", "Fcu value" , JOptionPane.INFORMATION_MESSAGE);
							break;
						}
						}
						break;
					case "As & Assume d":
						int r =checkFcu(it4 , 20 , 50);
						switch(r) {
						case 1:
							ChildAsD m6 = new ChildAsD(it1.getText(), "0", (String) c3.getSelectedItem(), it4.getText() , it5.getText());
							m6.d = m6.calculate_d();
							m6.calculateAs();
							m6.SlabAsMinMax();
							switch(m6.checkAsS()) {
							case 1:
								tt.setText(String.format("Required As =                     mm\u00B2 and d = %.2f mm\u00B2 \n", m6.d));
								tt2.setText(String.format("%.2f \n", m6.calculateAs()));
								hh.setVisible(true);

								break;
							case 2:
								tt.setText(String.format("Required As =                  mm\u00B2 is less than As minimum %.2f mm\u00B2 \n Required d = %.2f" , m6.AsminS, m6.d));
								tt2.setText(String.format("%.2f \n", m6.calculateAs()));
								hh.setVisible(true);

								break;
								
/*							case 0:
								JOptionPane.showMessageDialog(null, "You should increase the dimensions", "Unsafe Slab" , JOptionPane.WARNING_MESSAGE);
								break;
*/							} 
							break;
						case 0:
							JOptionPane.showMessageDialog(null, "Fcu value must be between 20 and 50", "Fcu value" , JOptionPane.INFORMATION_MESSAGE);
							break;
					}
						break;	
				}
			}
			}
			}
		});

		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				it1.setText(null);
				it2.setText(null);
				c3.setSelectedIndex(0);
				it4.setText(null);
				it5.setText(null);
				tt.setText(null);
				tt2.setText(null);
				pv.setVisible(false);
				hh.setVisible(false);
				pr.setVisible(false);

			}
		});
		h.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Hash H = new Hash();
				Double AB = H.hash( (String) c4.getSelectedItem());
				double No = (Double.parseDouble(tt2.getText())/AB )+1;
				rr.setText(String.format("%.0f", No));
			}
		});
		
		hh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pv.setVisible(true);

			}
		});
	/***********************************************************************************/		
		addComponents(l1,c1);
		addComponents(l2,c2);
		l2.setVisible(false);
		c2.setVisible(false);

		add(p);
		add(b);
		add(b1);
		p.setVisible(false);
		b.setVisible(false);
		b1.setVisible(false);
		add (pr);
		pr.setVisible(false);

		addComponentsToP(il1 , it1);
		addComponentsToP(il2 , it2);
		addComponentsToP(il3 , c3);
		addComponentsToP(il4 , it4);
		addComponentsToP(il5 , it5);
		addComponentsToP(u1 , u2);
		addComponentsToP(u3 , u4);
		p.add(u5);
		pr.add(tt);
		
		setTitle("Project");
		setLayout(null);
		setSize(500 , 700);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setBackground(new Color(225, 225, 234));
		}
	/*------------------------------------------------------------------------------------*/
	//another methods
	//methods to add components to Frame (OverLoad)
	public void addComponents(JLabel q , JComboBox w ) { //take a label and a combobox
		add(q);
		add(w);
	}
	public void addComponents(JLabel q , JTextField w ) { //take a label and a combobox
		add(q);
		add(w);
	}
	
	//methods to add components to Panel (OverLoad)
	public void addComponentsToP(JLabel q , JComboBox w ) { //take a label and a combobox
		p.add(q);
		p.add(w);
	}
	public void addComponentsToP(JLabel q , JTextField w ) { //take a label and a combobox
		p.add(q);
		p.add(w);
	}
	public void addComponentsToP(JLabel q , JLabel w ) { //take a label and a combobox
		p.add(q);
		p.add(w);
	}
	//mehod to check input values
	public int checkFcu(JTextField t1 ,int minval ,int maxval) {
		int bool=0;
		if (Double.parseDouble(t1.getText())<= maxval && Double.parseDouble(t1.getText())>= minval){
			bool = 1;
		}
		return bool;
	}
	
}
