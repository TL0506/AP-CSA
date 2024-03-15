import java.util.*;

public class Cowybot implements RPSLSBot {
    private int[] moves;
    private Random rand;
    private int[][] plusbank;
    private int rut;

    public Cowybot() { reset(); }
    public String getBotName() { return "Cowybot"; }
    public String getCoderName() { return "Tiffany Lin"; }
    public void reset() {
        moves = new int[] { 1, 1, 1, 1, 1 };
        rand = new Random();
        plusbank = new int[][] {
            {1, 4}, // rock
            {1, 2}, // paper
            {2, 3}, // scissors
            {2, 4}, // lizard
            {2, 4}  // spock
        };
        rut = 1000;
    }
    
    // If the opponent moves rock a lot, increase the probabilites of moving paper or spock.
   
    public int getMove() {
        if (rut-- <= 0) reset();
        
        int[] probabilities = new int[] { 0, 0, 0, 0, 0 };
        for (int i=0; i<5; i++) {
            probabilities[(i+plusbank[i][0]) % 5] += moves[i];
            probabilities[(i+plusbank[i][1]) % 5] += moves[i];
        }

        int sum = 0;
        for (int i=0; i<5; i++) {
            sum += probabilities[i];
        }

        int r = rand.nextInt(sum);
        int y = 0;
        //System.out.println(Arrays.toString(moves));
        //System.out.println(Arrays.toString(probabilities));
        //System.out.println(r);
        for (int i=0; i<5; i++) {
            // 2, (r probably), 500, 2, 500, 2
            y += probabilities[i];
            if (r <= y) return i;
        }

        return 0;
    }
    
    public void opponentsLastMove(int move) {
        moves[move]++;
    }
}