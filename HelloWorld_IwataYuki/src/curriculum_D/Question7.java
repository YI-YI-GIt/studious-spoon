package curriculum_D;

import java.util.List;
import java.util.Random;
import java.util.Scanner;


public class Question7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		System.out.print("名前を入力; ");
		String playerName = scanner.nextLine();
		scanner.close();
			
		int assignedHP = random.nextInt(51) + 50; // 50～100
		int assignedAT = random.nextInt(16) + 5; // 5～15
		int assignedSP = random.nextInt(11) + 5; // 5～10
		
		Character player = new Character(playerName, assignedHP, assignedAT, assignedSP);
        // Daemon読み込み（最初の1体だけ使う）
        List<Character> daemons = DaemonLoader.loadDaemon("daemon_status.txt");
        if (daemons.isEmpty()) {
            System.out.println("Daemonが読み込めませんでした。");
            return;
        }
        
        Character daemon = daemons.get(0);
        System.out.println("対戦相手: " + daemon);

        // バトル開始
        System.out.println("--- バトル開始！ ---");
        Character first, second;

        if (player.sp > daemon.sp) {
            first = player;
            second = daemon;
        } else if (player.sp < daemon.sp) {
            first = daemon;
            second = player;
        } else {
            if (random.nextBoolean()) {
                first = player;
                second = daemon;
            } else {
                first = daemon;
                second = player;
            }
        }

        System.out.println("先攻: " + first.name);

        while (player.isAlive() && daemon.isAlive()) {
            first.attack(second);
            if (!second.isAlive()) 
            	break;

            second.attack(first);
        }

        System.out.println("--- バトル終了！ ---");
        if (player.isAlive()) {
            System.out.println(player.name + " の勝利！");
        } else {
            System.out.println(daemon.name + " の勝利！");
        }
        
        // 結果を書き出す
        String result;
        if (player.isAlive()) {
            result = player.name + " の勝利！";
        } else {
            result = daemon.name + " の勝利！";
        }

        ResultWriter.writeBattleResult(player, daemon, result, "battle_log.txt");
	}
}

