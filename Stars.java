import javax.swing.JOptionPane;

public class Stars {

	public static void main(String[] args) {
		int number = Integer.parseInt(JOptionPane.showInputDialog(null,"How many stars do you want?"));
		String star = " * ";
		int n = 0;
		while (n<number) {
			System.out.println("*");
			n++;
		}
		
	}

}
