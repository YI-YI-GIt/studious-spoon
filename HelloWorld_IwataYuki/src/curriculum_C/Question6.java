package curriculum_C;

public class Question6 {
	public static void main(String[] args) {
		Player player = new Player();
		CPU cpu = new CPU();
		String[] hands = {"グー", "チョキ", "パー"};
		
		boolean playerWins = true;
		
		while (playerWins) { // playerが勝つまで繰り返す
            int playerHand = player.getHand();
            int cpuHand = cpu.getHand();

            System.out.println("あなたの手: " + hands[playerHand]);
            System.out.println("CPUの手: " + hands[cpuHand]);

            if (playerHand == cpuHand) {
                System.out.println("あいこです。もう一度！");
            } else if ((playerHand == 0 && cpuHand == 1) ||
                       (playerHand == 1 && cpuHand == 2) ||
                       (playerHand == 2 && cpuHand == 0)) {
                System.out.println("あなたの勝ち！");
                playerWins = false;
            } else {
                System.out.println("あなたの負け。もう一度！");
            }
		}
        player.closeScanner();
	}

}
