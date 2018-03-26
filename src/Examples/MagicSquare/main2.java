package Examples.MagicSquare;

import java.util.LinkedList;
import java.util.List;

public class main2 {

    public static void main(String[] args) {
        MagicSquare ms = new MagicSquare();

        List<Integer[]> solutions = new LinkedList<>();
        ms.solveSquare(new Integer[9], 0, solutions);
        for (Integer[] square : solutions) {
            for (int i = 0; i < square.length; i++)
                System.out.print(square[i] + " ");
            System.out.println();
        }
    }


}
