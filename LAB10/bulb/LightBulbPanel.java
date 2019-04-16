import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class LightBulbPanel extends JPanel {
	private ImageIcon imageon;
	private ImageIcon imageoff;
	private boolean on;
	private JLabel imageLabel;
	
	
	public LightBulbPanel(ImageIcon imageon, ImageIcon imageoff, boolean on,
			JLabel imageLabel) {
		super();
		this.imageon = imageon;
		this.imageoff = imageoff;
		this.on = on;
		this.imageLabel = imageLabel;
		this.imageLabel.setIcon(this.imageoff);
	}
	
	public void paintComponent(Graphics a){
		
	}

	public ImageIcon getImageon() {
		return imageon;
	}

	public ImageIcon getImageoff() {
		return imageoff;
	}

	public boolean isOn() {
		return on;
	}

	public JLabel getImageLabel() {
		return imageLabel;
	}

	public void setOn(boolean on) {
		this.on = on;
	}

	public void setImageLabel(JLabel imageLabel) {
		this.imageLabel = imageLabel;
	}
	
	
}
