package OefenTentamen.Opgave3_expressieboom;

public class Node {

    public int value;

    public Node left;

    public Node right;

    public Node() {

    }

    public int calculate() {
        return value;
    }

    public Node(int value) {
        this.value = value;
        right = null;
        left = null;
    }
}