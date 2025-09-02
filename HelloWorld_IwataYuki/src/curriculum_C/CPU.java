package curriculum_C;

import java.util.Random;

public class CPU {
	Random random = new Random();
	
	public int getHand() {
		return random.nextInt(3); // 0から2のランダム
	}

}
