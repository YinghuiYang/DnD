import java.util.*;

public class GameStart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("What your name, brave warrior?");
		Scanner keyboard = new Scanner(System.in);
		String name = keyboard.nextLine().trim();		
		Figure player = new Figure(name);
		Figure demon = new Figure("Demon");		
		
		if(player.maxLevel()){
			demon.lvUp(150*100);
		}

	}

}
