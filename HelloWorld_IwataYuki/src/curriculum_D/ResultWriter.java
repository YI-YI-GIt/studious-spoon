package curriculum_D;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ResultWriter {
	 public static void writeBattleResult
	 (Character player, Character daemon, String result, String fileName) {
	        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
	            writer.write("[ バトルログ ]");
	            writer.write("プレイヤー: " + player + "\n");
	            writer.write("対戦相手: " + daemon + "\n");
	            writer.write("結果: " + result + "\n");
	            writer.write("-----------------\n");
	            System.out.println("バトル結果を " + fileName + " に保存しました。");
	        } catch (IOException e) {
	            System.out.println("ファイル書き込みエラー: " + e.getMessage());
	        }
	    }
	}