import com.sun.prism.paint.Color;

public class SmurfRunner {
public static void main(String[] args) {
	Smurf Handy = new Smurf("Handy");
	Handy.eat();
	Handy.getName();
	Smurf PapaSmurf = new Smurf("Papa Smurf");
	PapaSmurf.getName();
	PapaSmurf.getHatColor("Red hat");
	PapaSmurf.isGirlOrBoy();
	Smurf Smurfette = new Smurf("Smurfette");
	Smurfette.getName();
	Smurfette.getHatColor();
	Smurfette.isGirlOrBoy();
	
	
}
}
/* 
 * 1. Watch this Smurf cartoon: https://www.youtube.com/watch?v=RqbpzEHuO2g
 * 2. In a Runner class, make a Handy Smurf. Use the methods below to make him eat, and print his name.
 * 3&4 see comments in code below
 * 5. Make a Papa Smurf and print his name, hat color and girl or boy.
 * 6. Make a Smurfette and print her name, hat color and girl or boy. 
 */