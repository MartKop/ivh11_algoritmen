package Examples.MagicSquare;

import java.util.List;

public class MagicSquare {

    private boolean numberUsed(Integer[] square, int i, int num){
        for (int j = 0; j < i; j++)
            if(square[j] == num) return true;

        return false;
    }

    public void solveSquare(Integer[] square, int i, List<Integer[]> solutions){
        if(i == square.length){
            if(checkAnswer(square))
                solutions.add(square.clone());
        }
        else{
            for (int num = 1; num <= square.length; num++) {
                if(numberUsed(square, i, num)) continue;
                square[i] = num;
                solveSquare(square, i+1, solutions);
            }
        }
    }

    public boolean checkAnswer(Integer[] square){

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
