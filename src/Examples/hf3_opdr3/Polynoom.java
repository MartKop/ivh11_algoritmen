package Examples.hf3_opdr3;

import OefenTentamen.Opgave5_Muziek.Song;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Optional;

public class Polynoom {

    protected ArrayList<Term> terms = new ArrayList<>();

    public Polynoom som(Polynoom polynoom) {
        for (Term term : polynoom.terms) {
            Optional<Term> found = terms.stream().filter(x -> x.exponent == term.exponent).findFirst();
            if (!found.isPresent()) {
                terms.add(term);
            } else {
                found.get().co_efficient += term.co_efficient;
            }
        }

        return this;
    }

    public String toString() {
        StringBuilder returnValue = new StringBuilder();
        terms.sort(new TermSorter());
        for (Term term : terms) {
            returnValue.append(term.toString() + " + ");
        }
        return returnValue.toString();
    }

}
