package Programs;
import java.util.*;
import javax.swing.*;
public class Students {
	Students()
	{
		JFrame f1 = new JFrame("Bevarsi");
		f1.setSize(300,300);
		f1.setVisible(true);
	}
	public static void main(String[] args)
	{
		SwingUtilities.invokeLater(new Runnable() 
		{
			 public void run()
			 {
				 new Students();
			 }
	    }
	);
	}
		
}

