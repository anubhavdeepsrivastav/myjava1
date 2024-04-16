import java.util.*;

public class anubhav {
    public static void main(String[] args) {
        char ch[][] = { { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
                { '6', '.', '.', '1', '9', '5', '.', '.', '.' }, { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
                { '8', '.', '.', '.', '6', '.', '.', '.', '3' }, { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
                { '7', '.', '.', '.', '2', '.', '.', '.', '6' }, { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
                { '.', '.', '.', '4', '1', '9', '.', '.', '5' }, { '.', '.', '.', '.', '8', '.', '.', '7', '9' } };
        char ch1[][] = new char[ch.length][ch.length];
        gen(ch, 0, 0);
    }

    public static void gen(char ch[][], int row, int col) {
        if (col == 9) {
            row++;
            col = 0;
        }
        if (row == 0) {
            print(ch);
            return;
        }
        if (ch[row][col] = '.') {
            gen(ch, row, col + 1);
        }
        for (int i = 1; i < ch.length; i++)
            if (safe(ch, row, col, i)) {
                ch[row][col] = (char) (x + '0');
                gen(ch, row, col + 1);
                ch[row][col] = '.';

            }
    }

}
