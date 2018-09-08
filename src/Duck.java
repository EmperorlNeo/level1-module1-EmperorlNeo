import javax.swing.JOptionPane;

public class Duck {
	int numberOfFriends;
	String favoriteFood;
	public static void main(String[] args) {
		Duck daffy = new Duck("duck",7);
		daffy.quack();
		daffy.waddle();
	}
	
	Duck(String favoriteFood, int numberOfFriends) {
		this.favoriteFood = favoriteFood;
		this.numberOfFriends = numberOfFriends;
	}
		public void quack() {
			JOptionPane.showMessageDialog(null, "QUACK");
		}
		public void waddle() {
			JOptionPane.showMessageDialog(null, "WADDLING");
		}
	}


