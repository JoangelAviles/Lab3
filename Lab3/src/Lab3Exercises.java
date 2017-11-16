import javax.swing.JFrame;

public class Lab3Exercises 
{
	public static void main(String[] args) 
	{
		JFrame myFrame = new JFrame("Joangel M. Avilés Reyes");
		myFrame.setSize(300,200);
		
		MyPanelClass myPanel = new MyPanelClass();
        myFrame.getContentPane().add(myPanel); 
        
		myFrame.setVisible(true);
		myFrame.setLocationRelativeTo(null);
		myFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
}