import javax.swing.JOptionPane;


public class CheckRegister {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		String cityName, upper, lower;
		char first;
		int characters;
		cityName = JOptionPane.showInputDialog(null, "Enter a city name: ");
				
		characters = cityName.length();
		upper = cityName.toUpperCase();
		lower = cityName.toLowerCase();
		first = cityName.charAt(0);
		
		JOptionPane.showMessageDialog(null, "The number of characters in " + cityName 
				+ " is " + characters + "\n The city in all uppercase letters is: " 
				+ upper + "\n The city in all lowercase letters is: " + lower 
				+ "\n The first letter of the city name is: " + first);
	}

}
