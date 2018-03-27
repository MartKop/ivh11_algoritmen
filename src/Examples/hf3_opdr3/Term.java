package Examples.hf3_opdr3;

public class Term {

    protected int co_efficient;

    protected int exponent;

    public Term (int co_efficient, int exponent ) {
        this.co_efficient = co_efficient;
        this.exponent = exponent;
    }

    public String toString() {
        return co_efficient + "x^" + exponent;
    }


}
