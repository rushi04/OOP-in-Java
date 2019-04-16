import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;


public class LightBulb {
	
	private JFrame frame;
	
	public static void main(String args[]){
		
		LightBulb lb = new LightBulb();
		
		lb.frame=new JFrame();
		
		lb.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ImageIcon on = new ImageIcon ("src/on.png");
		ImageIcon off = new ImageIcon ("src/off.png");
		
		JLabel label = new JLabel();
        label.setText("");
        		
		LightBulbPanel panel1 = new LightBulbPanel(on, off, false, label);
        
		LightBulbControls lbc = new LightBulbControls(panel1);
		
		lbc.add(lbc.getOnButton());
		lbc.add(lbc.getOffButton());
		lbc.setBounds(100, 300, 300, 600);
		
		lbc.getOnButton().addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(!panel1.isOn()){
					panel1.getImageLabel().setIcon(panel1.getImageon());
					panel1.setOn(true);
				}
			}
			
		});
		
		lbc.getOffButton().addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(panel1.isOn()){
					panel1.getImageLabel().setIcon(panel1.getImageoff());
					panel1.setOn(false);
				}
			}
			
		});
		
		panel1.add(label);
		
		lb.frame.add(lbc);
		lb.frame.add(panel1);
		
		
		lb.frame.setSize(600, 400);
		lb.frame.setTitle("Light Bulb");
		lb.frame.setVisible(true);
	}
}
