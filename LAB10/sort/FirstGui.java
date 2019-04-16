package lab_10;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Collections;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
public class FirstGui {
	private JFrame frame;
	private JPanel panel1,panel2;
	private int WIDTH = 300;
	private int HEIGHT = 75;
	public JTextField input;
	public JRadioButton button2,button3;
	public JLabel resultLabel,label;
	public FirstGui()
	{
		//FirstGui first = new FirstGui();
		//first.frame =new JFrame();
		frame = new JFrame("sorting");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		JButton button1 = new JButton("Sort");
		button2 = new JRadioButton("ASC");
		button3 = new JRadioButton("DESC");
		input = new JTextField (5);
		resultLabel = new JLabel ();
		
		resultLabel.setText("");
	    resultLabel.setBounds(100, 200, 300, 100);
		
		
		ButtonGroup bg=new ButtonGroup();
		
		bg.add(button2);
		bg.add(button3);
		button1.addActionListener(new TempListener());
		
		
		label = new JLabel();
		label.setText("Sorted List Will be");
		
		panel1 = new JPanel();
		panel2 = new JPanel();
		panel1.setPreferredSize (new Dimension(WIDTH, HEIGHT));
		panel1.setBackground (Color.CYAN);
		//label.setBounds(100, 200, 300, 100);
		
		 //Border border = BorderFactory.createLineBorder(Color.cyan, 1);
		 //label.setBorder(border);
	     
	     
	     
	     panel1.add(button1); 
	     panel1.add(input);
	     panel1.add(button2);
	     panel1.add(button3);
	     panel2.add(label);
	     
	     panel2.add(resultLabel);
	     
	     //frame.getContentPane().add (panel1);
	     frame.add(panel1,BorderLayout.SOUTH);
	     frame.add(panel2,BorderLayout.NORTH);
	     //frame.pack();
	     frame.setSize(600, 400);
	     frame.setTitle("Sorting Number");
	     
	     frame.setVisible(true);
	}
	
	private class TempListener implements ActionListener
	{
		
		
		public void actionPerformed (ActionEvent event)
		{
			
			String text = input.getText();
			String[] stringArray = text.split(",");
		    Integer[] intArray = new Integer[stringArray.length];
		    for (int i = 0; i < stringArray.length; i++) {
		       String numberAsString = stringArray[i];
		       intArray[i] = Integer.parseInt(numberAsString);
		    }
		    if(button2.isSelected())
		    	Arrays.sort(intArray);
		    else
		    	Arrays.sort(intArray,Collections.reverseOrder());
		    int len=stringArray.length,i=0;
		    String s="";
			/*if(button2.isSelected()){
				i=0;
				while(i<len){
					s+=intArray[i];
					if(i!=len-1){
						s+=',';
					}
					i++;
				}
			}else{
				i=len-1;
				while(i>=0){
					s+=intArray[i];
					if(i!=0){
						s+=',';
					}
					i--;
				}
			}*/
		    while(i<len)
		    {
		    	if(i!=len-1)
		    	s=s+intArray[i]+',';
		    	else
		    	s=s+intArray[i];
		    	i++;
		    }
		    /*String commaSeparatedNumbers = Arrays.stream(intArray)
		    	    .boxed()
		    	    .map((Integer i) -> Integer.toString((Integer)i))
		    	    .collect(Collectors.joining(" "));*/
		    resultLabel.setText(s);
		    label.setText("Sorted List is");
		}
		
	}

}

