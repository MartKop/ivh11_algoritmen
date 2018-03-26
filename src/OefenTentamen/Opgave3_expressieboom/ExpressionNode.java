package OefenTentamen.Opgave3_expressieboom;

public class ExpressionNode extends Node {

    public String operator;

    public ExpressionNode(String operator) {
        this.operator = operator;
        right = null;
        left = null;
    }

    @Override
    public int calculate() {
        switch (operator) {
            case "+":
                return left.calculate() + right.calculate();

            case "-":
                return left.calculate() - right.calculate();

            case "*":
                return left.calculate() * right.calculate();

            case "/":
                return left.calculate() / right.calculate();

            default:
                return value;
        }
    }
}
