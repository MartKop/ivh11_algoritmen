package Examples.hf4_opdr7;

import java.util.LinkedList;

public class Test {

    public static void main(String[] args) {
        LinkedList<Werknemer> werknemers = new LinkedList<>();
        werknemers.add(new Werknemer("Mart", 100.00));
        werknemers.add(new Werknemer("Leroy", 90.50));
        werknemers.add(new Werknemer("Remco", 70.30));
        werknemers.add(new Werknemer("Wessel", 50.10));

        //ondiepe kopie (opdracht 7 a)
//        LinkedList<Werknemer> werknemers2 = new LinkedList<>(werknemers);

        //diepe lijst (opdracht 7b)
        LinkedList<Werknemer> werknemers2 = new LinkedList<>();
        for (Werknemer i : werknemers) {
            werknemers2.add(i.copy());
        }

        werknemers.get(0).setNaam("Mart Kop");

        System.out.print(werknemers2.get(0).getNaam());
    }
}
