package Tentamen.opdracht_4;

public class SolvePuzzle {

    public static void main(String[] args) {
        AvansPuzzel puzzel = new AvansPuzzel();
        Backtrack(puzzel);
    }

    private static void Backtrack(AvansPuzzel puzzel) {
        if (puzzel.isReady() && puzzel.getStatus() == AvansPuzzel.Status.SOLVED) {
            return;
        } else {
            for (int i = 1; i <= (puzzel.SIZE * puzzel.SIZE); i++) {
                AvansPuzzel deepCopy = puzzel.deepCopy();
                if (!deepCopy.candidateUsed(i)) {
                    deepCopy.setCandidate(i);
                    Backtrack(deepCopy);
                }
            }
        }
    }
}
