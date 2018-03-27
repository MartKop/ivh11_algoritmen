package Examples.hf3_opdr3;

public class Test {

    public static void main(String[] args) {
        Polynoom polynoom1 = new Polynoom();
        polynoom1.terms.add(new Term(1,2));
        polynoom1.terms.add(new Term(3,1));
        polynoom1.terms.add(new Term(1,0));

        Polynoom polynoom2 = new Polynoom();
        polynoom2.terms.add(new Term(-1,3));
        polynoom2.terms.add(new Term(2,2));
        polynoom2.terms.add(new Term(-5,0));

        Polynoom polynoomsom = polynoom1.som(polynoom2);

        System.out.print(polynoomsom.toString());
    }
}
