package Examples.hf3_opdr3;

import java.util.Comparator;

public class TermSorter implements Comparator<Term> {
    @Override
    public int compare(Term term1, Term term2) {
        if (term1.exponent < term2.exponent)
            return -1;
        if (term1.exponent > term2.exponent)
            return 1;
        return 0;
    }
}