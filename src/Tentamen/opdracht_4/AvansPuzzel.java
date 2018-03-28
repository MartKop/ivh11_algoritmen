package Tentamen.opdracht_4;

public class AvansPuzzel {

    // for an AvansPuzzel of size 3, the sum value is 15
    // for an AvansPuzzel of size 4, the sum value is 34
    public static final int SIZE = 3;
    public static final int SUM = 15;
    public static final int EMPTY = 0;

    public enum Status  {SOLVED, NOTSOLVED, ERROR};

    private int[][] ms = new int[SIZE][SIZE];
    private Status status;
    private static int nrSolved = 0;

    /**
     *
     * @return true "if not completely filled AND all filled rows and columns have sum of value 15 (status NotSolved)"
     *         false "if completely filled AND all rows and columns have sum of value 15 (status Solved)
     *         false "at least one row or column sum is not equal to 15 (status Error)"
     */
    public boolean isReady() {

        boolean completelyFilled = true;

        for(int i=0; i<SIZE; i++) {
            int rowsum = 0;
            int colsum = 0;
            boolean rowFilled = true;
            boolean colFilled = true;
            for(int j=0; j<SIZE; j++) {
                rowsum += ms[i][j];
                colsum += ms[j][i];
                if(ms[i][j] == EMPTY) {
                    rowFilled = false;
                    completelyFilled = false;
                }
                if(ms[j][i] == EMPTY) {
                    colFilled = false;
                    completelyFilled = false;
                }
            }
            if(rowsum != SUM && rowFilled) {
                status = Status.ERROR;
                return true;
            }
            if(colsum != SUM && colFilled) {
                status = Status.ERROR;
                return true;
            }
        }

        if(completelyFilled) {
            status = Status.SOLVED;
            nrSolved++;
            print();
            return true;
        }

        status = Status.NOTSOLVED;
        return false;
    }

    /*
     * @return a deep copy of the AvansPuzzel
     */
    public AvansPuzzel deepCopy() {
        AvansPuzzel deepCopy = new AvansPuzzel();
        for(int i=0; i<SIZE; i++) {
            for(int j=0; j<SIZE; j++) {
                deepCopy.ms[i][j] = ms[i][j];
            }
        }
        deepCopy.status = status;
        return deepCopy;
    }

    /*
     * checks if a candidate has already been used in the AvansPuzzel
     */
    public boolean candidateUsed(int candidate) {
        assert candidate != EMPTY : "invalid value";
        for(int i=0; i<SIZE; i++) {
            for(int j=0; j<SIZE; j++) {
                if(ms[i][j] == candidate) {
                    return true;
                }
            }
        }
        return false;
    }

    /*
     * sets the candidates value if the first empty slot; it searches in the
     * following order: first row, from left to right,
     * then the second row from left to right, ans so on
     */
    public void setCandidate(int candidate) {
        for(int i=0; i<SIZE; i++) {
            for(int j=0; j<SIZE; j++) {
                if(ms[i][j] == EMPTY) {
                    ms[i][j] = candidate;
                    return;
                }
            }
        }
    }

    public void print() {
        for(int i=0; i<SIZE; i++) {
            for(int j=0; j<SIZE; j++) {
                if(ms[i][j]<10) {
                    System.out.print(" " + ms[i][j] + " ");
                }
                else {
                    System.out.print(ms[i][j] + " ");
                }
            }
            System.out.println();
        }
        System.out.println("number of AvansPuzzels found is " + nrSolved);
    }

    public Status getStatus() {
        return this.status;
    }
}