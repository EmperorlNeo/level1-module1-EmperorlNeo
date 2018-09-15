import javax.swing.JOptionPane;
public class Duck{
	String favoriteFood;
	int numberOfFriends;
	public Duck (String favoriteFood, int numberOfFriends){
	this.favoriteFood = favoriteFood;
	this.numberOfFriends = numberOfFriends;
}
	void quack() {
		JOptionPane.showMessageDialog(null, "QUACK");
	}
	void waddle() {
		JOptionPane.showMessageDialog(null, "*WADDLING*");
	}


}