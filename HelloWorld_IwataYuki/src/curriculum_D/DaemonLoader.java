package curriculum_D;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class DaemonLoader {
    public static List<Character> loadDaemon(String fileName) {
        List<Character> daemonList = new ArrayList<>();

        //try-with-resources 構文にして自動的にクローズさせる
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
        	// ファイルの終わりまでループしてCharacterを作成
            String name;
            while ((name = reader.readLine()) != null) {
                String hpLine = reader.readLine();
                String atLine = reader.readLine();
                String spLine = reader.readLine();

                // すべて存在しているか確認（エラーがあったらreadLine()がnullを返す）
                if (hpLine != null && atLine != null && spLine != null) {
                	// 文字を数値に変換、文字列に含まれる空白などを削除
                    int hp = Integer.parseInt(hpLine.trim());
                    int at = Integer.parseInt(atLine.trim());
                    int sp = Integer.parseInt(spLine.trim());
                    // データがそろっていればリストを作成
                    daemonList.add(new Character(name, hp, at, sp));
                }
            }
            // 例外の対応
        } catch (IOException e) {
            System.out.println("ファイル読み込みエラー: " + e.getMessage());
        }

        return daemonList;
    }
}
