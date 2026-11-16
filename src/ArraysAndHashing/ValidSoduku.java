package ArraysAndHashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.Phaser;

public class ValidSoduku {

    public boolean validSuduko(char[][] board) {
        int width = 9;
        int height = 9;
        HashMap<Character, Character> vertical = new HashMap<>();
        HashMap<Integer, ArrayList<Character>> horizontal = new HashMap<>();
        HashMap<String, ArrayList<Character>> box = new HashMap<>();



        for(int i = 0; i < height; i ++) {
            vertical.clear();
            for(int j = 0; j < width; j++) {

                if(vertical.containsKey(board[i][j]) && board[i][j] != '.') {
                    return false;
                }
                String a = (i / 3) + "," + (j/3) ;
                if(!box.containsKey(a)) {
                    box.put(a, new ArrayList<>());
                }
                if(!horizontal.containsKey(j)) {
                    horizontal.put(j, new ArrayList<>());
                }
                for(char c : box.get(a)) {
                    if(c == board[i][j] && c != '.') {
                        return false;
                    }
                }
                for(char c : horizontal.get(j)) {
                    if(c == board[i][j] && c!= '.') {
                        return false;
                    }
                }



                vertical.put(board[i][j], '0');
                horizontal.get(j).add(board[i][j]);
                box.get(a).add(board[i][j]);


            }
        }
        return true;


    }


}
