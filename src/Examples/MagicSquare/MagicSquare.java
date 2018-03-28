package Examples.MagicSquare;

import java.util.List;

public class MagicSquare {

    public boolean checkAnswer(int[] square){

        int size = (int)Math.sqrt(square.length);
        int constant = ((int)Math.pow(size, 3) + size) / 2;

        //check row sums
        for (int i = 0; i < square.length; i+=size) {
            int sum = 0;
            for (int j = i; j < i+size; j++) {
                sum += square[j];
            }
            if(sum != constant) return false;
        }

        //check column sums
        for (int i = 0; i < size; i++) {
            int sum = 0;
            for (int j = i; j < square.length; j+=size) {
                sum += square[j];
            }
            if(sum != constant) return false;
        }

        //check first diagonal sum
        int sum = 0;
        for (int i = 0; i < square.length; i+=size+1)
            sum += square[i];
        if(sum != constant) return false;

        //check second diagonal sum
        sum = 0;
        for (int i = size-1; i < square.length-1; i+=size-1)
            sum += square[i];
        if(sum != constant) return false;

        //all tests passed
        return true;
    }
}
