import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class LightBulbControls extends JPanel{
	private JButton onButton;
	private JButton offButton;
	
	public LightBulbControls(LightBulbPanel lbp) {
		
		this.onButton = new JButton("On");
		
		this.offButton = new JButton("Off");
		
	}

	public JButton getOnButton() {
		return onButton;
	}

	public JButton getOffButton() {
		return offButton;
	}

	
}
