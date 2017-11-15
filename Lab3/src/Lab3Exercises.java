import javax.swing.JFrame;

public class Lab3Exercises 
{
    public static void main(String[] args) 
    {
        JFrame myFrame = new JFrame("Joangel");
        
        myFrame.setSize(200, 200);
        myFrame.setVisible(true);
        //myFrame.setLocation(200,200);
        
        myFrame.setLocationRelativeTo(null);
        myFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}