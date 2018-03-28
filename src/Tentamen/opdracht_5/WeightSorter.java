package Tentamen.opdracht_5;

import java.util.Comparator;

public class WeightSorter implements Comparator<IPet> {

    @Override
    public int compare(IPet pet1, IPet pet2) {
        if(pet1.getWeight() > pet2.getWeight()) {
            return 1;
        }
        if(pet2.getWeight() > pet1.getWeight()) {
            return -1;
        }
        return 0;
    }
}
